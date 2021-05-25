package com.database.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.database.demo.model.Employee;

public interface EmpRepo extends CrudRepository<Employee, Integer>{
	

}
