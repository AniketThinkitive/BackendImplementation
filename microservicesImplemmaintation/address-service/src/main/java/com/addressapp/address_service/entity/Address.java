package com.addressapp.address_service.entity;


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
@Entity
@Table(name="address")
public class Address {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="addId")
    private int addId;
//    private UUID auuid;
    private String lane;
    private String state;

}
