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
    <div class="jumbotron text-center">
            <h1>Projeto de Bloco - AT</h1>
            <h2>Lucas Ramalho Bueno</h2>
            <br>
            <h3>Faça seu cadastro abaixo</h3>          
            <a href="/" class="btn btn-primary">Fazer Login</a>
    </div> 
    
    <div class="container">
        <h2>Cadastro</h2>

            <form action="/usuario/incluir" method="post">

                <div class="form-group">
                  <label>Nome:</label>
                  <input type="text" class="form-control" name="nome" value="Lucas">
                </div>			

                <div class="form-group">
                    <label>E-mail:</label>
                    <input type="email" class="form-control" name="email" value="lucas@lucas">
                </div>

                <div class="form-group">
                    <label>Senha</label>
                    <input type="password" class="form-control" name="senha" value="123">
                </div>

                <button class="btn btn-primary" type="submit">Confirmar</button>
            </form>
            <br>        
    </div>	
</body>
</html>