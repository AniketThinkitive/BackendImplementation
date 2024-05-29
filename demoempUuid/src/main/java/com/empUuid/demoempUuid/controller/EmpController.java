package com.empUuid.demoempUuid.controller;

import com.empUuid.demoempUuid.entities.Employee;
import com.empUuid.demoempUuid.entities.Project;
import com.empUuid.demoempUuid.repository.EmployeeRepository;
import com.empUuid.demoempUuid.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/emp")
public class EmpController {
//    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;


@PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
    UUID uid = UUID.randomUUID();
    employee.setEuuid(uid);

    return employeeRepository.save(employee);

}
@GetMapping("/getEmployee/{empId}")
    public Employee getEmployee(@PathVariable UUID empId){
    Employee e1=employeeRepository.findByEuuid(empId);
    return e1;
}

    @GetMapping("/getEmployees")
    public List<Employee> getEmployees(){
        List<Employee> elist=employeeRepository.findAll();
        return elist;
}









//////delete
    @DeleteMapping("/deleteEmployee/{empId}")
    @Transactional
    public ResponseEntity<String> deleteEmployee(@PathVariable UUID empId) {

        Optional<Employee> optionalEmployee = Optional.ofNullable(employeeRepository.findByEuuid(empId));

        if (optionalEmployee.isPresent()) {
            Employee employeeToDelete = optionalEmployee.get();
            // Delete the employee
            employeeRepository.delete(employeeToDelete);
            return ResponseEntity.ok("Employee deleted successfully.");
        } else {
            return ResponseEntity.notFound().build(); // Employee not found
        }
    }

//    @DeleteMapping("/deleteEmployee/{empId}")
//    @Transactional
//    public Employee deleteEmployee(@PathVariable UUID empId){
//
//        Employee e1=employeeRepository.deleteByEuuid(empId);
//        return e1;
//}


//    @DeleteMapping("/deleteEmployee/{empId}")
//    @Transactional
//    public void deleteEmployee(@PathVariable UUID empId){
//        employeeRepository.deleteByEuuid(empId);
//
//    }






    @PutMapping("/updateEmployee/{empId}")
    public Employee updateEmployee(@PathVariable UUID empId, @RequestBody Employee employee){
        Employee emp = employeeRepository.findByEuuid(empId);
        emp.setEmpName(employee.getEmpName());
        return employeeRepository.save(emp);

    }


//     ////for assign project

//    @PutMapping("/assignProject/{empId}/project/{projectId}")
//    public ResponseEntity<?> assignProjectToEmployee(@PathVariable UUID empId, @PathVariable UUID projectId) {
//        Employee employee = employeeRepository.findByEuuid(empId);
//        if (employee == null) {
//            return ResponseEntity.notFound().build();
//        }
//        Project project = projectRepository.findByPuuid(projectId);
//        if (project == null) {
//            return ResponseEntity.notFound().build();
//        }
//        employee.setProject(project);
//        employeeRepository.save(employee);
//        return ResponseEntity.ok().build();
//    }





















}