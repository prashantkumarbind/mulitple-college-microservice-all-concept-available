package com.pksoftware.controller.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AllManage {
	
	PKCollege pkcollege;
	HRCollege hrcollege;
	IDCollege idcollege;
	public PKCollege getPkcollege() {
		return pkcollege;
	}
	public void setPkcollege(PKCollege pkcollege) {
		this.pkcollege = pkcollege;
	}
	public HRCollege getHrcollege() {
		return hrcollege;
	}
	public void setHrcollege(HRCollege hrcollege) {
		this.hrcollege = hrcollege;
	}
	public IDCollege getIdcollege() {
		return idcollege;
	}
	public void setIdcollege(IDCollege idcollege) {
		this.idcollege = idcollege;
	}
	
	

}
