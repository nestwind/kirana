package com.kirana.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kirana.dto.ResponseDto;
import com.kirana.model.Product;
import com.kirana.services.CommonUtils;
import com.kirana.services.ProductsService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class Controllers {
	
	private static final int DEFAULT_PAGE_NUMBER = 1;
	private static final int DEFAULT_PAGE_SIZE = 10;
	
	@Autowired
	CommonUtils commonUtils;
	
	@Autowired
	ProductsService productService;
	
	@GetMapping(value = "/")
	public String viewIndexPage() {
	     log.info("Redirecting the index page to the controller method for fetching the residents in a paginated fashion.");
	     return "redirect:products/paginated/" + DEFAULT_PAGE_NUMBER + "/" + DEFAULT_PAGE_SIZE;
	}
	
	@GetMapping(value = "/products/paginated/{page}/{page-size}")
	public String getPaginatedProductList(@PathVariable(name = "page") final int pageNumber, @PathVariable (name="page-size") final int pageSize, final Model model)
	{
		log.info("Getting paginated data for page-number = {} and page-size = {}", pageNumber, pageSize);
		
		final Page<Product> paginatedProducts = productService.getPaginatedProducts(pageNumber, pageSize);
		model.addAttribute("responseEntity", createResponseDto(paginatedProducts, pageNumber));
		return "index";
	}
	
	private ResponseDto createResponseDto(final Page<Product> productPage, final int pageNumber)
	{
		final Map<String, Integer> page = new HashMap<>();
		page.put("currentPage", pageNumber);
		
		/*
        Here we are fetching the total number of records from the Page interface of the Spring itself.
        We can also customize this logic based on the total number of elements retrieved from the query.
       */
		
		page.put("totalPages", productPage.getTotalPages());
        page.put("totalElements", (int) productPage.getTotalElements());
        return ResponseDto.create(productPage.getContent(), page);
		
	}
	
	
}
