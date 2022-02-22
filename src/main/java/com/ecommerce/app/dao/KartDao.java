package com.ecommerce.app.dao;

import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;

public interface KartDao {

	Integer getCartSize();

	void addToKart(Product prod);

	Boolean isKartCreater();

	void createKart(User user);

	Double getTotal();

	void resetTotal();
	
}
