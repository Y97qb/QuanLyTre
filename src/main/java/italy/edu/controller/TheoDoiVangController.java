package italy.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import italy.edu.model.TheoDoiVangDTO;
import italy.edu.model.TreDTO;
import italy.edu.service.TheoDoiVangService;
import italy.edu.service.TreService;

@Controller
public class TheoDoiVangController {
	
	@Autowired
	TheoDoiVangService theoDoiVangService;
	
	@Autowired
	TreService treService;
	
	@GetMapping(value = "/view-formThongTin/{maTre}/{ngayhoc}")
	public String showFormEditThongTinTre(HttpServletRequest request,@PathVariable(value="maTre")String maTre, @PathVariable(value = "ngayhoc")String ngayHoc) {
		//xử date ở đây để query
		String str1 = ngayHoc.substring(0,2).concat("/");
		String str2 = ngayHoc.substring(2,4).concat("/");
		String str3 = ngayHoc.substring(4,8);
		String str4 = str1.concat(str2).concat(str3);
		request.setAttribute("theodoi", theoDoiVangService.getTheoDoiVangById(maTre, str4));
		return "theodoi/showFormEditTheoDoiVang";
	}
	@PostMapping(value = "/edit-theodoi")
	public String editTheoDoiVang(TheoDoiVangDTO theoDoiVangDTO) {
		theoDoiVangService.editTheoDoiVang(theoDoiVangDTO);
		return "redirect:/view-tre";
	}
	
	@GetMapping(value = "/form-theodoi")
	public String showFormTheoDoi(HttpServletRequest request) {
		List<TreDTO> listTre = treService.getAllTre();
		request.setAttribute("listTre", listTre);
		request.setAttribute("theodoi", new TheoDoiVangDTO());
		return "theodoi/showFormTheoDoi";
	}
	@PostMapping(value = "/them-theodoi")
	public String themTheoDoiVang(TheoDoiVangDTO theoDoiVangDTO) {
		theoDoiVangService.addTheoDoiVang(theoDoiVangDTO);
		return "redirect:/view-tre";
	}
}
