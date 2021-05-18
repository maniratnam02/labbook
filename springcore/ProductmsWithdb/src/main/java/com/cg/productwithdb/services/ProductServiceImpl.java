package com.cg.productwithdb.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.productwithdb.dao.IProductDao;
import com.cg.productwithdb.entities.Product;
import com.cg.productwithdb.exceptions.InvalidIdException;
import com.cg.productwithdb.exceptions.InvalidNameException;
import com.cg.productwithdb.exceptions.InvalidPriceException;

@Transactional
@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private IProductDao dao;
	
	@Override
	public Product createProduct(String name, int price) {
		validateName(name);
		validatePrice(price);
		Product product=new Product(name,price);
		Product added =dao.add(product);
		return added;
	}

	@Override
	public Product updatePrice(int id, int newPrice) {
		validateId(id);
        validatePrice(newPrice);
        Product product=dao.findById(id);
        product.setPrice(newPrice);
        Product changedprice=dao.update(product);
		return changedprice;
	}

	@Override
	public List<Product> findAll() {
		List<Product> list=dao.findAll();
		return list;
	}

	@Override
	public Product findById(int id) {
		validateId(id);
	    Product product= dao.findById(id);		
		return product;
	}
	
	void validateName(String name) {
		if(name==null||name.isEmpty())
			throw new InvalidNameException("Name is invalid");
	}
	void validatePrice(int price) {
		if(price<0) {
			throw new InvalidPriceException("Price is negative");
		}
	}
	void validateId(int id) {
		if(id<0) {
			throw new InvalidIdException("invalid id");
		}
	}
	
}
