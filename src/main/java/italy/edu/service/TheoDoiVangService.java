package italy.edu.service;

import italy.edu.model.TheoDoiVangDTO;

public interface TheoDoiVangService {
	public void editTheoDoiVang(TheoDoiVangDTO theoDoiVangDTO);
	public TheoDoiVangDTO getTheoDoiVangById(String maTre, String ngayHoc);
	public void addTheoDoiVang(TheoDoiVangDTO theoDoiVangDTO);
}
