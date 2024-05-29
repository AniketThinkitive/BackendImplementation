package com.emprest.demoemp.repo;

import com.emprest.demoemp.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Erepository extends JpaRepository<Employee,Integer>{
}
