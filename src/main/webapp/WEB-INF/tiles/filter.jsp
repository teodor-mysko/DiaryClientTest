<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 

<div id="filter">
<center>
	<form action="hashTag" method="get">
		Search by hash Tag:
        <input type="text" name="hashTag" autocomplite="ON" placeholder=" // #MyHashTag"/>
        <input  id="search" type="submit" value="Search!" />
        </center>
	</form>
	    </div > 
<link rel="stylesheet" type="text/css" href="resources/css/filter-style.css">
	    
   <!--  <center>
     <div id="sorting">
     Sort By Date:
        <input type="button" value="&#8593" onclick="history.back()" />
        <input type="button" value="&#8595" />
     Sort By alphabet:
     <input type="button" value="&#8593" onclick="history.back()" />
     <input type="button" value="&#8595" />
    </div>
    </center>  


    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script>
$(document).ready(function(){
    $("#search").click(function(){
        $("#sorting").slideDown("slow");
    });
});
</script>-->
