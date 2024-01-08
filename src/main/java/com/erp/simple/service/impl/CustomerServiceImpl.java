package com.erp.simple.service.impl;

import com.erp.simple.domain.Customer;
import com.erp.simple.dto.CustomerCreateRequestDTO;
import com.erp.simple.dto.CustomerResponseDTO;
import com.erp.simple.exception.BadRequestException;
import com.erp.simple.repository.CustomerRepository;
import com.erp.simple.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerResponseDTO findCustomerById(Long id) {

        Customer customer = customerRepository.findById(id).orElseThrow(() -> new BadRequestException("invalid. customer id"));

        CustomerResponseDTO dto = new CustomerResponseDTO();
        dto.setId(customer.getId());
        dto.setName(customer.getName());
        dto.setAddress(customer.getAddress());
        dto.setPhoneNumber(customer.getPhoneNumber());

        return dto;
    }

    @Override
    public void createNewCustomer(List<CustomerCreateRequestDTO> dtos) {

        List<Customer> customers = dtos.stream().map((dto) -> {
            Customer customer = new Customer();
            customer.setName(dto.getName());
            customer.setAddress(dto.getAddress());
            customer.setPhoneNumber(dto.getPhoneNumber());
            return customer;
        }).collect(Collectors.toList());

        customerRepository.saveAll(customers);
    }
}
