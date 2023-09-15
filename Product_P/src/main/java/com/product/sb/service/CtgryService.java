package com.product.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.sb.Dao.CtgryRepo;
import com.product.sb.Dao.ProductRepo;
import com.product.sb.entity.Ctgry;
import com.product.sb.entity.Product;

@Service
public class CtgryService {
	
	@Autowired
	private CtgryRepo ctgryProductRepo;
	
	public Ctgry addOrupdate(Ctgry ctgry)
	{
		return ctgryProductRepo.save(ctgry);
	}
	
	public void delete(int id)
	{
		ctgryProductRepo.deleteById(id);
	}
	
	public Ctgry getByid(int id)
	{
		return ctgryProductRepo.findById(id).get();
	}
	
	
    public List<Ctgry> getAllCtgry()
	{
		 return ctgryProductRepo.findAll();
	}
	

}
