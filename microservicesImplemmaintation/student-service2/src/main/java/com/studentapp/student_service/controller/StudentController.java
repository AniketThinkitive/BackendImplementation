package com.studentapp.student_service.controller;


import com.studentapp.student_service.Implementation.StudentImpl;
import com.studentapp.student_service.dto.StudentDto;
import com.studentapp.student_service.entity.Student;
import com.studentapp.student_service.responses.Studentresponses;
import com.studentapp.student_service.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/student")
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    @PostMapping("/addStudent")
    public StudentDto addStudent(@RequestBody StudentDto studentDto) {
        Student newStudent = convertToEntity(studentDto);
        Student addedStudent = studentService.addStudent(newStudent);
        return convertToDto(addedStudent);
    }

    @GetMapping("/getStudent/{studId}")
    ResponseEntity<Studentresponses> getStudent(@PathVariable int studId) {
        Studentresponses studentresponses = studentService.getStudent(studId);
        return ResponseEntity.ok(studentresponses);
    }




//    @GetMapping("/getStudent/{studId}")
//    public StudentDto getStudent(@PathVariable UUID studId) {
//        Student student = studentService.getStudent(studId);
//        return convertToDto(student);
//    }






    @GetMapping("/getStudents")
    public List<StudentDto> getStudents() {
        List<Student> students = studentService.getStudents();
        List<StudentDto> studDtos = new ArrayList<>();
        for (Student student : students) {
            studDtos.add(convertToDto(student));
        }
        return studDtos;
    }


    @DeleteMapping("/deleteStudent/{studId}")
    @Transactional
    public ResponseEntity<String> deleteStudent(@PathVariable int studId) {
        return studentService.deleteStudent(studId);
    }

    @PutMapping("/updateStudent/{studId}")
    public StudentDto updateStudent(@PathVariable int studId, @RequestBody StudentDto studentDto) {
        Student updatedStudent = studentService.updateStudent(studId, convertToEntity(studentDto));
        return convertToDto(updatedStudent);
    }



//    @GetMapping("/findAddressByStudentId/{studId}")
//    public ResponseEntity<StudentDto> findAddressByStudentId(@PathVariable UUID studId) {
//        Student student = studentService.findAddressByStudentId(studId);
//        return ResponseEntity.ok(convertToDto(student));
//
//    }




    // Converting Emp DTO to Employee entity
    private Student convertToEntity(StudentDto studentDto) {
        Student student = new Student();
        student.setStudId(studentDto.getStudId());
//        student.setSuuid(studentDto.getSuuid());
        student.setStudentName(studentDto.getStudentName());
        student.setStudentCollege(studentDto.getStudentCollege());

        return student;
    }

    // Converting entity to DTO
    private StudentDto convertToDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setStudId(student.getStudId());
//        studentDto.setSuuid(student.getSuuid());
        studentDto.setStudentName(student.getStudentName());
        studentDto.setStudentCollege(student.getStudentCollege());

        return studentDto;
    }






}
