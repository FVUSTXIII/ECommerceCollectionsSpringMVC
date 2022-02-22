package com.ecommerce.app.dao;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.entity.User;


public interface UserDao{
	
	public void saveUser(User user);	

	public User authenticateUser(String name, String password);

	public void setCurrentUser(User user);

	public User getCurrentUser();
}
