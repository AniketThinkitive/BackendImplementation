package com.studentapp.student_service.feignclient;

import com.studentapp.student_service.responses.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;


@FeignClient(name="addressClient",url="http://localhost:9091",path = "/address-app/api")
public interface AddressClient {

    @GetMapping("/address/getAddress/{studId}")
     public ResponseEntity<AddressResponse> getAddressByStudentId(@PathVariable int studId);

//
//    @GetMapping("/getAddress")
//    public List<AddressDto> getAddress();

}
