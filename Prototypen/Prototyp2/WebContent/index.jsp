<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link href="style/stylesheet.css" type="text/css" rel="stylesheet">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet"> 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" />
<title>Fallstudie</title>
</head>
<body>
<header class="container-fluid">
	<div class="row">
		<div id="logoDiv" class="col">
			<img src="img/time-is-money.png" >
		</div>
		<div id="heading" class="col">
			Watch Tycoon
		</div>
		<div class="container-fluid">
			<div class="row">
				<div class="col info" id="platz">
					<img src="img/ranking.png">
					<div class="money rankingText">Platz</br><span>2</span></div>
				</div>
				<div class="col info">
					<img src="img/006-atm.png">
					<div class="money">18.000 &euro;</div>
				</div>
				<div class="col info">
					<img src="img/calendar.png">
					<div class="money periodeText">Periode</br> <span>3</span></div>
				</div>
				
			</div>
		</div>
	</div>
</header>




<div class="container">
	<div class="row">
	<nav class="col">
			<ul class="nav nav-tabs">
				<li class="active">
  					<a data-toggle="tab" href="#sortiment"><img class="linkIcon" src="img/clock.png">		Sortiment</a>
  				</li>
  				<li>
  					<a data-toggle="tab" href="#funde"><img class="linkIcon" src="img/microscope.png"> F &amp; E</a>
  				</li>
  				<li>
  					<a data-toggle="tab" href="#einkauf"><img class="linkIcon" src="img/cart.png"> Einkauf</a>
  				</li>
  				<li>
  					<a data-toggle="tab" href="#produktion"><img class="linkIcon" src="img/industry.png"> Produktion</a>
  				</li>
  				<li>
  					<a data-toggle="tab" href="#marketing"><img class="linkIcon" src="img/user.png"> Marketing</a>
  				</li>
  				<li>
  					<a data-toggle="tab" href="#verkauf"><img class="linkIcon" src="img/002-cashier-1.png"> Verkauf</a>
  				</li>
  				<li>
  					<a data-toggle="tab" href="#statistik"><img class="linkIcon" src="img/graph.png"> Statistik</a>
  				</li>
  				<li id="lastLink">
  					 <a data-toggle="tab"  href="#periode"><img class="linkIcon" src="img/next.png"> End Round</a>
  				</li>
			</ul>

			<div class="tab-content">
				<div id="sortiment" class="tab-pane fade in active">
    				<div class="container">
    					<div class="row show-grid">
    						<article class="col-6 col-md-4">
  								<div class="item-wrapper">
    								<figure>
      									<div class="image" style="background-image:url(https://i.pinimg.com/736x/fa/3a/2b/fa3a2bd5756f8d149fd320f1104c939b--cheap-watches-for-men-rubber-watches.jpg);"></div>
      									<div class="lighting">
      									</div>
    								</figure>
    								<div class="item-content">
      									<h1>Billig-Uhr</h1>
      									<p>Verkaufspreis: 10,-</p>
      									<div class="author">by Cheapman</div>
    								</div>
  								</div>
							</article>
							<article class="col-6 col-md-4">
  								<div class="item-wrapper">
    								<figure>
      									<div class="image" style="background-image:url(https://www.wewood.de/media/image/8a/d5/3b/ww57002-DATE_MB_CHOCO_ROUGH_BROWN-02_1280x1280@2x.jpg);"></div>
      									<div class="lighting"></div>
    								</figure>
    								<div class="item-content">
      									<h1>&Oumlko-Uhr</h1>
      									<p>Verkaufspreis: 230,-</p>
      									<div class="author">by Greenman</div>
    								</div>
  								</div>
							</article>
							<article class="col-6 col-md-4">
  								<div class="item-wrapper">
    								<figure>
      									<div class="image" style="background-image:url(https://www.thetrendspotter.net/wp-content/uploads/2016/01/Rolex-1.jpg);"></div>
      									<div class="lighting"></div>
  									</figure>
    								<div class="item-content">
      									<h1>Luxus-Uhr</h1>
      									<p>Verkaufspreis: 1000,-</p>
      									<div class="author">by Moneyman</div>
    								</div>
  								</div>
							</article>
						</div>
    				</div>
  				</div>
  				
  				
  				
  				<div id="funde" class="tab-pane fade in">
    				<div class="container">
    					<div class="row">
    						<div class="col-6 col-md-4 production">
    							<h3>Produkt 1</h3>
    							<div>
    								<div class="material-button-anim">
          <ul class="list-inline" id="options">
            <li class="option">
              <button class="material-button option1 anim" type="button" title="Billig-Uhr">
                <span class="fa fa-phone" aria-hidden="true"></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option2 anim" type="button" title="Öko-Uhr">
                <span class="fa fa-pagelines " aria-hidden="true"></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option3 anim" type="button" title="Luxus-Uhr">
                <span class="fa fa-star" aria-hidden="true"></span>
              </button>
            </li>
          </ul>
          <button class="material-button material-button-toggle" type="button">
            <span class="fa fa-plus" aria-hidden="true"></span>
          </button>
        </div>
    							</div>
    							
    						</div>
    						<div class="col-6 col-md-4 production">
    							<h3>Produkt 2</h3>
    							<div class="material-button-anim">
          <ul class="list-inline" id="options">
            <li class="option">
              <button class="material-button option1 anim" type="button" title="Billig-Uhr">
                <span class="fa fa-phone" aria-hidden="true"></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option2 anim" type="button" title="Öko-Uhr">
                <span class="fa fa-pagelines " aria-hidden="true"></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option3 anim" type="button" title="Luxus-Uhr">
                <span class="fa fa-star" aria-hidden="true"></span>
              </button>
            </li>
          </ul>
          <button class="material-button material-button-toggle2" type="button">
            <span class="fa fa-plus" aria-hidden="true"></span>
          </button>
        </div>
    						</div>
    						<div class="col-6 col-md-4 production">
    							<h3>Produkt 3</h3>
    							<div class="material-button-anim">
          <ul class="list-inline" id="options">
            <li class="option">
              <button class="material-button option1 anim" type="button" title="Billig-Uhr">
                <span class="fa fa-phone" aria-hidden="true"></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option2 anim" type="button" title="Öko-Uhr">
                <span class="fa fa-pagelines " aria-hidden="true"></span>
              </button>
            </li>
            <li class="option">
              <button class="material-button option3 anim" type="button" title="Luxus-Uhr">
                <span class="fa fa-star" aria-hidden="true"></span>
              </button>
            </li>
          </ul>
          <button class="material-button material-button-toggle3" type="button">
            <span class="fa fa-plus" aria-hidden="true"></span>
          </button>
        </div>
    						</div>
    					</div>
    				</div>
  				</div>
  				
  				<div id="einkauf" class="tab-pane fade in">
    				<h3>Menu 1</h3>
    				<p>Some content in menu 1.</p>
  				</div>
  				<div id="produktion" class="tab-pane fade in">
    				<div class="container">
    					<div class="row">
    						<div class="col-6 col-md-4 production">
    							<h3>Produkt 1</h3>
    							<p>Billig-Uhr</p>
    						</div>
    						<div class="col-6 col-md-4 production">
    							<h3>Produkt 2</h3>
    							<p>&Oumlko-Uhr</p>
    						</div>
    						<div class="col-6 col-md-4 production">
    							<h3>Produkt 3</h3>
    							<p>Luxus-Uhr</p>
    						</div>
    					</div>
    				</div>
  				</div>
  				<div id="marketing" class="tab-pane fade in">
    				<h3>Menu 2</h3>
    				<p>Some content in menu 2.</p>
  				</div>
  				<div id="verkauf" class="tab-pane fade in">
    				<h3>Menu 2</h3>
    				<p>Some content in menu 2.</p>
  				</div>
  				<div id="statistik" class="tab-pane fade in">
    				<h3>Menu 2</h3>
    				<p>Some content in menu 2.</p>
  				</div>
  				<div id="periode" class="tab-pane fade in">
    				<h3>Menu 2</h3>
    				<p>Some content in menu 2.</p>
  				</div>
			</div>
	</nav>
	


