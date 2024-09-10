package com.br.clienteservice.clienteservice.Domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Entity
@Table(name = "clientes")
@Getter
@Setter
@AllArgsConstructor
public class Cliente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "nome", nullable = false, length= 150)
    private String nome;
    @Column(name = "cpf", nullable = false, length= 14, unique = true)
    private String cpf;
    @Column(name = "email", nullable = false, length= 150, unique = true)
    private String email;
    @Column(name = "celular", nullable = false, length= 15)
    private String celular;
    @Column(name = "data_nascimento", nullable = false)
    private Date dataNascimento;
    @Column(name = "sexo", nullable = false, length= 1)
    private String sexo;
    @Column(name = "ativo", nullable = false, length= 1)
    private Integer ativo;
    
    
    


}
