package br.com.fiap.exemplo.repository;

import java.util.List;

import br.com.fiap.exemplo.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;



public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    List<Produto> findByNome(String prod);
    List<Produto> findByNovo(boolean novo);
    List<Produto> findByNomeAndNovo(String prod, boolean novo);
    List<Produto> findByPrecoGreaterThan(double preco);
}