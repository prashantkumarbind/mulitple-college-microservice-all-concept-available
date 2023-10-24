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

import com.pksoftware.entity.HRCollege;
import com.pksoftware.service.HRCollegeService;

@RestController
public class HRCollegeController {

		@Autowired
		HRCollegeService collegeService;
		
		@GetMapping("/testing/{name}")
		public String getName(@PathVariable String name) {
			   return "************************You input name is the::***********************"+name;
		}
		
		//for insert value concept
		@PostMapping("/hrcollege")
		public HRCollege insert(@RequestBody HRCollege c) {
			   HRCollege college = collegeService.insert(c);
			   return college;
		}
		
		//for get all value
		@GetMapping("/hrcollege")
		public List<HRCollege> getAll(){
			 List<HRCollege> colleges = collegeService.select();
			 return colleges;
		}
		
		//update data 
		@PutMapping("/hrcollege")
		public HRCollege update(@RequestBody HRCollege college) {
			   HRCollege hr = collegeService.update(college);
			   return hr;
		}
		
		//delete data
		@DeleteMapping("/hrcollege/{id}")
		public String delete(@PathVariable int id) {
			   String message = collegeService.delete(id);
			   return message;
		}
		@GetMapping("/hrcollege/{id}")
		public HRCollege getById(@PathVariable int id) {
			   HRCollege college = collegeService.getById(id);
			   return college;
		}
		
	
}
