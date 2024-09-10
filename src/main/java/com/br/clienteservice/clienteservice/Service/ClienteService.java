package com.br.clienteservice.clienteservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.clienteservice.clienteservice.Domain.Cliente;
import com.br.clienteservice.clienteservice.Repository.ClienteRepository;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository; 
    
    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }
    
    public Cliente saveCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente deleteCliente(Long id) {
        Cliente cliente = clienteRepository.findById(id).get();
        clienteRepository.delete(cliente);
        return cliente;
    }

    public Cliente updateCliente(Long id, Cliente cliente) {
        Cliente clienteToUpdate = clienteRepository.findById(id).get();
        clienteToUpdate.setNome(cliente.getNome());
        clienteToUpdate.setEmail(cliente.getEmail());
        clienteToUpdate.setCelular(cliente.getCelular());
        clienteToUpdate.setAtivo(cliente.getAtivo());
        return clienteRepository.save(clienteToUpdate);
    }
    

}
