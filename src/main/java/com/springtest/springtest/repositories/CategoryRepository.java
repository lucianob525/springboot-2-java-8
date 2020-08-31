package com.springtest.springtest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.springtest.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
