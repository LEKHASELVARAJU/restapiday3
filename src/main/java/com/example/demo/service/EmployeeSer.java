package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmpRepo;

@Service
public class EmployeeSer {
	@Autowired
	EmpRepo er;
	public Employee saveinfo(Employee ee)
	{
		return er.save(ee);
	}
	
	public List<Employee> showinfo(){
		return er.findAll();
	}

	public Optional<Employee> getEmployeeById(int id) {
		return er.findById(id);
	}
	public Optional<Employee> getEmpid(int id) {
		return er.findById(id);
	}
	

}