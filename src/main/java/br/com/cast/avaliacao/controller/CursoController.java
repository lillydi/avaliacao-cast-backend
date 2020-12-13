package br.com.cast.avaliacao.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cast.avaliacao.dto.CursoDto;
import br.com.cast.avaliacao.model.Categoria;
import br.com.cast.avaliacao.model.Curso;
import br.com.cast.avaliacao.service.CategoriaService;
import br.com.cast.avaliacao.service.CursoService;



@RestController
@RequestMapping("/cursos")
@CrossOrigin(origins = "http://localhost:4200")
public class CursoController {
	
	@Autowired
	private CursoService service;
	
	@Autowired
	private CategoriaService categoriaService;

	@GetMapping
	public List<Curso> cursos() {
		Sort sort = Sort.by("dataInicio").descending();
		return service.findAll(sort);
	}
	
	@PostMapping
	public Curso gravar(@Valid @RequestBody CursoDto cursoDto) {
		
		Optional<Categoria> categoriaInformada = categoriaService.findById(cursoDto.getIdCategoria());
		
		if(!categoriaInformada.isPresent()) {
			return null;
		}
		
		Categoria categoria = categoriaInformada.get();
		
		Curso curso = cursoDto.parseCurso();
		curso.setCategoria(categoria);
		
		service.gravar(curso);
		
		return curso;
	}
}
