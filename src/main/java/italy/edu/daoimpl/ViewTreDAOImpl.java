package italy.edu.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.ViewTreDAO;
import italy.edu.entity.View_ThongTinTre;

@Repository
@Transactional
public class ViewTreDAOImpl implements ViewTreDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	@SuppressWarnings("unchecked")
	public List<View_ThongTinTre> hienThiTre() {
		Session session = sessionFactory.getCurrentSession();
		List<View_ThongTinTre> listTre = session.createQuery("FROM View_ThongTinTre").getResultList();
		return listTre;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<View_ThongTinTre> searchByThongTin(String key) {
		return sessionFactory.getCurrentSession().createQuery("FROM View_ThongTinTre WHERE NamHoc =:key OR TenLop =: key").setParameter("key",key).getResultList();
	}
}
