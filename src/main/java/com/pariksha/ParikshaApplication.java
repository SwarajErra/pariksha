package com.pariksha;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pariksha.entity.Role;
import com.pariksha.entity.User;
import com.pariksha.entity.UserRole;
import com.pariksha.service.UserService;

@SpringBootApplication
public class ParikshaApplication implements CommandLineRunner  {
	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ParikshaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("starting code");
		
//		User user = new User();
//		
//		user.setFirstName("Swaraj");
//		user.setLastName("Erra");
//		user.setUserName("Swaraj991");
//		user.setPassword("abc");
//		user.setEmail("swaraj991@gmail.com");
//		user.setProfile("default.png");
//		
//		Role role1 = new Role();
//		role1.setRoleId(44L);
//		role1.setRoleName("Admin");
//		
//		
//		Set<UserRole> userRoles = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		
//		userRole.setUser(user);
//		
//		userRoles.add(userRole);
//		
//		User user1 = userService.createUser(user, userRoles);
//		System.out.println(user1.getUserName());
	}

}
