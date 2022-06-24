package com.example.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
