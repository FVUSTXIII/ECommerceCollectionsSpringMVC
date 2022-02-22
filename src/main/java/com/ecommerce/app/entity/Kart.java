package com.ecommerce.app.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Kart {
	public class KartProduct {
		private Integer id;
		private String name;
		private Double price;
		
		public KartProduct(Integer id, String name, Double price) {
			this.id = id;
			this.name = name;
			this.price = price;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Double getPrice() {
			return price;
		}
		public void setPrice(Double price) {
			this.price = price;
		}
		
		
	}
	private static HashMap<KartProduct, Integer> products = new HashMap<>();
	private User user;
	public User getUser() {
		return this.user;
	}
	public Integer getProductsSize() {
		Integer counter = 0;
		Iterator<Integer> quantities = products.values().iterator();
		while (quantities.hasNext()) {
			counter += quantities.next().intValue();
		}
		return counter;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Boolean elementFound(Product product) {
		 Boolean prod = false;
		 Iterator<KartProduct> products_in_car = products.keySet().iterator();
		 
		 while (products_in_car.hasNext()) {
			 KartProduct aux = products_in_car.next();
			 if (aux.getName().equals(product.getName())) {
				 prod = true;
				 products.replace(aux, products.get(aux), products.get(aux)+1);
			 }
		 }
		 return prod;
	}
	
	public void addElement(Product product) {
		if (!elementFound(product)) {
			KartProduct aux = new KartProduct(product.getId(), product.getName(), product.getPrice());
			products.put(aux, 1);
		}
	}
	
	public static HashMap<KartProduct, Integer> getProducts() {
		return products;
	}
}
