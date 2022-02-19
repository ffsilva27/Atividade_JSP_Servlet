<%@ page import="com.example.santander.ClienteModel" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Filip
  Date: 17/02/2022
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Lista de Cadastrados</title>
</head>
<body>
<h1 style="display: flex; flex-direction: column; justify-content: center; align-items: center;">
    Lista de Clientes
</h1>
<table style="display: flex; flex-direction: column; justify-content: center; align-items: center; height: 95vh; border-collapse: separate; border-spacing: 20px">
    <tr>
        <th>Nome</th>
        <th>Data de Nascimento</th>
        <th>Banco</th>
        <th>Agência</th>
        <th>Conta</th>
    </tr>
    <%
        List<ClienteModel> clientes = (List)request.getAttribute("listaGlobal");
        for(ClienteModel clienteModel: clientes){
    %>
    <tr style="text-align: center">
        <td><%= clienteModel.getNome()%></td>
        <td><%= clienteModel.getDataNascimento()%></td>
        <td><%= clienteModel.getConta().getBanco()%></td>
        <td><%= clienteModel.getConta().getAgencia()%></td>
        <td><%= clienteModel.getConta().getConta()%></td>
    </tr>
    <%
        }
    %>
    <tfoot>
        <tr>
            <td>
                <a href="/santander">Voltar a tela inicial</a>
            </td>
            <td>
                <a href="formCadastro.html">Voltar a tela de cadastro</a>
            </td>
        </tr>
    </tfoot>
</table>
</body>
</html>
