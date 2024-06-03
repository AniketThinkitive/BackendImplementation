package com.studentapp.student_service.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Studentresponses {


        private int studId;
//        private UUID suuid;
        private String studentName;
        private String studentCollege;
        private AddressResponse addressResponse;



}
