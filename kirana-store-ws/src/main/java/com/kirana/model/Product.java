package com.kirana.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity(name="KIRANA_PRODUCT")
@Table(name="KIRANA_PRODUCT")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="PROD_ID")
	public String PROD_ID;
	
	@Column(name="PROD_TYPE")
	public String PROD_TYPE;
	
	@Column(name="PROD_NAME")
	public String PROD_NAME;
	
	@Column(name="PROD_PRICE")
	public String PROD_PRICE;
	
	@Column(name="PROD_QUANTITY")
	public String PROD_QUANTITY;
	
	@Lob
	@Column(name="PROD_IMAGE_1")
	public String PROD_IMAGE_1;
	
	@Lob	
	@Column(name="PROD_IMAGE_2")
	public String PROD_IMAGE_2;
	
	@Column(name="PROD_DESC")
	public String PROD_DESC;

}
