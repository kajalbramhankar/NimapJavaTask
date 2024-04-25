package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.CategoryDao;
import com.demo.model.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Autowired
    public CategoryDao cd;


	@Override
	public Category save(Category c) {
		// TODO Auto-generated method stub
		return cd.save(c);
	}

	@Override
	public Category findByCid(long id) {
		// TODO Auto-generated method stub
		return cd.findByCid(id);
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return cd.findAll();
	}

	@Override
	public int deleteByCid(long cid) {
		// TODO Auto-generated method stub
		return cd.deleteByCid(cid);
	}

	@Override
	public Category updateByCid(Category c , long cid) {
		Category c1 = cd.findByCid(cid);
		return cd.save(c);
	}

	
	
	

}
