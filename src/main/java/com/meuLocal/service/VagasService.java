package com.meuLocal.service;

import com.meuLocal.domain.Vagas;
import java.util.List;

public interface VagasService {

    public List<Vagas> findAll();
    public List<Vagas> findByLocalizacao(double longitude, double latitude);

}