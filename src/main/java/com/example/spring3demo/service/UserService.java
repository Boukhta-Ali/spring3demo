package com.example.spring3demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demostarter.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
}
