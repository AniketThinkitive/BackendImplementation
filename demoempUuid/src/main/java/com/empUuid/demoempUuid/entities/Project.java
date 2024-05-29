package com.empUuid.demoempUuid.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="project")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="projectId")
    private int projectId;
    private UUID puuid;
    private String projectName;



//        @OneToMany(mappedBy = "departments")
//        private Set<Department> departments;
//        @OneToMany(mappedBy = "projects")
//        private Set<Employee> employees;

    //////cg
    @ManyToOne
    @JoinColumn(name="project_deptId")
    private Department department;


    @OneToMany(mappedBy = "project",cascade = CascadeType.ALL)
    private List<Employee> employees =new ArrayList<>();

}
