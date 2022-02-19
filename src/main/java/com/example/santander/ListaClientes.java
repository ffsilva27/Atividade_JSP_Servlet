package com.example.santander;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {
    private List<ClienteModel> listaDeCliente = new ArrayList<>();

    public void addCliente(ClienteModel clienteModel) {
        listaDeCliente.add(clienteModel);
    }

    public List<ClienteModel> listarClientes() {
        return listaDeCliente;
    }
}
