package com.sridurgatraders.main.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sridurgatraders.main.HibernateSessionFactory;
import com.sridurgatraders.main.dao.LoginDbValidation;
import com.sridurgatraders.main.dto.User;

public class LoginDbValidationImpl implements LoginDbValidation {

	@Override
	public boolean validateUser(String name, String password) throws Exception {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		Query query = session
				.createQuery("select userName from RegisterUser where userName=:name and password=:password ");
		query.setParameter("name", name);
		query.setParameter("password", password);
		session.getTransaction().commit();
		session.close();
		return false;
	}

	@Override
	public void registerUser(User user) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(user);

		session.getTransaction().commit();
		session.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getlist(String name) {

		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User where userName=:name");
		query.setParameter("name", name);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUserList() {

		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from User");
		return query.list();
	}

	@Override
	public void deleteAnUser(String uname) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(getUserObject(uname));
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public void updateAnUser(User user) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(user);

		session.getTransaction().commit();
		session.close();
	}

	@Override
	public User getAnUser(String uname) {
		return getUserObject(uname);
	}

	private User getUserObject(String uname) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		return (User) session.get(User.class, uname);

	}
}
