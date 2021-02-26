package com.lojaGames.Fliperama.UsuaControl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lojaGames.Fliperama.Usurepository.UsuaRepos;
import com.lojaGames.Fliperama.model.Usuario;


@RestController
@RequestMapping("Usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuCont {

	@Autowired
	private UsuaRepos UsuCont;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> GetALL(){
		return ResponseEntity.ok(UsuCont.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Usuario> GetById(@PathVariable int id){
		return UsuCont.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Usuario>> GetByDescricao(@PathVariable String nome){
		return ResponseEntity.ok(UsuCont.findAllByNomeContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Usuario> post(@RequestBody Usuario nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(UsuCont.save(nome));
	}

	@PutMapping
	public ResponseEntity<Usuario> put(@RequestBody Usuario nome){
		return ResponseEntity.status(HttpStatus.OK).body(UsuCont.save(nome));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		UsuCont.deleteById((int) id);
	}
	
}
