package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.ProductDao;
import com.demo.model.Category;
import com.demo.model.Product;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	public ProductDao pd;
	
	@Autowired
	 CategoryService cs;
	Product product = new Product();
	

	@Override
	public Product save(Product p) {
		// TODO Auto-generated method stub
		return pd.save(p);
	}
	
  public  Product createProduct(Product p, long cid)
  {
	 //this method sets category to the product by finding category by its id and providiing that category object to the Product p
	  
	  Category c = cs.findByCid(cid);
	
	  p.setCategory(c);
	  System.out.print(p);
	  
	  return pd.save(p);
	  
  }

@Override
public Product findByPid(long pid) {
	// TODO Auto-generated method stub
	return pd.findByPid(pid);
}

// this method matters when we need to update a product for updating product it need whole product by id whichi already available in table
// and cid too
public Product updateByPid(Product p,long pid, long cid) 
{
	Product p1 = pd.findByPid(pid);
	Category c = cs.findByCid(cid);
	p.setPname(p1.getPname());
	p.setPrice(p1.getPrice());
	p.setCategory(c);
	
	return pd.save(p);
}

@Override
public List<Product> findAll() {
	// TODO Auto-generated method stub
	return pd.findAll();
}

@Override
public int deleteByPid(long pid) {
	// TODO Auto-generated method stub
	return pd.deleteByPid(pid);
}
}
