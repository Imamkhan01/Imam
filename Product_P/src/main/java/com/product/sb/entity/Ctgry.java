package com.product.sb.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ctgry {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "ct_id",referencedColumnName = "cid")
	private List<Product> pro;

}
