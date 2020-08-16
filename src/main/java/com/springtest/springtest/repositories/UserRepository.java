package com.springtest.springtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.springtest.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
