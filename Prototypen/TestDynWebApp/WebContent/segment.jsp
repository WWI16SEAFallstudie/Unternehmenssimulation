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

	<div class="container head">
		<h2>W&auml;hlen Sie ihre Stammsparte aus.</h2>
	</div>

    <!-- Page Content -->
    <div id="content" class="container">

    
    <!-- Forschung und Entwicklung -->
    <div id="menu2">
      	<div class="row">
      	<form action="${pageContext.request.contextPath}/servlet" method="post">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card umwelt">
				<h4>Umwelt</h4>
				<button class="addBtn" name="selectoeko">Freischalten</button>
				<p>Beschreibungstext der Sparte mit Vor- und Nachteilen...</p>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card luxus">
				<h4>Luxus</h4>
				<button class="addBtn" name="selectluxus">Freischalten</button>
				<p>Beschreibungstext der Sparte mit Vor- und Nachteilen...</p>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card preisbewusst">
				<h4>Gro&szlig;serienfertigung</h4>
				<button class="addBtn" name="selectbillig">Freischalten</button>
				<p>Beschreibungstext der Sparte mit Vor- und Nachteilen...</p>
				</div>
			</div>
			</form>
		</div>
    </div>


    </div>
    <!-- /.container -->

    <!-- Bootstrap core JavaScript -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
  </body>

</html>
