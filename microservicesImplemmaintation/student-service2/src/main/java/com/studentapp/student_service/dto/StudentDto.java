package com.studentapp.student_service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

import java.util.UUID;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private int studId;
//    private UUID suuid;
    private String studentName;
    private String studentCollege;
//    private AddressDto addressDto ;;




}