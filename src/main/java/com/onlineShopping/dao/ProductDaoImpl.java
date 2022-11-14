package com.onlineShopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.onlineShopping.beans.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public List<Product> getProducts() {
		Query qry=em.createQuery("select p from Product p ");
		List<Product> productList=qry.getResultList();
		return productList;
	}


	@Override
	@Transactional
	public Product addProduct(Product product) {
		em.persist(product);
		return product;
	}

}
