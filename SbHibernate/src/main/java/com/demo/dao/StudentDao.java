package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;
import java.util.List;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {

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
	
	@Query(value="from Student where sid=:a")
	Student m1(@Param("a") int id);
	
	@Query(value="from Student where sid=:a and sname=:b")
	Student m2(@Param("a") int a,@Param("b") String name);
}
