package com.pksoftware.service;

import java.util.List;

import com.pksoftware.controller.entity.AllManage;
import com.pksoftware.controller.entity.HRCollege;
import com.pksoftware.controller.entity.IDCollege;
import com.pksoftware.controller.entity.PKCollege;

public interface Microservices {

		   AllManage microservices(int id);
		   PKCollege pkWork(int id);
		   String check();
		   HRCollege hrWork(int id);
		   IDCollege idWork(int id);
		   String hrTesting(String name);
		   /*************************************/
		   AllManage secondMethodUse(int id);
		   //bellow for use method OpenFeign Client concept
		   //I.D. College
		   IDCollege idCollegeDataByFeignClient(int id);
		   List<IDCollege> idCollegeAllDataByFeignClient();
		   
		   //P.K. College
		   PKCollege pkCollegeDataByFeignClient(int id);
		   List<PKCollege> pkCollegeAllDataByFeignClient();
		   
		   //H.R. College
		   HRCollege hrCollegeDataByFeignClient(int id);
		   List<HRCollege> hrCollegeAllDataByFeignClient();
		   
}
