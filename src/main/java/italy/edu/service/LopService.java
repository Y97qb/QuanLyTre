package italy.edu.service;

import java.util.List;

import italy.edu.model.LopDTO;

public interface LopService {
	public LopDTO getByMaLopId(String maLop);
	public List<LopDTO> getAllLop();
	public int getSoLuongLop(String maLop);
}
