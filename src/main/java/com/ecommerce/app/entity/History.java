package com.ecommerce.app.entity;

import java.util.HashMap;
import java.util.List;

import com.ecommerce.app.dto.ItemBought;

public class History {
	
	private User user;
		
	private static HashMap<String, List<ItemBought>> transactions = new HashMap<>();
	
	public  HashMap<String, List<ItemBought>> getTransactions() {
		return transactions;
	}
}
