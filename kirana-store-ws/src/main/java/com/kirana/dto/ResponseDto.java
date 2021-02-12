package com.kirana.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.kirana.model.Product;

public class ResponseDto {
	
	   public final List<Product> products;
	   public final Map<String, Integer> page;

	    public ResponseDto(final List<Product> products, final Map<String, Integer> page) {
	        this.products = new ArrayList<>(products);
	        this.page = new HashMap<>(page);
	    }

	    public static ResponseDto create(final List<Product> products, final Map<String, Integer> page) {
	        return new ResponseDto(products, page);
	    }

	    public List<Product> getResidents() {
	        return products;
	    }

	    public Map<String, Integer> getPage() {
	        return page;
	    }

}
