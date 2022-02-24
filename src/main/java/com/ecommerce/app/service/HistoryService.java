package com.ecommerce.app.service;

import java.util.HashMap;
import java.util.List;

import com.ecommerce.app.dto.ItemBought;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.entity.Kart.KartProduct;

public interface HistoryService {
	HashMap<String, List<ItemBought>> getHistory();
	void addTransaction (String date, HashMap<KartProduct, Integer> bought_items);
	void setUser(User user);
}
