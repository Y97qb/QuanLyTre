package italy.edu.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import italy.edu.dao.TheoDoiVangDAO;
import italy.edu.entity.TheoDoiVang;
@Transactional
@Repository
public class TheoDoiVangDAOImpl implements TheoDoiVangDAO{

	@Autowired
	SessionFactory sessionFactory;
	
	@Override
	public void editTheoDoiVang(TheoDoiVang theoDoiVang) {
		sessionFactory.getCurrentSession().merge(theoDoiVang);
	}
	
	@Override
	public TheoDoiVang getTheoDoiVangById(String maTre,String ngayHoc) {
		return sessionFactory.getCurrentSession().get(TheoDoiVang.class, new TheoDoiVang(maTre, ngayHoc));
	}

	@Override
	public void addTheoDoiVang(TheoDoiVang theoDoiVang) {
		sessionFactory.getCurrentSession().save(theoDoiVang);
	}
}
