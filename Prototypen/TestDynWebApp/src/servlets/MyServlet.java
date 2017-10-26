package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import func.Spielbrett;
import func.Unternehmen;
import func.Info;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/servlet")
public class MyServlet extends HttpServlet {
	
	/**
	 * Initiierung der für das Spiel benötigten Instanzen
	 */
	Spielbrett spiel = new Spielbrett(10, 100000, 0.2);
	Unternehmen[] spieler;
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Start des Spiels mit der ausgewählten Anzahl an Spielern
		if (request.getParameter("startbtn") != null) {
			
			// Ermitteln der Spieleranzahl
			int spielerAnz = Integer.parseInt(request.getParameter("spielerAnzahl"));
			
			// Erzeugen der Unternehmen/Spieler
			spiel.erstelleSpieler(spielerAnz);
			spieler = spiel.getSpieler();

			for(int i = 0; i < spieler.length; i++) {
				System.out.println(spieler[i].toString());
			}
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/segment.jsp");
			dispatcher.forward(request, response);
			
		}
		
		// Auswahl der Sparte zu Spielbeginn
		
			// Wahl der Ökosparte
			if (request.getParameter("selectoeko") != null) {

				spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Oeko");
				spieler[spiel.getAktuellerSpieler()].erforscheUhr("Oeko");
				System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Öko gewählt");
				System.out.println(spieler[spiel.getAktuellerSpieler()].toString());
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m0s", "Umwelt");
				
				// setzen der Bezeichnungen der Gehäuse
				request.setAttribute("m0c1", Info.getGehaeuseOeko()[0]);
				request.setAttribute("m0c2", Info.getGehaeuseOeko()[1]);
				request.setAttribute("m0c3", Info.getGehaeuseOeko()[2]);
				
				// setzen der Bezeichnungen der Armbänder
				request.setAttribute("m0b1", Info.getArmbandOeko()[0]);
				request.setAttribute("m0b2", Info.getArmbandOeko()[1]);
				request.setAttribute("m0b3", Info.getArmbandOeko()[2]);
				
				// setzen der Bezeichnungen der Uhrwerke
				request.setAttribute("m0cw1", Info.getUhrwerkOeko()[0]);
				request.setAttribute("m0cw2", Info.getUhrwerkOeko()[1]);
				request.setAttribute("m0cw3", Info.getUhrwerkOeko()[2]);
				
				setValuesOnUI(request, response);
				
				dispatcher.forward(request, response);
			}
			
			// Wahl der Luxussparte
			if (request.getParameter("selectluxus") != null) {
				
				spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Premium");
				spieler[spiel.getAktuellerSpieler()].erforscheUhr("Premium");
				System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Luxus gewählt");
				System.out.println(spieler[spiel.getAktuellerSpieler()].toString());
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m0s", "Luxus");
				
				// setzen der Bezeichnungen der Gehäuse
				request.setAttribute("m0c1", Info.getGehaeusePremium()[0]);
				request.setAttribute("m0c2", Info.getGehaeusePremium()[1]);
				request.setAttribute("m0c3", Info.getGehaeusePremium()[2]);
				
				// setzen der Bezeichnungen der Armbänder
				request.setAttribute("m0b1", Info.getArmbandPremium()[0]);
				request.setAttribute("m0b2", Info.getArmbandPremium()[1]);
				request.setAttribute("m0b3", Info.getArmbandPremium()[2]);
				
				// setzen der Bezeichnungen der Uhrwerke
				request.setAttribute("m0cw1", Info.getUhrwerkPremium()[0]);
				request.setAttribute("m0cw2", Info.getUhrwerkPremium()[1]);
				request.setAttribute("m0cw3", Info.getUhrwerkPremium()[2]);
				
				setValuesOnUI(request, response);
				
				dispatcher.forward(request, response);
			}
						
			// Wahl der Billigsparte
			if (request.getParameter("selectbillig") != null) {
				
				spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Billig");
				spieler[spiel.getAktuellerSpieler()].erforscheUhr("Billig");
				System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Billig gewählt");
				System.out.println(spieler[spiel.getAktuellerSpieler()].toString());
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m0s", "Billig");
				
				// setzen der Bezeichnungen der Gehäuse
				request.setAttribute("m0c1", Info.getGehaeuseBillig()[0]);
				request.setAttribute("m0c2", Info.getGehaeuseBillig()[1]);
				request.setAttribute("m0c3", Info.getGehaeuseBillig()[2]);
				
				// setzen der Bezeichnungen der Armbänder
				request.setAttribute("m0b1", Info.getArmbandBillig()[0]);
				request.setAttribute("m0b2", Info.getArmbandBillig()[1]);
				request.setAttribute("m0b3", Info.getArmbandBillig()[2]);
				
				// setzen der Bezeichnungen der Uhrwerke
				request.setAttribute("m0cw1", Info.getUhrwerkOeko()[0]);
				request.setAttribute("m0cw2", Info.getUhrwerkOeko()[1]);
				request.setAttribute("m0cw3", Info.getUhrwerkOeko()[2]);
				
				setValuesOnUI(request, response);
				
				dispatcher.forward(request, response);
			}
        
