package italy.edu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "view_thongtintre")
public class View_ThongTinTre implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MATRE")
	private String maTre;
	
	@Id
	@Column(name = "NGAYHOC")
	private String ngayHoc;
	
	public String getNgayHoc() {
		return ngayHoc;
	}

	public void setNgayHoc(String ngayHoc) {
		this.ngayHoc = ngayHoc;
	}

	@Column(name = "HOTEN")
	private String hoTen;
	
	@Column(name = "NGAYSINH")
	private String ngaySinh;
	
	@Column(name = "TENLOP")
	private String tenLop;
	
	@Column(name = "TENGV1")
	private String tenGV1;
	
	@Column(name = "TENGV2")
	private String tenGV2;
	
	@Column(name = "NAMHOC")
	private String namHoc;
	
	@Column(name = "THOIGIANNGHI")
	private String thoiGianNghis;

	public View_ThongTinTre() {
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

	public String getThoiGianNghis() {
		return thoiGianNghis;
	}

	public void setThoiGianNghis(String thoiGianNghis) {
		this.thoiGianNghis = thoiGianNghis;
	}

}
