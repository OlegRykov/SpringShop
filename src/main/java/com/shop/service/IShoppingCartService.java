package com.shop.service;

import com.shop.entites.Product;
import com.shop.utils.ShoppingCart;

import javax.servlet.http.HttpSession;

public interface IShoppingCartService {

    ShoppingCart getCurrentCart(HttpSession session);

    void addProductToCart(HttpSession session, Long productId);

    void addProductToCart(HttpSession session, Product product);

    void removeFromCart(HttpSession session, Long productId);

    void removeFromCart(HttpSession session, Product product);

}
