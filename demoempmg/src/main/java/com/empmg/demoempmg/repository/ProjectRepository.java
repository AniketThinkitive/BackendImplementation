package com.empmg.demoempmg.repository;

import com.empmg.demoempmg.entities.Employee;
import com.empmg.demoempmg.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
}
