package com.ecommerce.models;

import jakarta.persistence.*;

@Entity(name="CART")
public class Cart
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private User customer;

    public Cart() {
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public User getCustomer()
    {
        return customer;
    }

    public void setCustomer(User customer)
    {
        this.customer = customer;
    }
}
