<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Tela Inicial</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">    
    </head>
    <body>
        <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
        
        <div class="container">
            <div class="row">
              <div class="col-sm-4">
                <h3>LinkedIn</h3>
                <p><a href="https://www.linkedin.com/in/lucas-ramalho-bueno/" target="blank">Visite meu LinkedIn</a></p>
              </div>
              <div class="col-sm-4">
                <h3>GitHub</h3>
                <p><a href="https://github.com/lucasrbueno" target="blank">Visite meu GitHub</a></p>
              </div>
              <div class="col-sm-4">
                <h3>Cadastros</h3>   
                Usuários :: ${usuarioQtd}  <br> <a href="/usuario/lista">Veja a lista de usuários</a> <br>
                <br> <a href="/aluno/cadastro">Realize o cadastro de alunos</a> <br>
                <br> <a href="/disciplina/cadastro">Realize o cadastro de disciplinas</a> <br>
              </div>
            </div>
        </div>       
    </body>
</html>