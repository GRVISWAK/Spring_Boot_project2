package com.example.review2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.review2.model.Pet;

@Repository
public interface PetRepo extends JpaRepository<Pet,Integer> {

    
}