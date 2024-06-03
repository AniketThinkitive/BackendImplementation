package com.addressapp.address_service.service;

import com.addressapp.address_service.entity.Address;
import com.addressapp.address_service.responses.AddressResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    List<Address> getAddress();

//    Address getAddress(UUID addId);
AddressResponse getAddress(int addId);

    Address addAddress(Address Address);

    Address  updateAddress(int addId, Address address);

    ResponseEntity<String> deleteAddress(int addId);
}