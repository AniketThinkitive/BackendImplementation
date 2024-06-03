package com.addressapp.address_service.Implementation;

import com.addressapp.address_service.entity.Address;
import com.addressapp.address_service.repository.AddressRepo;
import com.addressapp.address_service.responses.AddressResponse;
import com.addressapp.address_service.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AddressImpl implements AddressService {

    @Autowired
    private AddressRepo addressRepo;


    @Override
    public List<Address> getAddress() {
        List<Address> alist=addressRepo.findAll();
        return alist;

    }


    @Autowired
    private ModelMapper modelMapper;
    @Override
    public AddressResponse getAddress(int addId) {
        Address a1=addressRepo.findById(addId).get();
        AddressResponse addressResponse= modelMapper.map(a1,AddressResponse.class);
        return addressResponse;
    }

//    @Override
//    public Address getAddress(UUID addId) {
//        Address a1=addressRepo.findByAuuid(addId);
//        return a1;
//    }

    @Override
    public Address addAddress(Address address) {
//        UUID uid = UUID.randomUUID();
//        address.setAddId(address.getAddId());
        Address addressResponse=addressRepo.save(address);
        return  addressResponse;

    }

    @Override
    public Address updateAddress(int addId, Address newAddress) {
        Address oldAddress= addressRepo.findById(addId).get();
        oldAddress.setLane(newAddress.getLane());
        oldAddress.setState(newAddress.getState());
    Address address= addressRepo.save(oldAddress);
return  address;

    }

    @Override
    public ResponseEntity<String> deleteAddress(int addId) {
       Address dA = addressRepo.findById(addId).get();

            addressRepo.delete(dA);
            return ResponseEntity.ok("Address deleted successfully.");

    }
//
//    @Override
//    public Address findAddressByStudentId(UUID studId) {
//        Address address = addressRepo.findByAuuid(studId);
//        return address;
//    }


}
