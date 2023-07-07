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

import com.demo.entity.Branch;
import com.demo.service.BranchService;

@Controller
public class BranchController {

@Autowired BranchService branchService;
	
    //All branch details display
	@GetMapping("/branch")
	public ResponseEntity<List<Branch>> getAll()
	{
		List<Branch> li=this.branchService.getAll();
		return ResponseEntity.of(Optional.of(li));
	}
	
	//Branch details display by id
	@GetMapping("/branch/{id}")
	public ResponseEntity<Branch> getById(@PathVariable("id") int id)
	{
		Branch std=this.branchService.getById(id);
		return ResponseEntity.of(Optional.of(std));
	}
	
	//Add the branch details
	@PostMapping("/branch")
	public ResponseEntity<Branch> addBranch(@RequestBody Branch branch)
	{
		Branch Result=this.branchService.addBranch(branch);
		return ResponseEntity.of(Optional.of(Result));
	}
	
	//delete the branch by using id
	@DeleteMapping("/branch/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") int id)
	{
		this.branchService.deleteBranch(id);
		return ResponseEntity.ok("Deleted");
	}
	
	//Update the branch by using id
	@PutMapping("/branch/{id}")
	public ResponseEntity<String> update(@RequestBody Branch branch,@PathVariable("id") int id)
	{
		this.branchService.updateBranch(branch, id);
		return ResponseEntity.ok("Updated");
	}
}


