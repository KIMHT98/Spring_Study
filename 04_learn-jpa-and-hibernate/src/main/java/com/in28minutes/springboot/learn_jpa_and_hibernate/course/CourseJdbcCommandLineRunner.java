package com.in28minutes.springboot.learn_jpa_and_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learn_jpa_and_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
//	@Autowired
//	private CourseJpaRepository repository;
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1,"Learn AWS Jpa!","in28minutes"));
//		repository.insert(new Course(2,"Learn Azure Jpa!","in28minutes"));
//		repository.insert(new Course(3,"Learn Spring Jpa!","in28minutes"));
		repository.save(new Course(1,"Learn AWS SpringDataJpa!","in28minutes"));
		repository.save(new Course(2,"Learn Azure SpringDataJpa!","in28minutes"));
		repository.save(new Course(3,"Learn Spring SpringDataJpa!","in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByName("Learn Azure SpringDataJpa!"));
		
	}
	
	

}
