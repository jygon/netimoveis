package com.meuLocal.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.security.access.annotation.Secured;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;

@Controller
public class IndexController implements ErrorController {

    //private static final Logger log = LoggerFactory.getLogger(DashboardController.class);
    private static final String VIEW_INDEX = "index";
	  private static final String VIEW_LOGIN = "login";

    @RequestMapping("/")
    public String greeting(Model model) {
        //log.info("aqui");
        model.addAttribute("texto","123");
        return VIEW_INDEX;
    }

    @RequestMapping("/estrutura")
    public String estrutura(Model model) {
        return "estrutura";
    }

/*
    @RequestMapping(value = "/principal", method = RequestMethod.GET)
    public String principal(Principal principal) {
        return principal != null ? "home/homeSignedIn" : "home/homeNotSignedIn";
    }
*/

    @RequestMapping("/faq")
    public String faq(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        //System.out.println("ok\r\n\r\n\r\n\r\n");
        //log.info("aqui");
        model.addAttribute("name", name);
        return "user/info";
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        //System.out.println("ok\r\n\r\n\r\n\r\n");
        model.addAttribute("name", name);
        return "greeting";
    }

    @Secured("ROLE_ADMIN")
    @RequestMapping("/go/workarea")
    public String work(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "go/workarea";
    }

    @RequestMapping(value="/login")
  	public ModelAndView login(ModelAndView modelAndView){
  		modelAndView.setViewName(VIEW_LOGIN);
  		return modelAndView;
  	}

    private static final String PATH_ERROR = "/error";

    @RequestMapping(value = PATH_ERROR)
    public String error() {
        return VIEW_LOGIN;
    }

    @Override
    public String getErrorPath() {
        return PATH_ERROR;
    }

}
