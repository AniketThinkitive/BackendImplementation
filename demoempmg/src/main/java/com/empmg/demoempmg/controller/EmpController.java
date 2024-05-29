package com.empmg.demoempmg.controller;


import com.empmg.demoempmg.entities.Employee;
import com.empmg.demoempmg.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmpController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        Employee e1=employeeRepository.save(employee);
        return e1;
    }


    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
       List<Employee> empList=employeeRepository.findAll();
       return empList;
    }

    @GetMapping("/getEmployee/{empId}")
    public Employee getEmployee(@PathVariable int id){
        Employee emp=employeeRepository.findById(id).get();
        return emp;
    }

    @DeleteMapping("/deleteEmployee/{empId}")
    public Employee deleteEmployee(@PathVariable int id){
        Employee emp=   employeeRepository.findById(id).get();
        return emp;
    }

    @PutMapping("/update/{empId}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody Employee employee) {
        Employee emp = employeeRepository.findById(id).get();
        emp.setEmpName(employee.getEmpName());
        employeeRepository.save(emp);
        return emp;

    }
}
