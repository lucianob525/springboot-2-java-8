package com.springtest.springtest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtest.springtest.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
