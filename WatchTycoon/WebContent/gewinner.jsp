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
		<div id="win" class="card card-aktive">
			<h4>Abschlieﬂende Spielstatistik</h4>
			
			<ul class="list-group">
				<li class="list-group-item">
					<span class="pos">
						1. Platz 
						<img class="win" src="images/TrophyGold.png">
					</span>
					<span class="winner">${wp0}</span>
					<span class="winner">${wc0}</span>
				</li>
				<li class="list-group-item">
					<span class="pos">
						2. Platz 
						<img class="win" src="images/TrophySilver.png">
					</span>
					<span class="winner">${wp1}</span>
					<span class="winner">${wc1}</span>
				</li>
				<li class="list-group-item">
					<span class="pos">
						3. Platz 
						<img class="win" src="images/TrophyBronze.png">
					</span>
					<span class="winner">${wp2}</span>
					<span class="winner">${wc2}</span>
				</li>
				<li class="list-group-item">
					<span class="pos">
						4. Platz
					</span>
					<span class="winner">${wp3}</span>
					<span class="winner">${wc3}</span>
				</li>
			</ul>
		</div>
    </div>
    <!-- /.container -->

	<div class="container">
		<div id="inpframe">
		<form action="${pageContext.request.contextPath}/servlet" method="post">
			<input class="input" type="submit" name="restart" id="restart" value="neues Spiel" class="input">
		</form>
		</div>
	</div><!-- /.container -->

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
  </body>

</html>
