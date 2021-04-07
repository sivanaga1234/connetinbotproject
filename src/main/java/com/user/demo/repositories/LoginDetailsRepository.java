package com.user.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user.demo.model.LoginDetails;

@Repository
public interface LoginDetailsRepository extends JpaRepository<LoginDetails, Integer> {
	
	LoginDetails findByUserName(String userName);
}
