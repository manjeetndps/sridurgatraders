package com.sridurgatraders.main.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sridurgatraders.main.HibernateSessionFactory;
import com.sridurgatraders.main.dao.ItemStoreOperationsDao;
import com.sridurgatraders.main.dto.Item;

public class ItemStoreOperationsDaoimpl implements ItemStoreOperationsDao{

	@Override
	public void addAnItem(Item item) {
		
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.save(item);

		session.getTransaction().commit();
		session.close();
	}

	@Override
	public String upDateAnItem(Item item) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(item);

		session.getTransaction().commit();
		session.close();	
		return null;
	}

	@Override
	public String deleteAnItem(Item item) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.update(item);

		session.getTransaction().commit();
		session.close();		return null;
	}
	
	@Override
	public String deleteAnItemPermanently(Item item) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		session.delete(item);

		session.getTransaction().commit();
		session.close();		return null;
	}


	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getAllItemList() {

		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Item");
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getInStockItemList() {
		int active=1;
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Item where active=:active");
		query.setParameter("active", active);
		return query.list();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Item> getOutOfStockItemList() {
		int active=0;
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from Item where active=:active");
		query.setParameter("active", active);
		return query.list();
	}
	
	@Override
	public Item getAnItem(String itemCode) {
		return getItemObject(itemCode);
	}

	private Item getItemObject(String itemCode) {
		SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		return (Item)session.get(Item.class, itemCode);

	}

}
