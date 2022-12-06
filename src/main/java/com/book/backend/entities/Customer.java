package com.book.backend.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long customerId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailId;
    private String password;
    private String confirmPassword;
    private String streetNumber;
    private String streetName;
    private String postalCode;
    private String Province;
    private String country;
}
