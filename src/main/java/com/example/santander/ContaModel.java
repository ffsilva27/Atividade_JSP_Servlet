package com.example.santander;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Getter
@Setter

public class ContaModel {
    private String banco;
    private String agencia;
    private int conta;

    private int contaAux;

    public ContaModel() {
        this.banco = "Santander";
        this.agencia = "0001";
        this.conta = gerarConta();
    }

    public int gerarConta(){
        ListaClientes listaClientes = new ListaClientes();
        List<ClienteModel> listaTotal = listaClientes.listarClientes();
        List<Integer> listaContas = new ArrayList<>();
        listaTotal.forEach(x -> {
            listaContas.add(x.getConta().getConta());
        });

        Random random = new Random();
        int numero = random.nextInt(9999);
        if(listaContas.contains(numero)){
            numero = random.nextInt(9999);
        }
        return numero;
    }
}
