package com.ibm.repository;

import com.ibm.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    //Here you can write your own apis too
}
