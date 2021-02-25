package com.lojaGames.Fliperama.ProdControl;

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

import com.lojaGames.Fliperama.ProRepository.ProdRepos;
import com.lojaGames.Fliperama.model.Produto;

@RestController
@RequestMapping("/tb_Produtos")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdCont {

	@Autowired
	private ProdRepos ProdRep;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetALL(){
		return ResponseEntity.ok(ProdRep.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable int id){
		return ProdRep.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nomeJogo/{nomeJogo}")
	public ResponseEntity<List<Produto>> GetByDescricao(@PathVariable String nomeJogo){
		return ResponseEntity.ok(ProdRep.findAllByNomeJogoContainingIgnoreCase(nomeJogo));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto prod){
		return ResponseEntity.status(HttpStatus.CREATED).body(ProdRep.save(prod));
	}

	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto prod){
		return ResponseEntity.status(HttpStatus.OK).body(ProdRep.save(prod));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		ProdRep.deleteById((int) id);
	}
	
	
}
