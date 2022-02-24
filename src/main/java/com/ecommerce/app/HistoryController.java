package com.ecommerce.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.app.entity.Kart;
import com.ecommerce.app.service.HistoryService;
import com.ecommerce.app.service.KartService;

@Controller
public class HistoryController {
	@Autowired
	HistoryService history_service;
	@Autowired
	KartService kart_service;
	
	@RequestMapping(value = "/transactionsHistory", method = RequestMethod.GET)
	public String proceedToPayment(Model model, @RequestParam("date") String date) {		
		history_service.addTransaction(date, Kart.getProducts());
		
		kart_service.emptyKart();
		model.addAttribute("history", history_service.getHistory());
		return "historyView";
	}
}
