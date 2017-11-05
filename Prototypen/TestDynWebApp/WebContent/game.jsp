<!DOCTYPE html>
<html lang="de">

  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" href="images/favicon16.png" sizes="16x16"/>
    <link rel="icon" type="image/png" href="images/favicon32.png" sizes="32x32"/>

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Unternehmenssimulation</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/style.css" rel="stylesheet">

  </head>

  <body>
	<form id="roundData" action="${pageContext.request.contextPath}/servlet" method="post">
    <!-- Navigation -->
      <ul id="mainNav" class="nav nav-tabs">
      	<li id="player"><a><img alt="" src="images/Man${pic}.png"> <span id="countdown" class="player">10:00</span></a></li>
		<li class="dropdown">
			<a id="player" class=" player dropdown-toggle" data-toggle="dropdown" href="#"><span id="money">${kapital}</span> &euro;<span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><span class="first-elem">Anfangskapital</span><span class="last-elem">${kapital} &euro;</span></li>
				<li><span class="first-elem">Geplante Ausgaben</span><span class="last-elem">? &euro;</span></li>
				<li><span class="first-elem">Endkapital</span><span class="last-elem">? &euro;</span></li>
				<li><span class="first-elem">Uhr 1</span><span class="last-elem">${stock0} St.</span></li>
				<li><span class="first-elem">Uhr 2</span><span class="last-elem">${stock1} St.</span></li>
				<li><span class="first-elem">Uhr 3</span><span class="last-elem">${stock2} St.</span></li>                       
			</ul>
		</li>    
	    <li class="active"><a data-toggle="tab" href="#menu1">Produkte</a></li>
	    <li><a data-toggle="tab" href="#menu2">F+E</a></li>
	    <li><a data-toggle="tab" href="#menu3">Produktion</a></li>
	    <li><a data-toggle="tab" href="#menu4">Einkauf</a></li>
	    <li><a data-toggle="tab" href="#menu5">Vertrieb</a></li>
	    <li><a data-toggle="tab" href="#menu6">Marketing</a></li>
	    <li><a data-toggle="tab" href="#menu7">Statistik</a></li>
	    <li><button id="nextRound" name="nextRound" type="submit" class="btn">Runde beenden</button></li>
	    <li onclick="uiSwitch();"><a id="uiSwitch"><span class="glyphicon glyphicon-menu-hamburger"></span></a></li>
	    <li><a data-toggle="tab" href="#help">?</a></li>
	  </ul>

    <!-- Page Content -->
    <div id="content" class="container">
	  <div class="tab-content">	  
	  
	  	<!-- Produkte -->
	  	<jsp:include page="sections/products.jsp"></jsp:include>
	    
	    <!-- Forschung und Entwicklung -->
		<jsp:include page="sections/research.jsp"></jsp:include>

	    <!-- Produktion -->
		<jsp:include page="sections/production.jsp"></jsp:include>
		
	    <!-- Einkauf -->
		<jsp:include page="sections/purchasing.jsp"></jsp:include>		
		
	    <!-- Vertrieb -->
		<jsp:include page="sections/distribution.jsp"></jsp:include>		
		
	    <!-- Marketing -->
	    <jsp:include page="sections/marketing.jsp"></jsp:include>

	    <!-- Statistik -->
		<jsp:include page="sections/statistics.jsp"></jsp:include>
		
		
	    <!-- Hilfe -->
		<jsp:include page="sections/help.jsp"></jsp:include>
		
	  </div>

    </div>
    <!-- /.container -->

	</form>

    <!-- Bootstrap core JavaScript -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/chart.min.js"></script>
	<script src="js/functions.js"></script>
  </body>

</html>
