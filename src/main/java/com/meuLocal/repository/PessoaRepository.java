package com.meuLocal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.meuLocal.domain.Pessoa;


public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	@Query("select p from Pessoa p where p.cpf = ?1")
	Pessoa findByCpf(Long cpf);
}
