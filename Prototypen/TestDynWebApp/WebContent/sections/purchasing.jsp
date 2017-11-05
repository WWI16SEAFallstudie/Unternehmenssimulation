	    <div id="menu4" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="purO" class="card umwelt ${purchasingO}">
						<h4>Umwelt</h4>
						<p></p>
						<span class="listhead">Verbesserung</span>
						<ul class="list-group">
							<li class="${purO0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingOeko',0); change($(this)); }else if($(this).hasClass('d')){research('purchasingOeko',0); change($(this));}else{notEnough()}">+  ${purCO0} &euro;</a></li>
							<li class="${purO1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurO1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingOeko',1); change($(this)); }else if($(this).hasClass('d')){research('purchasingOeko',1); change($(this));}else{notEnough()}">+  ${purCO1} &euro;</a></li>
							<li class="${purO2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurO2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingOeko',2); change($(this)); }else if($(this).hasClass('d')){research('purchasingOeko',2); change($(this));}else{notEnough()}">+ ${purCO2} &euro;</a></li>
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
							<li class="${purL0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingLuxus',0); change($(this)); }else if($(this).hasClass('d')){research('purchasingLuxus',0); change($(this));}else{notEnough()}">+  ${purCL0} &euro;</a></li>
							<li class="${purL1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurL1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingLuxus',0); change($(this)); }else if($(this).hasClass('d')){research('purchasingLuxus',0); change($(this));}else{notEnough()}">+  ${purCL1} &euro;</a></li>
							<li class="${purL2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurL2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingLuxus',0); change($(this)); }else if($(this).hasClass('d')){research('purchasingLuxus',0); change($(this));}else{notEnough()}">+ ${purCL2} &euro;</a></li>
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
							<li class="${purB0} list-group-item">Punkt 1 <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingBillig',0); change($(this)); }else if($(this).hasClass('d')){research('purchasingBillig',0); change($(this));}else{notEnough()}">+  ${purCB0} &euro;</a></li>
							<li class="${purB1} list-group-item">Punkt 2 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurB1}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingBillig',1); change($(this)); }else if($(this).hasClass('d')){research('purchasingBillig',1); change($(this));}else{notEnough()}">+  ${purCB1} &euro;</a></li>
							<li class="${purB2} list-group-item">Punkt 3 <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addPurB2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('purchasingBillig',2); change($(this)); }else if($(this).hasClass('d')){research('purchasingBillig',2); change($(this));}else{notEnough()}">+ ${purCB2} &euro;</a></li>
						</ul>
						<input type="hidden" id="purchasingBillig" name="purchasingBillig">				
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
			</div>
	    </div>