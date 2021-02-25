package com.lojaGames.Fliperama.ProRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaGames.Fliperama.model.Produto;

public interface ProdRepos extends JpaRepository <Produto, Integer>{
	public List<Produto> findAllByNomeJogoContainingIgnoreCase(String nomeJogo);

}
