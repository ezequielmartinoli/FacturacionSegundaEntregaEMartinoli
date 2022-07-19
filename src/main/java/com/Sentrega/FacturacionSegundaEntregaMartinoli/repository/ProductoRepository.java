package com.Sentrega.FacturacionSegundaEntregaMartinoli.repository;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Integer> {
}
