package persistence;

import java.util.List;

import models.User;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


@org.springframework.stereotype.Repository
public class Repository {

	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(User.class).list();
	}
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
