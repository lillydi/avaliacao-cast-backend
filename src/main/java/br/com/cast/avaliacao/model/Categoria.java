package br.com.cast.avaliacao.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Categoria {

	@Id
	private Long id;
	
	private String descricao;
	
	private Integer codigo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
