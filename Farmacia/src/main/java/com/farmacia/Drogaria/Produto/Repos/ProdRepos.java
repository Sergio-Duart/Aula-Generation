package com.farmacia.Drogaria.Produto.Repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia.Drogaria.ModelProd.Produto;

public interface ProdRepos extends JpaRepository <Produto, Integer>{
	public List<Produto> findAllBynomeContainingIgnoreCase (String nome);
	public List<Produto> findAllBydescontoContainingIgnoreCase (double desconto);
	public List<Produto> findAllByprecoContainingIgnoreCase (double preco);	
	
}
