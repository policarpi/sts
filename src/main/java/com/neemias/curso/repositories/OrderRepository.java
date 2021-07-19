package com.neemias.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neemias.curso.entidade.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{
	
	

}
