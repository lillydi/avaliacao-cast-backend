package br.com.cast.avaliacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
@CrossOrigin
public class CategoriaController {

	@Autowired
	private CategoriaService service;
	
	@GetMapping
	public List<Categoria> categorias(){
		return service.findAll();
	}
}
