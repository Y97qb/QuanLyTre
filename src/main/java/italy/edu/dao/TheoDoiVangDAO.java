package italy.edu.dao;

import italy.edu.entity.TheoDoiVang;

public interface TheoDoiVangDAO {
	public void editTheoDoiVang(TheoDoiVang theoDoiVang);
	public TheoDoiVang getTheoDoiVangById(String maTre,String ngayHoc);
	public void addTheoDoiVang(TheoDoiVang theoDoiVang);
}
