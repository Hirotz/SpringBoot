package br.org.generation.loja.games.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.loja.games.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
	public List <Produto> findAllByNomeContainingIgnoreCase(String nome);
	
	public List <Produto> findAllByDescricaoContainingIgnoreCase(String descricao);

}
