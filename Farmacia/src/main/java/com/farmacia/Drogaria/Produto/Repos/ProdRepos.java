package com.farmacia.Drogaria.Produto.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Drogaria.ModelCateg.Categoria;


public interface ProdRepos extends JpaRepository <Categoria, Integer>{
	public List<Categoria> findAllBynomeContainingIgnoreCase (String nome);
	public List<Categoria> findAllBymarcaContainingIgnoreCase (double desconto);
	
	
}
