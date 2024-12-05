package com.qsp.controller;
import com.qsp.model.Student;
public interface StudentDBMS {
	void save(Student s);
	
	Student update(int id);
	
	void getAllData();
	
	Student getDataById(int id);
	
	Student getDataByName(String name);
	
	Student getDataByMobno(long mobno);
	
	Student getDataByEmail(String email);
	
	void remove(int id);
	
	void clear();
}
