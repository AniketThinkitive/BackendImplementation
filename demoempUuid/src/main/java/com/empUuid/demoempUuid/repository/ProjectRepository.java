package com.empUuid.demoempUuid.repository;


import com.empUuid.demoempUuid.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public interface ProjectRepository extends JpaRepository<Project,UUID> {


    Project deleteByPuuid(UUID projectId);

    Project findByPuuid(UUID projectId);
}
