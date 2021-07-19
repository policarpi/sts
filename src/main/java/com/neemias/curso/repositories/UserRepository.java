package com.neemias.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neemias.curso.entidade.User;

public interface UserRepository  extends JpaRepository<User, Long>{
	
	

}
