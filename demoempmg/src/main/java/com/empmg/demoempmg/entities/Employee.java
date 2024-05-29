package com.empmg.demoempmg.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String empName;

    @ManyToOne
    @JoinColumn(name="emp_deptId")
    private Department department;


    @ManyToOne
    @JoinColumn(name="emp_projectId")
    private Project project;






}
