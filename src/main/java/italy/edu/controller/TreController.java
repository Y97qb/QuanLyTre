package italy.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import italy.edu.model.LopDTO;
import italy.edu.model.TreDTO;
import italy.edu.service.LopService;
import italy.edu.service.TreService;

@Controller
public class TreController {
	@Autowired
	TreService treService;
	
	@Autowired
	LopService lopService;
	
	@GetMapping(value = "/")
	public String showFormThemTre(HttpServletRequest request) {
		List<LopDTO> listLop = lopService.getAllLop();
		request.setAttribute("listLop", listLop);
		request.setAttribute("tre", new TreDTO());
		return "tres/showFormThemTre";
	}
	@PostMapping(value = "/them-tre")
	public String themTre(@ModelAttribute("tre")TreDTO treDTO,LopDTO lopDTO,HttpServletRequest request) {
		int soLuongTre = treService.checkSoLuong(lopDTO.getMaLop());
		int soLuongLop = lopService.getSoLuongLop(lopDTO.getMaLop());
		if(soLuongTre >= soLuongLop) {
			List<LopDTO> listLop = lopService.getAllLop();
			request.setAttribute("listLop", listLop);
			request.setAttribute("soLuongTre","* Lớp này đã hết số lượng đăng ký!.");
			return "tres/showFormThemTre";
		}else {
			if(!treService.checkTrungMa(treDTO.getMaTre())) {
				treService.themTre(treDTO);
				return "redirect:/view-tre";
			}else {
				List<LopDTO> listLop = lopService.getAllLop();
				request.setAttribute("listLop", listLop);
				request.setAttribute("trungMa","* Mã Trẻ đã tồn tại!.");
				return "tres/showFormThemTre";
			}
		}
	}
}