		// Beenden der aktuellen Runde des Spielers
		if (request.getParameter("nextRound") != null) {
			
			int anzeigeRunde;
			int anzeigeSpieler; 
			
			// Übergabe der Formularwerte aus dem UI an den Spieler
			// Testausgabe
			System.out.println(request.getParameter("usedCase1"));
			System.out.println(request.getParameter("usedBracelet1"));
			System.out.println(request.getParameter("usedClockWork1"));
			
			// Ender der Datenübergabe
			
			
			System.out.println("Runde " + spiel.getRundenAktuell() + " von Spieler" + spiel.getAktuellerSpieler() + "beendet.");
			
			// Auswahl des nächsten Spielers, wenn aktueller Spieler nicht der letzte ist
			if(spiel.getAktuellerSpieler() != (spieler.length-1)){
				
				spiel.naechsterSpieler();

				RequestDispatcher dispatcher = request.getRequestDispatcher("/next.jsp");
				request.setAttribute("round", spiel.getRundenAktuell());
				request.setAttribute("picNext", spiel.getAktuellerSpieler());
				dispatcher.forward(request, response);
				
				System.out.println("Auswahl des nächsten Spielers.");
			}
			
			// Start der nächsten Runde, wenn die aktuelle Runde nicht die letzte ist
			else if((spiel.getRundenAktuell()+1) != spiel.getRundenMax()){
				
				spiel.naechsteRunde();
				spiel.naechsterSpieler();
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/next.jsp");
				request.setAttribute("round", spiel.getRundenAktuell());
				request.setAttribute("picNext", spiel.getAktuellerSpieler());
				dispatcher.forward(request, response);
				
				System.out.println("Auswahl des nächsten Spielers und Start einer neuen Runde.");
			}
			
			// Beenden des Spiels, da der letzte Spieler der letzen Runde seine Runde beendete.
			else{
				RequestDispatcher dispatcher = request.getRequestDispatcher("/statistik.jsp");
				dispatcher.forward(request, response);
				System.out.println("Beendigung der letzten Spielrunde.");
			}
		}
		
