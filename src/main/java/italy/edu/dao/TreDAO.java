package italy.edu.dao;

import java.util.List;

import italy.edu.entity.Tre;

public interface TreDAO {
	public void themTre(Tre tre);
	public List<Tre> getAllTre();
	public Tre getTreById(String maTre);
	public int checkSoLuong(String maLop);
	public boolean checkTrungMa(String maTre);
}
