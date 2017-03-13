package com.exemplo.autenticacao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControladorNavegacaoController {
	
	@RequestMapping("/")
	public String goHome() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String goLogin() {
		return "login";
	}
	
	@RequestMapping("/admin")
	public String goAdmin() {
		return "admin";
	}

}
