package com.book.backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
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
