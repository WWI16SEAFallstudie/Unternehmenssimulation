// Begrenzung der Inputmöglichkeiten auf Ziffern und Komma
$('.numInput').keypress(function(event){
	var keyPressed = (window.event) ? window.event.keyCode : event.which;
	 v=String.fromCharCode(keyPressed);
	 if(keyPressed == 37 || keyPressed == 38 || keyPressed == 39 || keyPressed == 40 || keyPressed == 8 || keyPressed == 46) {
	     return true;
	 }
	 if ( eval('v.match(/^[0-9,]$/)'))  return true;
	 event.preventDefault();
	 event.stopPropagation();
});

//Begrenzung der Inputmöglichkeiten auf Ziffern
$('.intInput').keypress(function(event){
	var keyPressed = (window.event) ? window.event.keyCode : event.which;
	v=String.fromCharCode(keyPressed);
	if(keyPressed == 37 || keyPressed == 38 || keyPressed == 39 || keyPressed == 40 || keyPressed == 8 || keyPressed == 46) {
	     return true;
	 }
	if ( eval('v.match(/^[0-9]$/)'))  return true;
	event.preventDefault();
	event.stopPropagation();
	});

// Umschaltung der Navigation von Top to side
function uiSwitch(){
	var mainNav = document.getElementById("mainNav");
	if(mainNav.classList.contains("nav-tabs")){
		mainNav.classList.remove("nav-tabs");
		mainNav.classList.add("nav-pills");
		mainNav.classList.add("nav-stacked");
		document.getElementById("content").classList.add("cont-side-nav")
	}else{
		mainNav.classList.add("nav-tabs");
		mainNav.classList.remove("nav-pills");
		mainNav.classList.remove("nav-stacked");
		document.getElementById("content").classList.remove("cont-side-nav")		
	}
}

// Auswahl des zu Nutzenden Gehäuse, Armband, Uhrwerk
function usedItem(input, item){	
	selectItem(input, item);
	document.getElementById(input).value = item;
}

// Freischalten einer weiteren Uhr
function openResearch(card){
	$("#"+card+">.selectSegmentOuter").css("display","block");
}

function selectItem(input, item){
	if($("."+input).first().parent().hasClass("card-inaktive"))return false;
	itemOne = document.getElementsByClassName(input)[0].children[0];
	itemTwo = document.getElementsByClassName(input)[0].children[1];
	itemThree = document.getElementsByClassName(input)[0].children[2];
	
	switch(item) {
	    case 0:
	    	if(itemOne.classList.contains("notAvailable")) return false;
	        if(!itemOne.classList.contains("selected"))itemOne.classList.add("selected");
	        if(itemTwo.classList.contains("selected"))itemTwo.classList.remove("selected");
	        if(itemThree.classList.contains("selected"))itemThree.classList.remove("selected");
	        break;
	    case 1:
	    	if(itemTwo.classList.contains("notAvailable")) return false;
	        if(!itemTwo.classList.contains("selected"))itemTwo.classList.add("selected");
	        if(itemOne.classList.contains("selected"))itemOne.classList.remove("selected");
	        if(itemThree.classList.contains("selected"))itemThree.classList.remove("selected");
	        break;
	    case 2:
	    	if(itemThree.classList.contains("notAvailable")) return false;
	        if(!itemThree.classList.contains("selected"))itemThree.classList.add("selected");
	        if(itemOne.classList.contains("selected"))itemOne.classList.remove("selected");
	        if(itemTwo.classList.contains("selected"))itemTwo.classList.remove("selected");
	        break;
	}
}

function researchModel(input,item){
	
	selectItem(input, item);
	
	switch(item) {
    case 0:
    	document.getElementById(input).value = "Oeko";
        break;
    case 1:
    	document.getElementById(input).value = "Premium";
        break;
    case 2:
    	document.getElementById(input).value = "Billig";
        break;
	}
}

function acceptResearch(card){
	$("#"+card+">.selectSegmentOuter").css("display","none");
}

function cancelResearch(card, input){
	document.getElementById(input).value = "";
	
	$("#"+card+" .list-group-item").removeClass("selected");
	$("#"+card+">.selectSegmentOuter").css("display","none");
}

// Erforschung des übergebenen Parameters
// Diese Funktion wird von F&E, Produktion und Einkauf verwendet
function research(input, item){
	
	if(document.getElementById(input).value == ""){
		alert("Die Erforschung erfolgt");
		document.getElementById(input).value = item;
	}else{
		alert("Die Erforschung wird abgebrochen");
		document.getElementById(input).value = "";
	}
}