		// Start der nächsten Runde des angezeigten Spielers
				if (request.getParameter("nextPlayer") != null) {
					
					// Auswahl des ersten Segmentes, sofern der Spieler in seiner ersten Runde ist.
					if(spiel.getRundenAktuell() == 0){
						RequestDispatcher dispatcher = request.getRequestDispatcher("/segment.jsp");
						dispatcher.forward(request, response);
					}
					
					// Der neue Spieler wird zu seinem Spielinterface weitergeleitet
					else{
						RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
						
						// setzen des Spielerbildes sowie des aktuellen Kapitals
						request.setAttribute("pic", spiel.getAktuellerSpieler());
						request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
						
						// setzen der getätigten Auswahl der Produkte
								
						int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
					
						for(int i=0; i<anzahlUhren; i++){
							if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
								
								String segment = spieler[spiel.getAktuellerSpieler()].getUhr()[i].getSegment();
								switch(segment) {
									case "Billig":
										// setzen der Produktlinienbezeichnung
										request.setAttribute("m"+i+"s", "Billig");
										
										// setzen der Bezeichnungen der Gehäuse
										request.setAttribute("m"+i+"c1", Info.getGehaeuseBillig()[0]);
										request.setAttribute("m"+i+"c2", Info.getGehaeuseBillig()[1]);
										request.setAttribute("m"+i+"c3", Info.getGehaeuseBillig()[2]);
										
										// setzen der Bezeichnungen der Armbänder
										request.setAttribute("m"+i+"b1", Info.getArmbandBillig()[0]);
										request.setAttribute("m"+i+"b2", Info.getArmbandBillig()[1]);
										request.setAttribute("m"+i+"b3", Info.getArmbandBillig()[2]);
										
										// setzen der Bezeichnungen der Uhrwerke
										request.setAttribute("m"+i+"cw1", Info.getUhrwerkOeko()[0]);
										request.setAttribute("m"+i+"cw2", Info.getUhrwerkOeko()[1]);
										request.setAttribute("m"+i+"cw3", Info.getUhrwerkOeko()[2]);
										break;
									case "Oeko":
										// setzen der Produktlinienbezeichnung
										request.setAttribute("m"+i+"s", "Umwelt");
										
										// setzen der Bezeichnungen der Gehäuse
										request.setAttribute("m"+i+"c1", Info.getGehaeuseOeko()[0]);
										request.setAttribute("m"+i+"c2", Info.getGehaeuseOeko()[1]);
										request.setAttribute("m"+i+"c3", Info.getGehaeuseOeko()[2]);
										
										// setzen der Bezeichnungen der Armbänder
										request.setAttribute("m"+i+"b1", Info.getArmbandOeko()[0]);
										request.setAttribute("m"+i+"b2", Info.getArmbandOeko()[1]);
										request.setAttribute("m"+i+"b3", Info.getArmbandOeko()[2]);
										
										// setzen der Bezeichnungen der Uhrwerke
										request.setAttribute("m"+i+"cw1", Info.getUhrwerkOeko()[0]);
										request.setAttribute("m"+i+"cw2", Info.getUhrwerkOeko()[1]);
										request.setAttribute("m"+i+"cw3", Info.getUhrwerkOeko()[2]);
										break;
									case "Premium":
										// setzen der Produktlinienbezeichnung
										request.setAttribute("m"+i+"s", "Luxus");
										
										// setzen der Bezeichnungen der Gehäuse
										request.setAttribute("m"+i+"c1", Info.getGehaeusePremium()[0]);
										request.setAttribute("m"+i+"c2", Info.getGehaeusePremium()[1]);
										request.setAttribute("m"+i+"c3", Info.getGehaeusePremium()[2]);
										
										// setzen der Bezeichnungen der Armbänder
										request.setAttribute("m"+i+"b1", Info.getArmbandPremium()[0]);
										request.setAttribute("m"+i+"b2", Info.getArmbandPremium()[1]);
										request.setAttribute("m"+i+"b3", Info.getArmbandPremium()[2]);
										
										// setzen der Bezeichnungen der Uhrwerke
										request.setAttribute("m"+i+"cw1", Info.getUhrwerkPremium()[0]);
										request.setAttribute("m"+i+"cw2", Info.getUhrwerkPremium()[1]);
										request.setAttribute("m"+i+"cw3", Info.getUhrwerkPremium()[2]);
										break;
								}
							}
						}
						
						setValuesOnUI(request, response);
						
						
						
						//spieler[spiel.getAktuellerSpieler()].
						
						dispatcher.forward(request, response);
					}
					System.out.println("Start neuer Runde.");
					
				}
				
	}// doPost
	
	private void setValuesOnUI(HttpServletRequest request, HttpServletResponse response){
		setClockClass(request, response);
		
		
		// setzen der getätigten Auswahl für F&E						
		setFEOptions(request, response);
		
		// setzen der getätigten Auswahl für Produktion
		setProductionOptions(request, response);
		
		// setzen der getätigten Auswahl für Einkauf
		setPurchasingOptions(request, response);
		// setzen der getätigten Auswahl für Vertrieb
		
		// setzen der getätigten Auswahl für Marketing
	}
	
	private void setClockClass(HttpServletRequest request, HttpServletResponse response){
		
		int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
		
		for(int i = 0; i < anzahlUhren; i++){
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke
			if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
				request.setAttribute("watch"+i, "card-aktive");
				String[] item = {"c","b","cw"};
				for(int j = 0; j <=2; j++){
					
					if(spieler[spiel.getAktuellerSpieler()].getUhr()[i].getGehaeuse() == j)							
						request.setAttribute("clM"+i+"c"+j, "selected");
					if(spieler[spiel.getAktuellerSpieler()].getUhr()[i].getUhrwerk() == j)							
						request.setAttribute("clM"+i+"cw"+j, "selected");
					if(spieler[spiel.getAktuellerSpieler()].getUhr()[i].getArmband() == j)							
						request.setAttribute("clM"+i+"b"+j, "selected");
					
					for(int k = 0; k <= 2; k++){
						String segment = spieler[spiel.getAktuellerSpieler()].getUhr()[i].getSegment();
						
						switch(segment){
						case "Billig":
							if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrBillig()[j][k] == false)
								request.setAttribute("clM"+i+item[j]+k, "notAvailable");
							break;
						case "Oeko":
							if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrOeko()[j][k] == false)
								request.setAttribute("clM"+i+item[j]+k, "notAvailable");
							break;
						case "Premium":
							if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrPremium()[j][k] == false)
								request.setAttribute("clM"+i+item[j]+k, "notAvailable");
							break;
						}
									
					}
				}
			}else request.setAttribute("watch"+i, "card-inaktive");
		}
	}
	
	private void setFEOptions(HttpServletRequest request, HttpServletResponse response){
			
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke des Segmentes Billig
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[0] == true){
				request.setAttribute("researchB", "card-aktive");
				String[] item = {"c","b","cw"};
				for(int j = 0; j <=2; j++){
					for(int k = 0; k <= 2; k++){						
						if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrBillig()[j][k] == true)
							request.setAttribute("clB"+item[j]+k, "done");
						if(k== 2 && spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrBillig()[j][1] == false)
							request.setAttribute("addB"+item[j]+k, "notAvailable");
					}
				}
			}else request.setAttribute("researchB", "card-inaktive");
			
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke des Segmentes Oeko
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[1] == true){
				request.setAttribute("researchO", "card-aktive");
				String[] item = {"c","b","cw"};
				for(int j = 0; j <=2; j++){
					for(int k = 0; k <= 2; k++){						
						if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrOeko()[j][k] == true)
							request.setAttribute("clO"+item[j]+k, "done");
						if(k== 2 && spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrOeko()[j][1] == false)
							request.setAttribute("addO"+item[j]+k, "notAvailable");
					}
				}
			}else request.setAttribute("researchO", "card-inaktive");
			
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke des Segmentes Luxus
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[2] == true){
				request.setAttribute("researchL", "card-aktive");
				String[] item = {"c","b","cw"};
				for(int j = 0; j <=2; j++){
					for(int k = 0; k <= 2; k++){						
						if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrPremium()[j][k] == true)
							request.setAttribute("clL"+item[j]+k, "done");
						if(k== 2 && spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrPremium()[j][1] == false)
							request.setAttribute("addL"+item[j]+k, "notAvailable");
					}
				}
			}else request.setAttribute("researchL", "card-inaktive");
	}
	
	// setzen der möglichen und freigeschaltenen Produktionserweiterungen
	private void setProductionOptions(HttpServletRequest request, HttpServletResponse response){

		for(int i = 0; i < 3; i++){		

			String[] seg = {"B","O","L"};
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[i] == true){
				request.setAttribute("production"+seg[i], "card-aktive");
					for(int k = 0; k <= 2; k++){
						switch(i){
							case 0:
								if(spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStraßeBillig()[k] == true)
									request.setAttribute("prdBcr"+k, "done");
								if(k >0  && spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStraßeBillig()[k-1] == false)
									request.setAttribute("addPrBcr"+k, "notAvailable");
								
								if(spieler[spiel.getAktuellerSpieler()].getKapaErwStraßeBillig()[k] == true)
									request.setAttribute("prdBce"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getKapaErwStraßeBillig()[k-1] == false)
									request.setAttribute("addPrBce"+k, "notAvailable");
							break;
							
							case 1:
								if(spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStraßeOeko()[k] == true)
									request.setAttribute("prdOcr"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStraßeOeko()[k-1] == false)
									request.setAttribute("addPr"+seg[i]+"cr"+k, "notAvailable");
								
								if(spieler[spiel.getAktuellerSpieler()].getKapaErwStraßeOeko()[k] == true)
									request.setAttribute("prdOce"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getKapaErwStraßeOeko()[k-1] == false)
									request.setAttribute("addPrOce"+k, "notAvailable");
							break;
							
							case 2:
								if(spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStraßePremium()[k] == true)
									request.setAttribute("prdLcr"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStraßePremium()[k-1] == false)
									request.setAttribute("addPrLcr"+k, "notAvailable");
								
								if(spieler[spiel.getAktuellerSpieler()].getKapaErwStraßePremium()[k] == true)
									request.setAttribute("prdLce"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getKapaErwStraßePremium()[k-1] == false)
									request.setAttribute("addPrLce"+k, "notAvailable");
							break;
						}
					}
			}
			else request.setAttribute("production"+seg[i], "card-inaktive");
		}
	}
	
	// setzen der möglichen und freigeschaltenen Produktionserweiterungen
	private void setPurchasingOptions(HttpServletRequest request, HttpServletResponse response){

		for(int i = 0; i < 3; i++){		

			String[] seg = {"B","O","L"};
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[i] == true){
				request.setAttribute("purchasing"+seg[i], "card-aktive");
					for(int k = 0; k <= 2; k++){
						switch(i){
							case 0:
								if(spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufBillig()[k] == true)
									request.setAttribute("purB"+k, "done");
								if(k >0  && spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufBillig()[k-1] == false)
									request.setAttribute("addPurB"+k, "notAvailable");
								
							break;
							
							case 1:
								if(spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufOeko()[k] == true)
									request.setAttribute("purO"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufOeko()[k-1] == false)
									request.setAttribute("addPurO"+seg[i]+"cr"+k, "notAvailable");
								
							break;
							
							case 2:
								if(spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufPremium()[k] == true)
									request.setAttribute("purL"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufPremium()[k-1] == false)
									request.setAttribute("addPurL"+k, "notAvailable");
								
							break;
						}
					}
			}
			else request.setAttribute("purchasing"+seg[i], "card-inaktive");
		}
	}
	
}
