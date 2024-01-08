package com.erp.simple.service;

import com.erp.simple.dto.CustomerCreateRequestDTO;
import com.erp.simple.dto.CustomerResponseDTO;

import java.util.List;

public interface CustomerService {

    public CustomerResponseDTO findCustomerById(Long id);

    public void createNewCustomer(List<CustomerCreateRequestDTO> dto);
}
