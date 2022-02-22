package com.ecommerce.app.service;

import com.ecommerce.app.dto.Credential;
import com.ecommerce.app.entity.User;

public interface UserService {
	void saveUser(User user);
	void setCurrentUser(User user);
	User getCurrentUser();
	User authenticateUser(Credential credential);
}
