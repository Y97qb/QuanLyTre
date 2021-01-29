package italy.edu.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.LopDAO;
import italy.edu.dao.TreDAO;
import italy.edu.entity.Lop;
import italy.edu.entity.Tre;
import italy.edu.model.TreDTO;
import italy.edu.service.TreService;

@Service
@Transactional
public class TreServiceImpl implements TreService{

	@Autowired
	LopDAO lopDAO;
	
	@Autowired
	TreDAO treDAO;
	
	@Override
	public void themTre(TreDTO treDTO) {
			Tre tre = new Tre();
			tre.setMaTre(treDTO.getMaTre());
			Lop lop = lopDAO.getByMaLopId(treDTO.getMaLop());
			tre.setMaLop(lop);
			tre.setHoTen(treDTO.getHoTen());
			tre.setNgaySinh(treDTO.getNgaySinh());
			tre.setHoTenPH(treDTO.getHoTenPH());
			tre.setSoDienThoaiPH(treDTO.getSoDienThoaiPH());
			tre.setNgayVaoHoc(treDTO.getNgayVaoHoc());
			tre.setGioiTinh(Integer.parseInt(treDTO.getGioiTinh()));
			tre.setTrangThai((treDTO.getTrangThai()));
			treDAO.themTre(tre);
	}

	@Override
	public List<TreDTO> getAllTre() {
		List<Tre> listTre = treDAO.getAllTre();
		List<TreDTO> treDTO = new ArrayList<TreDTO>();
		for(Tre list : listTre) {
			TreDTO tre = new TreDTO();
			tre.setMaTre(list.getMaTre());
			treDTO.add(tre);
		}
		return treDTO;
	}

	@Override
	public TreDTO getAllTre(String maTre) {
		Tre listTre = treDAO.getTreById(maTre);
		TreDTO treDTO = new TreDTO();
		treDTO.setMaTre(listTre.getMaTre());
		return treDTO;
	}

	public int checkSoLuong(String maLop) {
		return treDAO.checkSoLuong(maLop);
	}

	@Override
	public boolean checkTrungMa(String maTre) {
		boolean ktThem = treDAO.checkTrungMa(maTre);
		return ktThem;
	}
}
