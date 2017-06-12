package com.huytcm.vqtx.dao.impl;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huytcm.vqtx.dao.IUserDAO;
import com.huytcm.vqtx.model.User;

@Repository
public class UserDAOImpl extends BaseDAOImpl<User, String> implements IUserDAO {
	private static final Logger logger = Logger.getLogger(UserDAOImpl.class);
	
	public UserDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public UserDAOImpl(Class<User> clazz) {
		super(clazz);
	}

	@Override
	@Transactional
	public User getUserByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
