package com.empUuid.demoempUuid.controller;

import com.empUuid.demoempUuid.entities.Department;
import com.empUuid.demoempUuid.repository.DepartmentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DepartmentRepository departmentRepository;


    @PostMapping("/addDept")
    public Department addDept(@RequestBody Department department) {
        UUID uid = UUID.randomUUID();
        department.setDuuid(uid);
        return departmentRepository.save(department);
    }

    @GetMapping("/getDept/{deptId}")
    public Department getDept(@PathVariable UUID deptId) {
        Department d1 = departmentRepository.findByDuuid(deptId);
        return d1;
    }

    @GetMapping("/getDepts")
    public List<Department> getDepts() {
        List<Department> dlist = departmentRepository.findAll();
        return dlist;
    }

//    @DeleteMapping("/deleteDept/{deptId}")
//    public Department deleteDept(@PathVariable UUID deptId) {
//        Department d1 = departmentRepository.deleteByDuuid(deptId);
//        return d1;
//    }

    @DeleteMapping("/deleteDept/{deptId}")
    @Transactional
    public ResponseEntity<String> deleteDept(@PathVariable UUID deptId) {

        Optional<Department> optionalDepartment = Optional.ofNullable(departmentRepository.findByDuuid(deptId));

        if (optionalDepartment.isPresent()) {
            Department departmentToDelete = optionalDepartment.get();
            // Delete the department
            departmentRepository.delete(departmentToDelete);
            return ResponseEntity.ok("Department deleted successfully.");
        } else {
            return ResponseEntity.notFound().build(); // Department not found
        }
    }



    @PutMapping("/updateDept/{deptId}")
    public Department updateDept(@PathVariable UUID deptId, @RequestBody Department department) {
        Department d = departmentRepository.findByDuuid(deptId);
        d.setDeptName(department.getDeptName());
        return departmentRepository.save(d);

    }












}