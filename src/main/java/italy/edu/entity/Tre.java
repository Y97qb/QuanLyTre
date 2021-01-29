package italy.edu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="TRE")
public class Tre implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MATRE")
	private String maTre;

	@Column(name = "HOTEN")
	private String hoTen;

	@Column(name = "NGAYSINH")
	private String ngaySinh;

	@Column(name = "HOTENPH")
	private String hoTenPH;

	@Column(name = "SODIENTHOAIPH")
	private String soDienThoaiPH;

	@Column(name = "NGAYVAOHOC")
	private String ngayVaoHoc;

	@Column(name = "GIOITINH")
	private int gioiTinh;

	@Column(name = "TRANGTHAI")
	private String trangThai;

	@ManyToOne
	@JoinColumn(name = "MALOP", nullable = false)
	private Lop maLop;

	public Tre() {
	}

	public String getMaTre() {
		return maTre;
	}

	public void setMaTre(String maTre) {
		this.maTre = maTre;
	}

	public String getHoTen() {
		return hoTen;
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

	public String getHoTenPH() {
		return hoTenPH;
	}
	public Lop getMaLop() {
		return maLop;
	}

	public void setMaLop(Lop maLop) {
		this.maLop = maLop;
	}

	public void setHoTenPH(String hoTenPH) {
		this.hoTenPH = hoTenPH;
	}

	public String getSoDienThoaiPH() {
		return soDienThoaiPH;
	}

	public void setSoDienThoaiPH(String soDienThoaiPH) {
		this.soDienThoaiPH = soDienThoaiPH;
	}

	public String getNgayVaoHoc() {
		return ngayVaoHoc;
	}

	public void setNgayVaoHoc(String ngayVaoHoc) {
		this.ngayVaoHoc = ngayVaoHoc;
	}

	public int getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(int gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getTrangThai() {
		return trangThai;
	}

	public void setTrangThai(String trangThai) {
		this.trangThai = trangThai;
	}

	public Tre(String maTre) {
		this.maTre = maTre;
	}
}
