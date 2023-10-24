package com.pksoftware.service;

import java.util.List;

import com.pksoftware.entity.IDCollege;

public interface IDCollegeService {

		IDCollege insert(IDCollege college);
		IDCollege update(IDCollege college);
		List<IDCollege> select();
		String delete(int id);
		IDCollege getById(int id);
}
