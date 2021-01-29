package italy.edu.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "LOP")
public class Lop implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "MALOP")
	private String maLop;

	@Column(name = "NAMHOC")
	private String namHoc;
	
	@Column(name = "SOLUONGTRE")
	private int soLuongTre;

	@Column(name = "TENGV1")
	private String tenGV1;

	@Column(name = "TENGV2")
	private String tenGV2;

	@Column(name = "TENLOP")
	private String tenLop;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "maLop")
	private List<Tre> tres;

	public Lop() {
	}

	public String getMaLop() {
		return this.maLop;
	}

	public List<Tre> getTres() {
		return tres;
	}

	public void setTres(List<Tre> tres) {
		this.tres = tres;
	}

	public void setMaLop(String maLop) {
		this.maLop = maLop;
	}

	public String getNamHoc() {
		return this.namHoc;
	}

	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}

	public int getSoLuongTre() {
		return this.soLuongTre;
	}

	public void setSoLuongTre(int soLuongTre) {
		this.soLuongTre = soLuongTre;
	}

	public String getTenGV1() {
		return this.tenGV1;
	}

	public void setTenGV1(String tenGV1) {
		this.tenGV1 = tenGV1;
	}

	public String getTenGV2() {
		return this.tenGV2;
	}

	public void setTenGV2(String tenGV2) {
		this.tenGV2 = tenGV2;
	}

	public String getTenLop() {
		return this.tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

}