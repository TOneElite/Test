<!--
<section id="queueHeader">
    <div id="queueInfo">                         
        <h1>�vinger i Matematikk 2</h1>
        <p>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19</p>
    </div>


    <div id="queueButtons">         
        <input type="button" value="St� i k�" name="getInLine"/>
    </div>
</section>
-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<script src="http://cdn.jquerytools.org/1.2.7/full/jquery.tools.min.js"></script>

<section id="queueHeader">
    <div id="queueInfo">                         
        <h1>�vinger i Matematikk 2</h1>
        <p>1 <span id="mandatory">2</span> <span id="accepted">3 4 5</span> 6 7 8 9 10 <span id="mandatory"><span id="accepted">11</span></span> 12 13 14 15 16 17 18 19</p>
    </div>


    <div>         
        <a href="<c:url value="queueOverlay.htm"/>" rel="#overlay">
            <button id="queueButton" type="button">St� i k�</button>
        </a>
    </div>

    <div class="simple_overlay" id="overlay">
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
                            <li><label class="checkboxLabel">�ving 2<input class="boxes"type="checkbox" name="task" value="�ving 2"></label></li>
                            <li><label class="checkboxLabel">�ving 3<input class="boxes"type="checkbox" name="task" value="�ving 3"></label></li>
                            <li><label class="checkboxLabel">�ving 14<input class="boxes"type="checkbox" name="task" value="�ving 14"></label></li>
                            <li><label class="checkboxLabel">�ving 15<input class="boxes"type="checkbox" name="task" value="�ving 15"></label></li>
                            <li><label class="checkboxLabel">�ving 16<input class="boxes"type="checkbox" name="task" value="�ving 15"></label></li>
                            <li><label class="checkboxLabel">�ving 17<input class="boxes"type="checkbox" name="task" value="�ving 15"></label></li>
                        </ul>
                    </div> <br>

                    <label for="group">Gruppe:</label>
                    <div class="styledSelect">
                        <select id="group" class="queueFormMiddle">
                            <option>- Velg -</option>
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
                    </div>

                    <div class="queueContainer">
                        <br><br><br>
                        <div class="queueRulesHeader"><span>Regler for �vingene &#x25BC</span>

                        </div>
                        <div class="queueRulesContent">
                            <p>
                                Bacon ipsum dolor sit amet salami turkey fatback andouille biltong short loin prosciutto swine shoulder. Strip steak meatloaf ball tip cow. Ham hock beef ribs frankfurter doner. Kevin jowl spare ribs, sirloin chuck drumstick cow swine. Drumstick tongue pancetta, meatloaf sausage jerky pig kevin tenderloin doner spare ribs shankle pork beef ribs.
                                Bacon ipsum dolor sit amet salami turkey fatback andouille biltong short loin prosciutto swine shoulder. Strip steak meatloaf ball tip cow. Ham hock beef ribs frankfurter doner. Kevin jowl spare ribs, sirloin chuck drumstick cow swine. Drumstick tongue pancetta, meatloaf sausage jerky pig kevin tenderloin doner spare ribs shankle pork beef ribs.
                            </p>
                        </div>
                    </div>

                </section>

                <section id="queue">
                    <table id="queueTable">
                        <col width="6%">
                        <col width="16%">
                        <col width="10%">
                        <col width="20%">
                        <col width="15%">
                        <col width="10%">
                        <col width="15%">
                        <tr>
                            <th>Tid</th>
                            <th>Navn</th>
                            <th>�ving(er)</th>
                            <th>Kommentar</th>
                            <th>Status</th>
                            <th>Bord</th>
                            <th></th>
                        </tr>
                        <c:forEach var="queue" items="${queues}">
                            <tr>
                                <td><c:out value="${queue.date}"/></td>
                                <td><c:out value="${queue.users}"/></td>
                                <td><c:out value="${queue.ov}"/></td>
                                <td><c:out value="${queue.comment}"/></td>
                                <td><c:out value="${queue.status}"/></td>
                                <td><c:out value="${queue.tables}"/></td>
                                <td><button type="button">Fjern</button><button type="button">Utsett</button></td>
                            </tr>
                        </c:forEach>
                    </table>
                </section>

                <script language="javascript">
                    $(".queueRulesHeader").click(function() {

                        $queueRulesHeader = $(this);
                        //getting the next element
                        $queueRulesContent = $queueRulesHeader.next();
                        //open up the content needed - toggle the slide- if visible, slide up, if not slidedown.
                        $queueRulesContent.slideToggle(500, function() {
                            //execute this after slideToggle is done
                            //change text of header based on visibility of content div
                            $queueRulesHeader.text(function() {
                                //change text based on condition
                                return $queueRulesContent.is(":visible") ? "Regler for �vingene" : "Regler for �vingene";
                            });
                        });
                    });

                   $("a[rel]").overlay();
                </script> 

