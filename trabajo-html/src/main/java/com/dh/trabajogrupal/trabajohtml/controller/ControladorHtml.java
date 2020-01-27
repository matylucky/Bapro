package com.dh.trabajogrupal.trabajohtml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorHtml {
	
	@GetMapping("inicio")
		public String IrAlHome() {
			return"./home/inicio";
	}
	
	@GetMapping("login")
	public String IrAlLogin() {
		return"./login/login";
	}
	
	@GetMapping("faq")
	public String IrAlfaq() {
		return"./preguntas/preguntas";
	}
	
	@GetMapping("registro")
	public String IrAlRegistro() {
		return"./registro/registro";
	}
}
