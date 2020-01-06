package com.zzz.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.zzz.dtos.ProductDto;
import com.zzz.services.ProductService;

@Controller
public class ProductController {
	private ProductService prodserv;

	@RequestMapping(value = "product", method = RequestMethod.GET)
	public ModelAndView showpage() {
		System.out.println("Iam inside product api");

		ProductDto p = prodserv.giveDemoProduct();
		System.out.println(p.toString());

		ModelAndView mv = new ModelAndView("product");
		mv.addObject("username", "Hadi");
		mv.addObject("pt", p);

		return mv;

	}

	@RequestMapping(value = "product-form", method = RequestMethod.GET)
	public ModelAndView showProductPage() {
		ProductDto p = new ProductDto();

		ModelAndView mv = new ModelAndView("product-form");
		mv.addObject("productObj", p);
		return mv;

	}

	@RequestMapping(value = "save-product", method = RequestMethod.POST)
	public ModelAndView saveProduct(ProductDto product) {
		System.out.println("i am receiving product from user");
		System.out.println(product.toString());

		ModelAndView mv = new ModelAndView("product");
		mv.addObject("pt", product);
		return mv;
	}

	public ProductService getProdserv() {
		return prodserv;
	}

	public void setProdserv(ProductService prodserv) {
		this.prodserv = prodserv;
	}

}