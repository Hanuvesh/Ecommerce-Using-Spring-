package com.ecommerce.services;

import com.ecommerce.dao.CartRepository;
import com.ecommerce.models.Cart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService
{
    @Autowired
    private CartRepository cartRepository;

    public Cart addCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public List<Cart> getCart() {
        return cartRepository.findAll();
    }

    public List<Cart> getCartsByCustomerID(Integer customerId) {
        return cartRepository.findByCustomerId(customerId);
    }

    public void updateCart(Cart cart) {
        cartRepository.save(cart);
    }

    public void deleteCart(Cart cart) {
        cartRepository.delete(cart);
    }
}
