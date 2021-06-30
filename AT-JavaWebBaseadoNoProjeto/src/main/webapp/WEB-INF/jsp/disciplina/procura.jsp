<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<title>Procura</title>
</head>
<body>
    <header><c:import url="/WEB-INF/jsp/header.jsp"/></header>
    <div class="container">
	<h1>Procura de Disciplinas</h1>
        <table class="table">
            <thead>
                <tr>
                    <th scope="col">Nome</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${result}" var="disciplina"> 
                    <tr>
                        <td>${disciplina.nome}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <a href="/disciplina/consulta">Voltar</a>
    </div>
</body>
</html>