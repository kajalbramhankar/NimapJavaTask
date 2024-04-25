package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Category;
import com.demo.service.CategoryService;

@RestController
@RequestMapping
public class CategoryController {
    @Autowired
	public CategoryService cs;
    
    // post mapping to insert a new record of category into a table
    // it takes whole category object as input
    @PostMapping(value="/api/categories")
    public Category insertCategory(@RequestBody Category c)
    {
    	return cs.save(c);
    }
    
    // get mapping to get category by id
    // it takes category id as a parameter
    @GetMapping(value="/api/categories")
    public Category findByCid(@RequestParam("a") long cid)
    {
    	return cs.findByCid(cid);
    }
    
    // get mappping to get all records in category table
    @GetMapping(value="api/categories/page=3")
    public List<Category> getAll()
    {
    	return cs.findAll();
    }
   
    // delete mapping to delete a record in category table
    @DeleteMapping(value="api/categories")
    public int deleteById(@RequestParam("a") long cid)
    {
    	return cs.deleteByCid(cid);
    }
    
    // put mapping to update a category from category table 
    // it takes a category object and id as parameter
    @PutMapping(value="api/categories")
    public Category updateByCid(@RequestBody Category c , @RequestParam("a") long cid)
    {
    	return cs.updateByCid(c, cid);
    }
    
    //Put method to update a category by its id
    @PutMapping(value="/m")
    public Category updateCategory(@RequestBody Category c,@RequestParam("a") long cid)
    {
    	Category c1 = cs.findByCid(cid);
    	return cs.save(c);
    }
}
