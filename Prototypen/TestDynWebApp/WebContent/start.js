function playerPic(val){
	if(document.getElementById(val).getAttribute("src") != "images/player.png"){
		document.getElementById(val).setAttribute("src", "images/player.png")
	}else{
		document.getElementById(val).setAttribute("src", "images/playersw.png")
	}
	
}