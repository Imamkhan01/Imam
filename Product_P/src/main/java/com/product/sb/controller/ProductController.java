package com.product.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.sb.entity.Ctgry;
import com.product.sb.entity.Product;
import com.product.sb.service.CtgryService;
import com.product.sb.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping()
	private List<Product> getall()
	{
		return productService.getAllProduct();
	}
	@PostMapping
	private Product add(@RequestBody Product product)
	{
		return productService.addOrupdate(product);
	}
	@PutMapping("/{id}")
	private Product update(@PathVariable int id, @RequestBody Product product)
	{
		
	   return productService.addOrupdate(product);	
	}
	@DeleteMapping("/{id}")
	private void delete(@PathVariable int id)
	{
		productService.delete(id);
	}
	@GetMapping("/{id}")
	
    private Product getbyid(@PathVariable int id)
    {
		return productService.getByid(id);
    }
}
