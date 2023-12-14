package com.ibm.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data //generate constructors,setters and getters,toString
public class Customer {
    //Column name
    @Id //says that it is primary key in the table.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")
    private Long customerId;
    private String firstName;
    private String lastName;
    private String city;
}
