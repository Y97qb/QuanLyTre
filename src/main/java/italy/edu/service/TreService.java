package italy.edu.service;

import java.util.List;

import italy.edu.model.TreDTO;

public interface TreService {
	public void themTre(TreDTO treDTO);
	public List<TreDTO> getAllTre();
	public TreDTO getAllTre(String maTre);
	public int checkSoLuong(String maLop);
	public boolean checkTrungMa(String maTre);
}
