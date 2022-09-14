package com.user.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.model.User;

public interface IUserRepo extends JpaRepository<User, Integer>{

	List<User> findUserByType(String UserType);
	
	List<User> findUserByPhone(String Phone);
	
}
