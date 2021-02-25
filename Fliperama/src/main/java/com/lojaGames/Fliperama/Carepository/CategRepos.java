package com.lojaGames.Fliperama.Carepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaGames.Fliperama.model.Categoria;

public interface CategRepos extends JpaRepository <Categoria, Integer>{
	public List<Categoria> findAllBydescricaoContainingIgnoreCase(String descricao);

}
