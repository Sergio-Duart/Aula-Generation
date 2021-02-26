package com.lojaGames.Fliperama.CaController;

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

import com.lojaGames.Fliperama.Carepository.CategRepos;
import com.lojaGames.Fliperama.model.Categoria;

@RestController
@RequestMapping("/Categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategControl {

	@Autowired
	private CategRepos CategRep;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetALL(){
		return ResponseEntity.ok(CategRep.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable int id){
		return CategRep.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Categoria>> GetByDescricao(@PathVariable String descricao){
		return ResponseEntity.ok(CategRep.findAllBydescricaoContainingIgnoreCase(descricao));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categ){
		return ResponseEntity.status(HttpStatus.CREATED).body(CategRep.save(categ));
	}

	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categ){
		return ResponseEntity.status(HttpStatus.OK).body(CategRep.save(categ));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		CategRep.deleteById((int) id);
	}
	
	
	
}
