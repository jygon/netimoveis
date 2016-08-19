package com.meuLocal.controllers;

import com.meuLocal.service.PessoaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.meuLocal.domain.Pessoa;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages={"com.meuLocal.repository"})
@Controller
public class DashboardController {
  //private static final Logger log = LoggerFactory.getLogger(DashboardController.class);

  @Autowired
  private PessoaService repo;

  public DashboardController(){

  }

  @RequestMapping("/user/dashboard")
  public String dashboard(ModelAndView modelAndView) {
      modelAndView.setViewName("/user/dashboard");
      return "user/dashboard";
  }

  @RequestMapping("/user/info")
  public ModelAndView info(@RequestParam(value="cpf", required=true) long cpf, ModelAndView mv){
			//log.info("> info() ...");
      System.out.println("iniciando user info");
      try{
        Pessoa pessoa = repo.findByCpf(cpf);
        mv.setViewName("user/info");
        mv.addObject("nome", pessoa.getNome());
        mv.addObject("idade", pessoa.getIdade());
			  //log.info(pessoa.toString());
      } catch(Exception ex){
        System.out.println(ex.getMessage());
      }
      return mv;
	}

}
