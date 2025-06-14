package com.educationalManagementSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //depois lembrar de implentar uma logica diferente de geração de id
    private Long id;

    private String nome;
    private String matricula;
    private String notas;
    //Notas precisa ser uma tabela com relação de muitos para 1 com aluno,
    //depois ja criar os campos como notnull
    //ver como fazer isso no JPA

}