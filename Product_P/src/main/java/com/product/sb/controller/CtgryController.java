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
import com.product.sb.service.CtgryService;
@RestController
@RequestMapping("/ctgy")
public class CtgryController {
	
	@Autowired
	private CtgryService ctgryService;
	
	@PostMapping
	private Ctgry add(@RequestBody Ctgry ctgry)
	{
		System.out.println("hii");
		return ctgryService.addOrupdate(ctgry);
	}
	
	@GetMapping
	private List<Ctgry> getall()
	{
		return ctgryService.getAllCtgry();
	}	
	@GetMapping("/{id}")
   private Ctgry getidd(@PathVariable int id)
   {
	   return ctgryService.getByid(id);
   }
	@PutMapping("/{id}")
	private Ctgry update(@PathVariable int id, Ctgry ctgry)
	{
		return ctgryService.addOrupdate(ctgry);
	}
	@DeleteMapping("/{id}")
	private void delete(int id)
	{
		ctgryService.delete(id);
	}
	
}
