package com.Sentrega.FacturacionSegundaEntregaMartinoli.service.Cliente;

import com.Sentrega.FacturacionSegundaEntregaMartinoli.Entity.Cliente;
import com.Sentrega.FacturacionSegundaEntregaMartinoli.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService implements ClienteServiceInterface {

    @Autowired
    private ClienteRepository repository;

    @Override
    public Cliente getClienteById(Integer id) {
        return (Cliente) repository.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> getClientes() {
        return repository.findAll();
    }

    @Override
    public List<Cliente> getClientesBySex(Character s) {
        return repository.findBySex(s);
    }

    @Override
    public Cliente postCliente(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente putCliente(Cliente cliente) {
        return null;
    }
}
