package com.joaovictor.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaovictor.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
	
}
