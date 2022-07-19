package com.Sentrega.FacturacionSegundaEntregaMartinoli.repository;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
    List<Cliente> findBySex(char s);
}
