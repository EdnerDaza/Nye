package com.example.nye.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.nye.test.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@SuppressWarnings("unchecked")
	User save(User user);

}
