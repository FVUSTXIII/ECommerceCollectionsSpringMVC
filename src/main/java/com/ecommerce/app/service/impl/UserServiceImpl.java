package com.ecommerce.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ecommerce.app.dao.UserDao;
import com.ecommerce.app.dao.impl.UserDaoImpl;
import com.ecommerce.app.dto.Credential;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao users;
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		users.saveUser(user);
	}
	@Override
	public User authenticateUser(Credential credential) {
		User user = users.authenticateUser(credential.getName(), credential.getPassword());
		return user;
		
		
	}
	@Override
	public void setCurrentUser(User user) {
		users.setCurrentUser(user);
		
	}
	@Override
	public User getCurrentUser() {
		// TODO Auto-generated method stub
		return users.getCurrentUser();
	}

}
