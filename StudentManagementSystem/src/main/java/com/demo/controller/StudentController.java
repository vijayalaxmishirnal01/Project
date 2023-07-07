package com.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@Controller
public class StudentController {

	@Autowired StudentService studentService;
	
	//All student details display
	@GetMapping("/student")
	public ResponseEntity<List<Student>> getAll()
	{
		List<Student> li=this.studentService.getAll();
		return ResponseEntity.of(Optional.of(li));
	}
	
	//student details display by id
	@GetMapping("/student/{id}")
	public ResponseEntity<Student> getById(@PathVariable("id") int id)
	{
		Student std=this.studentService.getById(id);
		return ResponseEntity.of(Optional.of(std));
	}
	
	//Add the student details
	@PostMapping("/student")
	public ResponseEntity<Student> addStudent(@RequestBody Student std)
	{
		Student Result=this.studentService.addStudent(std);
		return ResponseEntity.of(Optional.of(Result));
	}
	
	//Delete the student details by using id
	@DeleteMapping("/student/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id)
	{
		this.studentService.deleteStudent(id);
		return ResponseEntity.ok("Deleted");
	}
	
	//Update the student details by using id
	@PutMapping("/student/{id}")
	public ResponseEntity<String> update(@RequestBody Student std,@PathVariable("id") int id)
	{
		this.studentService.updateStudent(std, id);
		return ResponseEntity.ok("Updated");
	}
}
