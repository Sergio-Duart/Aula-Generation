package com.redeGamer.RedeSocialparaGamers.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.redeGamer.RedeSocialparaGamers.model.Usuario;

public interface UsuarioRepos extends JpaRepository<Usuario, Integer>{
	public Optional<Usuario> findByUsuario(String usuario);
		
}
