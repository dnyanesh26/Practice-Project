package com.onlineShopping.dao;

import java.util.List;

import com.onlineShopping.beans.Product;

public interface ProductDao {
	public List<Product> getProducts();

	public Product addProduct(Product product);

}
