package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.ProductDao;
import com.ecommerce.app.entity.Kart;
import com.ecommerce.app.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	static List<Product> prouducts;
	
	public ProductDaoImpl() {
		if (prouducts == null) {
			prouducts = new ArrayList<Product>();
		}
	}
	
	@Override
	public List<Product> getProducts() {
		Product product1 = new Product();
		product1.setName("Samsung A20");
		product1.setCategory("Cellphone");
		product1.setPrice(1820.45);
		product1.setQuantity(15);
		
		Product product2 = new Product();
		product2.setName("Iphone 11");
		product2.setCategory("Cellphone");
		product2.setPrice(11820.45);
		product2.setQuantity(5);
		
		Product product3 = new Product();
		product3.setName("TELEVISION");
		product3.setCategory("TV");
		product3.setPrice(18120.45);
		product3.setQuantity(20);
		if (this.prouducts.size() ==	 0) {
			this.prouducts.add(product1);
			this.prouducts.add(product2);
			this.prouducts.add(product3);
		}
		
		return this.prouducts;
	}

	@Override
	public void addProductsToKart(Product prod) {
		
		System.out.println("hola? llegamos hasta el método de agregar al carro con " + prod.getName());
		prouducts.forEach(p -> {
			System.out.println("Name: " + p.getName() + " Quantity: " + p.getQuantity());
			if (p.getName().equalsIgnoreCase(prod.getName())) {
				p.setQuantity((p.getQuantity() - 1));
				System.out.println(p.getQuantity());
			}
		});
		
	}

	@Override
	public List lookUpByName(String name) {
		List<Product> new_product_list = new ArrayList<>();
			prouducts.forEach(product -> {
				if (product.getName().matches("(.*)" + name + "(.*)")) {
					new_product_list.add(product);
				}
			});
		if (!(name.trim().length() > 0)) {
			return this.prouducts;
		}
		return new_product_list;
	}

	
	
	
}
