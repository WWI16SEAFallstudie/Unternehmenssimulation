	    <div id="menu1" class="tab-pane fade in active">
			<div class="row">
			
			<!-- Uhr Modell 1 -->
			
			<!-- 
			Beispiele f¸r Variablenname
			m0s = Modell 1 Segment
			m0c1 = Modell 1 Case 1
			m1b2 = Modell 2 Bracelet 2
			m2cw3 = Modell 3 ClockWork 3
			clM0c1 = Class Modell 1 Case 1	
			 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch0" class="card ${watch0}">
						<h4>Modell 1</h4>
						<p>Produktlinie: ${m0s}</p>
						<span class="listhead">Geh&auml;use</span>				
						<ul class="list-group usedCase0">
							<li class="${clM0c0} list-group-item" onclick="usedItem('usedCase0',0);">${m0c0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM0c1} list-group-item" onclick="usedItem('usedCase0',1);">${m0c1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM0c2} list-group-item" onclick="usedItem('usedCase0',2);">${m0c2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedCase0" name="usedCase0" value="${usedCase0}">				
						<span class="listhead">Armband</span>
						<ul class="list-group usedBracelet0">
							<li class="${clM0b0} list-group-item" onclick="usedItem('usedBracelet0',0);">${m0b0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM0b1} list-group-item" onclick="usedItem('usedBracelet0',1);">${m0b1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM0b2} list-group-item" onclick="usedItem('usedBracelet0',2);">${m0b2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedBracelet0" name="usedBracelet0" value="${usedBracelet0}">
						<span class="listhead">Uhrwerk</span>
						<ul class="list-group usedClockWork0">
							<li class="${clM0cw0} list-group-item" onclick="usedItem('usedClockWork0',0);">${m0cw0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM0cw1} list-group-item" onclick="usedItem('usedClockWork0',1);">${m0cw1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM0cw2} list-group-item" onclick="usedItem('usedClockWork0',2);">${m0cw2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedClockWork0" name="usedClockWork0" value="${usedClockWork0}">
						<ul class="list-group">
							<li class="list-group-item">Selbstkosten: <span class="ekVal">${ekM0} &euro;</span></li>
						</ul>
					</div>
				</div>
				
				<!-- Uhr Modell 2 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch1" class="card ${watch1}">
						<h4>Modell 2</h4>
						<a class="segment addBtn" onclick="openResearch('watch1');">Freischalten 100.000 &euro;</a>
						<p>Produktlinie: ${m1s}</p>
						<span class="listhead">Geh&auml;use</span>				
						<ul class="list-group usedCase1">
							<li class="${clM1c0} list-group-item" onclick="usedItem('usedCase1',0);">${m1c0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM1c1} list-group-item" onclick="usedItem('usedCase1',1);">${m1c1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM1c2} list-group-item" onclick="usedItem('usedCase1',2);">${m1c2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedCase1" name="usedCase1" value="${usedCase1}">				
						<span class="listhead">Armband</span>
						<ul class="list-group usedBracelet1">
							<li class="${clM1b0} list-group-item" onclick="usedItem('usedBracelet1',0);">${m1b0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM1b1} list-group-item" onclick="usedItem('usedBracelet1',1);">${m1b1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM1b2} list-group-item" onclick="usedItem('usedBracelet1',2);">${m1b2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedBracelet1" name="usedBracelet1" value="${usedBracelet1}">
						<span class="listhead">Uhrwerk</span>
						<ul class="list-group usedClockWork1">
							<li class="${clM1cw0} list-group-item" onclick="usedItem('usedClockWork1',0);">${m1cw0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM1cw1} list-group-item" onclick="usedItem('usedClockWork1',1);">${m1cw1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM1cw2} list-group-item" onclick="usedItem('usedClockWork1',2);">${m1cw2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedClockWork1" name="usedClockWork1" value="${usedClockWork1}">
						<ul class="list-group">
							<li class="list-group-item">Selbstkosten: <span class="ekVal">${ekM1} &euro;</span></li>
						</ul>
						<input type="hidden" id="researchModel1" name="researchModel1" value="">
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
						<div class="selectSegmentOuter">
							<div class="selectSegment">
								<span class="listhead">Uhrwerk</span>
									<ul class="list-group researchModel1">
										<li class="${rO} list-group-item" onclick="researchModel('researchModel1',0);">Umwelt <span class="glyphicon glyphicon-ok"></span></li>
										<li class="${rL} list-group-item" onclick="researchModel('researchModel1',1);">Luxus <span class="glyphicon glyphicon-ok"></span></li>
										<li class="${rB} list-group-item" onclick="researchModel('researchModel1',2);">Groﬂserienfertigung <span class="glyphicon glyphicon-ok"></span></li>
									</ul>
								<a class="addBtn" onclick="acceptResearch('watch1');">Erforschen</a>
								<a class="addBtn" onclick="cancelResearch('watch1','researchModel1');">Abbrechen</a>		
							</div>
						</div>
					</div>
				</div>
				
				<!-- Uhr Modell 3 -->
				<div class="col-sm-4 col-md-4 col-lg-4">
					<div id="watch2" class="card ${watch2}">
						<h4>Modell 3</h4>
						<a class="segment addBtn" onclick="openResearch('watch2');">Freischalten 100.000 &euro;</a>
						<p>Produktlinie: ${m2s}</p>
						<span class="listhead">Geh&auml;use</span>				
						<ul class="list-group usedCase2">
							<li class="${clM2c0} list-group-item" onclick="usedItem('usedCase2',0);">${m2c0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM2c1} list-group-item" onclick="usedItem('usedCase2',1);">${m2c1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM2c2} list-group-item" onclick="usedItem('usedCase2',2);">${m2c2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedCase2" name="usedCase2" value="${usedCase2}">				
						<span class="listhead">Armband</span>
						<ul class="list-group usedBracelet2">
							<li class="${clM2b0} list-group-item" onclick="usedItem('usedBracelet2',0);">${m2b0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM2b1} list-group-item" onclick="usedItem('usedBracelet2',1);">${m2b1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM2b2} list-group-item" onclick="usedItem('usedBracelet2',2);">${m2b2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedBracelet2" name="usedBracelet2" value="${usedBracelet2}">
						<span class="listhead">Uhrwerk</span>
						<ul class="list-group usedClockWork2">
							<li class="${clM2cw0} list-group-item" onclick="usedItem('usedClockWork2',0);">${m2cw0} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM2cw1} list-group-item" onclick="usedItem('usedClockWork2',1);">${m2cw1} <span class="glyphicon glyphicon-ok"></span></li>
							<li class="${clM2cw2} list-group-item" onclick="usedItem('usedClockWork2',2);">${m2cw2} <span class="glyphicon glyphicon-ok"></span></li>
						</ul>
						<input type="hidden" id="usedClockWork2" name="usedClockWork2" value="${usedClockWork2}">
						<ul class="list-group">
							<li class="list-group-item">Selbstkosten: <span class="ekVal">${ekM2} &euro;</span></li>
						</ul>
						<input type="hidden" id="researchModel2" name="researchModel2" value="">
						<div class="overlay">
							<div class="ol-text">nicht verf&uuml;gbar</div>
						</div>
						<div class="selectSegmentOuter">
							<div class="selectSegment">
								<span class="listhead">Uhrwerk</span>
									<ul class="list-group researchModel2">
										<li class="${rO} list-group-item" onclick="researchModel('researchModel2',0);">Umwelt <span class="glyphicon glyphicon-ok"></span></li>
										<li class="${rL} list-group-item" onclick="researchModel('researchModel2',1);">Luxus <span class="glyphicon glyphicon-ok"></span></li>
										<li class="${rB} list-group-item" onclick="researchModel('researchModel2',2);">Groﬂserienfertigung <span class="glyphicon glyphicon-ok"></span></li>
									</ul>
								<a class="addBtn" onclick="acceptResearch('watch2');">Erforschen</a>
								<a class="addBtn" onclick="cancelResearch('watch2','researchModel2');">Abbrechen</a>		
							</div>
						</div>
					</div>
				</div>
			</div>
	    </div>