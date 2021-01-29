package italy.edu.dao;

import java.util.List;

import italy.edu.entity.View_ThongTinTre;

public interface ViewTreDAO {
	public List<View_ThongTinTre> hienThiTre();
	public List<View_ThongTinTre> searchByThongTin(String key);
}
