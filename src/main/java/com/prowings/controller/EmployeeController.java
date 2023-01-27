package com.prowings.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prowings.model.Employee;
import com.prowings.service.EmpService;

@RestController
public class EmployeeController {

	@Autowired
	EmpService service;

	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id") int id) {
		return service.getEmployeeById(id);
	}

	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		return service.getEmployee();
	}

	@PostMapping("/employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return service.saveEmployee(employee);
	}

	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return service.updateEmployee(employee);
	}

	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") int id) {

		service.deleteEmployeeById(id);
		
		return "Delete Successfull !!" ;
	}
}
