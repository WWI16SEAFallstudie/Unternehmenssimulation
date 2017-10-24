// Testfunktion zur Demonstation des Spielerwechsels
function next(){
	window.open("index.jsp","_self")
}


// Chart.js Diagramm für Statistik der verkauften Uhren
var ctx = document.getElementById("myChart").getContext('2d');
ctx.height = 800;
var myChart = new Chart(ctx, {
    type: 'bar',
    data: {
        labels: ["Runde 1", "Runde 2", "Runde 3", "Runde 4", "Runde 5", "Runde 6"],
        datasets: [{
            label: 'Modell 1',
            data: [20000, 15000, 23000, 10000, 5000, 14000],
            backgroundColor: 'rgba(54, 162, 235, 0.2)',
            borderColor: 'rgba(54, 162, 235, 1)',
            borderWidth: 1
        },
        {
            label: 'Modell2',
            data: [1000, 2000, 5000, 1000, 6000, 3000],
            backgroundColor: 'rgba(255, 99, 132, 0.2)',
            borderColor: 'rgba(255,99,132,1)',
            borderWidth: 1
        },
        {
            label: 'Modell3',
            data: [0, 0, 0, 0, 0, 0],
            backgroundColor: 'rgba(255, 206, 86, 0.2)',
            borderColor: 'rgba(255, 206, 86, 1)',
            borderWidth: 1
        }]
    },
    options: {
    	title: {
            display: true,
            text: 'Modellabsatz je Runde'
        },
    	scales: {
            yAxes: [{
                ticks: {
                    beginAtZero:true
                }
            }]
        },
        maintainAspectRatio: false
    }
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

// Timerfunktion
function startTimer(duration, display) {
    var timer = duration, minutes, seconds;
    setInterval(function () {
        minutes = parseInt(timer / 60, 10)
        seconds = parseInt(timer % 60, 10);

        minutes = minutes < 10 ? "0" + minutes : minutes;
        seconds = seconds < 10 ? "0" + seconds : seconds;

        display.textContent = minutes + ":" + seconds;

        if (--timer < 0) {
            timer = duration;
        }
    }, 1000);
}

// Start des Timers
window.onload = function () {
    var starttime = 10;// Countdown-Zeit in Minuten
    var display = document.querySelector('#countdown');
    startTimer((starttime*60), display);
};


// Auswahl des zu Nutzenden Gehäuse, Armband, Uhrwerk
function usedItem(input, item){
	
	itemOne = document.getElementsByClassName(input)[0].children[0];
	itemTwo = document.getElementsByClassName(input)[0].children[1];
	itemThree = document.getElementsByClassName(input)[0].children[2];
	
	switch(item) {
	    case 1:
	    	if(itemOne.classList.contains("notAvailable")) return false;
	        if(!itemOne.classList.contains("selected"))itemOne.classList.add("selected");
	        if(itemTwo.classList.contains("selected"))itemTwo.classList.remove("selected");
	        if(itemThree.classList.contains("selected"))itemThree.classList.remove("selected");
	        break;
	    case 2:
	    	if(itemTwo.classList.contains("notAvailable")) return false;
	        if(!itemTwo.classList.contains("selected"))itemTwo.classList.add("selected");
	        if(itemOne.classList.contains("selected"))itemOne.classList.remove("selected");
	        if(itemThree.classList.contains("selected"))itemThree.classList.remove("selected");
	        break;
	    case 3:
	    	if(itemThree.classList.contains("notAvailable")) return false;
	        if(!itemThree.classList.contains("selected"))itemThree.classList.add("selected");
	        if(itemOne.classList.contains("selected"))itemOne.classList.remove("selected");
	        if(itemTwo.classList.contains("selected"))itemTwo.classList.remove("selected");
	        break;
	}
	document.getElementById(input).value = item;
}

// Freischalten einer weiteren Uhr
function researchModel(card,input){
	if(document.getElementById(input).value == ""){
		alert("Eine weiter Uhr steht in der nächsten Runde zur Verfügung");
		document.getElementById(input).value = 1;
	}else{
		alert("Die Uhr wird nicht erforscht");
		document.getElementById(input).value = "";
	}
}
