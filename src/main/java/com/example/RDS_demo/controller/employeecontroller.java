package com.example.RDS_demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/employees")
public class employeecontroller {

    
    	@GetMapping("App4/getEmployee")
    	public String hello() {

    	    return ("hello docker");
    	}
    	@GetMapping("/test-error")
    	public String testError() {
    	    throw new RuntimeException("Testing CloudWatch Error");
    	}
    	@GetMapping("/version")
    	public String version() {
    	    return "VERSION-2";
    	}

 



}


