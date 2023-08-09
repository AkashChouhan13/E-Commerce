package com.akash.ecomerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products
{
	@Id
    private long id;
	
	
    private String name;
    private String description;

}
