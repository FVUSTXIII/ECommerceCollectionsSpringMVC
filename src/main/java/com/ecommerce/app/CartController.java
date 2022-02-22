package com.ecommerce.app;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.standard.DateTimeContext;
import org.springframework.format.datetime.standard.DateTimeContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ecommerce.app.entity.Kart;
import com.ecommerce.app.entity.Product;
import com.ecommerce.app.service.KartService;
import com.ecommerce.app.service.ProductService;
import com.ecommerce.app.service.UserService;

@Controller
public class CartController {
	@Autowired
	ProductService product_service;
	@Autowired
	KartService kart_service;
	@Autowired
	UserService user_service;
	
	@RequestMapping(value = "/addToKart", method = RequestMethod.POST)
	public String addProductToKart(@ModelAttribute Product product, Model model) {
		product_service.addToKart(product);
		kart_service.addToKart(product);
		List products = product_service.getProductList();
		System.out.println("ID DEL USUARIO: " + user_service.getCurrentUser().getUserId() );
		model.addAttribute("user", user_service.getCurrentUser());
		model.addAttribute("cartSize", kart_service.getCartSize());
		model.addAttribute("products", products);
		model.addAttribute("product", product);
		return "productsView";
	}
	
	@RequestMapping(value="/viewCart", method = RequestMethod.GET)
	public String showCart(Model model, @RequestParam("userId") Integer userID) {
		model.addAttribute("CartElements", Kart.getProducts());
		model.addAttribute("total", kart_service.getTotalProducts());
		model.addAttribute("fecha", LocalDateTime.now());
		kart_service.resetTotal();
		return "cartView";
	}
}
