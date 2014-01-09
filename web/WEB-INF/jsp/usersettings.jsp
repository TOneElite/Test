<style>
    #pass-input{
        background-color: #f3ede1;
        padding: 1%; 
    }
</style>
<section id="pass-input">
    <form:form method="post" modelAttribute="changePass" action="checkPass">
        <form:errors path="*" />
        Gammelt Passord:
        <form:input path="oldPass" />
        <form:errors path="oldPass" />
        <input type="password" name="" value="">
        <br>Nytt Passord:
        <form:input path="newPass" />
        <form:errors path="newPass" />
        <input type="password" name="" value="">
        <br>Gjenta nytt passord:
        <form:input path="newPass" />
        <form:errors path="newPass" />
        <input type="password" name="" value="">
        <br><input type="submit" value="Bytt Passord">
    </form:form>
</id>