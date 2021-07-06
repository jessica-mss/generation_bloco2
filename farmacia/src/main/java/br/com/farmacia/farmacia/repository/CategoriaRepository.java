package br.com.farmacia.farmacia.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.farmacia.farmacia.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	public List<Categoria> findAll();
	public Optional<Categoria> findById(long id);
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	
	
}
