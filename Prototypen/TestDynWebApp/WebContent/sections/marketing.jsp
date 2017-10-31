	    <div id="menu6" class="tab-pane fade marketing">
	    	<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<div id="marketingCompany" class="card card-aktive">
						<h4>Unternehmsweit</h4>
						<ul class="list-group">
							<li class="list-group-item" onclick="marketing('marketingCompany0',1);">Radio Werbespot <a class="addBtn">+ ${ mCC0} &euro;</a></li>
							<li class="list-group-item" onclick="marketing('marketingCompany1',1);">TV-Werbespot <a class="addBtn">+ ${ mCC1} &euro;</a></li>
							<li class="list-group-item" onclick="marketing('marketingCompany2',1);">Formel 1 Werbung <a class="addBtn">+ ${ mCC2} &euro;</a></li>
						</ul>
						<input type="hidden" id="marketingCompany0" name="marketingCompany0">
						<input type="hidden" id="marketingCompany1" name="marketingCompany1">
						<input type="hidden" id="marketingCompany2" name="marketingCompany2">
					</div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<div id="marketingResults" class="card card-aktive">
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
					<div id="marketingWatch0" class="card ${watch0}">
					<h4>Modell 1</h4>
					<ul class="list-group">
						<li class="list-group-item" onclick="marketing('marketing0Clock0',1);">Werbeplakate <a class="addBtn">+ ${ mCm00} &euro;</a></li>
						<li class="list-group-item" onclick="marketing('marketing1Clock0',1);">Zeitung <a class="addBtn">+ ${ mCm01} &euro;</a></li>
						<li class="list-group-item" onclick="marketing('marketing2Clock0',1);">Radio Werbespot <a class="addBtn">+ ${ mCm02} &euro;</a></li>
					</ul>
					<input type="hidden" id="marketing0Clock0" name="marketing0Clock0">
					<input type="hidden" id="marketing1Clock0" name="marketing1Clock0">
					<input type="hidden" id="marketing2Clock0" name="marketing2Clock0">
					</div>
				</div>
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="marketingWatch1" class="card ${watch1}">
					<h4>Modell 2</h4>
					<ul class="list-group">
						<li class="list-group-item" onclick="marketing('marketing0Clock1',1);">Werbeplakate <a class="addBtn">+ ${ mCm10} &euro;</a></li>
						<li class="list-group-item" onclick="marketing('marketing1Clock1',1);">Zeitung <a class="addBtn">+ ${ mCm11} &euro;</a></li>
						<li class="list-group-item" onclick="marketing('marketing2Clock1',1);">Radio Werbespot <a class="addBtn">+ ${ mCm12} &euro;</a></li>
					</ul>
					<input type="hidden" id="marketing0Clock1" name="marketing0Clock1">
					<input type="hidden" id="marketing1Clock1" name="marketing1Clock1">
					<input type="hidden" id="marketing2Clock1" name="marketing2Clock1">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="marketingWatch2" class="card ${watch2}">
					<h4>Modell 3</h4>
					<ul class="list-group">
						<li class="list-group-item" onclick="marketing('marketing0Clock2',1);">Werbeplakate <a class="addBtn">+ ${ mCm20} &euro;</a></li>
						<li class="list-group-item" onclick="marketing('marketing1Clock2',1);">Zeitung <a class="addBtn">+ ${ mCm21} &euro;</a></li>
						<li class="list-group-item" onclick="marketing('marketing2Clock2',1);">Radio Werbespot <a class="addBtn">+ ${ mCm22} &euro;</a></li>
					</ul>
					<input type="hidden" id="marketing0Clock2" name="marketing0Clock2">
					<input type="hidden" id="marketing1Clock2" name="marketing1Clock2">
					<input type="hidden" id="marketing2Clock2" name="marketing2Clock2">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
			</div>
	    </div>