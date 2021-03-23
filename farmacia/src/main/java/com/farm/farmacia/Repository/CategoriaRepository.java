package com.farm.farmacia.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farm.farmacia.model.CategoriaModel;
import com.farm.farmacia.model.ProdutoModel;



@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long>
{

	public List<CategoriaModel>findAllByNomeContainingIgnoreCase(String nome);
	
	public List <CategoriaModel>findAllByDescricaoContainingIgnoreCase(String descricao);

}

	

