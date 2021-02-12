package com.kirana.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kirana.model.Product;
import com.kirana.repository.ProductRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductsService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void save(final Product product)
	{
		productRepository.save(product);
	}
	
	public long getProductCount()
	{
		return productRepository.count();
	}
	
	public Page getPaginatedProducts(final int pageNumber, final int pageSize)
	{
		log.info("Fetching paginated products data from db");
		final Pageable pageable = PageRequest.of(pageNumber - 1, pageSize);
		return productRepository.findAll(pageable);		
	}
	
	public List<String> getAllProductCategories()
	{
		return productRepository.getAllProductTypes();
	}

}
