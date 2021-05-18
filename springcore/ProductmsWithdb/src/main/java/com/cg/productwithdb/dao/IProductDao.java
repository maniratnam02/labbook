package com.cg.productwithdb.dao;

import java.util.List;

import com.cg.productwithdb.entities.Product;

public interface IProductDao {
	
	Product add(Product product);

	Product update(Product product);

	List<Product>findAll();

	Product findById(int id); 
}
