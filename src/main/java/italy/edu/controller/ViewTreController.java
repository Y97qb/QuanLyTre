package italy.edu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import italy.edu.model.ViewTreDTO;
import italy.edu.service.ViewTreService;

@Controller
public class ViewTreController {

	@Autowired
	ViewTreService viewTreService;
	
	@GetMapping(value = "/view-tre")
	public String hienThiTre(HttpServletRequest request) {
		List<ViewTreDTO> listTre = viewTreService.hienThongTinTre();
		request.setAttribute("viewTre", listTre);
		return "tres/viewThongTinTre";
	}
	@GetMapping(value = "/search-tre")
	public String searchByThongTin(HttpServletRequest request,@RequestParam("key")String key) {
		if(key != null) {
		List<ViewTreDTO> listTre = viewTreService.searchByThongTin(key);
		request.setAttribute("viewTre", listTre);
		}
		return "tres/viewThongTinTre";
	}
}
