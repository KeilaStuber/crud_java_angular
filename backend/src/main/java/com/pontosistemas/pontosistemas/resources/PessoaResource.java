package com.pontosistemas.pontosistemas.resources;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.pontosistemas.pontosistemas.models.Pessoa;
import com.pontosistemas.pontosistemas.repository.*;

@RestController
@RequestMapping(value = "/pessoa")
@CrossOrigin(value = "*") // Deixa qualquer endereco "entrar" nesse endpoint desse controller

public class PessoaResource {

	@Autowired
	public PessoaRepository pessoaRepository;

	@GetMapping
	public List<Pessoa> listaPessoas() {
		return pessoaRepository.findAll();
	}

	@GetMapping("/{id}")
	public Pessoa listaPessoaUnico(@PathVariable(value = "id") long id) {
		return pessoaRepository.findById(id);
	}

	@PostMapping
	public Pessoa salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletaPessoa(@PathVariable(value = "id") long id) {
		pessoaRepository.deleteById(id);
	}

	@PutMapping("/{id}")
	public Pessoa atualizaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}

}