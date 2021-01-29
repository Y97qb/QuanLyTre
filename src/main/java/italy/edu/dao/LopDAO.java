package italy.edu.dao;

import java.util.List;

import italy.edu.entity.Lop;

public interface LopDAO {
	public Lop getByMaLopId(String maLop); 
	public List<Lop> getAllLop();
	public int getSoLuongLop(String maLop);
}
