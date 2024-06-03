package com.addressapp.address_service.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;



    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
       public class AddressDto {

        private int addId;
//        private UUID auuid;
        private String lane;
        private String state;


    }
