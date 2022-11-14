package com.onlineShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.onlineShopping.beans.Product;
import com.onlineShopping.services.ProductService;

@RestController
@CrossOrigin("*")
@RequestMapping("/product-api")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getClaimList()
	{
		return ResponseEntity.ok(service.getProducts());
	}
	
	@PostMapping(path="/add-product")
	public ResponseEntity<Product> addProduct(@RequestBody Product product)
	{	
		
		return ResponseEntity.ok(service.addProduct(product));
	}
	

}
