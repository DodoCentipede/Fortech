<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*"%>
<%@ page import="entities.*" %>
<%@ page import="model.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cinema ticket try</title>
 <style>
        *{margin:0px; padding:0px; font-family:Helvetica, Arial, sans-serif;}

        /* Full-width input fields */
        input[type=text], input[type=password] {
            width: 90%;
            padding: 12px 20px;
            margin: 8px 26px;
            display: inline-block;
            border: 1px solid #ccc;
            box-sizing: border-box;
            font-size:16px;
        }

        /* Set a style for all buttons */
        button {
            background-color: #4CAF50;
            color: white;
            padding: 7px 10px;
            margin: 4px 13px;
            border: none;
            cursor: pointer;
            width: 40%;
            font-size:10px;
        }
        button:hover {
            opacity: 0.8;
        }

        /* Center the image and position the close button */
        .imgcontainer {
            text-align: center;
            margin: 24px 0 12px 0;
            position: relative;
        }

        /* The Modal (background) */
        .modal {
            display:none;
            position: fixed;
            z-index: 1;
            left: 0;
            top: 0;
            width: 100%;
            height: 100%;
            overflow: auto;
            background-color: rgba(0,0,0,0.4);
        }

        /* Modal Content Box */
        .modal-content {
            background-color: #fefefe;
            margin: 4% auto 15% auto;
            border: 1px solid #888;
            width: 40%;
            padding-bottom: 30px;
        }

        /* The Close Button (x) */
        .close {
            position: absolute;
            right: 25px;
            top: 0;
            color: #000;
            font-size: 35px;
            font-weight: bold;
        }
        .close:hover,.close:focus {
            color: red;
            cursor: pointer;
        }

        /* Add Zoom Animation */
        .animate {
            animation: zoom 0.6s
        }
        @keyframes zoom {
            from {transform: scale(0)}
            to {transform: scale(1)}
        }
    </style>
</head>
<body>
<button onclick="document.getElementById('modal-wrapper').style.display='block'" style="width:60px;position:absolute; top:0; right:125px;">Add</button>
<button onclick="document.getElementById('modal-wrapper1').style.display='block'" style="width:60px;position:absolute; top:75px; right:125px;">Update</button>
<button onclick="document.getElementById('modal-wrapper2').style.display='block'" style="width:60px;position:absolute; top:145px; right:125px;">Delete</button>
	<% MovieEntityModel mem=new MovieEntityModel(); %>
	<table cellpadding="4" cellspacing="3" border="0">
	<tr> 
		<th>idMovie</th>
		<th>nameMovie</th>
		<th>tipeMovie</th>
		<th>distributieMovie</th>
		<th>regizorMovie</th>
		<th>dateMovie</th>
		<th>languageMovie</th>
		<th>classificationMovie</th>
		<th>ClickToContinue</th>
	</tr>
	<c:forEach var="p" items="<%=mem.findAll() %>">
		<tr>
			<td>${p.idMovie}</td>
			<td>${p.nameMovie}</td>
			<td>${p.tipeMovie}</td>
			<td>${p.distributieMovie}</td>
			<td>${p.regizorMovie}</td>
			<td>${p.dateMovie}</td>
			<td>${p.languageMovie}</td>
			<td>${p.classificationMovie}</td>
			<td  align="center"><a href="MoviePlaceEntityController?id=${p.idMovie}&action=ContinueBuying">SeeTheTime</a></td>
						
		</tr>
	</c:forEach>
	</table>
	
    <div id="modal-wrapper" class="modal">
    <form class="modal-content animate" action="AddEntityMovie">
        <div class="imgcontainer">
            <span onclick="document.getElementById('modal-wrapper').style.display='none'" class="close" title="Close PopUp">&times;</span>
            <h1 style="text-align:center">Add</h1>
        </div>
        <div class="container" >
            <input type="text" placeholder="Enter idMovie" 				name="idMovieT">
            <input type="text" placeholder="Enter nameMovie" 			name="nameMovieT">
            <input type="text" placeholder="Enter tipeMovie" 			name="tipeMovieT">
            <input type="text" placeholder="Enter distributieMovie" 	name="distributieMovieT">
            <input type="text" placeholder="Enter regizorMovie" 		name="regizorMovieT">
            <input type="text" placeholder="Enter dateMovie" 			name="dateMovieT">
            <input type="text" placeholder="Enter languageMovie" 		name="languageMovieT">
            <input type="text" placeholder="Enter classificationMovie"  name="classificationMovieT">
            <button type="submit">Add</button>
        </div>
    </form> 
    </div>
   
     <script>
    var modal = document.getElementById('modal-wrapper');
    window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
    }
    </script>
    
	<div id="modal-wrapper1" class="modal">
    <form class="modal-content animate" action="UpdateEntityMovie">
        <div class="imgcontainer">
            <span onclick="document.getElementById('modal-wrapper1').style.display='none'" class="close" title="Close PopUp">&times;</span>
            <h1 style="text-align:center">Update</h1>
        </div>
        <div class="container" >
            <input type="text" placeholder="Enter idMovie" 				name="idMovieT">
            <input type="text" placeholder="Enter nameMovie" 			name="nameMovieT">
            <input type="text" placeholder="Enter tipeMovie" 			name="tipeMovieT">
            <input type="text" placeholder="Enter distributieMovie" 	name="distributieMovieT">
            <input type="text" placeholder="Enter regizorMovie" 		name="regizorMovieT">
            <input type="text" placeholder="Enter dateMovie" 			name="dateMovieT">
            <input type="text" placeholder="Enter languageMovie" 		name="languageMovieT">
            <input type="text" placeholder="Enter classificationMovie"  name="classificationMovieT">
            <button type="submit">Update</button>
        </div>
    </form> 
    </div>
   
     <script>
    var modal = document.getElementById('modal-wrapper1');
    window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
    }
    </script>	
    
    <div id="modal-wrapper2" class="modal">
    <form class="modal-content animate" action="DeleteEntityMovie">
        <div class="imgcontainer">
            <span onclick="document.getElementById('modal-wrapper2').style.display='none'" class="close" title="Close PopUp">&times;</span>
            <h1 style="text-align:center">Delete</h1>
        </div>
        <div class="container" >
            <input type="text" placeholder="Enter idMovie" 				name="idMovieT">
            <button type="submit">Delete</button>
        </div>
    </form> 
    </div>
   
     <script>
    var modal = document.getElementById('modal-wrapper2');
    window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
    }
    </script>	
	


</body>
</html>