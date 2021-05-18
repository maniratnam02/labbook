package com.cg.productwithdb.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.productwithdb.entities.Product;

@Repository
public class ProductDaoImpl implements IProductDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Product add(Product product) {
		entityManager.persist(product);
		return product;
	}

	@Override
	public Product update(Product product) {
		Product updated=entityManager.merge(product);
		return updated;
	}

	@Override
	public List<Product> findAll() {
		String qlText="from Product";
        TypedQuery<Product>query= entityManager.createQuery(qlText,Product.class);
        List<Product>list= query.getResultList();
        return list;
	}

	@Override
	public Product findById(int id) {
		Product product=entityManager.find(Product.class, id);
		return product;
	}

}
