package com.farmacia.Drogaria.Categ.Control;

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

import com.farmacia.Drogaria.Categoria.Repos.CategRepos;
import com.farmacia.Drogaria.ModelCateg.Categoria;

@RestController
@RequestMapping("/Categorias")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CategControl {
	
	@Autowired
	private CategRepos CateRepo;
	
	@GetMapping
	public ResponseEntity<List<Categoria>> GetALL(){
		return ResponseEntity.ok(CateRepo.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Categoria> GetById(@PathVariable int id){
		return CateRepo.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Categoria>> GetByName(@PathVariable String nome){
		return ResponseEntity.ok(CateRepo.findAllByNomeContainingIgnoreCase(nome));
	}

	@GetMapping("/marca/{marca}")
	public ResponseEntity<List<Categoria>> GetByMarca(@PathVariable String marca){
		return ResponseEntity.ok(CateRepo.findAllByNomeContainingIgnoreCase(marca));
	}
	
	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria categ){
		return ResponseEntity.status(HttpStatus.CREATED).body(CateRepo.save(categ));
	}

	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria categ){
		return ResponseEntity.status(HttpStatus.OK).body(CateRepo.save(categ));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		CateRepo.deleteById((int) id);
	}
	
}
