package com.example.santander;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CadastroServlet", value = "/CadastroServlet")
public class CadastroServlet extends HttpServlet {
    ClienteModel cliente;
    ListaClientes listaClientes = new ListaClientes();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ClienteModel> listaGeral = listaClientes.listarClientes();
        request.setAttribute("listaGlobal", listaGeral);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaCadastros.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nomeCliente = request.getParameter("nomeCliente");
        String dataNascimento = request.getParameter("dataNascimento");
        cliente = new ClienteModel(nomeCliente, dataNascimento, new ContaModel());

        listaClientes.addCliente(cliente);

        RequestDispatcher requestDispatcher =request.getRequestDispatcher("confirmacaoCadastro.jsp");
        request.setAttribute("nomeCliente", cliente.getNome());
        request.setAttribute("dataNascimento", cliente.getDataNascimento());

        requestDispatcher.forward(request,response);
    }
}
