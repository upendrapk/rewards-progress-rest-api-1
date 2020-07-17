package com.spectrum.assessment.springboot.rewards;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spectrum.assessment.springboot.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
