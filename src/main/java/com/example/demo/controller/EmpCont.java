package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeSer;

@RestController
public class EmpCont {

	
	@Autowired
	EmployeeSer aser;
	
	@PostMapping("/")
	public boolean add(@RequestBody Employee ee)
	{
	    return aser.saveinfo(ee)!=null;
	}
	@GetMapping("/")
	public List<Employee> show()
	{
		return aser.showinfo();
	}
	@GetMapping("/{id}")
	public Optional<Employee> oneEmployee(@PathVariable int id) {
		return aser.getEmployeeById(id);
	}
	@GetMapping("getid")
	public Optional<Employee> oneEmp(@RequestParam int id) {
		return aser.getEmployeeById(id);
	}
	

}