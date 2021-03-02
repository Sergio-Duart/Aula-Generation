package com.redeGamer.RedeSocialparaGamers.seguranca;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.redeGamer.RedeSocialparaGamers.model.Usuario;
import com.redeGamer.RedeSocialparaGamers.repository.UsuarioRepos;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	private UsuarioRepos userRepos;
	
	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		Optional<Usuario> user = userRepos.findByUsuario(userName);
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "Not Found."));
		return user.map(UserDetailsImpl::new).get();
	}
	
	
}
