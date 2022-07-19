package com.Sentrega.FacturacionSegundaEntregaMartinoli.service.Factura;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Factura;
import com.Sentrega.FacturacionSegundaEntregaMartinoli.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;
@Service
public class FacturaService implements FacturaServiceInterface {

    @Autowired
    private FacturaRepository repository;

    @Override
    public Factura getFacturaById(Integer id) {
        return (Factura) repository.findById(id).orElse(null);
    }

    @Override
    public List<Factura> getFacturas() {
        return repository.findAll();
    }

    @Override
    public List<Factura> getFacturasByClienteId(Integer idCliente) {
        return null;
    }

    @Override
    public List<Factura> getFacturaByFecha(Date d) {
        return null;
    }
}
