package com.akash.ecomerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.akash.ecomerce.model.Products;
import com.akash.ecomerce.repo.ProductRepository;

@Service
public class ProductService 
{
	@Autowired
	private ProductRepository productRepo;
	public List<Products> searchProducts(String query) 
	{
        return productRepo.findAllByNameContainingIgnoreCase(query);
    }

}
