<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <title>Atualização</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6">
                <h1>Alterar dados do Usuário</h1>
                <div>
                    <form:form action="salvarusuario" method="post" modelAttribute="usuario">
                        <div class="form-group">
                            <label>ID: ${usuario.id}</label>
                            <form:hidden path="id"/>
                        </div>
                        <div class="form-group">
                            Nome:
                            <form:input path="nome"/>
                        </div>
                        <div class="form-group">
                            Email:
                            <form:input path="email"/>
                        </div>
                        <div class="form-group">
                            Senha:
                            <form:input path="senha"/>
                        </div>
                        <div class="form-group">
                            <input type="submit" id="submit" class="btn btn-primary" value="Salvar">
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
    </body>

