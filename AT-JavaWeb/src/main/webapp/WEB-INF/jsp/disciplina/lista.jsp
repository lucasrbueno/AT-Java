<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<title>Lista</title>
</head>
<body>
    <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
    <div class="container">
            <h1>Lista de Disciplinas</h1>

            <form method="get" action="/disciplina/procura">
                <input type="text" name="keyword"> <input class="btn btn-primary" type="submit"
                            name="procura">
            </form>
            <h3>
                <a href="/disciplina/cadastro">Nova Disciplina</a>
            </h3>
            
            <c:if test="${not empty permissao}">
                <div class="alert alert-danger">
                    <strong>Problema!</strong> ${permissao}
                </div>
            </c:if>
            
            <table class="table">
                <thead>
                <th>Nome</th>
                </thead>
                <tbody>
                    <c:forEach items="${listaDisciplina}" var="atributo">
                        <tr>
                            <td>${atributo.nome}</td>
                            <td><a href="/disciplina/alterar?id=${atributo.id}">Alterar</a>
                                    &nbsp;&nbsp; <a href="/disciplina/excluir?id=${atributo.id}">Excluir</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
    </div>
</body>
</html>