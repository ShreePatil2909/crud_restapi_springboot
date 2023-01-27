package com.prowings.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import com.prowings.dao.EmpDao;
import com.prowings.exception.EmployeeNotPresentException;
import com.prowings.model.Employee;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpDao dao;

	@Override
	public Employee getEmployeeById(int id) {
		try {
			return dao.findById(id).get();
		} catch (NoSuchElementException ex) {
			throw new EmployeeNotPresentException("Employee not present with this " + id);
		}
	}

	@Override
	public List<Employee> getEmployee() {
		try {
			return dao.findAll();
		} catch (NoSuchElementException ex) {
			throw new EmployeeNotPresentException("You Entered wrong mapping ");
		}
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return dao.save(employee);
	}

	@Override
	public void deleteEmployeeById(int id) {
		try {
			dao.deleteById(id);
		} catch (Exception ex) {
			throw new EmployeeNotPresentException("You Entered Wrong id " + id);
		}
	}

}
