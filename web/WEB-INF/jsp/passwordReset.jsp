<%-- 
    Document   : passwordReset
    Created on : Jan 9, 2014, 4:26:55 PM
    Author     : Øystein
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            *{
                margin:0;
                padding:0;
            }

            #logo{
                font-size: 4em;
                font-family: "mekanik let", arial;
                display: inline;
            }

        </style>
    </head>
    <body>
        <div id="logo">SKS 2.0</div>
    <form:form method="post" modelAttribute="changePass" action="changePass">
        <br><label>Epost:</label>
        <form:input path="oldPass" />
        <form:errors path="oldPass" />
    </form:form>
</body>
</html>
