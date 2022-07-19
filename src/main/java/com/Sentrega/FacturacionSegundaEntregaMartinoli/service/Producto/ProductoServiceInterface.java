package com.Sentrega.FacturacionSegundaEntregaMartinoli.service.Producto;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Producto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface ProductoServiceInterface {
    Producto getProductoById(Integer id);
    Producto getProductoByNombre(String nombre);
    List<Producto> getProductos();
    List<Producto> getProductosSinStock();
}
