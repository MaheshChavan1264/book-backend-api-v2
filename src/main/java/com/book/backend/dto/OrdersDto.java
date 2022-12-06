package com.book.backend.dto;

import com.book.backend.entities.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrdersDto {
    private long orderId;
    private LocalDate orderDate;
    private long subTotal;
    private String shipping;
    private long Total;
}
