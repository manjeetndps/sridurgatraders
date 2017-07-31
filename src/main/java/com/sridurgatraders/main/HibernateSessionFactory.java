package com.sridurgatraders.main;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.sridurgatraders.main.dto.Item;
import com.sridurgatraders.main.dto.User;

public class HibernateSessionFactory {

	private HibernateSessionFactory() {

	}

	private static SessionFactory sessionFactory;

	static {
		Configuration config = new Configuration();
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.show_sql", "false");
		properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		properties.put("hibernate.connection.url", "jdbc:mysql://172.24.90.59:3306/durgatraders");
		properties.put("hibernate.connection.username", "root");
		properties.put("hibernate.connection.password", "root");

		 config.addProperties(properties);
		 config.addAnnotatedClass(User.class);
		 config.addAnnotatedClass(Item.class);
		 sessionFactory=config.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(properties).build());

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
