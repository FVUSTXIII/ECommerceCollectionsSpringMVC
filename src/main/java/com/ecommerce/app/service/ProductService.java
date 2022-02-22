package com.ecommerce.app.service;

import java.util.List;

import com.ecommerce.app.entity.Product;

public interface ProductService {

	public List<Product> getProductList();
	public void addToKart(Product p);
	public List lookUpByName(String name);

}
