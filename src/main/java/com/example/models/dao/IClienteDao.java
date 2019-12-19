package com.example.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
	
	

}
