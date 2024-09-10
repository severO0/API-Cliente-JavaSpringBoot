package com.br.clienteservice.clienteservice.Dto;

public record ClienteDto(
    Long id, 
    String nome, 
    String cpf, 
    String email) {}