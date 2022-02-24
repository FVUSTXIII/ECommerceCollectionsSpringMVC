package com.ecommerce.app.entity;

import java.util.HashMap;
import java.util.List;

import com.ecommerce.app.dto.ItemBought;

public class History {
	
	private User user;
		
	public User getUser() {
		return user;
	}

	public static void setTransactions(HashMap<String, List<ItemBought>> transactions) {
		History.transactions = transactions;
	}

	private static HashMap<String, List<ItemBought>> transactions = new HashMap<>();
	
	public  HashMap<String, List<ItemBought>> getTransactions() {
		return transactions;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
}
