package com.ecommerce.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.KartDao;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.service.KartService;

@Service
public class KartServiceImpl implements KartService {
	
	@Autowired
	KartDao kart_dao;
	
	
	@Override
	public Integer getCartSize() {
		// TODO Auto-generated method stub
		return kart_dao.getCartSize();
	}

	@Override
	public void addToKart(Product prod) {
		kart_dao.addToKart(prod);
		
	}

	@Override
	public Boolean isKartCreated() {
		// TODO Auto-generated method stub
		return kart_dao.isKartCreater();
	}

	@Override
	public void createKart(User user) {
		// TODO Auto-generated method stub
		kart_dao.createKart(user);
		
	}

	@Override
	public Double getTotalProducts() {
		// TODO Auto-generated method stub
		return kart_dao.getTotal();
	}

	@Override
	public void resetTotal() {
		// TODO Auto-generated method stub
		kart_dao.resetTotal();
	}

}
