package io.github.rodrigoflexa.clientes.model.repository;

import io.github.rodrigoflexa.clientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico,Integer> {
}
