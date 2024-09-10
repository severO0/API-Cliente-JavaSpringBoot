package com.br.clienteservice.clienteservice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.clienteservice.clienteservice.Service.ClienteService;



@RestController
@RequestMapping("/cliente")
//API STATELESS -> A cada nova requisicao eu recebo todas as 
//informações necessárias para processar a requisição(tokens, etc)

//STATEFULL -> O estado de cada cliente é mantido no servidor
public class ClienteController {

        @Autowired //injeção de dependência
        private ClienteService clienteService;
    //post, get, delete, put, patch, options, head -> metodos http

    @GetMapping("/listarClientes")
    public ResponseEntity getAllClientes() {
        return ResponseEntity.ok(clienteService.getAllClientes());
        }

    @PostMapping("/")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return entity;
    }
    
    }
    
                                                                                                                
