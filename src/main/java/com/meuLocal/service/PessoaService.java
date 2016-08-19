package com.meuLocal.service;

import com.meuLocal.domain.Pessoa;

import java.util.List;

public interface PessoaService {

	public List<Pessoa> findAll();
    public Pessoa findByCpf(Long cpf);

}
