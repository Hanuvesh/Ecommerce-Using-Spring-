package com.ecommerce.dao;

import com.ecommerce.models.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepository extends JpaRepository<CartProduct, Integer>
{
//    @Query("SELECT cp.product FROM CartProduct cp WHERE cp.cart.id = :cartId")
//    List<Product> findProductsByCartId(@Param("cartId") Integer cartId);

}
