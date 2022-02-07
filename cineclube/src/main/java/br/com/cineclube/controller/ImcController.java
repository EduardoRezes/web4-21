package br.com.cineclube.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ImcController {
//	http://localhost:8080/imc?peso=77
	@RequestMapping("/imc")
	public String imc(
			@RequestParam Double peso,
			@RequestParam Double altura,
			Model model) {
		Double imc = peso / (altura * altura);
		
		if (imc < 25)
			model.addAttribute("mensagem", 
					imc+" esta ótimo!");
		if (imc > 25)
			model.addAttribute("mensagem", 
					imc+" Cuidado reveja seus hábitos!");
		
		model.addAttribute("imc", imc);
		
		return "index.html";
	}
}
