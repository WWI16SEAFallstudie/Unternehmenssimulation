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

    <!-- Navigation -->
      <ul id="mainNav" class="nav nav-tabs">
      	<li id="player"><a><img alt="" src="images/Boss.png"> Spieler 1</a></li>
		<li class="dropdown">
			<a id="player" class=" player dropdown-toggle" data-toggle="dropdown" href="#"> 300.500 &euro; <span class="caret"></span></a>
			<ul class="dropdown-menu">
				<li><span class="first-elem">Uhr 1</span><span class="last-elem">2000 St.</span></li>
				<li><span class="first-elem">Uhr 2</span><span class="last-elem">- St.</span></li>
				<li><span class="first-elem">Uhr 3</span><span class="last-elem">- St.</span></li>                       
			</ul>
		</li>
    	<li><a id="countdown" class="player">05:00</a></li>    
	    <li class="active"><a data-toggle="tab" href="#menu1">Produkte</a></li>
	    <li><a data-toggle="tab" href="#menu2">F+E</a></li>
	    <li><a data-toggle="tab" href="#menu3">Produktion</a></li>
	    <li><a data-toggle="tab" href="#menu4">Einkauf</a></li>
	    <li><a data-toggle="tab" href="#menu5">Vertrieb</a></li>
	    <li><a data-toggle="tab" href="#menu6">Marketing</a></li>
	    <li><a data-toggle="tab" href="#menu7">Statistik</a></li>
	    <li><a id="nextRound" href="next.jsp">Runde beenden</a></li>
	    <li onclick="uiSwitch();"><a id="uiSwitch"><span class="glyphicon glyphicon-menu-hamburger"></span></a></li>
	    <li><a data-toggle="tab" href="#help">?</a></li>
	  </ul>

    <!-- Page Content -->
    <div id="content" class="container">


  <div class="tab-content">
  	<!-- Produkte -->
    <div id="menu1" class="tab-pane fade in active">
		<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card card-aktive">
					<h4>Modell 1</h4>
					<p>Produktlinie: Umwelt</p>
					<span class="listhead">Geh&auml;use</span>				
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="selected list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span></li>
						<li class="list-group-item">Punkt 3</li>
					</ul>				
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="selected list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span></li>
						<li class="notAavailable list-group-item">Punkt 3</li>
					</ul>
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="selected list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span></li>
						<li class="notAavailable list-group-item">Punkt 2</li>
						<li class="notAavailable list-group-item">Punkt 3</li>
					</ul>
					<ul class="list-group">
						<li class="list-group-item">Einkaufspreis: <span class="ekVal">220 &euro;</span></li>
						<li class="list-group-item">Verkaufspreis: <span class="vkVal">280 &euro;</span></li>
					</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card card-inaktive">
					<h4>Modell 2</h4>
					<button class="addBtn">Freischalten 100.000 &euro;</button>
					<p>Produktlinie: noch zu w&auml;hlen</p>
					<span class="listhead">Geh&auml;use</span>				
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="list-group-item">Punkt 2</li>
						<li class="list-group-item">Punkt 3</li>
					</ul>				
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="list-group-item">Punkt 2</li>
						<li class="list-group-item">Punkt 3</li>
					</ul>
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="list-group-item">Punkt 2</li>
						<li class="list-group-item">Punkt 3</li>
					</ul>
					<ul class="list-group">
						<li class="list-group-item">Einkaufspreis: <span class="ekVal"></span></li>
						<li class="list-group-item">Verkaufspreis: <span class="vkVal"></span></li>
					</ul>
					<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card card-inaktive">
					<h4>Modell 3</h4>
					<button class="addBtn">Freischalten 100.000 &euro;</button>
					<p>Produktlinie: noch zu w&auml;hlen</p>
					<span class="listhead">Geh&auml;use</span>				
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="list-group-item">Punkt 2</li>
						<li class="list-group-item">Punkt 3</li>
					</ul>				
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="list-group-item">Punkt 2</li>
						<li class="list-group-item">Punkt 3</li>
					</ul>
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="list-group-item">Punkt 1</li>
						<li class="list-group-item">Punkt 2</li>
						<li class="list-group-item">Punkt 3</li>
					</ul>
					<ul class="list-group">
						<li class="list-group-item">Einkaufspreis: <span class="ekVal"></span></li>
						<li class="list-group-item">Verkaufspreis: <span class="vkVal"></span></li>
					</ul>
					<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
		</div>
    </div>
    
    <!-- Forschung und Entwicklung -->
    <div id="menu2" class="tab-pane fade">
      	<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card umwelt">
				<h4>Umwelt</h4>
				<p></p>
				<span class="listhead">Geh&auml;use</span>
				<ul class="list-group">
					<li class="done list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span></li>
					<li class="done list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span></li>
					<li class="done list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span></li>
				</ul>
				
				<span class="listhead">Armband</span>
				<ul class="list-group">
					<li class="done list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span></li>
					<li class="done list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul> 
				
				<span class="listhead">Uhrwerk</span>
				<ul class="list-group">
					<li class="done list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card luxus card-aktive">
				<h4>Luxus</h4>
				<p></p>
				<span class="listhead">Geh&auml;use</span>
				<ul class="list-group">
					<li class="done list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<span class="listhead">Armband</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<span class="listhead">Uhrwerk</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card preisbewusst card-inaktive">
				<h4>Gro&szlig;serienfertigung</h4>
				<button class="addBtn">Freischalten 100.000 &euro;</button>
				<p></p>
				<span class="listhead">Geh&auml;use</span>				
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>				
				<span class="listhead">Armband</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<span class="listhead">Uhrwerk</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
		</div>
    </div>
    <!-- Produktion -->
    <div id="menu3" class="tab-pane fade">
      	<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card umwelt">
				<h4>Umwelt</h4>
				<p></p>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul> 
				
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<ul class="list-group">
					<li class="list-group-item">Produktionslimit <span class="productionLimit">3000</span></li>
					<li class="list-group-item">Produktionsmenge <span class="numProduction"></span></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card luxus card-aktive">
				<h4>Luxus</h4>
				<p></p>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<ul class="list-group">
					<li class="list-group-item">Produktionslimit <span class="productionLimit">900</span></li>
					<li class="list-group-item">Produktionsmenge <span class="numProduction"></span></li>
				</ul>				
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card preisbewusst card-inaktive">
				<h4>Gro&szlig;serienfertigung</h4>
				<p></p>
				<span class="listhead">Verbesserung</span>				
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>				
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<ul class="list-group">
					<li class="list-group-item">Produktionslimit <span class="productionLimit"></span></li>
					<li class="list-group-item">Produktionsmenge <span class="numProduction"></span></li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>				
				</div>
			</div>
		</div>
    </div>
    <!-- Einkauf -->
    <div id="menu4" class="tab-pane fade">
      	<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card umwelt">
				<h4>Umwelt</h4>
				<p></p>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul> 
				
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card luxus card-aktive">
				<h4>Luxus</h4>
				<p></p>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 100.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 100.000 &euro;</a></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card preisbewusst card-inaktive">
				<h4>Gro&szlig;serienfertigung</h4>
				<p></p>
				<span class="listhead">Verbesserung</span>				
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>				
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<span class="listhead">Verbesserung</span>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
		</div>
    </div>
    <!-- Vertrieb -->
    <div id="menu5" class="tab-pane fade">
      		<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card card-aktive">
				<h4>Modell 1</h4>
				<ul class="list-group">
					<li class="list-group-item">geplanter Absatz <span class="verkauf"></span></li>
					<li class="list-group-item">geplanter Umsatz <span class="verkauf"></span></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card card-inaktive">
				<h4>Modell 2</h4>
				<ul class="list-group">
					<li class="list-group-item">geplanter Absatz <span class="verkauf"></span></li>
					<li class="list-group-item">geplanter Umsatz <span class="verkauf"></span></li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card card-inaktive">
				<h4>Modell 3</h4>
				<ul class="list-group">
					<li class="list-group-item">geplanter Absatz <span class="verkauf"></span></li>
					<li class="list-group-item">geplanter Umsatz <span class="verkauf"></span></li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
		</div>
    </div>
    <!-- Marketing -->
    <div id="menu6" class="tab-pane fade marketing">
    	<div class="row">
			<div class="col-sm-6 col-md-6 col-lg-6">
				<div id="" class="card card-aktive">
					<h4>Unternehmsweit</h4>
					<ul class="list-group">
						<li class="list-group-item">Punkt 1 <a class="addBtn">+ 10.000 &euro;</a></li>
						<li class="list-group-item">Punkt 2 <a class="addBtn">+ 10.000 &euro;</a></li>
						<li class="list-group-item">Punkt 3 <a class="addBtn">+ 10.000 &euro;</a></li>
					</ul>
				</div>
			</div>
			<div class="col-sm-6 col-md-6 col-lg-6">
				<div id="" class="card card-aktive">
					<h4>Ergebnisse letzter Runde</h4>
					<ul class="list-group">
						<li class="list-group-item bad"><span class="glyphicon glyphicon-remove"></span> Die Imagekampagne ist fehlgeschlagen. Die Verk&auml;ufe haben sich reduziert.</li>
						<li class="list-group-item good"><span class="glyphicon glyphicon-ok"></span> Die Produktwerbung f&uuml;r Uhr 1 war erfolgreich. Es konnten mehr Uhren abgesetzt werden.</li>
					</ul>
				</div>
			</div>
		</div>
      	<div class="row">
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch1" class="card card-aktive">
				<h4>Modell 1</h4>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1 <a class="addBtn">+ 10.000 &euro;</a></li>
					<li class="list-group-item">Punkt 2 <a class="addBtn">+ 10.000 &euro;</a></li>
					<li class="list-group-item">Punkt 3 <a class="addBtn">+ 10.000 &euro;</a></li>
				</ul>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch2" class="card card-inaktive">
				<h4>Modell 2</h4>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
			<div class="col-sm-4 col-md-4 col-lg-4">
				<div id="watch3" class="card card-inaktive">
				<h4>Modell 3</h4>
				<ul class="list-group">
					<li class="list-group-item">Punkt 1</li>
					<li class="list-group-item">Punkt 2</li>
					<li class="list-group-item">Punkt 3</li>
				</ul>
				<div id="overlay">
						<div id="ol-text">nicht verf&uuml;gbar</div>
					</div>
				</div>
			</div>
		</div>
    </div>
    <!-- Statistik -->
    <div id="menu7" class="tab-pane fade">
        <div class="row">
			<div class="col-sm-6 col-md-6 col-lg-6">
				<div id="" class="card card-aktive">
				  <table class="table table-striped">
				    <tbody>
				      <tr>
				        <td>Kapital</td>
				        <td>300.500 &euro;</td>
				      </tr>
				      <tr>
				        <td>Bestand Modell 1</td>
				        <td>2000</td>
				      </tr>
				      <tr>
				        <td>Bestand Modell 2</td>
				        <td>-</td>
				      </tr>
				      <tr>
				        <td>Bestand Modell 3</td>
				        <td>-</td>
				      </tr>
				    </tbody>
				  </table>
				</div>
			</div>
			<div class="col-sm-6 col-md-6 col-lg-6">
				<div id="" class="card card-aktive">
				  	<canvas id="myChart" width="400" height="400"></canvas>
				</div>
			</div>
			<div class="col-sm-6 col-md-6 col-lg-6">
				<div id="" class="card card-aktive">
				  <table class="table table-striped">
				    <tbody>
				      <tr>
				        <td>bisheriger Umsatz</td>
				        <td>500.000 &euro;</td>
				      </tr>
				      <tr>
				        <td>bisheriger Gewinn</td>
				        <td>200.500 &euro;</td>
				      </tr>
				      <tr>
				        <td>Imagepunkte</td>
				        <td>5.000</td>
				      </tr>
				      <tr>
				        <td>Umweltpunkte</td>
				        <td>3.000</td>
				      </tr>
				    </tbody>
				    <tfoot>
				    	<tr>
					    	<td>Gesamtscore</td>
					        <td>10.000</td>
				      </tr>
				    </tfoot>
				  </table>
				</div>
			</div>
		</div>
    </div>
    <!-- Hilfe -->
    <div id="help" class="tab-pane fade">
      		<div class="row">
			<div class="col-sm-12 col-md-12 col-lg-12">
				<div id="watch1" class="card card-aktive">
				<h4>Hilfe</h4>
				<ul class="list-group">
					<li class="list-group-item">Erläuterungen zum Menüpunkt Produkte</li>
					<li class="list-group-item">Erläuterungen zum Menüpunkt F&E</li>
				</ul>
				</div>
			</div>
		</div>
    </div>
  </div>

    </div>
    <!-- /.container -->

    <!-- Bootstrap core JavaScript -->
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/chart.min.js"></script>
	<script src="js/functions.js"></script>
  </body>

</html>
