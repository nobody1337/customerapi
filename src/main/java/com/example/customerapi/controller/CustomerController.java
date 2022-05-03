package com.example.customerapi.controller;

import com.example.customerapi.entity.Customer;
import com.example.customerapi.repository.CustomerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

/*
    Controller nehmen eingehende Requests vom Browser entgegen.
    Rest Controller sind im Spring Boot Umfeld Java Klassen, die mit speziellen
    Annotationen angereichert werden. Damit ein Rest Controller überhaupt auf HTTP Anfragen reagieren kann,
    ist es zwingend erforderlich dem Rest Controller mitzuteilen unter welcher URL er angesprochen werden kann.
    Hierfür muss man den Rest Controller um die Annotation „@RequestMapping“ erweitern.
    In unserem Fall erweitern wir den CustomerController der über die URL http://localhost:8080/customer erreichbar sein soll.
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerRepository customerRepository;

    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    //GET-Methoden
    @GetMapping("")
    public List<Customer> index(){
        return customerRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable long id){
        return customerRepository.findById(id);
    }

}
