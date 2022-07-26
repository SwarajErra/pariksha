package com.pariksha.service.implementation;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pariksha.entity.User;
import com.pariksha.entity.UserRole;
import com.pariksha.repository.RoleRepository;
import com.pariksha.repository.UserRepository;
import com.pariksha.service.UserService;
@Service
public class UserServiceImplementation implements UserService{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;

	@Override
	public User createUser(User user, Set<UserRole> userRoles) throws Exception  {
		
		User local = userRepository.findByUserName(user.getUserName());
		
		if(local!=null) {
			
			System.out.println("User is already there");
			throw new Exception("User is already present!!");
		}
		else {
			
			for(UserRole role:userRoles) {
				
				roleRepository.save(role.getRole());
			}
			
			user.getUserRoles().addAll(userRoles);
			local = userRepository.save(user);
			
			
			
		}

		return local;
	}
	
	
	public User getUser(String userName) {
		
		User user = userRepository.findByUserName(userName);
		
		return user;
	}


	@Override
	public void deleteUserById(Long id) {
		userRepository.deleteById(id);
	}

}
