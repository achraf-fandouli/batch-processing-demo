package com.digitalcode.batch.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalcode.batch.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer> {
}