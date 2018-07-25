package com.prashanth.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashanth.demo.repository.UserRepository;
import com.prashanth.demo.security.UserPrincipal;



@Service
public class HomeService {

	private static final Logger logger = LoggerFactory.getLogger(HomeService.class);
	 
	@Autowired
	private UserRepository userRepository;
	
	public void getUserRepsonse(UserPrincipal currentUser) {
		// TBD
	}

}
