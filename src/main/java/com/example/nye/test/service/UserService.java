package com.example.nye.test.service;

import java.util.List;

import com.example.nye.test.model.User;

public interface UserService {

	/**
	 * Guarda un Usuario
	 * 
	* @param user
	* @return el usuario guardado
	* 
	* **/
	User save(User user);

	/**
	* Recupera la lista de usuarios
	* 
	* @return lista de usuarios
	* 
	* **/
	List<User> findAll();

	/**
	* Elimina un usuario
	* 
	* @param id 
	* 
	* **/
	void deleteUser(Long id);



}
