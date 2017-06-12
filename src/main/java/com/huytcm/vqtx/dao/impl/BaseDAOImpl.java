package com.huytcm.vqtx.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;

import com.huytcm.vqtx.dao.IBaseDAO;

@Repository
public class BaseDAOImpl<Model, Id> implements IBaseDAO<Model, Id> {

	private static final Logger logger = Logger.getLogger(BaseDAOImpl.class);
	private Class<Model> clazz;
	@Autowired
	private SessionFactory factory;

	public BaseDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	public BaseDAOImpl(Class<Model> clazz) {
		this.clazz = clazz;
	}

	public void setClazz(Class<Model> clazz) {
		this.clazz = clazz;
	}

	protected Session getSession() {
		logger.info("[getSession]--Start");
		if (factory == null) {
			factory = (SessionFactory) new LocalSessionFactoryBean();
		}
		logger.info("[getSession]--End");
		return factory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public Model getById(Id id) {
		return (Model) getSession().get(clazz, (Serializable) id);
	}

	@Override
	public void insert(Model model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Model model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Model model) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Model> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	private static SessionFactory buildSessionFactory() {
		// Create Configuration
		Configuration configuration = new Configuration();

		// By default, Hibernate will read hibernate.cfg.xml configuration file
		// You can specify the file if you want:
		// configuration.configure("myhiberante.cfg.xml");
		configuration.configure();

		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties()).build();

		// Create SessionFactory
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		return sessionFactory;
	}

}
