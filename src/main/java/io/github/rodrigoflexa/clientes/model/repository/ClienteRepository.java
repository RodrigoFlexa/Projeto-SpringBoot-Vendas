package io.github.rodrigoflexa.clientes.model.repository;


import io.github.rodrigoflexa.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Integer> {
}

