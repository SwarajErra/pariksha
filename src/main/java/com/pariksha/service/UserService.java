package com.pariksha.service;

import java.util.Set;

import com.pariksha.entity.User;
import com.pariksha.entity.UserRole;

public interface UserService {
	
	//creating user
	public User createUser(User user,Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	public void deleteUserById(Long id);

}
