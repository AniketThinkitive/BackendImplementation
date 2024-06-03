package com.studentapp.student_service.repository;

import com.studentapp.student_service.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer>{


//    Student findBySuuid(UUID studId);

//    Student deleteBySuuid(UUID studId);

//    Student setAddressDto(UUID studId);

}
