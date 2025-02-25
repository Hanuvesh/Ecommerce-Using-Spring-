package com.ecommerce.dao;

import com.ecommerce.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>
{
    List<Cart> findByCustomerId(Integer customerId);
}
