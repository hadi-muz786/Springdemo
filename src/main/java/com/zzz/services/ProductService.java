package com.zzz.services;

import org.springframework.stereotype.Service;

import com.zzz.dtos.ProductDto;

@Service
public class ProductService {

	public ProductDto giveDemoProduct() {
		ProductDto p = new ProductDto();
		p.setName("Iphone 11");
		p.setCategory("phone & Tablets");
		p.setDescription("This is the new iphone");
		return p;

	}

}
