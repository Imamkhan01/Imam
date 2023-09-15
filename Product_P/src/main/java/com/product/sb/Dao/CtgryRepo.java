package com.product.sb.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.sb.entity.Ctgry;
@Repository
public  interface CtgryRepo extends JpaRepository<Ctgry, Integer> {

}
