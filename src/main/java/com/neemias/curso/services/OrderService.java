package com.neemias.curso.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import com.neemias.curso.entidade.Order;
import com.neemias.curso.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	public Order findById(Long id) {
		Optional<Order> obj =  repository.findById(id);
		return obj.get();
	}
}
