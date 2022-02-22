package com.ecommerce.app.dao.impl;

import java.util.Iterator;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.ObjectUtils;

import com.ecommerce.app.dao.KartDao;
import com.ecommerce.app.entity.Kart;
import com.ecommerce.app.entity.Kart.KartProduct;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;

@Repository
public class KartDaoImpl implements KartDao {

	@Autowired
	static Kart kart = null;
	Double total = 0.00;
	@Override
	public Integer getCartSize() {
		// TODO Auto-generated method stub
		return kart.getProductsSize();
	}

	@Override
	public void addToKart(Product prod) {
		kart.addElement(prod);
		
	}

	@Override
	public Boolean isKartCreater() {
		// TODO Auto-generated method stub
		System.out.println("llegamos hasta aqui?");
		return !(ObjectUtils.isEmpty(kart));
	}

	@Override
	public void createKart(User user) {
		// TODO Auto-generated method stub
		KartDaoImpl.kart = new Kart();
		KartDaoImpl.kart.setUser(user);
	}
 
	@Override
	public Double getTotal() {
		kart.getProducts().forEach((key, element)  -> {
			total += (key.getPrice() * element);
		});
		return total;
	}

	@Override
	public void resetTotal() {
		// TODO Auto-generated method stub
		this.total = 0.00;
	}
	
}
