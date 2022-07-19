package com.Sentrega.FacturacionSegundaEntregaMartinoli.controller;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Factura;
import com.Sentrega.FacturacionSegundaEntregaMartinoli.service.Factura.FacturaServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/Facturas")
public class FacturaController {
    @Autowired
    private FacturaServiceInterface facturaService;

    //Facturas
    @GetMapping("/Facturas")
    private List<Factura> getFacturas(){
        return facturaService.getFacturas();
    }
    @GetMapping("/Facturas/{id}")
    private Factura getFacturaById(@PathVariable Integer id){
        return facturaService.getFacturaById(id);
    }
    @GetMapping("/Facturas/Cliente/{idC}")
    private List<Factura> getFacturasCliente(@PathVariable Integer idC){
        return facturaService.getFacturasByClienteId(idC);
    }
    @GetMapping("/Facturas/Fecha/{date}")
    private List<Factura> getFacturasFecha(@PathVariable Date date){
        return facturaService.getFacturaByFecha(date);
    }
}
