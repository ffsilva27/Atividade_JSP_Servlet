package com.example.santander;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class ClienteModel {
    private String nome;
    private String dataNascimento;
    private ContaModel conta;
}
