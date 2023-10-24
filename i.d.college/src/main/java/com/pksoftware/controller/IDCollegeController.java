package com.pksoftware.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pksoftware.entity.IDCollege;
import com.pksoftware.service.IDCollegeService;

@RestController
public class IDCollegeController {

		@Autowired
		IDCollegeService collegeService;
	
		@GetMapping("/name/{name}")
		public String name(@PathVariable String name) {
			   return name;
		}
		
		//for insert data
		@PostMapping("/idcollege")
		public IDCollege insert(@RequestBody IDCollege college) {
			   IDCollege college2 = collegeService.insert(college);
			   return college2;
		}
		
		//FOR UPDATE 
		@PutMapping("/idcollege")
		public IDCollege update(@RequestBody IDCollege college) {
			   IDCollege college2 = collegeService.update(college);
			   return college2;
		}
		
		//FOR SELECT
		@GetMapping("/idcollege")
		public List<IDCollege> select(){
			   List<IDCollege> list = collegeService.select();
			   return list;
		}
		
		//FOR DELETE
		@DeleteMapping("/idcollege")
		public String delete(@PathVariable int id) {
			   String message = collegeService.delete(id);
			   return message;
		}
		
		@GetMapping("/idcollege/{id}")
		public IDCollege getById(@PathVariable int id) {
			   IDCollege idcollege = collegeService.getById(id);
			   return idcollege;
		}
}
