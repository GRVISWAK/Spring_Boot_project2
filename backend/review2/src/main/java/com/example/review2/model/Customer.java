package com.example.review2.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Customer {
   @Id
   @GeneratedValue
   private int id;
   private String customerName;
   private String customerAddress;
   @OneToMany(
      targetEntity = Pet.class,
      cascade = {CascadeType.ALL}
   )
   @JoinColumn(
      name = "fk_cust_id",
      referencedColumnName = "id"
   )
   private List<Pet> pet;



   public Customer() {
   }
   public Customer(int id, String customerName, String customerAddress, List<Pet> pet) {
      this.id = id;
      this.customerName = customerName;
      this.customerAddress = customerAddress;
      this.pet = pet;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
   public String getCustomerName() {
      return customerName;
   }
   public void setCustomerName(String customerName) {
      this.customerName = customerName;
   }
   public String getCustomerAddress() {
      return customerAddress;
   }
   public void setCustomerAddress(String customerAddress) {
      this.customerAddress = customerAddress;
   }
   public List<Pet> getPet() {
      return pet;
   }
   public void setPet(List<Pet> pet) {
      this.pet = pet;
   }
   
}