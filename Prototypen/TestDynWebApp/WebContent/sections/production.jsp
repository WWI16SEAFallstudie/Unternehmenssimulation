	    <div id="menu3" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="productionO" class="card umwelt ${productionO}">
					<h4>Umwelt</h4>
					<p></p>
					<span class="listhead">Produktionskostensenkung</span>
					<ul class="list-group">
						<li class="${prdOcr0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionOeko',0); change($(this)); }else if($(this).hasClass('d')){research('costReductionOeko',0); change($(this));}else{notEnough(); h($(this));}">+ ${prdCOcr0} &euro;</a></li>
						<li class="${prdOcr1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOcr1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionOeko',1); change($(this)); }else if($(this).hasClass('d')){research('costReductionOeko',1); change($(this));}else{notEnough()}">+ ${prdCOcr1} &euro;</a></li>
						<li class="${prdOcr2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOcr2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionOeko',2); change($(this)); }else if($(this).hasClass('d')){research('costReductionOeko',2); change($(this));}else{notEnough()}">+ ${prdCOcr2} &euro;</a></li>
					</ul>
					<input type="hidden" id="costReductionOeko" name="costReductionOeko">
					
					<span class="listhead">Kapazit&auml;tserweiterung</span>
					<ul class="list-group">
						<li class="${prdOce0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionOeko',0); change($(this)); }else if($(this).hasClass('d')){research('expansionOeko',0); change($(this));}else{notEnough()}">+ ${prdCOce0} &euro;</a></li>
						<li class="${prdOce1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOce1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionOeko',1); change($(this)); }else if($(this).hasClass('d')){research('expansionOeko',1); change($(this));}else{notEnough()}">+ ${prdCOce1} &euro;</a></li>
						<li class="${prdOce2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrOce2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionOeko',2); change($(this)); }else if($(this).hasClass('d')){research('expansionOeko',2); change($(this));}else{notEnough()}">+ ${prdCOce2} &euro;</a></li>
					</ul> 
					<input type="hidden" id="expansionOeko" name="expansionOeko">
					
					<ul class="list-group">
						<li class="list-group-item">Produktionslimit <span class="productionLimit" id="productionLimit0">${prodLimitO}</span></li>
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
						<li class="${prdLcr0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionLuxus',0); change($(this)); }else if($(this).hasClass('d')){research('costReductionLuxus',0); change($(this));}else{notEnough()}">+ ${prdCLcr0} &euro;</a></li>
						<li class="${prdLcr1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLcr1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionLuxus',1); change($(this)); }else if($(this).hasClass('d')){research('costReductionLuxus',1); change($(this));}else{notEnough()}">+ ${prdCLcr1} &euro;</a></li>
						<li class="${prdLcr2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLcr2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionLuxus',2); change($(this)); }else if($(this).hasClass('d')){research('costReductionLuxus',2); change($(this));}else{notEnough()}">+ ${prdCLcr2} &euro;</a></li>
					</ul>
					<input type="hidden" id="costReductionLuxus" name="costReductionLuxus">
					
					<span class="listhead">Kapazit&auml;tserweiterung</span>
					<ul class="list-group">
						<li class="${prdLce0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionLuxus',0); change($(this)); }else if($(this).hasClass('d')){research('expansionLuxus',0); change($(this));}else{notEnough()}">+ ${prdCLce0} &euro;</a></li>
						<li class="${prdLce1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLce1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionLuxus',1); change($(this)); }else if($(this).hasClass('d')){research('expansionLuxus',1); change($(this));}else{notEnough()}">+ ${prdCLce1} &euro;</a></li>
						<li class="${prdLce2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPrLce2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionLuxus',2); change($(this)); }else if($(this).hasClass('d')){research('expansionLuxus',2); change($(this));}else{notEnough()}">+ ${prdCLce2} &euro;</a></li>
					</ul>
					<input type="hidden" id="expansionLuxus" name="expansionLuxus">
					
					<ul class="list-group">
						<li class="list-group-item">Produktionslimit <span class="productionLimit" id="productionLimit1">${prodLimitL}</span></li>
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
							<li class="${prdBcr0} list-group-item">Punkt 1 <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionBillig',0); change($(this)); }else if($(this).hasClass('d')){research('costReductionBillig',0); change($(this));}else{notEnough()}">+ ${prdCBcr0} &euro;</a></li>
							<li class="${prdBcr1} list-group-item">Punkt 2 <a class="addBtn ${addPrBcr1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionBillig',1); change($(this)); }else if($(this).hasClass('d')){research('costReductionBillig',1); change($(this));}else{notEnough()}">+ ${prdCBcr1} &euro;</a></li>
							<li class="${prdBcr2} list-group-item">Punkt 3 <a class="addBtn ${addPrBcr2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('costReductionBillig',2); change($(this)); }else if($(this).hasClass('d')){research('costReductionBillig',2); change($(this));}else{notEnough()}">+ ${prdCBcr2} &euro;</a></li>
						</ul>		
						<input type="hidden" id="costReductionBillig" name="costReductionBillig">
								
						<span class="listhead">Kapazit&auml;tserweiterung</span>
						<ul class="list-group">
							<li class="${prdBce0} list-group-item">Punkt 1 <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionBillig',0); change($(this)); }else if($(this).hasClass('d')){research('expansionBillig',0); change($(this));}else{notEnough()}">+ ${prdCBce0} &euro;</a></li>
							<li class="${prdBce1} list-group-item">Punkt 2 <a class="addBtn ${addPrBce1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionBillig',1); change($(this)); }else if($(this).hasClass('d')){research('expansionBillig',1); change($(this));}else{notEnough()}">+ ${prdCBce1} &euro;</a></li>
							<li class="${prdBce2} list-group-item">Punkt 3 <a class="addBtn ${addPrBce2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('expansionBillig',2); change($(this)); }else if($(this).hasClass('d')){research('expansionBillig',2); change($(this));}else{notEnough()}">+ ${prdCBce2} &euro;</a></li>
						</ul>
						<input type="hidden" id="expansionBillig" name="expansionBillig">
						
						<ul class="list-group">
							<li class="list-group-item">Produktionslimit <span class="productionLimit" id="productionLimit2">${prodLimitB}</span></li>
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
							<li class="list-group-item">Einkaufspreis/St&uuml;ck: <span class="ekVal" id="ekVal0">${ekM0} &euro;</span></li>							
							<li class="list-group-item">Produktionskosten <span id="prodCost0" class="prodC"></span></li>
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
						<ul class="list-group" dir="ltr">
							<li class="list-group-item">Vorrat <span id="stockModel1" class="stock">${stock1}</span></li>
							<li class="list-group-item">Produktionsmenge <input  type="text" class="numInput" id="output1" name="output1"></li>
							<li class="list-group-item">Einkaufspreis/St&uuml;ck: <span class="ekVal" id="ekVal1">${ekM1} &euro;</span></li>							
							<li class="list-group-item">Produktionskosten <span id="prodCost1" class="prodC"></span></li>
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
							<li class="list-group-item">Einkaufspreis/St&uuml;ck: <span class="ekVal" id="ekVal2">${ekM2} &euro;</span></li>							
							<li class="list-group-item">Produktionskosten <span id="prodCost2" class="prodC"></span></li>
						</ul>
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
			</div>
	    </div>