	    <div id="menu4" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="purO" class="card umwelt ${purchasingO}">
						<h4>Umwelt</h4>
						<p></p>
						<span class="listhead">Verbesserung</span>
						<ul class="list-group">
							<li class="${purO0} list-group-item" onclick="research('purchasingOeko',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+  ${purCO0} &euro;</a></li>
							<li class="${purO1} list-group-item" onclick="research('purchasingOeko',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurO1}">+  ${purCO1} &euro;</a></li>
							<li class="${purO2} list-group-item" onclick="research('purchasingOeko',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurO2}">+ ${purCO2} &euro;</a></li>
						</ul>
						<input type="hidden" id="purchasingOeko" name="purchasingOeko">
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="purL" class="card luxus ${purchasingL}">
						<h4>Luxus</h4>
						<p></p>
						<span class="listhead">Verbesserung</span>
						<ul class="list-group">
							<li class="${purL0} list-group-item" onclick="research('purchasingLuxus',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+  ${purCL0} &euro;</a></li>
							<li class="${purL1} list-group-item" onclick="research('purchasingLuxus',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurL1}">+  ${purCL1} &euro;</a></li>
							<li class="${purL2} list-group-item" onclick="research('purchasingLuxus',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurL2}">+ ${purCL2} &euro;</a></li>
						</ul>
						<input type="hidden" id="purchasingLuxus" name="purchasingLuxus">
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="purB" class="card preisbewusst ${purchasingB}">
						<h4>Gro&szlig;serienfertigung</h4>
						<p></p>
						<span class="listhead">Verbesserung</span>				
						<ul class="list-group">
							<li class="${purB0} list-group-item" onclick="research('purchasingBillig',0);">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn">+  ${purCB0} &euro;</a></li>
							<li class="${purB1} list-group-item" onclick="research('purchasingBillig',1);">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurB1}">+  ${purCB1} &euro;</a></li>
							<li class="${purB2} list-group-item" onclick="research('purchasingBillig',2);">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurB2}">+ ${purCB2} &euro;</a></li>
						</ul>
						<input type="hidden" id="purchasingBillig" name="purchasingBillig">				
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
			</div>
	    </div>