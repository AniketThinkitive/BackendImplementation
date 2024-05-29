package com.empUuid.demoempUuid.repository;


import com.empUuid.demoempUuid.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public interface DepartmentRepository extends JpaRepository<Department,UUID> {
    Department findByDuuid(UUID deptId);

    Department deleteByDuuid(UUID deptId);
}
