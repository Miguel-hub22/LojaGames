package org.lojagame.games.on.Repository;

import java.util.List;

import org.lojagame.games.on.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
}
