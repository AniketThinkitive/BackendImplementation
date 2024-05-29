package com.empUuid.demoempUuid.repository;


import com.empUuid.demoempUuid.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public interface EmployeeRepository extends JpaRepository<Employee,UUID> {
//    ScopedValue<Object> findById(UUID empId);

    Employee findByEuuid(UUID empId);

    Employee deleteByEuuid(UUID empId);
}
