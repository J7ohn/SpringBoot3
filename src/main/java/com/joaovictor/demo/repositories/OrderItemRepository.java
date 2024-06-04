package com.joaovictor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
	
}
