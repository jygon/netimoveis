package com.meuLocal.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import com.meuLocal.service.VagasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.meuLocal.domain.Vagas;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages={"com.meuLocal.repository"})
@RestController
public class VagasController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private VagasService vagasService;

    @RequestMapping("/vagas")
    public List<Vagas> pesquisaVagas(@RequestParam(value="lng", defaultValue="-26.55") double longitude, @RequestParam(value="lat", defaultValue="-35.11") double latitude) {
        List<Vagas> vagas;
        vagas = vagasService.findByLocalizacao(longitude, latitude);
        return vagas;
    }
}
