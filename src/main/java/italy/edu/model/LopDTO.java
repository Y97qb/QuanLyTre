package italy.edu.model;

import java.util.List;

import italy.edu.entity.Tre;

public class LopDTO{

	private String maLop;
	private String namHoc;
	private int soLuongTre;
	private String tenGV1;
	private String tenGV2;
	private String tenLop;
	private List<Tre> tres;
	
	public LopDTO() {
	}

	public List<Tre> getTres() {
		return tres;
	}

	public void setTres(List<Tre> tres) {
		this.tres = tres;
	}

	public String getMaLop() {
		return this.maLop;
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