<!-- 
<div class="start col">
	<div class="funkyradio">
	<form method="POST" action="">
		<p>Wählen Sie die Spielerzahl aus</p>
        <div class="funkyradio-default">
            <input type="radio" name="radio" id="radio1" />
            <label for="radio1">1 Spieler</label>
        </div>
        <div class="funkyradio-primary">
            <input type="radio" name="radio" id="radio2" checked/>
            <label for="radio2">2 Spieler</label>
        </div>
        <div class="funkyradio-success">
            <input type="radio" name="radio" id="radio3" />
            <label for="radio3">3 Spieler</label>
        </div>
        <div class="funkyradio-danger">
            <input type="radio" name="radio" id="radio4" />
            <label for="radio4">4 Spieler</label>
        </div>
        <p>
        <button type="submit" onclick="hide()">
        	Weiter
        </button>
        </p>
        </form>
    </div>
</div>
 -->

</div>
</div>




<script>
$(document).ready(function () 
{	
		$('.material-button-toggle').on("click", function () {
	        $(this).toggleClass('open');
	        $('.option').toggleClass('scale-on');
	    });		  
});

$(document).ready(function () 
		{	
				$('.material-button-toggle2').on("click", function () {
			        $(this).toggleClass('open');
			        $('.option').toggleClass('scale-on');
			    });		  
		});
		
$(document).ready(function () 
		{	
				$('.material-button-toggle3').on("click", function () {
			        $(this).toggleClass('open');
			        $('.option').toggleClass('scale-on');
			    });		  
		});

    var articles = $('article > .item-wrapper'),
    lightingRgb = '255,255,255';

articles.mousemove(function(e) {
  var current = $(this),
      x = current.width() - e.offsetX * 2,
      y = current.height() - e.offsetY * 2,
      rx = -x / 30,
      ry = y / 24,
      deg = Math.atan2(y, x) * (180 / Math.PI) + 45;
  current.css({"transform":"scale(1.05) rotateY("+rx+"deg) rotateX("+ry+"deg)"});
  $('figure > .lighting',this).css('background','linear-gradient('+deg+'deg, rgba('+lightingRgb+',0.32) 0%, rgba('+lightingRgb+',0) 100%)');
});

articles.on({
  'mouseenter':function() {
    var current = $(this);
    current.addClass('enter ease').removeClass("leave");
    setTimeout(function(){
      current.removeClass('ease');
    }, 280);
  },
  'mouseleave':function() {
    var current = $(this);
    current.css({"transform":"rotate(0)"});
    current.removeClass('enter').addClass("leave");
    $('figure > .lighting',this).removeAttr('style');
  }}
);
</script>



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js" integrity="sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>







</body>
</html>