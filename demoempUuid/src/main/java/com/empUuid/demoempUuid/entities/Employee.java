package com.empUuid.demoempUuid.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="empId")
    private int empId;
    private UUID euuid;
    private String empName;

    @ManyToOne
    @JoinColumn(name="emp_deptId")
    private Department department;


    @ManyToOne
    @JoinColumn(name="emp_projectId")
    private Project project;

//    public void setEmpName(String empName) {
//        this.empName = empName;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }










}
