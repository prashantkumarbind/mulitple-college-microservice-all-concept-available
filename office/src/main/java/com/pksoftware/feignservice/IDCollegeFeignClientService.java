package com.pksoftware.feignservice;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pksoftware.controller.entity.IDCollege;


@FeignClient(url="http://localhost:8198", value="IDCollege")
public interface IDCollegeFeignClientService {

		 @GetMapping("/idcollege/{id}")
		 public IDCollege idCollegeData(@PathVariable int id);
		 
		 @GetMapping("/idcollege")
		 public List<IDCollege> idcollegeAllDataByFeignCleint();
}
