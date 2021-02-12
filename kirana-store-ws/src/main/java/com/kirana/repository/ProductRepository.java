package com.kirana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kirana.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {
	
	@Query("SELECT DISTINCT PROD_TYPE FROM KIRANA_PRODUCT")
	public List<String> getAllProductTypes();
	

}
