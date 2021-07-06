package br.com.farmacia.farmacia.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.farmacia.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAll();
	public Optional<Produto> findById(Long id);
	public List<Produto> findAllByDescricaoContainingIgnoreCase(String descricao);
}
