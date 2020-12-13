package br.com.cast.avaliacao.dto;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.FutureOrPresent;

import com.sun.istack.NotNull;

import br.com.cast.avaliacao.model.Curso;

public class CursoDto {

	@NotNull
	private Long idCategoria;
	
	@NotNull
	private String descricao;
	
	@NotNull
	@FutureOrPresent(message = "A data início não pode ser menor que a data atual.")
	private LocalDate dataInicio;
	
	@NotNull
	@FutureOrPresent(message = "A data término não pode ser menor que a data atual.")
	private LocalDate dataTermino;
	
	private Integer quantidadeAlunos;

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(LocalDate dataTermino) {
		this.dataTermino = dataTermino;
	}

	public Integer getQuantidadeAlunos() {
		return quantidadeAlunos;
	}

	public void setQuantidadeAlunos(Integer quantidadeAlunos) {
		this.quantidadeAlunos = quantidadeAlunos;
	}

	public Curso parseCurso() {
		Curso curso = new Curso() ;
		curso.setDataInicio(dataInicio);
		curso.setDataTermino(dataTermino);
		curso.setDescricao(descricao);
		curso.setQuantidadeAlunos(quantidadeAlunos);
		return curso;
	}
}
