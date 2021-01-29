package italy.edu.service;

import java.util.List;

import italy.edu.model.ViewTreDTO;

public interface ViewTreService {
	public List<ViewTreDTO> hienThongTinTre();
	public List<ViewTreDTO> searchByThongTin(String key);
}
