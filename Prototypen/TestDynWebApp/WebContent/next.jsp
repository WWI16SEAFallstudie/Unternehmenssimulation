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

    <!-- Page Content -->
    <div id="content" class="container">
		<div id="next" class="card card-aktive">
			<h4>N&auml;chster Spieler</h4>
			<h4>Runde ${round}</h4>
			<h3>Spieler ${picNext+1}</h3>
			<img alt="" src="images/Man${picNext}.png"><form id="roundData" action="${pageContext.request.contextPath}/servlet" method="post">
			<button class="input" name="nextPlayer" id="nextBtn" onclick="next();">WEITER</button>
			</form>
		</div>
    </div>
    <!-- /.container -->

    <!-- Footer -->
    <footer class="py-5 bg-dark">
      <div class="container">
        <p class="m-0 text-center text-white">Copyright &copy; Watch Tycoon 2017</p>
      </div>
      <!-- /.container -->
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/chart.min.js"></script>
	<script src="js/functions.js"></script>
  </body>

</html>
