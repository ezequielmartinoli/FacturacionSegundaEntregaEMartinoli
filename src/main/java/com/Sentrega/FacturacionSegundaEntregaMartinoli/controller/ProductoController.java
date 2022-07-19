package com.Sentrega.FacturacionSegundaEntregaMartinoli.controller;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Producto;
import com.Sentrega.FacturacionSegundaEntregaMartinoli.service.Producto.ProductoServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductoController {

    @Autowired
    private ProductoServiceInterface productoService;

    //Productos
    @GetMapping("")
    private List<Producto> getProductos(){
        return productoService.getProductos();
    }
    @GetMapping("/{id}")
    private Producto getProductoById(@PathVariable Integer id){
        return productoService.getProductoById(id);
    }
    @GetMapping("/{name}")
    private Producto getProductoByName(@PathVariable String name){
        return productoService.getProductoByNombre(name);
    }
    @GetMapping("/SinStock")
    private List<Producto> getProductosSinStock(){
        return productoService.getProductosSinStock();
    }
}
