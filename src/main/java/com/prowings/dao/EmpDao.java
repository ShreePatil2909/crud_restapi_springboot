package com.prowings.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prowings.model.Employee;

@Repository
public interface EmpDao extends JpaRepository<Employee, Integer> {

}
