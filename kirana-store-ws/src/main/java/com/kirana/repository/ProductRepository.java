package com.kirana.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kirana.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
