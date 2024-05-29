package com.emprest.demoemp.controller;


import com.emprest.demoemp.entity.Employee;
import com.emprest.demoemp.repo.Erepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class Econtroller {

    @Autowired
    private Erepository erepository;

    @PostMapping("/addEmp")
    public Employee addEmp(@RequestBody Employee employee){
        Employee e=erepository.save(employee);
        return e;
    }


    @GetMapping("/getEmps")
    public List<Employee> getEmps(){
       List<Employee> elist= erepository.findAll();
       return elist;
           }
    @GetMapping("/getEmp/{id}")
    public Employee getEmp(@PathVariable int id){
        Employee e1= erepository.findById(id).get();
        return e1;
    }

    @DeleteMapping("/deleteEmp/{id}")
    public Employee deleteEmp(@PathVariable int id){
        Employee e1=erepository.findById(id).get();
        erepository.delete(e1);
        return e1;
    }

    @PutMapping("/updateEmp/{id}")
    public Employee updateEmp(@PathVariable int id,@RequestBody Employee employee){
        Employee e=erepository.findById(id).get();
        e.setEname(employee.getEname());
        e.setDepartment(employee.getDepartment());
        erepository.save(e);
        return e;
    }

}
