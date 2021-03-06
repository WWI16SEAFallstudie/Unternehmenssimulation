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

    <link href="css/styles3.css" rel="stylesheet">

  </head>

  <body id="start">

<div class="container head">
	<h1>Unternehmenssimulation</h1>
	<h2>Watch Tycoon</h2>
</div>

<div class="container">
	<ul class="playerCard">
		<li>1 Spieler</li>
		<li class="selected">2 Spieler</li>
		<li>3 Spieler</li>
		<li>4 Spieler</li>
	</ul>
</div>

<div class="container">
	<div id="inpframe">
		<button class="input" name="start" id="startbtn" onclick="start();">START</button>
	</div>
</div>

    <!-- Footer -->
    <footer>
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Watch Tycoon 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="js/functions.js"></script>

  </body>

</html>
