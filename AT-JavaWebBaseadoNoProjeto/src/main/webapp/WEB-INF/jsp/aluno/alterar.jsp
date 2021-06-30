<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <title>Cadastro</title>
    </head>
    <body>
        <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
        <div class="container">
            <div class="col-md-6">
                <h1>Alterar dados do Aluno</h1>
                <div>
                    <form:form action="salvaraluno" method="post" modelAttribute="aluno">
                        <div class="form-group">
                            ID: ${aluno.id}
                                <form:hidden path="id"/>
                        </div>
                        <div class="form-group">
                            Nome:
                            <form:input path="nomeAluno"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" id="submit" class="btn btn-primary" value="Salvar">
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </body>

