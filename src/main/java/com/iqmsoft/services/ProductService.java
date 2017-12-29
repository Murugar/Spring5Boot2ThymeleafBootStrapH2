package com.iqmsoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iqmsoft.model.Product;
import com.iqmsoft.repository.ProductRepository;

@Service
public class ProductService{
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> list(){
		return productRepository.findAll();			
	}
}
