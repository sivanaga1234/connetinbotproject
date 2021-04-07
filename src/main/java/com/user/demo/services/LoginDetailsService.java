package com.user.demo.services;

import com.user.demo.model.LoginDetails;

public interface LoginDetailsService {

	LoginDetails getLoginDetailsByUsername(String username);
}
