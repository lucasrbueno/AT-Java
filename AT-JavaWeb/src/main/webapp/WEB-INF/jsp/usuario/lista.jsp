<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP-AT-PB</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
    <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
    <div class="container">
        
         <h3>Lista de Usuários</h3>
        
        <c:if test="${not empty usuarios}">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>ID</th>
                  <th>Nome</th>
                  <th>E-mail</th>
                  <th></th>
                  <th></th>
                </tr>
              </thead>
              <tbody>
                <c:forEach var="u" items="${usuarios}">
                    <tr>
                      <td>${u.id}</td>
                      <td>${u.nome}</td>
                      <td>${u.email}</td>
                      <td><a href="alterar?id=${u.id}">Alterar</a></td>
                      <td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
                    </tr>
                </c:forEach>
              </tbody>
            </table>
        </c:if>    
        <c:if test="${empty usuarios}">
            <h3>Nenhum usuario foi cadastrado!</h3>
        </c:if>
    </div>	
</body>
</html>