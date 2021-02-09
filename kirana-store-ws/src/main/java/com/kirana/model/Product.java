package com.kirana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="PROD_ID")
	private String PROD_ID;
	
	@Column(name="PROD_TYPE")
	private String PROD_TYPE;
	
	@Column(name="PROD_NAME")
	private String PROD_NAME;
	
	@Column(name="PROD_PRICE")
	private String PROD_PRICE;
	
	@Column(name="PROD_QUANTITY")
	private String PROD_QUANTITY;
	
	@Lob
	@Column(name="PROD_IMAGE_1")
	private String PROD_IMAGE_1;
	
	@Lob	
	@Column(name="PROD_IMAGE_2")
	private String PROD_IMAGE_2;
	
	@Column(name="PROD_DESC")
	private String PROD_DESC;

}
