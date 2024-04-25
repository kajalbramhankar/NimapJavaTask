package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.StudentDao;
import com.demo.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	@Autowired
 private StudentDao sd;

	@Override
	public Student save(Student s) {
		return sd.save(s);
	}

	@Override
	public Student findBySid(int sid) {
		return sd.findBySid(sid);
	}

	@Override
	public List<Student> findBySname(String sname) {
		return sd.findBySname(sname);
	}

	@Override
	public List<Student> findAll() {
		return sd.findAll();
	}

	@Override
	public List<Student> findBySidAndSname(int sid, String sname) {
		return sd.findBySidAndSname(sid, sname);
	}

	@Override
	public List<Student> findBySidOrSname(int sid, String sname) {
		return sd.findBySidOrSname(sid, sname);
	}

	@Override
	public List<Student> findBySidLessThan(int sid) {
		return sd.findBySidLessThan(sid);
	}

	@Override
	public List<Student> findBySpercentageLessThan(double spercentage) {
		return sd.findBySpercentageLessThan(spercentage);
	}

	@Override
	public List<Student> findBySidGreaterThan(int sid) {
		return sd.findBySidGreaterThan(sid);
	}

	@Override
	public List<Student> findBySidBetween(int low, int high) {
		return sd.findBySidBetween(low, high);
	}

	@Override
	public List<Student> findBySnameStartingWith(String s) {
		return sd.findBySnameStartingWith(s);
	}

	@Override
	public List<Student> findBySnameEndingWith(String s) {
		return sd.findBySnameEndingWith(s);
	}

	@Override
	public List<Student> findBySnameContaining(String s) {
		return sd.findBySnameContaining(s);
	}

	@Override
	public List<Student> findByOrderBySnameDesc() {
		return sd.findByOrderBySnameDesc();
	}

	@Override
	public Student m1(int id) {
		return sd.m1(id);
	}

	@Override
	public Student m2(int a, String name) {
		return sd.m2(a, name);
	}

	



	

	
	

	
	
	
}
