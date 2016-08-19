package com.meuLocal.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.meuLocal.domain.Pessoa;
import org.springframework.stereotype.Service;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import com.meuLocal.repository.PessoaRepository;

@Repository
@Service
@Transactional
public class PessoaServiceImpl implements PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public List<Pessoa> findAll(){
		return pessoaRepository.findAll();
	}
	public Pessoa findByCpf(Long cpf){
    return pessoaRepository.findByCpf(cpf);
  }

}
