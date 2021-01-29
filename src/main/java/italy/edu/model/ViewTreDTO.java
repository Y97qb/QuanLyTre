package italy.edu.model;

public class ViewTreDTO {
	
	private String maTre;
	private String hoTen;
	private String ngaySinh;
	private String tenLop;
	private String tenGV1;
	private String tenGV2;
	private String namHoc;
	private String thoiGianNghi;
	private String ngayHoc;

	public ViewTreDTO() {
		super();
	}

	public String getHoTen() {
		return hoTen;
	}

	public String getMaTre() {
		return maTre;
	}

	public void setMaTre(String maTre) {
		this.maTre = maTre;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public String getTenGV1() {
		return tenGV1;
	}

	public void setTenGV1(String tenGV1) {
		this.tenGV1 = tenGV1;
	}

	public String getTenGV2() {
		return tenGV2;
	}

	public void setTenGV2(String tenGV2) {
		this.tenGV2 = tenGV2;
	}

	public String getNamHoc() {
		return namHoc;
	}

	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}

	public String getThoiGianNghi() {
		return thoiGianNghi;
	}

	public void setThoiGianNghi(String theoDoiVang) {
		this.thoiGianNghi = theoDoiVang;
	}

	public String getNgayHoc() {
		return ngayHoc;
	}

	public void setNgayHoc(String ngayHoc) {
		this.ngayHoc = ngayHoc;
	}
	
}
