package com.Sentrega.FacturacionSegundaEntregaMartinoli.service.Producto;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Producto;
import com.Sentrega.FacturacionSegundaEntregaMartinoli.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements ProductoServiceInterface {

    @Autowired
    private ProductoRepository repository;

    @Override
    public Producto getProductoById(Integer id) {
        return (Producto) repository.findById(id).orElse(null);
    }

    @Override
    public Producto getProductoByNombre(String nombre) {
        return null;
    }

    @Override
    public List<Producto> getProductos() {
        return repository.findAll();
    }

    @Override
    public List<Producto> getProductosSinStock() {
        return null;
    }
}
