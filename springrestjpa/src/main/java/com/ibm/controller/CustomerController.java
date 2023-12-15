package com.ibm.controller;

import com.ibm.entities.Customer;
import com.ibm.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    //inject repository
    @Autowired
    CustomerRepository repository;

    //apis
    @GetMapping(produces = {"application/json"})
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id") long id) {
        Optional<Customer> customer = repository.findById(id);

        if (customer.isPresent()) {
            return new ResponseEntity<>(customer.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }

    @PutMapping(value = "/{id}", produces = {"application/json"})
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer
            customer) {
        Optional<Customer> customerFound = repository.findById(id);
        if (customerFound.isPresent()) {
            System.out.println(customer);
            Customer tmpCustomer = customerFound.get();
            //override properties for update
            tmpCustomer.setFirstName(customer.getFirstName());
            tmpCustomer.setLastName(customer.getLastName());
            tmpCustomer.setCity(customer.getCity());
            Customer updatedCustomer = repository.save(tmpCustomer);
            return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
        }
        return new ResponseEntity<>(new Customer(), HttpStatus.NOT_FOUND);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HttpStatus> removeCustomer(@PathVariable("id") long id) {
        try {
            Optional<Customer> customer = repository.findById(id);
            if (customer.isPresent()) {
                repository.deleteById(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer savedCustomer = repository.save(customer);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);

    }

}
