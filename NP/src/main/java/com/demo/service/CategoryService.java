package com.demo.service;

import java.util.List;

import com.demo.model.Category;

public interface CategoryService {
	
	Category save(Category c);
	Category findByCid(long id);
	List<Category> findAll();
	int deleteByCid(long cid);
	Category updateByCid(Category c, long cid);
}
