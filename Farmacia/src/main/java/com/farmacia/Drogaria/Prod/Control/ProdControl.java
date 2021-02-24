package com.farmacia.Drogaria.Prod.Control;

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

import com.farmacia.Drogaria.ModelProd.Produto;
import com.farmacia.Drogaria.Produto.Repos.ProdRepos;

@RestController
@RequestMapping("/Produto")
@CrossOrigin("*")
public class ProdControl {
	
	@Autowired
	private ProdRepos ProdRepo;
	
	@GetMapping
	public ResponseEntity<List<Produto>> GetALL(){
		return ResponseEntity.ok(ProdRepo.findAll());
	}
	
	@GetMapping ("/{id}")
	public ResponseEntity<Produto> GetById(@PathVariable int id){
		return ProdRepo.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/desconto/{desconto}")
	public ResponseEntity<List<Produto>> GetByDesconto(@PathVariable double desconto){
		return ResponseEntity.ok(ProdRepo.findAllBydescontoContainingIgnoreCase(desconto));
	}
	
	@GetMapping("/preco/{preco}")
	public ResponseEntity<List<Produto>> GetByPreco(@PathVariable double preco){
		return ResponseEntity.ok(ProdRepo.findAllByprecoContainingIgnoreCase(preco));
	}

	@PostMapping
	public ResponseEntity<Produto> post(@RequestBody Produto nome){
		return ResponseEntity.status(HttpStatus.CREATED).body(ProdRepo.save(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post1(@RequestBody Produto desconto){
		return ResponseEntity.status(HttpStatus.CREATED).body(ProdRepo.save(desconto));
	}
	
	@PostMapping
	public ResponseEntity<Produto> post2(@RequestBody Produto preco){
		return ResponseEntity.status(HttpStatus.CREATED).body(ProdRepo.save(preco));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put(@RequestBody Produto nome){
		return ResponseEntity.status(HttpStatus.OK).body(ProdRepo.save(nome));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put1(@RequestBody Produto desconto){
		return ResponseEntity.status(HttpStatus.OK).body(ProdRepo.save(desconto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> put2(@RequestBody Produto preco){
		return ResponseEntity.status(HttpStatus.OK).body(ProdRepo.save(preco));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable int id) {
		ProdRepo.deleteById((int) id);
	}
	
	
}
