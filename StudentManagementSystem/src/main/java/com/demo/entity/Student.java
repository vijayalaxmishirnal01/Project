package com.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	
	@Column(length=20, nullable = false)
	private String sname;
	
	@Column(length = 50, nullable = false, unique = true)
	private String email;
	
	@Column(length = 30, nullable = false)
	private String addess;
	
	@Column(length = 10, nullable = false, unique = true)
	private long mobile;
	
	@ManyToOne //many Students can belong to one Branch
	private Branch branch;
}
