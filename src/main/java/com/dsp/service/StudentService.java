package com.dsp.service;

import java.util.HashMap;

import com.dsp.model.StudentModel;

public interface StudentService {
	
	public HashMap<String, Object> saveStudent(StudentModel studentModel);
	
	public HashMap<String, Object> signinstudent(String email, String password);
}
