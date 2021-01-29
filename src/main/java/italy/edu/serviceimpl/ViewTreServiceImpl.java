package italy.edu.serviceimpl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.ViewTreDAO;
import italy.edu.entity.View_ThongTinTre;
import italy.edu.model.ViewTreDTO;
import italy.edu.service.ViewTreService;

@Service
@Transactional
public class ViewTreServiceImpl implements ViewTreService {

	@Autowired
	ViewTreDAO viewTreDAO;
	
	@Override
	public List<ViewTreDTO> hienThongTinTre() {
		List<View_ThongTinTre> listTre = viewTreDAO.hienThiTre();
		List<ViewTreDTO> hienThiTre = new ArrayList<ViewTreDTO>();
		for (View_ThongTinTre viewTre: listTre) {
			ViewTreDTO viewTreDTO = new ViewTreDTO();
			viewTreDTO.setMaTre(viewTre.getMaTre());
			viewTreDTO.setHoTen(viewTre.getHoTen());
			viewTreDTO.setTenLop(viewTre.getTenLop());
			//Xu Ly tuoi
			Calendar calendar = Calendar.getInstance();
			int yearNow = calendar.get(Calendar.YEAR);
			int tuoi = 0;
			String ngaySinh = viewTre.getNgaySinh();
			String[] getNS = ngaySinh.split("/");
			tuoi = (yearNow - Integer.parseInt(getNS[2]));
			viewTreDTO.setNgaySinh(Integer.valueOf(tuoi).toString());
			
			viewTreDTO.setTenGV1(viewTre.getTenGV1());
			viewTreDTO.setTenGV2(viewTre.getTenGV2());
			viewTreDTO.setNamHoc(viewTre.getNamHoc());
			viewTreDTO.setThoiGianNghi(viewTre.getThoiGianNghis());
			//Lấy Paramater URL
			String ngayHoc = viewTre.getNgayHoc();
			String [] parts = ngayHoc.split("/");
			viewTreDTO.setNgayHoc(parts[0]+parts[1]+parts[2]);
			hienThiTre.add(viewTreDTO);
		}
		return hienThiTre;
	}

	@Override
	public List<ViewTreDTO> searchByThongTin(String key) {
		List<View_ThongTinTre> viewTres = viewTreDAO.searchByThongTin(key);
		List<ViewTreDTO> hienThiTre = new ArrayList<ViewTreDTO>();
		for (View_ThongTinTre viewTre: viewTres) {
			ViewTreDTO viewTreDTO = new ViewTreDTO();
			viewTreDTO.setMaTre(viewTre.getMaTre());
			viewTreDTO.setHoTen(viewTre.getHoTen());
			viewTreDTO.setTenLop(viewTre.getTenLop());
			//Xu Ly tuoi
			Calendar calendar = Calendar.getInstance();
			int yearNow = calendar.get(Calendar.YEAR);
			int tuoi = 0;
			String ngaySinh = viewTre.getNgaySinh();
			String[] getNS = ngaySinh.split("/");
			tuoi = (yearNow - Integer.parseInt(getNS[2]));
			viewTreDTO.setNgaySinh(Integer.valueOf(tuoi).toString());
			
			viewTreDTO.setTenGV1(viewTre.getTenGV1());
			viewTreDTO.setTenGV2(viewTre.getTenGV2());
			viewTreDTO.setNamHoc(viewTre.getNamHoc());
			viewTreDTO.setThoiGianNghi(viewTre.getThoiGianNghis());
			//Lấy Paramater URL
			String ngayHoc = viewTre.getNgayHoc();
			String [] parts = ngayHoc.split("/");
			viewTreDTO.setNgayHoc(parts[0]+parts[1]+parts[2]);
			hienThiTre.add(viewTreDTO);
		}
		return hienThiTre;
	}
}
