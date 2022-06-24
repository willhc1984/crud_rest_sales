package com.example.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
