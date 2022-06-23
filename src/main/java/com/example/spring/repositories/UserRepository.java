package com.example.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}
