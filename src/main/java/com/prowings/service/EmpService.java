package com.prowings.service;

import java.util.List;

import com.prowings.model.Employee;

public interface EmpService {

	public Employee getEmployeeById(int id);

	public List<Employee> getEmployee();

	public Employee saveEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployeeById(int id);
}
