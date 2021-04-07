package com.user.demo.servicesImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.demo.model.LoginDetails;
import com.user.demo.repositories.LoginDetailsRepository;
import com.user.demo.services.LoginDetailsService;

@Service
public class LoginDetailsServiceImpl implements LoginDetailsService {

	@Autowired
	LoginDetailsRepository loginDetailsRepository;
	
	@Override
	public LoginDetails getLoginDetailsByUsername(String username) {
		// TODO Auto-generated method stub
		return loginDetailsRepository.findByUserName(username);
	}

}
