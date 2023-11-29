package com.springpostgresjpa.service;

import com.springpostgresjpa.entity.Address;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface AddressService {
    List<Address> getAllAddresses();
    Address getAddressById(Long addressId);
    Address createAddress(Address address);
    Address updateAddress(Long addressId, Address address);
    void deleteAddress(Long addressId);
}
