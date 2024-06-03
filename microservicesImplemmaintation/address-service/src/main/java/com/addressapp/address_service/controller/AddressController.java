package com.addressapp.address_service.controller;


import com.addressapp.address_service.entity.Address;
import com.addressapp.address_service.responses.AddressResponse;
import com.addressapp.address_service.service.AddressService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {

    private final AddressService addressService;

    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }


    @PostMapping("/addAddress")
    public AddressResponse addAddress(@RequestBody AddressResponse addressResponse) {
        Address newAddress = convertToEntity(new AddressResponse());
        Address addedAddressResponse = addressService.addAddress(newAddress);
        return convertToResponse(addedAddressResponse);
    }









    @GetMapping("/getAddress/{addId}")
    public ResponseEntity<AddressResponse> getAddress(@PathVariable int addId) {
        AddressResponse addressResponse = addressService.getAddress(addId);
        return ResponseEntity.ok(addressResponse);
    }


    @GetMapping("/getAddress")
    public List<AddressResponse>getAddress() {
        List<Address> addresss = addressService.getAddress();
        List<AddressResponse> addressDtos = new ArrayList<>();
        for (Address address : addresss) {
            addressDtos.add(convertToResponse(address));
        }
        return addressDtos;
    }


    @DeleteMapping("/deleteAddress/{addId}")
    @Transactional
    public ResponseEntity<String> deleteAddress(@PathVariable int addId) {
        return addressService.deleteAddress(addId);
    }

    @PutMapping("/updateAddress/{addId}")
    public AddressResponse updateAddress(@PathVariable int addId, @RequestBody AddressResponse addressResponse) {
        Address updatedAddress =addressService.updateAddress(addId, convertToEntity(addressResponse));
        return convertToResponse(updatedAddress);
    }
//
//    @GetMapping("/findAddressByStudentId/{studId}")
//    public ResponseEntity<AddressDto> findAddressByStudentId(@PathVariable UUID studId) {
//        Address address = addressService.findAddressByStudentId(studId);
//           return ResponseEntity.ok(convertToDto(address));
//
//    }





    private Address convertToEntity(AddressResponse addressResponse) {
        Address address = new Address();
        address.setAddId(addressResponse.getAddId());
//        address.setAuuid(addressDto.getAuuid());
        address.setLane(addressResponse.getLane());
        address.setState(addressResponse.getState());
        return address;
    }

    // Converting entity to Responce
    private AddressResponse convertToResponse(Address address) {
        AddressResponse addressResponse = new AddressResponse();
        addressResponse.setAddId(address.getAddId());
//        addressDto.setAuuid(address.getAuuid() );
        addressResponse.setLane(address.getLane());
        addressResponse.setState(address.getState());
        return addressResponse;
    }












}
