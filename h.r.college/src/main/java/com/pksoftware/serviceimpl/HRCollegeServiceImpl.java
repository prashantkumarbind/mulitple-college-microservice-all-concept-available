package com.pksoftware.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pksoftware.dao.HRCollegeDao;
import com.pksoftware.entity.HRCollege;
import com.pksoftware.service.HRCollegeService;


@Component
public class HRCollegeServiceImpl implements HRCollegeService{

	@Autowired
	HRCollegeDao collegeDao;
	
	@Override
	public HRCollege insert(HRCollege college) {
		HRCollege college2 = collegeDao.save(college); 
		return college2;
	}

	@Override
	public List<HRCollege> select() {
		List<HRCollege> list = collegeDao.findAll();
		return list;
	}

	@Override
	public HRCollege update(HRCollege college) {
		HRCollege hr = null;
		Optional<HRCollege> opt = collegeDao.findById(college.getS_no());
		if(opt.isPresent())
		{
			  hr = opt.get();
		}
		return hr;
	}

	@Override
	public String delete(int id) {
		String message ="not found";
		Optional<HRCollege> opt = collegeDao.findById(id);
		if(opt.isPresent())
		{
			  collegeDao.deleteById(id);
			  message = "deleted successfuly";
		}
		return message;
	}

	@Override
	public HRCollege getById(int id) {
		   HRCollege college=null;
		   Optional<HRCollege> optional = collegeDao.findById(id);
		   if(optional.isPresent())
		   {
			     college = optional.get();
		   }
		   return college;
	}

}
