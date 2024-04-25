package com.demo;

import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;
@SpringBootApplication
public class App {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(App.class, args);
	StudentService ss=context.getBean(StudentService.class);
//	Student s=new Student();
//	s.setSid(6);
//    s.setSname("Rajkumari");
//    s.setScity("Gadchiroli");
//    s.setSpercentage(92.80);
//    System.out.println(ss.save(s));
	
//	for(int i=1;i<=2000;i++) {
//		Student s1=new Student();
//		StringBuilder name=new StringBuilder();
//		for(int j=1;j<=15;j++)
//			name.append((char)(new Random().nextInt(26)+65));
//		
//		StringBuilder city=new StringBuilder();
//		for(int j=1;j<=15;j++)
//			city.append((char)(new Random().nextInt(26)+65));
//		
//		s1.setSname(name.toString());
//		s1.setScity(city.toString());
//		s1.setSpercentage(new Random().nextDouble()*100);
//		System.out.println(ss.save(s1));
	
//	 Student s1=ss.findBySid(2600);
//	 System.out.println(ss.save(s1));
	
//	List<Student>list=ss.
//	for(Student s:list)
//		System.out.println(ss.save(s));
	
//	System.out.println(ss.m1(3));
	
	Student s=ss.m2(1, "Kajal");
	System.out.println(s);
	}

}
