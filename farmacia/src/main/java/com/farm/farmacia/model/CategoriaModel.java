package com.farm.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table(name = "Categoria") //vamos criar a tabela
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //o ID irá gerar identidade
	private long id;
	
	@NotNull
	private String nome;
	
	@NotNull
	private String descricao;
	
	@NotNull
	private boolean receita;
	
	
	@OneToMany(mappedBy = "categoria" , cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List <ProdutoModel> Produto;
	
	
	//fazer o get e set

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isReceita() {
		return receita;
	}

	public void setReceita(boolean receita) {
		this.receita = receita;
	}

	public List<ProdutoModel> getProduto() {
		return Produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		Produto = produto;
	}
	
	
}
