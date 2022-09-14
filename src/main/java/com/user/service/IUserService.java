package com.user.service;

import java.util.List;

import com.user.model.User;

public interface IUserService {
	
	Integer saveUser(User user);

	public List<User> getAllUser();

	public List<User> getUserByType(String UserType);

	public List<User> getUserByPhone(String Phone);

}
