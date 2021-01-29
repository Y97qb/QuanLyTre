package italy.edu.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.LopDAO;
import italy.edu.entity.Lop;
import italy.edu.model.LopDTO;
import italy.edu.service.LopService;

@Transactional
@Service
public class LopServiceImpl implements LopService{

	@Autowired
	LopDAO lopDAO;
	
	@Override
	public LopDTO getByMaLopId(String maLop) {
		Lop lop = lopDAO.getByMaLopId(maLop);
		LopDTO lopDTO = new LopDTO();
		lopDTO.setMaLop(lop.getMaLop());
		lopDTO.setTenGV1(lop.getTenGV1());
		lopDTO.setTenGV2(lop.getTenGV2());
		lopDTO.setTenLop(lop.getTenLop());
		lopDTO.setSoLuongTre(lop.getSoLuongTre());
		lopDTO.setNamHoc(lop.getNamHoc());
		return lopDTO;
	}

	@Override
	public List<LopDTO> getAllLop() {
		List<Lop> listLop = lopDAO.getAllLop();
		List<LopDTO> lopDTO = new ArrayList<LopDTO>();
		for(Lop list : listLop) {
			LopDTO lop = new LopDTO();
			lop.setMaLop(list.getMaLop());
			lopDTO.add(lop);
		}
		return lopDTO;
	}

	@Override
	public int getSoLuongLop(String maLop) {
		return lopDAO.getSoLuongLop(maLop);
	}

}
