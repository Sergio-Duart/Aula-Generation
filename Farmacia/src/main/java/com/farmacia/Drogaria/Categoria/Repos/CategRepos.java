package com.farmacia.Drogaria.Categoria.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Drogaria.ModelCateg.Categoria;

public interface CategRepos extends JpaRepository <Categoria, Integer>{
	public List<Categoria> findAllBynomeContainingIgnoreCase (String nome);
	public List<Categoria> findAllBymarcaContainingIgnoreCase (String marca);

}
