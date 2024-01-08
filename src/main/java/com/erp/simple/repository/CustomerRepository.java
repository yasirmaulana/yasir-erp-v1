package com.erp.simple.repository;

import com.erp.simple.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    public Optional<Customer> findById(Long id);

    public List<Customer> findByNameLike(String name);
}
