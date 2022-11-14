package com.onlineShopping.services;

import java.util.List;

import com.onlineShopping.beans.Product;

public interface ProductService {
	
	public List<Product> getProducts();

	public Product addProduct(Product product);

}
