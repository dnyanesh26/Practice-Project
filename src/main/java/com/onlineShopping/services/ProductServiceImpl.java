package com.onlineShopping.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlineShopping.beans.Product;
import com.onlineShopping.dao.ProductDao;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return dao.getProducts();
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

}
