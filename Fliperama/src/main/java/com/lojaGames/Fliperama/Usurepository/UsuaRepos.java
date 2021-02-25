package com.lojaGames.Fliperama.Usurepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lojaGames.Fliperama.model.Usuario;

public interface UsuaRepos extends JpaRepository <Usuario, Integer>{
	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);

}
