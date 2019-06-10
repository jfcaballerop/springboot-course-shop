package com.logesta.store.example.storeapplication.repository;

import java.util.List;

import com.logesta.store.example.storeapplication.model.compra;
import com.logesta.store.example.storeapplication.model.producto;
import com.logesta.store.example.storeapplication.model.usuario;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductoRepository extends JpaRepository<producto, Long>{

	List<producto> findByPropietario(usuario propietario);
	
	List<producto> findByCompra(compra compra);
	
	List<producto> findByCompraIsNull();
	
	List<producto> findByNombreContainsIgnoreCaseAndCompraIsNull(String nombre);
	
	List<producto> findByNombreContainsIgnoreCaseAndPropietario(String nombre, usuario propietario);
	
}
