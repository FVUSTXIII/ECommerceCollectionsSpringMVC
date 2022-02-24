package com.ecommerce.app.dao.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.dao.HistoryDao;
import com.ecommerce.app.dto.ItemBought;
import com.ecommerce.app.entity.History;
import com.ecommerce.app.entity.Kart.KartProduct;
import com.ecommerce.app.entity.User;

@Repository
public class HistoryDaoImpl implements HistoryDao{
	
	static History history = new History();
	
	@Override
	public HashMap<String, List<ItemBought>> getHistory() {
		return history.getTransactions();
	}

	@Override
	public void addTransaction(String date, HashMap<KartProduct, Integer> bought_items) {
		// TODO Auto-generated method stub
		List<ItemBought> items = new ArrayList<>();
		bought_items.forEach((key, value) -> {
			ItemBought i = new ItemBought(key.getName(), value, key.getPrice());
			items.add(i);
		});
		history.getTransactions().put(date, items);
	}

	@Override
	public void setUser(User user) {
		history.setUser(user);	
	}
	
}
