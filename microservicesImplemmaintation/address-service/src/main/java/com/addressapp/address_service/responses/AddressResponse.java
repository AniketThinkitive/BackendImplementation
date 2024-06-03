package com.addressapp.address_service.responses;

import com.addressapp.address_service.entity.Address;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;



    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    public class AddressResponse  {

        private int addId;
//        private UUID auuid;
        private String lane;
        private String state;


    }

