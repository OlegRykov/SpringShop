package com.shop.service;

import com.shop.entites.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface IUserService extends UserDetailsService {
    User findByUserName(String userName);
}
