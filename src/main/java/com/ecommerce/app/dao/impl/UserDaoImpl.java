package com.ecommerce.app.dao.impl;

import java.util.HashMap;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.UserDao;
import com.ecommerce.app.entity.User;

@Repository
public class UserDaoImpl implements UserDao{
	static int users_count = 0;
	private static User current_user;
	private static HashMap<String, User> users = new HashMap<>();
	@Override
	public void saveUser(User user) {
		users_count++;
		user.setUserId(users_count);
		users.put(user.getName(), user);
		// TODO Auto-generated method stub
	}
	
	@Override
	public User authenticateUser(String name, String password) {
		User user = users.get(name);
		System.out.println("Llegamos hasta aquí");
		System.out.println(user.getEmail());
		if (user.getPassword().equals(password)) {
			return user;
		}
		return null;
	}

	@Override
	public void setCurrentUser(User user) {
		current_user = user;
	}

	@Override
	public User getCurrentUser() {
		// TODO Auto-generated method stub
		return this.current_user;
	}

}
