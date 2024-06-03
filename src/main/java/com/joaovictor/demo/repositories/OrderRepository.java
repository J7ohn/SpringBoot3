package com.joaovictor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
	
}
