	    <div id="menu2" class="tab-pane fade">
	      	<div class="row">
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="researchO" class="card umwelt ${researchO}">
					<h4>Umwelt</h4>
					<a class="segment addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\Freischalten\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchSegmentOeko',1); change($(this)); }else if($(this).hasClass('d')){research('researchSegmentOeko',1); change($(this));}else{notEnough()}">Freischalten ${rCO} &euro;</a>
					<p></p>
					<span class="listhead">Geh&auml;use</span>
					<ul class="list-group">
						<li class="${clOc0} list-group-item">Biokunststoff <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchCaseOeko',0);">+ ${clCOc0} &euro;</a></li>
						<li class="${clOc1} list-group-item">Holz <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchCaseOeko',1); change($(this)); }else if($(this).hasClass('d')){research('researchCaseOeko',1); change($(this));}else{notEnough()}">+ ${clCOc1} &euro;</a></li>
						<li class="${clOc2} list-group-item">Bambus <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addOc2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchCaseOeko',2); change($(this)); }else if($(this).hasClass('d')){research('researchCaseOeko',2); change($(this));}else{notEnough()}">+ ${clCOc2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchCaseOeko" name="researchCaseOeko">
					
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="${clOb0} list-group-item">Biobaumwolle <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchBraceletOeko',0);">+ ${clCOb0} &euro;</a></span></li>
						<li class="${clOb1} list-group-item">Bioleder <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchBraceletOeko',1); change($(this)); }else if($(this).hasClass('d')){research('researchBraceletOeko',1); change($(this));}else{notEnough()}">+ ${clCOb1} &euro;</a></li>
						<li class="${clOb2} list-group-item">Holz <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addOb2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchBraceletOeko',2); change($(this)); }else if($(this).hasClass('d')){research('researchBraceletOeko',2); change($(this));}else{notEnough()}">+ ${clCOb2} &euro;</a></li>
					</ul> 
					<input type="hidden" id="researchBraceletOeko" name="researchBraceletOeko">
					
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="${clOcw0} list-group-item">Mechanisch <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchClockWorkOeko',0);">+ ${clCOcw0} &euro;</a></li>
						<li class="${clOcw1} list-group-item">Funk <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchClockWorkOeko',1); change($(this)); }else if($(this).hasClass('d')){research('researchClockWorkOeko',1); change($(this));}else{notEnough()}">+ ${clCOcw1} &euro;</a></li>
						<li class="${clOcw2} list-group-item">Quarz <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addOcw2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchClockWorkOeko',2); change($(this)); }else if($(this).hasClass('d')){research('researchClockWorkOeko',2); change($(this));}else{notEnough()}">+ ${clCOcw2} &euro;</a></li>
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
					<a class="segment addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\Freischalten\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchSegmentPremium',1); change($(this)); }else if($(this).hasClass('d')){research('researchSegmentPremium',1); change($(this));}else{notEnough()}">Freischalten ${rCL} &euro;</a>
					<p></p>
					<span class="listhead">Geh&auml;use</span>
					<ul class="list-group">
						<li class="${clLc0} list-group-item">High-Tech Keramik <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchCasePremium',0);">+ ${clCLc0} &euro;</a></li>
						<li class="${clLc1} list-group-item">Gold <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchCasePremium',1); change($(this)); }else if($(this).hasClass('d')){research('researchCasePremium',1); change($(this));}else{notEnough()}">+ ${clCLc1} &euro;</a></li>
						<li class="${clLc2} list-group-item">Platin <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addLc2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchCasePremium',2); change($(this)); }else if($(this).hasClass('d')){research('researchCasePremium',2); change($(this));}else{notEnough()}">+ ${clCLc2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchCasePremium" name="researchCasePremium">
					
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="${clLb0} list-group-item">Edelstahl <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchBraceletPremium',0);">+ ${clCLb0} &euro;</a></li>
						<li class="${clLb1} list-group-item">Aligatorleder <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchBraceletPremium',1); change($(this)); }else if($(this).hasClass('d')){research('researchBraceletPremium',1); change($(this));}else{notEnough()}">+ ${clCLb1} &euro;</a></li>
						<li class="${clLb2} list-group-item">Fischhaut <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addLb2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchBraceletPremium',2); change($(this)); }else if($(this).hasClass('d')){research('researchBraceletPremium',2); change($(this));}else{notEnough()}">+ ${clCLb2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchBraceletPremium" name="researchBraceletPremium">
					
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="${clLcw0} list-group-item">Mechanisch <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchClockWorkPremium',0);">+ ${clCLcw0} &euro;</a></li>
						<li class="${clLcw1} list-group-item">Automatik mit Skelettfunktion <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchClockWorkPremium',1); change($(this)); }else if($(this).hasClass('d')){research('researchClockWorkPremium',1); change($(this));}else{notEnough()}">+ ${clCLcw1} &euro;</a></li>
						<li class="${clLcw2} list-group-item">Elektromechanisch <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addLcw2}" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchClockWorkPremium',2); change($(this)); }else if($(this).hasClass('d')){research('researchClockWorkPremium',2); change($(this));}else{notEnough()}">+ ${clCLcw2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchClockWorkPremium" name="researchClockWorkPremium">
					
					<input type="hidden" id="researchSegmentPremium" name="researchSegmentPremium">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="researchB" class="card preisbewusst ${researchB}">
					<h4>Billig</h4>
					<a class="segment addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\Freischalten\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){research('researchSegmentBillig',1); change($(this)); }else if($(this).hasClass('d')){research('researchSegmentBillig',1); change($(this));}else{notEnough(); h($(this));}">Freischalten ${rCB} &euro;</a>
					<p></p>
					<span class="listhead">Geh&auml;use</span>				
					<ul class="list-group">
						<li class="${clBc0} list-group-item">Kunststoff <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchCaseBillig',0);">+ ${clCBc0} &euro;</a></li>
						<li class="${clBc1} list-group-item">Edelstahl <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchCaseBillig',1);">+ ${clCBc1} &euro;</a></li>
						<li class="${clBc2} list-group-item">Carbon <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addBc2}" onclick="research('researchCaseBillig',2);">+ ${clCBc2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchCaseBillig" name="researchCaseBillig">
									
					<span class="listhead">Armband</span>
					<ul class="list-group">
						<li class="${clBb0} list-group-item">Silikon <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchBraceletBillig',0);">+ ${clCBb0} &euro;</a></li>
						<li class="${clBb1} list-group-item">Metall <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchBraceletBillig',1);">+ ${clCBb1} &euro;</a></li>
						<li class="${clBb2} list-group-item">Kunstleder <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addBb2}" onclick="research('researchBraceletBillig',2);">+ ${clCBb2} &euro;</a></li>
					</ul>
					<input type="hidden" id="researchBraceletBillig" name="researchBraceletBillig">
					
					<span class="listhead">Uhrwerk</span>
					<ul class="list-group">
						<li class="${clBcw0} list-group-item">Quarz <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchClockWorkBillig',0);">+ ${clCBcw0} &euro;</a></li>
						<li class="${clBcw1} list-group-item">Funk <span class="glyphicon glyphicon-ok"></span><a class="addBtn" onclick="research('researchClockWorkBillig',1);">+ ${clCBcw1} &euro;</a></li>
						<li class="${clBcw2} list-group-item">Elektronisch <span class="glyphicon glyphicon-ok"></span><a class="addBtn ${addBcw2}" onclick="research('researchClockWorkBillig',2);">+ ${clCBcw2} &euro;</a></li>
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