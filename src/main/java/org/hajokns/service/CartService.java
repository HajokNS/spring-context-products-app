package org.hajokns.service;

import java.math.BigDecimal;
import java.util.UUID;
import org.hajokns.entity.Cart;
import org.hajokns.entity.Product;

public interface CartService {

    Cart getNewCart();

    void addProduct(Cart cart, Product product, Integer quantity);

    void addProduct(Cart cart, UUID prodId, Integer quantity);

    void delProduct(Cart cart, Product product, Integer quantity);

    BigDecimal getSum(Cart cart);

    void printCart(Cart cart);

    int getProductQuantity(Cart cart, Product product);

    int getProductQuantity(Cart cart, UUID prodId);
}
