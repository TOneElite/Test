<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>St� i k�</title>

        <link href="resources/css/styles.css" rel="stylesheet" type="text/css" media="screen" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
    </head>


    <body>

        <div id="queueForm">
            <section id="queueFormLeft">
            <h1>St� i k�</h1>
            <form action="#" method="post">

                    <label for="room">Rom:</label>  
                    <div class="styledSelect">
                        <select id="room" class="queueFormMiddle">
                            <option>Labben</option>
                            <option>Polarealet i f�rste</option>
                            <option value="other">Annet</option>
                        </select>
                    </div><br>

                    <label for="table">Bord:</label>
                    <div class="styledSelect">
                        <select id="table" class="queueFormMiddle">
                            <option>Bord 1</option>
                            <option>Bord 2</option>
                            <option>Bord 3</option>
                        </select>
                    </div><br>                           
                    
                    <div id="queueFormCeckboxes">
                        <label class="queueFormLabel" for="task">�ving:</label>
                        <ul class="queueFormMiddle">
                            <li><label class="checkboxLabel">�ving 1<input class="boxes" type="checkbox" name="task" value="�ving 1"></label></li>
                            <li><label class="checkboxLabel">�ving 2<input class="boxes" type="checkbox" name="task" value="�ving 2"></label></li>
                            <li><label class="checkboxLabel">�ving 3<input class="boxes" type="checkbox" name="task" value="�ving 3"></label></li>
                            <li><label class="checkboxLabel">�ving 14<input class="boxes" type="checkbox" name="task" value="�ving 14"></label></li>
                            <li><label class="checkboxLabel">�ving 15<input class="boxes" type="checkbox" name="task" value="�ving 15"></label></li>
                            <li><label class="checkboxLabel">�ving 16<input class="boxes" type="checkbox" name="task" value="�ving 15"></label></li>
                            <li><label class="checkboxLabel">�ving 17<input class="boxes" type="checkbox" name="task" value="�ving 15"></label></li>
                        </ul>
                    </div> <br>
                    
                      <label for="group">Gruppe:</label>
                    <div class="styledSelect">
                        <select id="group" class="queueFormMiddle">
                            <option>Velg</option>
                            <option>Tom</option>
                            <option>Ole</option>
                            <option>Andreas</option>
                        </select>
                    </div><br>
                    
                    <label for="comment">Kommentar:</label>
                    <textarea id="comment" class="queueFormMiddle"></textarea>
                    <br>
                    
                    <input class="middle" id="cancelbutton" type="button" value="Avbryt" />
                    <input class="middle" id="okbutton" type="submit" value="OK" />

            </form>
            <section>
            
            <div id="queueFormRight">
                Dette er h�yre
            </div>
        </div>

            <script language="javascript">
        var dis1 = document.getElementById("room");
        dis1.onchange = function() {
            if (this.value == "other") {
                document.getElementById("table").disabled = true;
                document.getElementById("table").className += " disabled";
            }
            else {
                document.getElementById("table").disabled = false;
                document.getElementById("table").className -= " disabled";
            }
        }
    </script>
        <!--
        <script language="javascript">

            $('input:checkbox').click(function() {
                $(this).parent('label').toggleClass('highlight', this.checked);
            }); 
        </script> -->
    </body>
</html>