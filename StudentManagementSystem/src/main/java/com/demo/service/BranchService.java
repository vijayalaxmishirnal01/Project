package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.entity.Branch;
import com.demo.repo.BranchRepo;

@Component
public class BranchService {

	@Autowired BranchRepo branchRepo;
	
	// get All Details Display
	public List<Branch> getAll()
	{
		List<Branch> li=(List<Branch>)this.branchRepo.findAll();
		return li;
	}
	
	//Branch details display by id
	public Branch getById(int id)
	{
		Branch std=branchRepo.findById(id).get();
		return std;
	}
	
	//Add the Branch details 
	public Branch addBranch(Branch std)
	{
		Branch result=this.branchRepo.save(std);
		return result;
	}
	
	//Delete the branch details by using id
	public String deleteBranch(int id)
	{
		this.branchRepo.deleteById(id);
		return "Deleted";
	}
	
	//Update the branch details by using id
	public String updateBranch(Branch std,int id)
	{
		std.setBid(id);
		this.branchRepo.save(std);
		return "Updated";
	}
}
