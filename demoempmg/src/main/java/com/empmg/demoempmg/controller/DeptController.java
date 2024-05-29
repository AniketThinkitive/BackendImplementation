package com.empmg.demoempmg.controller;

import com.empmg.demoempmg.entities.Department;
import com.empmg.demoempmg.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class DeptController {
    @Autowired
    private DepartmentRepository departmentRepository;


    @PostMapping("/addDept")
    public Department addDept(@RequestBody Department department){
       Department d1 =departmentRepository.save(department);
        return d1;
    }


    @GetMapping("/getDepts")
    public List<Department> getDepts(){
        List<Department> deptList=departmentRepository.findAll();
        return deptList;
    }

    @GetMapping("/getDept/{deptId}")
    public Department getDept(@PathVariable int id){
        Department d2=departmentRepository.findById(id).get();

        return d2;
    }

    @DeleteMapping("/deleteDept/{DeptId}")
    public Department deleteDept(@PathVariable int id){
        Department d=   departmentRepository.findById(id).get();
        return d;
    }

    @PutMapping("/updateDept/{DeptId}")
    public Department updateDept(@PathVariable int id,@RequestBody Department department) {
        Department dept = departmentRepository.findById(id).get();
        dept.setDeptName(department.getDeptName());
        departmentRepository.save(dept);
        return dept;

    }
}
