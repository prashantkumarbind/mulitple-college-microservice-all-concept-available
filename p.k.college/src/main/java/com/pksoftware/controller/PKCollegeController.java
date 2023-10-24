package com.pksoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pksoftware.entity.PKCollege;
import com.pksoftware.service.PKCollegeService;

@RestController
public class PKCollegeController {

		@Autowired
		PKCollegeService service;
		
		@GetMapping("/name/{name}")
		public String getName(@PathVariable String name) {
			    return name;
		}
		
		@GetMapping("/check")
		public String check() {
			 return "*************** Your Message *******************";
		}
		
		@PostMapping("/pkcollege")
		public PKCollege insert(PKCollege college) {
			   PKCollege college2 = service.insert(college);
			   return college2;
		}
		
		@PutMapping("/pkcollege")
		public PKCollege update(PKCollege college) {
			   PKCollege college2 = service.update(college);
			   return college2;
			   
		}
		
		@GetMapping("/pkcollege")
		public List<PKCollege> select(){
			   List<PKCollege> list = service.select();
			   return list;
		}
		
		@DeleteMapping("/pkcollege/{id}")
		public String delete(@PathVariable int id) {
				String message = service.delete(id);
			    return message; 
		}
		
		@GetMapping("/pkcollege/{id}")
		public PKCollege getById(@PathVariable int id) {
			   PKCollege pkcollege = service.getById(id);
			   return pkcollege;
		}
}
