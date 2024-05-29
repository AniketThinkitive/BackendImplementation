package com.empmg.demoempmg.controller;

import com.empmg.demoempmg.entities.Department;
import com.empmg.demoempmg.entities.Project;
import com.empmg.demoempmg.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
    @RestController
    @RequestMapping
    public class ProjController {
        @Autowired
        private ProjectRepository projectRepository;


        @PostMapping("/addProject")
        public Project addProject(@RequestBody Project project){
            Project p1 =projectRepository.save(project);
            return p1;
        }


        @GetMapping("/getProjects")
        public List<Project> getProjects(){
            List<Project> projectList=projectRepository.findAll();
            return projectList;
        }

        @GetMapping("/getProject/{projectId}")
        public Project getProject(@PathVariable int id){
            Project p2=projectRepository.findById(id).get();

            return p2;
        }

        @DeleteMapping("/deleteProject/{projectId}")
        public Project deleteProject(@PathVariable int id){
            Project p=   projectRepository.findById(id).get();
            return p;
        }

        @PutMapping("/updateProject/{projectId}")
        public Project updateProject(@PathVariable int id,@RequestBody Project project) {
            Project proj = projectRepository.findById(id).get();
            proj.setProjectName(project.getProjectName());
            projectRepository.save(proj);
                        return proj;

        }
    }
