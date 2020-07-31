package com.youhubs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	@Autowired
	private ProductService service;

	@RequestMapping("/")
	public String HomeView(Model model) {
		List<Product> products = service.listAll();
		model.addAttribute("products", products);

		return "index";
	}
}
