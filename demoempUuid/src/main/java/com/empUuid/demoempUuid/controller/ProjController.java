package com.empUuid.demoempUuid.controller;


import com.empUuid.demoempUuid.entities.Project;

import com.empUuid.demoempUuid.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/project")
public class ProjController {
    @Autowired
    private ProjectRepository projectRepository;


    @PostMapping("/addProject")
    public Project addProject(@RequestBody Project project) {
        UUID uid = UUID.randomUUID();
        project.setPuuid(uid);
        return projectRepository.save(project);

    }

    @GetMapping("/getProject/{projectId}")
    public Project getProject(@PathVariable UUID projectId) {
        Project p1 = projectRepository.findByPuuid(projectId);
        return p1;
    }

    @GetMapping("/getProjects")
    public List<Project> getProjects() {
        List<Project> plist = projectRepository.findAll();
        return plist;
    }

    @PutMapping("/updateProject/{projectId}")
    public Project updateProject(@PathVariable UUID projectId, @RequestBody Project project) {
        Project p= projectRepository.findByPuuid(projectId);
        p.setProjectName(project.getProjectName());
        return projectRepository.save(p);

    }



    @DeleteMapping("/deleteProject/{projectId}")
    @Transactional
    public ResponseEntity<String> deleteProject(@PathVariable UUID projectId) {
        // Fetch the project by ID
        Optional<Project> optionalProject = Optional.ofNullable(projectRepository.findByPuuid(projectId));

        if (optionalProject.isPresent()) {
            Project projectToDelete = optionalProject.get();
            // Delete the project
            projectRepository.delete(projectToDelete);
            return ResponseEntity.ok("Project deleted successfully.");
        } else {
            return ResponseEntity.notFound().build(); // Project not found
        }
    }













//    @DeleteMapping("/deleteProject/{projectId}")
//    @Transactional
//    public Project deleteProject(@PathVariable UUID projectId) {
//        Project p1 = projectRepository.deleteByPuuid(projectId);
//        return p1;
//    }

////// other delete
//@DeleteMapping("/deleteProject/{projectId}")
//@Transactional
//public void deleteProject(@PathVariable UUID projectId) {
//    projectRepository.deleteByPuuid(projectId);
//}




//////// using normal id

//    @DeleteMapping("/deleteProject/{projectId}")
//    public Project deleteProject(@PathVariable int id) {
//        Project p = projectRepository.findById(id).get();
//        return p;
//    }







}