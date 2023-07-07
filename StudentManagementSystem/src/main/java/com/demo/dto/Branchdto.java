package com.demo.dto;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Branchdto {

	@NotNull(message = "Branch id cannot be null")
	private int bid;
	
	@NotNull(message= "Branch Name cannot be null")
	private String bname;
	
	@NotNull(message= "Location cannot be null")
	private String location;
}
