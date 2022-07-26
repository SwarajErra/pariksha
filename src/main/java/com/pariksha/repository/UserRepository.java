package com.pariksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pariksha.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	public User findByUserName(String userName);

}
