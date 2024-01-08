package com.erp.simple.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

@Data
@JsonNaming(PropertyNamingStrategy.class)
public class CustomerResponseDTO {
    private Long id;
    private String name;
    private String address;
    private String phoneNumber;
}
