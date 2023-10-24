package com.pksoftware.service;

import java.util.List;

import com.pksoftware.entity.PKCollege;

public interface PKCollegeService {

		PKCollege insert(PKCollege college);
		PKCollege update(PKCollege college);
		List<PKCollege> select();
		String delete(int id);
		PKCollege getById(int id);
}
