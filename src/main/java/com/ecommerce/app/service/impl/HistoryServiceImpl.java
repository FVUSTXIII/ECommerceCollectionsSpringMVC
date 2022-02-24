package com.ecommerce.app.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.app.dao.HistoryDao;
import com.ecommerce.app.dto.ItemBought;
import com.ecommerce.app.entity.Kart.KartProduct;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.service.HistoryService;

@Service
public class HistoryServiceImpl implements HistoryService {
	@Autowired
	HistoryDao history_dao;

	@Override
	public HashMap<String, List<ItemBought>> getHistory() {
		// TODO Auto-generated method stub
		return history_dao.getHistory();
	}

	@Override
	public void addTransaction(String date, HashMap<KartProduct, Integer> bought_items) {
		// TODO Auto-generated method stub
		history_dao.addTransaction(date, bought_items);
	}

	@Override
	public void setUser(User user) {
		// TODO Auto-generated method stub
		history_dao.setUser(user);
	}
	
}
