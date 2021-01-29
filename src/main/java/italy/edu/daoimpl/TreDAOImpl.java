package italy.edu.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.TreDAO;
import italy.edu.entity.Tre;

@Repository
@Transactional
public class TreDAOImpl implements TreDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void themTre(Tre tre) {
		sessionFactory.getCurrentSession().save(tre);
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Tre> getAllTre() {
		return sessionFactory.getCurrentSession().createQuery("FROM Tre").getResultList();
	}

	@Override
	public Tre getTreById(String maTre) {
		return sessionFactory.getCurrentSession().get(Tre.class, maTre);
	}

	public int checkSoLuong(String maLop) {
		Session session = sessionFactory.getCurrentSession();
		int query = ((Long) session.createQuery("SELECT count(*) AS SoLuong FROM Tre WHERE MALOP='"+maLop+"'").uniqueResult()).intValue(); 
	    return query;
	}

	@Override
	public boolean checkTrungMa(String maTre) {
		try {
			Session session = sessionFactory.getCurrentSession();
			Tre tre = (Tre) session.createQuery("FROM Tre WHERE MATRE='"+maTre+"'").getSingleResult();
			if(tre != null) {
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			return false;
		} 
	}
}
