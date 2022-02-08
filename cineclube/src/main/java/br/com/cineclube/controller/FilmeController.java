package br.com.cineclube.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cineclube.dao.FilmeRepository;
import br.com.cineclube.model.Category;
import br.com.cineclube.model.Filme;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
	
	@Autowired
	private FilmeRepository dao;
	
	// http://localhost:8080/filmes/save
	@RequestMapping("/save")
	public String save(Model model) {
		Filme avatar = new Filme(
				"Avatar", 
				LocalDate.of(2009, 10, 25),
				Category.ficcao_cientifica,
				new BigDecimal(8.5)
		);
		dao.save(avatar);
//		List<Filme> filmeList = dao.findAll();
//		model.addAttribute("filmeList", filmeList);
		return "redirect: /filmes/list";
	}
	
	@RequestMapping("/new") // cadastro do filme
	public String newForm(Model model) {
		
		
		
		return "filmes/manter.html";
	}
	@RequestMapping("/delete/{id}") // remove o filme
	public String delete(Model model) {
		// 
//		dao.deleteById(null)
		return "redirect: /filmes/list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Filme> filmeList = dao.findAll();
		model.addAttribute("filmeList", filmeList);
		return "filmes/list.html";
	}

	@RequestMapping("/home")
	public String home(Model model) {
		
		Calendar cal = Calendar.getInstance();
		// model - permite passar uma variavel para a View (html)
		model.addAttribute("today", cal.getTime());
		
		return "index.html";
	}
}
