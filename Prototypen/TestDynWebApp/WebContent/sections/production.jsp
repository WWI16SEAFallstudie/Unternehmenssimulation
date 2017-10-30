	    <div id="menu3" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionO" class="card umwelt ${productionO}">
					<h4>Umwelt</h4>
					<p></p>
					<span class="listhead">Produktionskostensenkung</span>
					<ul class="list-group">
						<li class="${prdOcr0} list-group-item" onclick="research('costReductionOeko',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${prdCOcr0} &euro;</a></li>
						<li class="${prdOcr1} list-group-item" onclick="research('costReductionOeko',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOcr1}">+ ${prdCOcr1} &euro;</a></li>
						<li class="${prdOcr2} list-group-item" onclick="research('costReductionOeko',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOcr2}">+ ${prdCOcr2} &euro;</a></li>
					</ul>
					<input type="hidden" id="costReductionOeko" name="costReductionOeko">
					
					<span class="listhead">Kapazit&auml;tserweiterung</span>
					<ul class="list-group">
						<li class="${prdOce0} list-group-item" onclick="research('expansionOeko',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${prdCOce0} &euro;</a></li>
						<li class="${prdOce1} list-group-item" onclick="research('expansionOeko',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOce1}">+ ${prdCOce1} &euro;</a></li>
						<li class="${prdOce2} list-group-item" onclick="research('expansionOeko',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOce2}">+ ${prdCOce2} &euro;</a></li>
					</ul> 
					<input type="hidden" id="expansionOeko" name="expansionOeko">
					
					<ul class="list-group">
						<li class="list-group-item">Produktionslimit <span class="productionLimit">${prodLimitO}</span></li>
					</ul>
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionL" class="card luxus ${productionL}">
					<h4>Luxus</h4>
					<p></p>
					<span class="listhead">Produktionskostensenkung</span>
					<ul class="list-group">
						<li class="${prdLcr0} list-group-item" onclick="research('costReductionLuxus',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${prdCLcr0} &euro;</a></li>
						<li class="${prdLcr1} list-group-item" onclick="research('costReductionLuxus',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLcr1}">+ ${prdCLcr1} &euro;</a></li>
						<li class="${prdLcr2} list-group-item" onclick="research('costReductionLuxus',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLcr2}">+ ${prdCLcr2} &euro;</a></li>
					</ul>
					<input type="hidden" id="costReductionLuxus" name="costReductionLuxus">
					
					<span class="listhead">Kapazit&auml;tserweiterung</span>
					<ul class="list-group">
						<li class="${prdLce0} list-group-item" onclick="research('expansionLuxus',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${prdCLce0} &euro;</a></li>
						<li class="${prdLce1} list-group-item" onclick="research('expansionLuxus',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLce1}">+ ${prdCLce1} &euro;</a></li>
						<li class="${prdLce2} list-group-item" onclick="research('expansionLuxus',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLce2}">+ ${prdCLce2} &euro;</a></li>
					</ul>
					<input type="hidden" id="expansionLuxus" name="expansionLuxus">
					
					<ul class="list-group">
						<li class="list-group-item">Produktionslimit <span class="productionLimit">${prodLimitL}</span></li>
					</ul>
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>				
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionB" class="card preisbewusst ${productionB}">
						<h4>Gro&szlig;serienfertigung</h4>
						<p></p>
						<span class="listhead">Produktionskostensenkung</span>				
						<ul class="list-group">
							<li class="${prdBcr0} list-group-item" onclick="research('costReductionBillig',0);">Punkt 1 <a class="addBtn">+ ${prdCBcr0} &euro;</a></li>
							<li class="${prdBcr1} list-group-item" onclick="research('costReductionBillig',1);">Punkt 2 <a class="addBtn ${addPrBcr1}">+ ${prdCBcr1} &euro;</a></li>
							<li class="${prdBcr2} list-group-item" onclick="research('costReductionBillig',2);">Punkt 3 <a class="addBtn ${addPrBcr2}">+ ${prdCBcr2} &euro;</a></li>
						</ul>		
						<input type="hidden" id="costReductionBillig" name="costReductionBillig">
								
						<span class="listhead">Kapazit&auml;tserweiterung</span>
						<ul class="list-group">
							<li class="${prdBce0} list-group-item" onclick="research('expansionBillig',0);">Punkt 1 <a class="addBtn">+ ${prdCBce0} &euro;</a></li>
							<li class="${prdBce1} list-group-item" onclick="research('expansionBillig',1);">Punkt 2 <a class="addBtn ${addPrBce1}">+ ${prdCBce1} &euro;</a></li>
							<li class="${prdBce2} list-group-item" onclick="research('expansionBillig',2);">Punkt 3 <a class="addBtn ${addPrBce2}">+ ${prdCBce2} &euro;</a></li>
						</ul>
						<input type="hidden" id="expansionBillig" name="expansionBillig">
						
						<ul class="list-group">
							<li class="list-group-item">Produktionslimit <span class="productionLimit">${prodLimitB}</span></li>
						</ul>
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>			
					</div>
				</div>
			</div>
			
			<div class="row">
			
				<!-- Uhr Modell 1 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionW0" class="card ${watch0}">
						<h4>Modell 1</h4>
						<input type="hidden" id="usedClockWork1" name="usedClockWork1">
						<ul class="list-group">
							<li class="list-group-item">Vorrat <span id="stockModel0" class="stock">${stock0}</span></li>
							<li class="list-group-item">Produktionsmenge <input  type="text" class="numInput" id="output0" name="output0"></li>
							<li class="list-group-item">Einkaufspreis/St&uuml;ck: <span class="ekVal">${ekM0} &euro;</span></li>							
							<li class="list-group-item">Produktionskosten <span id="prodCost0" class=""></span></li>
						</ul>
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
				
				<!-- Uhr Modell 2 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionW1" class="card ${watch1}">
						<h4>Modell 2</h4>
						<input type="hidden" id="usedClockWork1" name="usedClockWork1">
						<ul class="list-group">
							<li class="list-group-item">Vorrat <span id="stockModel1" class="stock">${stock1}</span></li>
							<li class="list-group-item">Produktionsmenge <input  type="text" class="numInput" id="output1" name="output1"></li>
							<li class="list-group-item">Einkaufspreis/St&uuml;ck: <span class="ekVal">${ekM1} &euro;</span></li>							
							<li class="list-group-item">Produktionskosten <span id="prodCost0" class=""></span></li>
						</ul>
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
				
				<!-- Uhr Modell 3 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionW2" class="card ${watch2}">
						<h4>Modell 3</h4>
						<input type="hidden" id="usedClockWork1" name="usedClockWork1">
						<ul class="list-group">
							<li class="list-group-item">Vorrat <span id="stockModel2" class="stock">${stock2}</span></li>
							<li class="list-group-item">Produktionsmenge <input type="text" class="numInput" id="output2" name="output2"></li>
							<li class="list-group-item">Einkaufspreis/St&uuml;ck: <span class="ekVal">${ekM3} &euro;</span></li>							
							<li class="list-group-item">Produktionskosten <span id="prodCost0" class=""></span></li>
						</ul>
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
			</div>
	    </div>