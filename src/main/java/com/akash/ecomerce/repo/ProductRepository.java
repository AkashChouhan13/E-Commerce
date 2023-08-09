package com.akash.ecomerce.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.akash.ecomerce.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long> 
{
    List<Products> findAllByNameContainingIgnoreCase(String name);
}
