package com.ecommerce.app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ecommerce.app.entity.Product;
import com.ecommerce.app.entity.User;
import com.ecommerce.app.service.KartService;
import com.ecommerce.app.service.ProductService;
import com.ecommerce.app.service.UserService;

@Controller
public class ProductController {
	@Autowired
	ProductService product_service;
	@Autowired
	KartService kart_service;
	@Autowired
	UserService user_service;
	@RequestMapping(value = "/getProducts", method = RequestMethod.GET)
	public String getAllProducts(Model model) {
		System.out.println("hola, llegamos?");
		List<Product> products = product_service.getProductList();
		Product product = new Product();
		if (!kart_service.isKartCreated()) {
			kart_service.createKart(user_service.getCurrentUser());
		}
		model.addAttribute("user", user_service.getCurrentUser());
		model.addAttribute("cartSize", kart_service.getCartSize());
		model.addAttribute("product", product);
		model.addAttribute("products", products);
		return "productsView";
	}
	
	
	@RequestMapping(value = "/searchByName", method = RequestMethod.POST)
	public String searchByName(@ModelAttribute Product product, Model model) {
		List products = product_service.lookUpByName(product.getName());
		model.addAttribute("user", user_service.getCurrentUser());
		model.addAttribute("cartSize", kart_service.getCartSize());
		model.addAttribute("products", products);
		model.addAttribute("product", product);
		return "productsView";
	}
	
}
