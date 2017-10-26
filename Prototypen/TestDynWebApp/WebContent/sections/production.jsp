	    <div id="menu3" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch1" class="card umwelt ${productionO}">
					<h4>Umwelt</h4>
					<p></p>
					<span class="listhead">Produktionskostensenkung</span>
					<ul class="list-group">
						<li class="${prdOcr0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ 100.000 &euro;</a></li>
						<li class="${prdOcr1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOcr1}">+ 100.000 &euro;</a></li>
						<li class="${prdOcr2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOcr2}">+ 100.000 &euro;</a></li>
					</ul>
					<input type="hidden" id="costReductionOeko" name="costReductionOeko">
					
					<span class="listhead">Kapazit&auml;tserweiterung</span>
					<ul class="list-group">
						<li class="${prdOce0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ 100.000 &euro;</a></li>
						<li class="${prdOce1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOce1}">+ 100.000 &euro;</a></li>
						<li class="${prdOce2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOce2}">+ 100.000 &euro;</a></li>
					</ul> 
					<input type="hidden" id="expansionOeko" name="expansionOeko">
					
					<ul class="list-group">
						<li class="list-group-item">Produktionslimit <span class="productionLimit">3000</span></li>
						<li class="list-group-item">Produktionsmenge <span class="numProduction"></span></li>
					</ul>
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch2" class="card luxus ${productionL}">
					<h4>Luxus</h4>
					<p></p>
					<span class="listhead">Produktionskostensenkung</span>
					<ul class="list-group">
						<li class="${prdLcr0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ 100.000 &euro;</a></li>
						<li class="${prdLcr1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLcr1}">+ 100.000 &euro;</a></li>
						<li class="${prdLcr2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLcr2}">+ 100.000 &euro;</a></li>
					</ul>
					<input type="hidden" id="costReductionLuxus" name="costReductionLuxus">
					
					<span class="listhead">Kapazit&auml;tserweiterung</span>
					<ul class="list-group">
						<li class="${prdLce0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ 100.000 &euro;</a></li>
						<li class="${prdLce1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLce1}">+ 100.000 &euro;</a></li>
						<li class="${prdLce2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLce2}">+ 100.000 &euro;</a></li>
					</ul>
					<input type="hidden" id="expansionLuxus" name="expansionLuxus">
					
					<ul class="list-group">
						<li class="list-group-item">Produktionslimit <span class="productionLimit">900</span></li>
						<li class="list-group-item">Produktionsmenge <span class="numProduction"></span></li>
					</ul>
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>				
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch3" class="card preisbewusst ${productionB}">
						<h4>Gro&szlig;serienfertigung</h4>
						<p></p>
						<span class="listhead">Produktionskostensenkung</span>				
						<ul class="list-group">
							<li class="${prdBcr0} list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
							<li class="${prdBcr1} list-group-item">Punkt 2 <a class="addBtn ${addPrBcr1}">+ 100.000 &euro;</a></li>
							<li class="${prdBcr2} list-group-item">Punkt 3 <a class="addBtn ${addPrBcr2}">+ 100.000 &euro;</a></li>
						</ul>		
						<input type="hidden" id="costReductionBillig" name="costReductionBillig">
								
						<span class="listhead">Kapazit&auml;tserweiterung</span>
						<ul class="list-group">
							<li class="${prdBce0} list-group-item">Punkt 1 <a class="addBtn">+ 100.000 &euro;</a></li>
							<li class="${prdBce1} list-group-item">Punkt 2 <a class="addBtn ${addPrBce1}">+ 100.000 &euro;</a></li>
							<li class="${prdBce2} list-group-item">Punkt 3 <a class="addBtn ${addPrBce2}">+ 100.000 &euro;</a></li>
						</ul>
						<input type="hidden" id="expansionBillig" name="expansionBillig">
						
						<ul class="list-group">
							<li class="list-group-item">Produktionslimit <span class="productionLimit"></span></li>
							<li class="list-group-item">Produktionsmenge <span class="numProduction"></span></li>
						</ul>
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>			
					</div>
				</div>
			</div>
	    </div>