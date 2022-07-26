package com.pariksha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pariksha.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
