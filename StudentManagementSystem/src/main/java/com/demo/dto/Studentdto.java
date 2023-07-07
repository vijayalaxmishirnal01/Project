package com.demo.dto;

import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.demo.entity.Branch;

import lombok.Data;

@Data
public class Studentdto {

	
	@NotNull(message="Student id cannot be null")
	private int sid;
	
	@NotNull(message="Student Name cannot be null")
	private String sname;
	
	@NotNull(message="Email cannot be null")
	@Email(message="Please provide proper email")
	private String email;
	
	@NotNull(message = "Student address cannot be null")
	private String addess;
	
	@NotNull(message="Mobile no. cannot be null")
	@Pattern(regexp="^\\d{10}$", message="Mobile number should have 10 digits")
	private long mobile;
	
	@ManyToOne //many Students can belong to one Branch
	private Branch branch;
}
