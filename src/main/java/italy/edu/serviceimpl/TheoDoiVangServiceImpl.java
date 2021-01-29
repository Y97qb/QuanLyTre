package italy.edu.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.TheoDoiVangDAO;
import italy.edu.dao.TreDAO;
import italy.edu.entity.TheoDoiVang;
import italy.edu.entity.Tre;
import italy.edu.model.TheoDoiVangDTO;
import italy.edu.service.TheoDoiVangService;

@Transactional
@Service
public class TheoDoiVangServiceImpl  implements TheoDoiVangService {

	@Autowired
	TheoDoiVangDAO theoDoiVangDAO;
	
	@Autowired
	TreDAO treDAO;
	
	@Override
	public void editTheoDoiVang(TheoDoiVangDTO theoDoiVangDTO) {
		TheoDoiVang theoDoiVang = theoDoiVangDAO.getTheoDoiVangById(theoDoiVangDTO.getMaTre(), theoDoiVangDTO.getNgayHoc());
			theoDoiVang.setMaTre(theoDoiVang.getMaTre());
			theoDoiVang.setNgayHoc(theoDoiVang.getNgayHoc());
			theoDoiVang.setThoiGianNghi(theoDoiVangDTO.getThoiGianNghi());
			theoDoiVang.setLyDo(theoDoiVangDTO.getLyDo());
			theoDoiVangDAO.editTheoDoiVang(theoDoiVang);
	}

	@Override
	public TheoDoiVangDTO getTheoDoiVangById(String maTre, String ngayHoc) {
		TheoDoiVang theoDoiVang = theoDoiVangDAO.getTheoDoiVangById(maTre, ngayHoc);
		TheoDoiVangDTO theoDoiVangDTO = new TheoDoiVangDTO();
		theoDoiVangDTO.setMaTre(theoDoiVang.getMaTre().getMaTre());
		theoDoiVangDTO.setNgayHoc(theoDoiVang.getNgayHoc());
		theoDoiVangDTO.setThoiGianNghi(theoDoiVang.getThoiGianNghi());
		theoDoiVangDTO.setLyDo(theoDoiVang.getLyDo());
		return theoDoiVangDTO;
	}

	@Override
	public void addTheoDoiVang(TheoDoiVangDTO theoDoiVangDTO) {
		TheoDoiVang theoDoiVang = new TheoDoiVang();
		Tre tre = treDAO.getTreById(theoDoiVangDTO.getMaTre());
		theoDoiVang.setMaTre(tre);
		theoDoiVang.setNgayHoc(theoDoiVangDTO.getNgayHoc());
		theoDoiVang.setThoiGianNghi(theoDoiVangDTO.getThoiGianNghi());
		theoDoiVang.setLyDo(theoDoiVangDTO.getLyDo());
		theoDoiVangDAO.addTheoDoiVang(theoDoiVang);
	}
}
