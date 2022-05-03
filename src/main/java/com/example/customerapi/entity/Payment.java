package com.example.customerapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity     //@Entity steht für eine Datenbankentität
public class Payment {

    @Id     //Mit der @Id Annotation legt man ein eindeutiges Attribut fest
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String payment;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
