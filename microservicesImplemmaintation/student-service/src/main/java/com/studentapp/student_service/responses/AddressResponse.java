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
public class AddressResponse {

    private int addId;
//    private UUID auuid;
    private String lane;
    private String state;


}

