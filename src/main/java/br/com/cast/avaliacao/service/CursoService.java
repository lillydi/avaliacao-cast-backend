package br.com.cast.avaliacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.cast.avaliacao.model.Curso;
import br.com.cast.avaliacao.repository.CursoRepository;

@Service
public class CursoService {

	@Autowired
	private CursoRepository repository;

	public List<Curso> findAll(Sort sort) {
		return repository.findAll(sort);
	}

	public void gravar(Curso curso) {
		repository.save(curso);
	}
}
