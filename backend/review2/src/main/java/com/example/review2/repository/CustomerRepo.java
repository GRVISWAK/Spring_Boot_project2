package com.example.review2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.review2.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

    
}