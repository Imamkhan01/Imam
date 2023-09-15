package com.product.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.sb.Dao.ProductRepo;
import com.product.sb.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	
	public Product addOrupdate(Product product)
	{
		return productRepo.save(product);
	}
	
	public void delete(int id)
	{
		productRepo.deleteById(id);
	}
	
	public Product getByid(int id)
	{
		return productRepo.findById(id).get();
	}
	
	
    public List<Product> getAllProduct()
	{
		 return productRepo.findAll();
	}
	
	
	
	
	
	

}

