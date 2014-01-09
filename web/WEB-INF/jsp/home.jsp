<!--
<section id="queueHeader">
    <div id="queueInfo">                         
        <h1>Øvinger i Matematikk 2</h1>
        <p>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19</p>
    </div>


    <div id="queueButtons">         
        <input type="button" value="Stå i kø" name="getInLine"/>
    </div>
</section>
-->
<section id="queueHeader">
    <div id="queueInfo">                         
        <h1>Øvinger i Matematikk 2</h1>
        <p>1 <span id="mandatory">2</span> <span id="accepted">3 4 5</span> 6 7 8 9 10 <span id="mandatory"><span id="accepted">11</span></span> 12 13 14 15 16 17 18 19</p>
    </div>


    <div>         
        <a href="#" id="queueButton">Stå i kø</a>
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
            <th>Øving(er)</th>
            <th>Kommentar</th>
            <th>Status</th>
            <th>Bord</th>
        </tr>
        <tr>
            <td>01:30</td>
            <td>Ida Kristin Sollie Hagen</td>
            <td>13, 14</td>
            <td>Trenger hjelp til 13 og muligens godkjenning</td>
            <td>Får hjelp av Helge Hafting</td>
            <td>Labben, bord 2</td>
        </tr>
        <tr>
            <td>01:30</td>
            <td>Ida Kristin Sollie Hagen<br><span title="Her vil jeg at gruppen skal komme opp">med gruppe</span></td>
            <td>13, 14</td>
            <td>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nullam placerat odio eros.</td>
            <td>Får hjelp av Arvanthan</td>
            <td>Labben, bord 2</td>
        </tr>
        <tr>
            <td>01:30</td>
            <td>Ida Hagen</td>
            <td>13, 14, 17</td>
            <td>Trenger hjelp til 13 og muligens godkjenning</td>
            <td>Utsatt</td>
            <td>Labben, bord 2</td>
        </tr>
    </table>
</section>

<!--
<script language="javascript">
    $(function() {

        // if the function argument is given to overlay,
        // it is assumed to be the onBeforeLoad event listener
        $("a[rel]").overlay({
            mask: 'darkred',
            effect: 'apple',
            onBeforeLoad: function() {

                // grab wrapper element inside content
                var wrap = this.getOverlay().find(".contentWrap");

                // load the page specified in the trigger
                wrap.load(this.getTrigger().attr("href"));
            }

        });
    });
</script> -->

