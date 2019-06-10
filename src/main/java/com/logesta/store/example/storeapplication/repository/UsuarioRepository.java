package com.logesta.store.example.storeapplication.repository;

import com.logesta.store.example.storeapplication.model.usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<usuario, Long>{
	
	usuario findFirstByEmail(String email);

}