//Diese Funktion wird von F&E, Produktion und Einkauf verwendet
function marketing(input, item){
	
	if(document.getElementById(input).value == ""){
		alert("Die Marketingkampagne erfolgt");
		document.getElementById(input).value = item;
	}else{
		alert("Die Marketingkampagne wird abgebrochen");
		document.getElementById(input).value = "";
	}
}


function getMoney()
{
	return parseFloat($('#money').text().replace(/[\.\u20ac]/g,''));
}

function numberWithCommas(x) {
    var parts = x.toString().split(".");
    parts[0] = parts[0].replace(/\B(?=(\d{3})+(?!\d))/g, ",");
    return parts.join(".");
}

function change(button)
{
	if(button.hasClass('d'))
	{
		let buttonText = $(button).attr('value');
		$(button).text(buttonText);	
		let priceFloat = parseFloat(buttonText.replace(/[\.\+\u20ac\Freischalten]/g,''));
		let sum = parseFloat(getMoney()) + priceFloat;
		let floatSum = parseFloat(sum);
		$('#money').text(floatSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
		$(button).removeClass('d');
		let formattedNumber = buttonPrice.toLocaleString('de-DE',{minimumFractionDigits: 0});
		
	}
	else
	{
		let buttonText = button.text();
		let priceFloat = parseFloat(buttonText.replace(/[\.\+\u20ac\Freischalten]/g,''));
		let difference = getMoney() - priceFloat;
		$(button).attr('value',buttonText);
		$(button).text('Undo');
		$(button).addClass('d');
		$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
	}
}

function changeProd(button, changeCost)
{
	if(button.hasClass('d'))
	{
		let buttonText = $(button).attr('value');
		let changeCostText = $(button).attr('id');
		alert($(button).attr('id'));
		$(button).text(buttonText);	
		let priceFloat = parseFloat(buttonText.replace(/[\.\+\u20ac\Freischalten]/g,''));
		let changeCostFloat = parseFloat(changeCostText);
		alert(priceFloat);
		alert(changeCostFloat);
		
		let sum = parseFloat(getMoney()) + priceFloat + changeCostFloat;
		let floatSum = parseFloat(sum);
		$('#money').text(floatSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
		$(button).removeClass('d');
		let formattedNumber = buttonPrice.toLocaleString('de-DE',{minimumFractionDigits: 0});
		
	}
	else
	{
		let buttonText = button.text();
		let priceFloat = parseFloat(buttonText.replace(/[\Freischalten\.\+\u20ac]/g,''));
		let difference = getMoney() - priceFloat - changeCost;
		$(button).attr('value',buttonText);
		$(button).attr('id',changeCost);
		$(button).text('Undo');
		$(button).addClass('d');
		$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
	}
}


$('#output0').blur(function()
{
	if($(this).val())
	{
		if($(this).hasClass('d'))
		{
			let undoProdCost = $(this).attr('class').replace('d','').replace('numInput','');
			let undoSum = getMoney() + undoProdCost * parseFloat($('#ekVal0').text().replace(/[\.\u20ac]/g,''));
			$('#money').text(undoSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
			
			if($(this).val() > parseInt($('#productionLimit0').text().replace(/[\.]/g,'')))
			{
				alert("Die Produktionskapazitaeten reichen nicht aus!\nDas Limit betraegt: "+$('#productionLimit0').text());
				$(this).attr('class','numInput');
				$(this).val('');
				$('#prodCost0').text('');
			}
			else
			{
				if(getMoney() >= ($(this).val() * parseFloat($('#ekVal0').text().replace(/[\.\u20ac]/g,''))))
				{
					let prodCost = $(this).val() * parseFloat($('#ekVal0').text().replace(/[\.\u20ac]/g,''));
					let difference = getMoney() - prodCost;
					$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
					$(this).attr('class','numInput');
					$(this).addClass('d');
					$(this).addClass($(this).val());
					$('#prodCost0').text(prodCost.toLocaleString('de-DE',{minimumFractionDigits: 2})+' \u20ac');
				}
				else
				{
					alert("Das Guthaben reicht nicht aus!");
					$(this).val('');
					$(this).attr('class','numInput');
					$('#prodCost0').text('');
				}
			}
			
			
		}
		else
		{
			if($(this).val() > parseInt($('#productionLimit0').text().replace(/[\.]/g,'')))
			{
				alert("Die Produktionskapazitaeten reichen nicht aus!\nDas Limit betraegt: "+$('#productionLimit0').text());
				$(this).val('');
				$('#prodCost0').text('');
			}
			else
			{
				if(getMoney() >= ($(this).val() * parseFloat($('#ekVal0').text().replace(/[\.\u20ac]/g,''))))
				{
					let prodCost = $(this).val() * parseFloat($('#ekVal0').text().replace(/[\.\u20ac]/g,''));
					let difference = getMoney() - prodCost;
					$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
					$(this).addClass('d');
					$(this).addClass($(this).val());
					$('#prodCost0').text(prodCost.toLocaleString('de-DE',{minimumFractionDigits: 2})+' \u20ac');
				}
				else
				{
					alert("Das Guthaben reicht nicht aus!");
					$(this).val('');
					$(this).attr('class','numInput');
					$('#prodCost0').text('');
				}
			}
		}
	}
	else if(!$(this).val())
	{
		if($(this).hasClass('d'))
		{
			let undoProdCost = $(this).attr('class').replace('d','').replace('numInput','');
			let undoSum = getMoney() + undoProdCost * parseFloat($('#ekVal0').text().replace(/[\.\u20ac]/g,''));
			$('#money').text(undoSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
			$(this).attr('class','numInput');
			$('#prodCost0').text('');
		}
	}
});


$('#output1').blur(function()
		{
			if($(this).val())
			{
				if($(this).hasClass('d'))
				{
					let undoProdCost = $(this).attr('class').replace('d','').replace('numInput','');
					let undoSum = getMoney() + undoProdCost * parseFloat($('#ekVal1').text().replace(/[\.\u20ac]/g,''));
					$('#money').text(undoSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
					
					if($(this).val() > parseInt($('#productionLimit1').text().replace(/[\.]/g,'')))
					{
						alert("Die Produktionskapazitaeten reichen nicht aus!\nDas Limit betraegt: "+$('#productionLimit1').text());
						$(this).attr('class','numInput');
						$(this).val('');
						$('#prodCost1').text('');
					}
					else
					{
						if(getMoney() >= ($(this).val() * parseFloat($('#ekVal1').text().replace(/[\.\u20ac]/g,''))))
						{
							let prodCost = $(this).val() * parseFloat($('#ekVal1').text().replace(/[\.\u20ac]/g,''));
							let difference = getMoney() - prodCost;
							$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
							$(this).attr('class','numInput');
							$(this).addClass('d');
							$(this).addClass($(this).val());
							$('#prodCost1').text(prodCost.toLocaleString('de-DE',{minimumFractionDigits: 2})+' \u20ac');

						}
						else
						{
							alert("Das Guthaben reicht nicht aus!");
							$(this).val('');
							$(this).attr('class','numInput');
							$('#prodCost1').val('');
						}
					}
					
					
				}
				else
				{
					if($(this).val() > parseInt($('#productionLimit1').text().replace(/[\.]/g,'')))
					{
						alert("Die Produktionskapazitaeten reichen nicht aus!\nDas Limit betraegt: "+$('#productionLimit1').text());
						$(this).val('');
						$('#prodCost1').val('');
						$('#prodCost1').text('');
					}
					else
					{
						if(getMoney() >= ($(this).val() * parseFloat($('#ekVal1').text().replace(/[\.\u20ac]/g,''))))
						{
							let prodCost = $(this).val() * parseFloat($('#ekVal1').text().replace(/[\.\u20ac]/g,''));
							let difference = getMoney() - prodCost;
							$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
							$(this).addClass('d');
							$(this).addClass($(this).val());
							$('#prodCost1').text(prodCost.toLocaleString('de-DE',{minimumFractionDigits: 2})+' \u20ac');

						}
						else
						{
							alert("Das Guthaben reicht nicht aus!");
							$(this).val('');
							$(this).attr('class','numInput');
							$('#prodCost1').text('');
						}
					}
				}
			}
			else if(!$(this).val())
			{
				if($(this).hasClass('d'))
				{
					
					let undoProdCost = $(this).attr('class').replace('d','').replace('numInput','');
					let undoSum = getMoney() + undoProdCost * parseFloat($('#ekVal1').text().replace(/[\.\u20ac]/g,''));
					$('#money').text(undoSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
					$(this).attr('class','numInput');
					$('#prodCost1').text('');
				}
			}


		});


$('#output2').blur(function()
		{
			if($(this).val())
			{
				if($(this).hasClass('d'))
				{
					let undoProdCost = $(this).attr('class').replace('d','').replace('numInput','');
					let undoSum = getMoney() + undoProdCost * parseFloat($('#ekVal2').text().replace(/[\.\u20ac]/g,''));
					$('#money').text(undoSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
					
					if($(this).val() > parseInt($('#productionLimit2').text().replace(/[\.]/g,'')))
					{
						alert("Die Produktionskapazitaeten reichen nicht aus!\nDas Limit betraegt: "+$('#productionLimit2').text());
						$(this).attr('class','numInput');
						$(this).val('');
					}
					else
					{
						if(getMoney() >= ($(this).val() * parseFloat($('#ekVal2').text().replace(/[\.\u20ac]/g,''))))
						{
							let prodCost = $(this).val() * parseFloat($('#ekVal2').text().replace(/[\.\u20ac]/g,''));
							let difference = getMoney() - prodCost;
							$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
							$(this).attr('class','numInput');
							$(this).addClass('d');
							$(this).addClass($(this).val());
							$('#prodCost2').text(prodCost.toLocaleString('de-DE',{minimumFractionDigits: 2})+' \u20ac');
						}
						else
						{
							alert("Das Guthaben reicht nicht aus!");
							$(this).val('');
							$(this).attr('class','numInput');
							$('#prodCost2').text('');
						}
					}
					
					
				}
				else
				{
					if($(this).val() > parseInt($('#productionLimit2').text().replace(/[\.]/g,'')))
					{
						alert("Die Produktionskapazitaeten reichen nicht aus!\nDas Limit betraegt: "+$('#productionLimit2').text());
						$(this).val('');
						$('#prodCost2').text('');
					}
					else
					{
						if(getMoney() >= ($(this).val() * parseFloat($('#ekVal2').text().replace(/[\.\u20ac]/g,''))))
						{
							let prodCost = $(this).val() * parseFloat($('#ekVal2').text().replace(/[\.\u20ac]/g,''));
							let difference = getMoney() - prodCost;
							$('#money').text(difference.toLocaleString('de-DE',{minimumFractionDigits: 2}));
							$(this).addClass('d');
							$(this).addClass($(this).val());
							$('#prodCost2').text(prodCost.toLocaleString('de-DE',{minimumFractionDigits: 2})+' \u20ac');
						}
						else
						{
							alert("Das Guthaben reicht nicht aus!");
							$(this).val('');
							$(this).attr('class','numInput');
							$('#prodCost2').text('');
						}
					}
				}
			}
			else if(!$(this).val())
			{
				if($(this).hasClass('d'))
				{
					
					let undoProdCost = $(this).attr('class').replace('d','').replace('numInput','');
					let undoSum = getMoney() + undoProdCost * parseFloat($('#ekVal2').text().replace(/[\.\u20ac]/g,''));
					$('#money').text(undoSum.toLocaleString('de-DE',{minimumFractionDigits: 2}));
					$(this).attr('class','numInput');
					$('#prodCost2').text('');
				}
			}

//NOTE
		});


$('#quantitySupplied0').blur(function()
{
	if( !$(this).val() == '')
	{
		if(!$('#offerPrice0').val() == '')
		{
			if($(this).val() > parseInt($('#stock0').text().replace(/[\.]/g,'')))
			{
				alert('Der Vorrat reicht nicht aus! \nVorrat: '+$('#stock0').text());
				$(this).val('');
			}
			else if($(this).val() > 0 && $(this).val() <= parseInt($('#stock0').text().replace(/[\.]/g,'')))
			{
				alert($(this).val().toLocaleString('de-DE',{minimumFractionDigits: 2}));
				alert($('#offerPrice0').val());
				let verkauf = parseFloat($(this).val().toLocaleString('de-DE',{minimumFractionDigits: 2})) * parseFloat($('#offerPrice0').val());
				
				alert(verkauf);
				$('#verkauf0').text(parseFloat(verkauf)+ ' \u20ac');
			}
		}
		else
		{
			alert('Sie m\u00fcssen zuerst einen Verkaufspreis eingeben!');
			$(this).val('');
		}
	}
});


function notEnough()
{
	alert('Das Kontoguthaben reicht nicht aus!');
}

function h(h)
{
	alert(h.text().replace(/[\Freischalten\.\+\u20ac]/g,''));
	alert(getMoney());
}
