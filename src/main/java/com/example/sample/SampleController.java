package com.example.sample;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SampleController {
	
	 @GetMapping(value="/hello")
	    public String getAll(){
			 
	         return "welcome to sample automatic  daplication";
		 }

}
