package com.pontosistemas.pontosistemas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontosistemas.pontosistemas.models.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	Pessoa findById(long id);

	

}