package com.emprest.demoemp.entity;

import jakarta.persistence.*;
import lombok.*;


@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="employee")
public class Employee {

    @Id
    private int empid;
    private String ename;
    private String department;

}
