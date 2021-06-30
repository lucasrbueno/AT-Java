<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
		
        <title>Cadastro</title>
    </head>
    <body>
        <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
        <div class="container">
            <div class="col-md-6 cadastro">
                <h1>Cadastro do Aluno</h1>
                <div>
                    <form action="/aluno/cadastrar" method="POST">
                        <div class="form-group">
                            Nome
                            <input type="text" name="nomeAluno" id="nomeAluno" class="form-control" required="">
                        </div>
                        
                        <div class="form-group">
                            <input type="submit" id="submit" class="btn btn-primary" value="Cadastrar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>