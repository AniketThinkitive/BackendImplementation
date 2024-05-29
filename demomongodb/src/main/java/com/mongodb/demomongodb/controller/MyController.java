package com.mongodb.demomongodb.controller;



import com.mongodb.demomongodb.entity.Student;
import com.mongodb.demomongodb.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class MyController {

    @Autowired
    private StudentRepository studentRepository;

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        Student save=studentRepository.save(student);
        return save;
    }

//    @PostMapping("/student/add")
//    public ResponseEntity<Student> createStudent(@RequestBody Student student) {
//        Student newStudent = repo.save(student);
//        return ResponseEntity.status(HttpStatus.CREATED).body(newStudent);
//
//    }




//    @GetMapping("/getStudents")
//    public ResponseEntity<?> getStudents(){
//        return ResponseEntity.ok(this.studentRepository.findAll());
//
//    }




    //get all the students
    //localhost:8080/students
    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        return students;
    }

    //localhost:8080/students/1
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable int id) {
        Student student = studentRepository.findById(id).get();

        return student;

    }



    @PutMapping("/student/update/{id}")
    public Student updateStudents(@PathVariable int id,@RequestBody Student student) {
        Student stud = studentRepository.findById(id).get();
        stud.setName(student.getName());
        stud.setCollege(student.getCollege());
        studentRepository.save(student);
        return student;

    }
    @DeleteMapping("/student/delete/{id}")
      public void removeStudent(@PathVariable int id) {
        Student student = studentRepository.findById(id).get();
        studentRepository.delete(student);
    }







}

