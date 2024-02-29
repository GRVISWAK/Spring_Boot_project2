package com.example.review2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Pet {
    @Id
    private int pId;
    private String petBreed;
    private String petType;
    

    public Pet() {
    }


    public Pet(int pId, String petBreed, String petType) {
        this.pId = pId;
        this.petBreed = petBreed;
        this.petType = petType;
    }


    public int getpId() {
        return pId;
    }


    public void setpId(int pId) {
        this.pId = pId;
    }


    public String getPetBreed() {
        return petBreed;
    }


    public void setPetBreed(String petBreed) {
        this.petBreed = petBreed;
    }


    public String getPetType() {
        return petType;
    }


    public void setPetType(String petType) {
        this.petType = petType;
    }

    

    
    

    
}