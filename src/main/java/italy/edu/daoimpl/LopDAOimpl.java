package italy.edu.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.LopDAO;
import italy.edu.entity.Lop;

@Transactional
@Repository
public class LopDAOimpl implements LopDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public Lop getByMaLopId(String maLop) {
		return sessionFactory.getCurrentSession().get(Lop.class, maLop);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Lop> getAllLop() {
		return sessionFactory.getCurrentSession().createQuery("FROM Lop").getResultList();
	}

	@Override
	public int getSoLuongLop(String maLop) {
		Session session = sessionFactory.getCurrentSession();
		int query = ((Integer) session.createQuery("SELECT soLuongTre FROM Lop WHERE MALOP='"+maLop+"'").uniqueResult()).intValue(); 
	    return query;
	}

}
