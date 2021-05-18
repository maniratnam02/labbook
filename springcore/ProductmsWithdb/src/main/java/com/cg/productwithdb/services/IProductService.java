package com.cg.productwithdb.services;

import java.util.List;

import com.cg.productwithdb.entities.Product;

public interface IProductService {
	
	Product createProduct(String name,int price); 

	Product updatePrice(int id, int newPrice);

	List<Product>findAll();

	Product findById(int id); 
}
