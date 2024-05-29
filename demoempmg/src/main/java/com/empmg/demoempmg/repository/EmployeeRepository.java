package com.empmg.demoempmg.repository;

import com.empmg.demoempmg.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
