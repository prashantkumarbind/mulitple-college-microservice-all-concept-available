package com.pksoftware.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pksoftware.dao.PKCollegeDao;
import com.pksoftware.entity.PKCollege;
import com.pksoftware.service.PKCollegeService;


@Component
public class PKCollegeServiceImpl implements PKCollegeService{

	@Autowired
	PKCollegeDao collegeDao;
	
	@Override
	public PKCollege insert(PKCollege college) {
		   PKCollege college2 = collegeDao.save(college);
		return college2;
	}

	@Override
	public PKCollege update(PKCollege college) {
		PKCollege college2 = null;
		Optional<PKCollege> optional = collegeDao.findById(college.getS_no());
		if(optional.isPresent()) {
			   college2 = collegeDao.save(college);
			   
		}
		return college2;
	}

	@Override
	public List<PKCollege> select() {
			List<PKCollege> colleges = collegeDao.findAll();
		return colleges;
	}

	@Override
	public String delete(int id) {
		   String message="file not found";
		   Optional<PKCollege> optional = collegeDao.findById(id);
		   if(optional.isPresent())
		   {
			     collegeDao.deleteById(id);
			     message="delete successfully";
		   }
		return message;
	}

	@Override
	public PKCollege getById(int id) {
		PKCollege pkcollege = null;
		Optional<PKCollege> opt = collegeDao.findById(id);
		if(opt.isPresent())
		{
			  pkcollege = opt.get();
		}
		return pkcollege;
	}
}
