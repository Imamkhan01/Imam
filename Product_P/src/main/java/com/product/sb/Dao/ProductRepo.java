package com.product.sb.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.sb.entity.Product;
@Repository

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
