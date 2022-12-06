package com.book.backend.entities;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderId;
    private LocalDate orderDate;
    private long subTotal;
    private String shipping;
    private long Total;
    @ManyToOne()
    private Customer customer;
    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItems;

}
