package italy.edu.model;

public class TheoDoiVangDTO{

	private String maTre;
	private String ngayHoc;
	private String lyDo;
	private String thoiGianNghi;

	public TheoDoiVangDTO() {
	}

	public String getLyDo() {
		return this.lyDo;
	}

	public String getMaTre() {
		return maTre;
	}

	public void setMaTre(String maTre) {
		this.maTre = maTre;
	}

	public String getNgayHoc() {
		return ngayHoc;
	}

	public void setNgayHoc(String ngayHoc) {
		this.ngayHoc = ngayHoc;
	}

	public void setLyDo(String lyDo) {
		this.lyDo = lyDo;
	}

	public String getThoiGianNghi() {
		return this.thoiGianNghi;
	}

	public void setThoiGianNghi(String thoiGianNghi) {
		this.thoiGianNghi = thoiGianNghi;
	}

}