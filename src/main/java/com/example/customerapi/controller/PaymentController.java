package com.example.customerapi.controller;


import com.example.customerapi.entity.Payment;
import com.example.customerapi.repository.PaymentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private PaymentRepository paymentRepository;

    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @GetMapping("")
    public List<Payment> index(){
        return paymentRepository.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Payment> getPaymentById(@PathVariable long id){
        return paymentRepository.findById(id);
    }

}
