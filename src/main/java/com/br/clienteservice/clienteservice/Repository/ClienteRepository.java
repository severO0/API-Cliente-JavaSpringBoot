package com.br.clienteservice.clienteservice.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.clienteservice.clienteservice.Domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
