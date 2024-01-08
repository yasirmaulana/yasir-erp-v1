package com.erp.simple.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@JsonNaming(PropertyNamingStrategy.class)
@Data
public class CustomerCreateRequestDTO {
    @NotBlank
    private String name;
    private String address;
    private String phoneNumber;
}
