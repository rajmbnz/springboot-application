package com.example.testhello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
    @RestController
    public class MyController {
    	@GetMapping("/testhello")
    	public String hello()
    	{
    	  return"Hello Word!";
    	}

}
