package com.erp.simple.web;

import com.erp.simple.dto.CustomerCreateRequestDTO;
import com.erp.simple.dto.CustomerResponseDTO;
import com.erp.simple.service.CustomerService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@AllArgsConstructor
@RestController
public class CustomerResource {

    private final CustomerService customerService;

    @GetMapping("/customer/{id}/detail")
    public ResponseEntity<CustomerResponseDTO> findCustomerById(@PathVariable Long id) {
        return ResponseEntity.ok().body(customerService.findCustomerById(id));
    }

    @PostMapping("/customer")
    public ResponseEntity<Void> createNewCustomer(@RequestBody @Valid List<CustomerCreateRequestDTO> dto) {
        customerService.createNewCustomer(dto);
        return ResponseEntity.created(URI.create("/customer")).build();
    }
}
