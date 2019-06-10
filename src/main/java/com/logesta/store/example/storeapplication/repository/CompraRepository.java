package com.logesta.store.example.storeapplication.repository;

import java.util.List;

import com.logesta.store.example.storeapplication.model.compra;
import com.logesta.store.example.storeapplication.model.usuario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface CompraRepository extends JpaRepository<compra, Long>{

	List<compra> findByPropietario(usuario propietario);
	
}