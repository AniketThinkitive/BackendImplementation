package com.studentapp.student_service.service;


import com.studentapp.student_service.responses.AddressResponse;
import com.studentapp.student_service.entity.Student;
import com.studentapp.student_service.responses.Studentresponses;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface StudentService {

    List<Student> getStudents();
    Studentresponses getStudent(int studId);
//    Studentresponses getStudentr(UUID studId);
//    Student getStudent(int studId);

    Student addStudent(Student student);
    Student updateStudent(int studId,Student student);
    ResponseEntity<String> deleteStudent(int studId);

//    Student updateStudent(int studId, Student newStudent);


//    Student getStudent(UUID studId);



//    Student findAddressByStudentId(UUID studId);

}

