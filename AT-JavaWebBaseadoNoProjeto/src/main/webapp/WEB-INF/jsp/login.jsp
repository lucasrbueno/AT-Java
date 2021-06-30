<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>App</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="jumbotron text-center">
        <h1>Projeto de Bloco - AT</h1>
        <h2>Lucas Ramalho Bueno</h2>
        <br>

        <h3>Bem vindo ao sistema, novo usuário!</h3>

        <a href="/usuario" class="btn btn-primary">Crie seu cadastro!</a>
    </div> 
    <div class="container">
        
        <h2>Login</h2>

        <form action="/usuario/login" method="post">
            <div class="form-group">           
                      
            <c:if test="${not empty permissao}">
                <div class="alert alert-danger">
                    <strong>Problema!</strong> ${permissao}
                </div>
            </c:if>
              
            <label for="email">E-mail:</label>
            <input type="email" class="form-control" id="email" placeholder="Entre com o e-mail" name="email" value="lucas@lucas">
          </div>

          <div class="form-group">
            <label for="senha">Senha:</label>
            <input type="password" class="form-control" id="senha" placeholder="Entre com a senha" name="senha" value="123">
          </div>

          <button type="submit" class="btn btn-primary">Acessar</button>
        </form>
    </div>
</body>
</html>