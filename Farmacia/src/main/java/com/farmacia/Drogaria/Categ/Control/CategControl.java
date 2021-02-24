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
@RequestMapping("/Categoria")
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
	
	@GetMapping("/marca/{marca}")
	public ResponseEntity<List<Categoria>> GetByMarca(@PathVariable String marca){
		return ResponseEntity.ok(CateRepo.findAllBymarcaContainingIgnoreCase(marca));
	}

	@PostMapping
	public ResponseEntity<Categoria> post(@RequestBody Categoria nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(CateRepo.save(nome));
	}

	@PostMapping
	public ResponseEntity<Categoria> post1(@RequestBody Categoria marca){
		return ResponseEntity.status(HttpStatus.CREATED).body(CateRepo.save(marca));
	}

	@PutMapping
	public ResponseEntity<Categoria> put(@RequestBody Categoria nome){
		return ResponseEntity.status(HttpStatus.OK).body(CateRepo.save(nome));
	}

	@PutMapping
	public ResponseEntity<Categoria> put1(@RequestBody Categoria marca){
		return ResponseEntity.status(HttpStatus.OK).body(CateRepo.save(marca));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		CateRepo.deleteById((int) id);
	}
	
}
