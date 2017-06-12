package com.huytcm.vqtx.dao;

import com.huytcm.vqtx.model.User;

public interface IUserDAO {
	User getUserByUsername(String username);
}
