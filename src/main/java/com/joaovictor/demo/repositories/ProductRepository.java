package com.joaovictor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
	
}
