package com.pksoftware.feignservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pksoftware.controller.entity.PKCollege;

@FeignClient(url="http://localhost:8197", value="PKCollege")
public interface PKCollegeFeignClientService {

		//by id
		@GetMapping("/pkcollege/{id}")
		public PKCollege pkCollegeDataByFeignClient(@PathVariable int id);
		
		//all data 
		@GetMapping("/pkcollege")
		public List<PKCollege> pkCollegeAllDataByFeignClient();
}
