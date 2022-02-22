package com.ecommerce.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.ProductDao;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	ProductDao product_dao;
	
	
	@Override
	public List<Product> getProductList() {
		// TODO Auto-generated method stub
		return product_dao.getProducts();
	}


	@Override
	public void addToKart(Product p) {
		product_dao.addProductsToKart(p);
		
	}


	@Override
	public List lookUpByName(String name) {
		// TODO Auto-generated method stub
		return product_dao.lookUpByName(name);
	}


}
