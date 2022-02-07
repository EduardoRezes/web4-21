package br.com.cineclube.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping()
public class FilmeController {

	// http://localhost:8080/filmes
	@RequestMapping("/filmes")
	public String home(Model model) {
		
		Calendar cal = Calendar.getInstance();
		// model - permite passar uma variavel para a View (html)
		model.addAttribute("today", cal.getTime());
		
		return "index.html";
	}
}
