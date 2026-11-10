package io.github.felipevieira.trabalhoapirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.felipevieira.trabalhoapirest.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
