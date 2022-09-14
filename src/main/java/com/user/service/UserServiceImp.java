package com.user.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.model.User;

@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	IUserRepo iUserRepo;
	
	
	@Override
	public Integer saveUser(User user) {
		User saveUser = iUserRepo.save(user);
		return saveUser.getId();
	}


	@Override
	public List<User> getAllUser() {
		return iUserRepo.findAll();
	}


	@Override
	public List<User> getUserByType(String UserType) {
		return iUserRepo.findUserByType(UserType);
	}


	@Override
	public List<User> getUserByPhone(String Phone) {
		return iUserRepo.findUserByPhone(Phone);
	}
	
	

	
	


}
