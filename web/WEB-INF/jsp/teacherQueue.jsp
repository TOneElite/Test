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
        <h1>K� for Matematikk 2</h1>        
    </div>

    <div>         
        <button id="queueButton" type="button">Start k�en</button>
    </div>

    <div class="apple_overlay" id="overlay">
        <div class="queueContentWrap">            
        </div>
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
        <col width="28%">
        <col width="18%">
        <col width="16%">
        <tr>
            <th>Tid</th>
            <th>Navn</th>
            <th>�ving(er)</th>
            <th>Kommentar</th>
            <th>Status</th>
            <th>Plass</th>
            <th></th>
        </tr>
        <c:forEach var="queue" items="${queues}">
            <tr id="row">
                <td><c:out value="${queue.date}"/></td>
                <td><c:out value="${queue.users}"/></td>
                <td><c:out value="${queue.ov}"/></td>
                <td><c:out value="${queue.comment}"/></td>
                <td><c:out value="${queue.status}"/></td>
                <td><c:out value="${queue.tables}"/></td>
                <td>
                    <input id=help" type="button" value="Hjelp">
                    <input type="button" value="Utsett">
                    <a href="approveInQueue">
                        <button id="btnApprove" type="button">Godkjenn</button>
                    </a>
                    <input type="button" value="Fjern"></td>
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


    $("#queueButton").on("click", function() {
        if ($(this).text() == "Start k�en")
        {
            $(this).text("Steng k�en");
        } else {
            $(this).text("Start k�en");
        }
        $(".ISProductBody").toggle();

        return false;
    });
</script> 

