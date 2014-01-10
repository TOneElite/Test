<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
    *{
	margin:0;
	padding:0;
    }

    #login{
	text-align: center;
	margin-top: 15%;
    }

    #login hlink{
	float:right;
    }

    .logo{
	font-size: 4em;
	font-family: "mekanik let", arial;
	display: inline;
    }

</style>
<div id="login">
    <img src="<c:url value="/res/histlogo.png"/>" alt="HiST" height="94" width="98">
    <div class="logo">SKS 2.0</div><br>
    <form action="http://localhost:8084/TestSKS/">
	<input type="email" name="email" value="E-Post">
	<a href="<c:url value="/passwordReset" />">Reset password</a><br>
	<input type="text" name="passwordbox" type="password" value="Passord"><br>
	Husk passord:<input type="checkbox"> <input type="submit" value="Logg inn">
    </form>
</div>