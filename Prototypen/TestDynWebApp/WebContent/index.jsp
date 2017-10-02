<!DOCTYPE html>
<html lang="de">

  <head>
	<!-- Metadaten -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" href="images/favicon16.png" sizes="16x16"/>
    <link rel="icon" type="image/png" href="images/favicon32.png" sizes="32x32"/>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Unternehmenssimulation</title>

    <!-- CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/styles3.css" rel="stylesheet">

  </head>

  <body id="start">

	<!-- Spieltitel -->
	<div class="container head">
		<h1>Unternehmenssimulation</h1>
		<h2>Watch Tycoon</h2>
	</div>

	<!-- Auswahl der Spieleranzahl -->
	<form action="${pageContext.request.contextPath}/servlet" method="post">
		<div class="container">
			<div class="playerCard">
				<input id="checkOne" type="radio" name="spielerAnzahl" value="1"><label for="checkOne" class="radioLabel">1 Spieler</label>
				<input id="checkTwo" type="radio" name="spielerAnzahl" value="2" checked><label for="checkTwo" class="radioLabel">2 Spieler</label>
				<input id="checkThree" type="radio" name="spielerAnzahl" value="3"><label for="checkThree" class="radioLabel">3 Spieler</label>
				<input id="checkFour" type="radio" name="spielerAnzahl" value="4"><label for="checkFour" class="radioLabel">4 Spieler</label>
			</div>
		</div>
		
		<!-- Startbutton -->
		<div class="container">
			<div id="inpframe">
				<input class="input" type="submit" name="startbtn" id="startbtn" value="START" class="input">
			</div>
		</div><!-- /.container -->
	</form>

    <!-- Footer -->
    <footer>
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Watch Tycoon 2017</p>
      </div><!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/functions.js"></script>

  </body>

</html>
