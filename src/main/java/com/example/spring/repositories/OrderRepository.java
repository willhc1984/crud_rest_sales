package com.example.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
	

}
