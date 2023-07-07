package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{
	
	//custom method to fetch student details using student email using query+finder method
	public Student findById(int id);

}
