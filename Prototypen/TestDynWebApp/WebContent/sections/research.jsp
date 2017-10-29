	    <div id="menu2" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="researchO" class="card umwelt ${researchO}">
					<h4>Umwelt</h4>
					<a class="segment addBtn" onclick="research('researchSegmentOeko',1);">Freischalten ${rCO} &euro;</a>
					<p></p>
					<span class="listhead">Geh&auml;use</span>
					<ul class="list-group">
						<li class="${clOc0} list-group-item" onclick="research('researchCaseOeko',0);">Holz <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCOc0} &euro;</a></li>
						<li class="${clOc1} list-group-item" onclick="research('researchCaseOeko',1);">Wurzelholz <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCOc1} &euro;</a></li>
						<li class="${clOc2} list-group-item" onclick="research('researchCaseOeko',2);">Gebeiztes Holz <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addOc2}">+ ${clCOc2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchCaseOeko" name="researchCaseOeko">
					
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="${clOb0} list-group-item" onclick="research('researchBraceletOeko',0);">Stoff <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCOb0} &euro;</a></span></li>
						<li class="${clOb1} list-group-item" onclick="research('researchBraceletOeko',1);">Leinenfasern <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCOb1} &euro;</a></li>
						<li class="${clOb2} list-group-item" onclick="research('researchBraceletOeko',2);">Holz <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addOb2}">+ ${clCOb2} &euro;</a></li>
					</ul> 
					<input type="hidden" id="researchBraceletOeko" name="researchBraceletOeko">
					
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="${clOcw0} list-group-item" onclick="research('researchClockWorkOeko',0);">Quarz <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCOcw0} &euro;</a></li>
						<li class="${clOcw1} list-group-item" onclick="research('researchClockWorkOeko',1);">Funk <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCOcw1} &euro;</a></li>
						<li class="${clOcw2} list-group-item" onclick="research('researchClockWorkOeko',2);">Automatik <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addOcw2}">+ ${clCOcw2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchClockWorkOeko" name="researchClockWorkOeko">
					
					<input type="hidden" id="researchSegmentOeko" name="researchSegmentOeko">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="researchL" class="card luxus ${researchL}">
					<h4>Luxus</h4>
					<a class="segment addBtn" onclick="research('researchSegmentLuxus',1);">Freischalten ${rCL} &euro;</a>
					<p></p>
					<span class="listhead">Geh&auml;use</span>
					<ul class="list-group">
						<li class="${clLc0} list-group-item" onclick="research('researchCaseLuxus',0);">Stahl <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCLc0} &euro;</a></li>
						<li class="${clLc1} list-group-item" onclick="research('researchCaseLuxus',1);">Titan <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCLc1} &euro;</a></li>
						<li class="${clLc2} list-group-item" onclick="research('researchCaseLuxus',2);">Platin <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addLc2}">+ ${clCLc2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchCaseLuxus" name="researchCaseLuxus">
					
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="${clLb0} list-group-item" onclick="research('researchBraceletLuxus',0);">Leder <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCLb0} &euro;</a></li>
						<li class="${clLb1} list-group-item" onclick="research('researchBraceletLuxus',1);">Geh&auml;usematerial <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCLb1} &euro;</a></li>
						<li class="${clLb2} list-group-item" onclick="research('researchBraceletLuxus',2);">Keramik <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addLb2}">+ ${clCLb2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchBraceletLuxus" name="researchBraceletLuxus">
					
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="${clLcw0} list-group-item" onclick="research('researchClockWorkLuxus',0);">Quarz <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCLcw0} &euro;</a></li>
						<li class="${clLcw1} list-group-item" onclick="research('researchClockWorkLuxus',1);">Automatik <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCLcw1} &euro;</a></li>
						<li class="${clLcw2} list-group-item" onclick="research('researchClockWorkLuxus',2);">Skelett/Kalender <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addLcw2}">+ ${clCLcw2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchClockWorkLuxus" name="researchClockWorkLuxus">
					
					<input type="hidden" id="researchSegmentLuxus" name="researchSegmentLuxus">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="researchB" class="card preisbewusst ${researchB}">
					<h4>Gro&szlig;serienfertigung</h4>
					<a class="segment addBtn" onclick="research('researchSegmentBillig',1);">Freischalten ${rCB} &euro;</a>
					<p></p>
					<span class="listhead">Geh&auml;use</span>				
					<ul class="list-group">
						<li class="${clBc0} list-group-item" onclick="research('researchCaseBillig',0);">Plastik <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCBc0} &euro;</a></li>
						<li class="${clBc1} list-group-item" onclick="research('researchCaseBillig',1);">Gummi <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCBc1} &euro;</a></li>
						<li class="${clBc2} list-group-item" onclick="research('researchCaseBillig',2);">Stoff <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addBc2}">+ ${clCBc2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchCaseBillig" name="researchCaseBillig">
									
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="${clBb0} list-group-item" onclick="research('researchBraceletBillig',0);">Plastik <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCBb0} &euro;</a></li>
						<li class="${clBb1} list-group-item" onclick="research('researchBraceletBillig',1);">Gef&auml;rbtes Plastik <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCBb1} &euro;</a></li>
						<li class="${clBb2} list-group-item" onclick="research('researchBraceletBillig',2);">Durchsichtiges Plastik <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addBb2}">+ ${clCBb2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchBraceletBillig" name="researchBraceletBillig">
					
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="${clBcw0} list-group-item"onclick="research('researchClockWorkBillig',0);">Quarz <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCBcw0} &euro;</a></li>
						<li class="${clBcw1} list-group-item"onclick="research('researchClockWorkBillig',1);">Funk <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+ ${clCBcw1} &euro;</a></li>
						<li class="${clBcw2} list-group-item"onclick="research('researchClockWorkBillig',2);">Automatik <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addBcw2}">+ ${clCBcw2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchClockWorkBillig" name="researchClockWorkBillig">
					
					<input type="hidden" id="researchSegmentBillig" name="researchSegmentBillig">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
			</div>
	    </div>