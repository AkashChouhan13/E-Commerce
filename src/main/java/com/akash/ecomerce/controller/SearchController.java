package com.akash.ecomerce.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.akash.ecomerce.model.Products;
import com.akash.ecomerce.service.ProductService;

public class SearchController 
{
	@Autowired
	private  ProductService productService;


    @GetMapping("/api/products/search")
    public Collection<Products> searchProducts(@RequestParam String query) {
        List<Products> matchingProducts = productService.searchProducts(query);
        return matchingProducts;
    }

}
