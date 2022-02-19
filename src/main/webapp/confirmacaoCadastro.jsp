<%--
  Created by IntelliJ IDEA.
  User: Filip
  Date: 17/02/2022
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String nomeCliente = (String)request.getAttribute("nomeCliente");
    String dataNascimento = (String)request.getAttribute("dataNascimento");
%>
<html>
<head>
    <title>Confirmação de Cadastro</title>
</head>
<body>
  <div style="display: flex; flex-direction: column; justify-content: center; align-items: center; height: 95vh">
    <h1>Cadastro Efetuado com Sucesso!</h1>
      <h3>Seja bem-vindo(a) <%=nomeCliente%> nascido(a) em <%=dataNascimento%></h3>
      <a href="CadastroServlet">Verificar todos os clientes</a>
      <a href="formCadastro.html">Cadastrar novo clientes</a>
  </div>
</body>
</html>
