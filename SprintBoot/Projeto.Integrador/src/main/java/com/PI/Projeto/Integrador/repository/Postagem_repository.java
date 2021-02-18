package com.PI.Projeto.Integrador.repository;

import java.util.List;

import com.PI.Projeto.Integrador.model.PI_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface Postagem_repository extends JpaRepository<PI_model, Long> {
	public List<PI_model> findAllByTituloContainingIgnoreCase (String Titulo);
	
	
	

}
