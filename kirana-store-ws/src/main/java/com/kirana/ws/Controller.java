package com.kirana.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kirana.services.CommonUtils;

@RestController
public class Controller {
	
	@Autowired
	CommonUtils commonUtils;
	
}
