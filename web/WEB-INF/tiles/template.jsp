<%-- 
    Document   : template
    Created on : 09.jan.2014, 08:33:02
    Author     : Tom
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><tiles:insertAttribute name="title"/></title>
        <style>
            *{
                margin:0;
                padding:0;
            }
	    
	    body{
		background-color: #fcf8ee;
	    }
	    
            #main-wrapper{
                width: 78%;
                margin: 0 auto;
		margin-top: 1%;
		padding: 1%;
            }
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


            #queueHeader{
                background-color: #f3ede1;
		padding: 2%;
                text-align: left;    
                margin-bottom: 15px;
		overflow: hidden;
            }

            #queueInfo{
                float: left;
            }

            #queueButtons{
                float: right; 
            }

            #queue{
                clear: both;
                height: 650px;
                font-family: arial;
                overflow-y: scroll;
            }

            #queueTable{
                font-size: 0.90em;
                border-collapse: collapse;
                table-layout: fixed; 
                width: 100%;
            }

            #queueTable tr:nth-child(odd) {
                background: #F0F0F0;
            }

            #queueTable tr:nth-child(even) {
                background: #FFFFFF;
            }

            #queueTable th, #queueTable td{
                padding-left: 10px; 
                padding-right: 10px;
                padding-top: 7px;
                padding-bottom: 7px;
                text-align: left;
                vertical-align: top;    
            }

            #queueTable th, #queue{
                background-color: lightgrey;
            }

            #queueTable td{
                height: 30px;
            }
            
	    #footer{
		text-align: center;
		background-color: #f3ede1;
		margin-top: 1%;
	    }
	    
	    #footer p{
		padding-top: 1%;
		padding-bottom: 1%;
	    }
	    
	    #navigation{
		width: 18%;
		padding: 1%;
		background-color: #f3ede1;
		float: left;
	    }
	    #navigation ul{
		list-style: none;
		margin-left: 8%;
	    }
	    
	    #main-body{
		float: right;
		width: 78%;
	    }
        </style>
    </head>
    <body>

        <!-- Banner tile here -->
        <header id="banner">
            <tiles:insertAttribute name="banner"/>
        </header>

        <!-- The wrapper contains all main page tiles. This is for formating the with of the entire site -->
        <div id="main-wrapper">

            <!-- Navigation an settings tiles here -->
            <aside id="side-menu">

                <!-- Navigation tile here -->
                <nav id="navigation">
                    <tiles:insertAttribute name="navigation"/>
                </nav>

            </aside>

            <!-- Main body tiles here -->
            <section id="main-body">
                <tiles:insertAttribute name="body"/>
            </section>
	    
	    <br clear="both"/>
        </div>

        <!-- Footer tile here -->
        <footer id="footer">
            <tiles:insertAttribute name="footer"/>
        </footer>

    </body>
</html>
