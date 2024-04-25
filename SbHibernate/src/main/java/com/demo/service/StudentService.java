package com.demo.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.demo.model.Student;

public interface StudentService {
	Student save(Student s);
	Student findBySid(int sid);	
	List<Student> findBySname(String sname);
	List<Student> findAll();
	List<Student> findBySidAndSname(int sid, String sname);
	List<Student> findBySidOrSname(int sid, String sname);
	List<Student> findBySidLessThan(int sid);
	List<Student> findBySpercentageLessThan(double spercentage);
	List<Student> findBySidGreaterThan(int sid);
	List<Student> findBySidBetween(int low,int high);
	List<Student> findBySnameStartingWith(String s);
	List<Student> findBySnameEndingWith(String s);
	List<Student> findBySnameContaining(String s);
	List<Student> findByOrderBySnameDesc();

	Student m1(@Param("a") int id);
	 
	Student m2(@Param("a") int a,@Param("b") String name);

}
