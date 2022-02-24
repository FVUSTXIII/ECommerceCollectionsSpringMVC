package com.ecommerce.app.service;

import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;

public interface KartService {
	public Integer getCartSize();
	public void addToKart(Product prod);
	public Boolean isKartCreated();
	public void createKart(User user);
	public Double getTotalProducts();
	public void resetTotal();
	public void emptyKart();
}
