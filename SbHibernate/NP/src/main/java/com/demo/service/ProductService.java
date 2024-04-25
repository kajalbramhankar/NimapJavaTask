package com.demo.service;

import java.util.List;

import com.demo.model.Product;

public interface ProductService 
{
	Product save(Product p);
	
	// created this method because product need category id as foreign key, so it is important to give cid to product p
	Product createProduct(Product p, long cid);
	Product findByPid(long pid);
	//Product updateByPid(Product p, long pid, long cid);
	
	Product updateByPid(Product p, long pid, long cid) ;
	List<Product>findAll();
	int deleteByPid(long pid);
	
}
