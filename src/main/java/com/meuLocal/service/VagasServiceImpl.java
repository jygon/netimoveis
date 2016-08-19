package com.meuLocal.service;

import com.meuLocal.domain.Vagas;
import com.meuLocal.repository.VagasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Service
@Transactional
public class VagasServiceImpl implements VagasService {

	@Autowired
	private VagasRepository vagasRepository;

	public List<Vagas> findAll(){
		return vagasRepository.findAll();
	}
	public List<Vagas> findByLocalizacao(double longitude, double latitude){
		return vagasRepository.findByLocalizacao(longitude, latitude);
  	}

}
