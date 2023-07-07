package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.entity.Student;
import com.demo.repo.StudentRepo;

@Component
public class StudentService {

	@Autowired StudentRepo studentRepo;
	// get  All Student Details display
	public List<Student> getAll()
	{
		List<Student> li=(List<Student>)this.studentRepo.findAll();
		return li;
	}
	
	//Post the student details 
	public Student getById(int id)
	{
		Student std=this.studentRepo.findById(id);
		return std;
	}
	
	//Add the student details
	public Student addStudent(Student std)
	{
		Student result=this.studentRepo.save(std);
		return result;
	}
	
	//Delete the student details by using id
	public String deleteStudent(int id)
	{
		this.studentRepo.deleteById(id);
		return "Deleted";
	}
	
	//Update the student details by using id
	public String updateStudent(Student std,int id)
	{
		std.setSid(id);
		this.studentRepo.save(std);
		return "Updated";
	}
}
