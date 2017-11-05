	    <div id="menu6" class="tab-pane fade marketing">
	    	<div class="row">
				<div class="col-sm-12 col-md-6 col-lg-6">
					<div id="marketingCompany" class="card card-aktive">
						<h4>Unternehmsweit</h4>
						<ul class="list-group">
							<li class="list-group-item" >Radio Werbespot <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketingCompany0',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketingCompany0',1); change($(this));}else{notEnough(); h($(this));}">+ ${ mCC0} &euro;</a></li>
							<li class="list-group-item" >TV-Werbespot <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketingCompany1',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketingCompany1',1); change($(this));}else{notEnough();}">+ ${ mCC1} &euro;</a></li>
							<li class="list-group-item" >Formel 1 Werbung <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketingCompany2',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketingCompany2',1); change($(this));}else{notEnough();}">+ ${ mCC2} &euro;</a></li>
						</ul>
						<input type="hidden" id="marketingCompany0" name="marketingCompany0">
						<input type="hidden" id="marketingCompany1" name="marketingCompany1">
						<input type="hidden" id="marketingCompany2" name="marketingCompany2">
					</div>
				</div>
				
				<div class="col-sm-12 col-md-6 col-lg-6">
					<div id="marketingWatch0" class="card ${watch0}">
					<h4>Modell 1</h4>
					<ul class="list-group">
						<li class="list-group-item" >Werbeplakate <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing0Clock0',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing0Clock0',1); change($(this));}else{notEnough();}">+ ${ mCm00} &euro;</a></li>
						<li class="list-group-item" >Zeitung <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing1Clock0',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing1Clock0',1); change($(this));}else{notEnough();}">+ ${ mCm01} &euro;</a></li>
						<li class="list-group-item" >Radio Werbespot <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing2Clock0',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing2Clock0',1); change($(this));}else{notEnough();}">+ ${ mCm02} &euro;</a></li>
					</ul>
					<input type="hidden" id="marketing0Clock0" name="marketing0Clock0">
					<input type="hidden" id="marketing1Clock0" name="marketing1Clock0">
					<input type="hidden" id="marketing2Clock0" name="marketing2Clock0">
					</div>
				</div>
				
			</div>
	      	<div class="row">
				
				<div class="col-sm-12 col-md-6 col-lg-6">
					<div id="marketingWatch1" class="card ${watch1}">
					<h4>Modell 2</h4>
					<ul class="list-group">
						<li class="list-group-item" >Werbeplakate <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing0Clock1',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing0Clock1',1); change($(this));}else{notEnough(); h($(this));}">+ ${ mCm10} &euro;</a></li>
						<li class="list-group-item" >Zeitung <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing1Clock1',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing1Clock1',1); change($(this));}else{notEnough();}">+ ${ mCm11} &euro;</a></li>
						<li class="list-group-item" >Radio Werbespot <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing2Clock1',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing2Clock1',1); change($(this));}else{notEnough(); }">+ ${ mCm12} &euro;</a></li>
					</ul>
					<input type="hidden" id="marketing0Clock1" name="marketing0Clock1">
					<input type="hidden" id="marketing1Clock1" name="marketing1Clock1">
					<input type="hidden" id="marketing2Clock1" name="marketing2Clock1">
					<div class="overlay">
						<div class="ol-text">nicht verf&uuml;gbar</div>
					</div>
					</div>
				</div>
				<div class="col-sm-12 col-md-6 col-lg-6">
					<div id="marketingWatch2" class="card ${watch2}">
					<h4>Modell 3</h4>
					<ul class="list-group">
						<li class="list-group-item" >Werbeplakate <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing0Clock2',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing0Clock2',1); change($(this));}else{notEnough()}">+ ${ mCm20} &euro;</a></li>
						<li class="list-group-item" >Zeitung <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing1Clock2',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing1Clock2',1); change($(this));}else{notEnough()}">+ ${ mCm21} &euro;</a></li>
						<li class="list-group-item" >Radio Werbespot <a class="addBtn" onclick="if(getMoney() >= $(this).text().replace(/[\.\+\u20ac]/g,'')  && !$(this).hasClass('d')){marketing('marketing2Clock2',1); change($(this)); }else if($(this).hasClass('d')){marketing('marketing2Clock2',1); change($(this));}else{notEnough()}">+ ${ mCm22} &euro;</a></li>
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