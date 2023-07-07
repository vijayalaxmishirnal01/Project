package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.Branch;

//we will inherit CRUD operations
public interface BranchRepo extends JpaRepository<Branch, Integer>{


}
