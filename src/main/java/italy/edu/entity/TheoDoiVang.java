package italy.edu.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "THEODOIVANG")
public class TheoDoiVang implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "NGAYHOC")
	private String ngayHoc;
	
	@Id
	@ManyToOne
	@JoinColumn(name="MATRE")
	private Tre maTre;
	
	@Column(name = "LYDO")
	private String lyDo;

	@Column(name = "THOIGIANNGHI")
	private String thoiGianNghi;
	

	public Tre getMaTre() {
		return maTre;
	}

	public void setMaTre(Tre maTre) {
		this.maTre = maTre;
	}

	public TheoDoiVang() {
	}

	public String getLyDo() {
		return this.lyDo;
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
	
	 public TheoDoiVang(String maTre, String ngayHoc) {
	    this.maTre = new Tre(maTre);
	    this.ngayHoc = ngayHoc;
	 }

}