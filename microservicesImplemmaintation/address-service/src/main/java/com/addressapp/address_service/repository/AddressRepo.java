package com.addressapp.address_service.repository;

import com.addressapp.address_service.entity.Address;
import com.addressapp.address_service.responses.AddressResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.UUID;

public interface AddressRepo extends JpaRepository<Address,Integer> {

//    Address findByAuuid(UUID addId);

//    Address deleteByAuuid(UUID addId);


    @Query(nativeQuery = true,value = "SELECT * FROM StudentAddress.address sa join StudentAddress.student s on s.stud_id=sa.studentId where sa.studentId=studId;")
    Address findAddressByStudentId(int studId);

}
