	    <div id="menu1" class="tab-pane fade in active">
			<div class="row">
			
			<!-- Uhr Modell 1 -->
			
			<!-- 
			Beispiele für Variablenname
			m0s = Modell 1 Segment
			m0c1 = Modell 1 Case 1
			m1b2 = Modell 2 Bracelet 2
			m2cw3 = Modell 3 ClockWork 3	
			 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch1" class="card card-aktive">
						<h4>Modell 1</h4>
						<p>Produktlinie: ${m0s}</p>
						<span class="listhead">Geh&auml;use</span>				
						<ul class="list-group usedCase1">
							<li class="selected list-group-item" onclick="usedItem('usedCase1',1);">${m0c1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase1',2);">${m0c2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase1',3);">${m0c3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedCase1" name="usedCase1">				
						<span class="listhead">Armband</span>
						<ul class="list-group usedBracelet1">
							<li class="selected list-group-item" onclick="usedItem('usedBracelet1',1);">${m0b1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet1',2);">${m0b2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet1',3);">${m0b3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedBracelet1" name="usedBracelet1">
						<span class="listhead">Uhrwerk</span>
						<ul class="list-group usedClockWork1">
							<li class="selected list-group-item" onclick="usedItem('usedClockWork1',1);">${m0cw1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork1',2);">${m0cw2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork1',3);">${m0cw3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedClockWork1" name="usedClockWork1">
						<ul class="list-group">
							<li class="list-group-item">Einkaufspreis: <span class="ekVal">220 &euro;</span></li>
							<li class="list-group-item">Verkaufspreis: <span class="vkVal">280 &euro;</span></li>
						</ul>
					</div>
				</div>
				
				<!-- Uhr Modell 2 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch2" class="card card-inaktive">
						<h4>Modell 2</h4>
						<a class="segment addBtn" onclick="researchModel('watch2','researchModel2');">Freischalten 100.000 &euro;</a>
						<p>Produktlinie: ${m1s}</p>
						<span class="listhead">Geh&auml;use</span>				
						<ul class="list-group usedCase2">
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase2',1);">${m1c1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase2',2);">${m1c2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase2',3);">${m1c3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedCase2" name="usedCase2">				
						<span class="listhead">Armband</span>
						<ul class="list-group usedBracelet2">
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet2',1);">${m1b1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet2',2);">${m1b2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet2',3);">${m1b3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedBracelet2" name="usedBracelet2">
						<span class="listhead">Uhrwerk</span>
						<ul class="list-group usedClockWork2">
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork2',1);">${m1cw1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork2',2);">${m1cw2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork2',3);">${m1cw3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedClockWork2" name="usedClockWork2">
						<ul class="list-group">
							<li class="list-group-item">Einkaufspreis: <span class="ekVal"></span></li>
							<li class="list-group-item">Verkaufspreis: <span class="vkVal"></span></li>
						</ul>
						<input type="hidden" id="researchModel2" name="researchModel2" value="">
						<div id="overlay">
							<div id="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
				
				<!-- Uhr Modell 3 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch3" class="card card-inaktive">
						<h4>Modell 3</h4>
						<a class="segment addBtn" onclick="researchModel('watch3','researchModel3');">Freischalten 100.000 &euro;</a>
						<p>Produktlinie: ${m2s}</p>
						<span class="listhead">Geh&auml;use</span>				
						<ul class="list-group usedCase3">
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase3',1);">${m2c1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase3',2);">${m2c2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedCase3',3);">${m2c3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedCase3" name="usedCase3">				
						<span class="listhead">Armband</span>
						<ul class="list-group usedBracelet3">
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet3',1);">${m2b1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet3',2);">${m2b2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedBracelet3',3);">${m2b3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedBracelet3" name="usedBracelet3">
						<span class="listhead">Uhrwerk</span>
						<ul class="list-group usedClockWork3">
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork3',1);">${m2cw1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork3',2);">${m2cw2} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="notAvailable list-group-item" onclick="usedItem('usedClockWork3',3);">${m2cw3} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedClockWork3" name="usedClockWork3">
						<ul class="list-group">
							<li class="list-group-item">Einkaufspreis: <span class="ekVal"></span></li>
							<li class="list-group-item">Verkaufspreis: <span class="vkVal"></span></li>
						</ul>
						<input type="hidden" id="researchModel3" name="researchModel3" value="">
						<div id="overlay">
							<div id="ol-text">nicht verf&uuml;gbar</div>
						</div>
					</div>
				</div>
			</div>
	    </div>