<style>
    *{
	margin: 0;
	padding: 0;
    }
    #banner{
        padding: 1% 6%;
        background-color: #f3ede1;
    }
    .link{
        font-size: 0.8em;
    }

    #info{
        float:right;
        overflow: hidden;
        font-size: 1.5em;
        text-align: right;
        margin-top: 45px;
    }
    .logo{
        font-size: 4em;
        font-family: "mekanik let", arial;
        display: inline;
    }
</style>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header id="banner">
    <img src="<c:url value="/res/histlogo.png"/>" alt="HiST" height="94" width="98">
    
    <h1 class="logo">SKS 2.0</h1>
    <div id="info">
        <a href="">Øystein Huseby</a></br>
        <a href="" class="link">Bytt Passord</a>
        <a href="" class="link">Log ut</a>
    </div>
</header>