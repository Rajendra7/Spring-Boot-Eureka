package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class WebsiteController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping
	public String helloworld(Model model) {
		
		  String output = restTemplate .exchange("http://first", HttpMethod.GET, null,
		  new ParameterizedTypeReference<String>() { }).getBody();
		 
		 model.addAttribute("Hello", output); 
		
		return "helloworld";
	}

}