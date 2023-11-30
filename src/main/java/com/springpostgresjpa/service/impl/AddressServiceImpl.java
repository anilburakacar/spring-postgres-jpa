package com.springpostgresjpa.service.impl;

import com.springpostgresjpa.entity.Address;
import com.springpostgresjpa.repository.AddressRepository;
import com.springpostgresjpa.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public List<Address> getAllAddresses() {
        try {
            return addressRepository.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Address getAddressById(Long addressId) {
        try {
            Optional<Address> optionalAddress = addressRepository.findById(addressId);
            return optionalAddress.orElse(null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Address createAddress(Address address) {
        try {
            return addressRepository.save(address);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Address updateAddress(Long addressId, Address address) {
        try {
            if (addressRepository.existsById(addressId)) {
                address.setId(addressId);
                return addressRepository.save(address);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void deleteAddress(Long addressId) {
        try {
            addressRepository.deleteById(addressId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
