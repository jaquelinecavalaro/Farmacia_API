package com.farm.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.farmacia.model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long>
{
	public List <ProdutoModel>findAllByNomeContainingIgnoreCase(String nome);
	
	public List <ProdutoModel>findAllByDescricaoContainingIgnoreCase(String descricao);
}
