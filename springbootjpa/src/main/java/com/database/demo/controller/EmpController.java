package com.database.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.database.demo.dao.EmpRepo;
import com.database.demo.model.Employee;

@Controller
public class EmpController 
{
	@Autowired
	EmpRepo repo;
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
@RequestMapping("/addEmployee")

public String addEmployee(Employee employee)
{
	repo.save(employee);
	return "home.jsp";
}
	@RequestMapping("/getEmployee")
public ModelAndView getEmployee(@RequestParam int aid)
{ 
	ModelAndView mv = new ModelAndView("showEmployee.jsp");
	Employee employee = repo.findById(aid).orElse(new Employee());
	mv.addObject(employee);
	return mv;
}
@RequestMapping("/Employees")
@ResponseBody
public String getEmployees() {
	return repo.findAll().toString();
}
}
