<!DOCTYPE html>
<html lang="de">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <title>Unternehmenssimulation</title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="css/portfolio-item.css" rel="stylesheet">
    <link href="styles.css" rel="stylesheet">

  </head>

  <body id="start">

<div class="container">
	<h1>Unternehmenssimulation</h1>
	<h2>Armbanduhrproduktion</h2>
</div>

<div class="container">
	<div id="p1" class="playerCard">
		<img alt="player1" src="images/player.png" class="pImg" id="imgP1">
		<button class="input playerBtn" onclick="playerPic('imgP1')">Spieler 1</button>
	</div>
	<div id="p2" class="playerCard">
	<img alt="player2" src="images/player.png" class="pImg" id="imgP2">
		<button class="input playerBtn" onclick="playerPic('imgP2')">Spieler 2</button>
	</div>
	<div id="p3" class="playerCard">
	<img alt="player3" src="images/playersw.png" class="pImg" id="imgP3">
		<button class="input playerBtn" onclick="playerPic('imgP3')">Spieler 3</button>
	</div>
	<div id="p4" class="playerCard">
	<img alt="player4" src="images/playersw.png" class="pImg" id="imgP4">
		<button class="input playerBtn" onclick="playerPic('imgP4')">Spieler 4</button>
	</div>
</div>

<div class="container">
	<div id="inpframe">
		<input type="text" name="startSum" class="input" placeholder="Eingabe Startkapital">
		<button class="input" name="start" id="startbtn">START</button>
	</div>
</div>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="start.js"></script>

  </body>

</html>
