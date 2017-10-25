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
	Spielbrett spiel = new Spielbrett(10);
	Unternehmen[] spieler;
	// Markt markt = new Markt;
	
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
				
				setClockClass(request, response);
				
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
				
				setClockClass(request, response);
				
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
				
				setClockClass(request, response);
				
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

						
						// setzen der getätigten Auswahl für F&E
						
						// setzen der getätigten Auswahl für Produktion
						
						// setzen der getätigten Auswahl für Einkauf
						
						// setzen der getätigten Auswahl für Vertrieb
						
						// setzen der getätigten Auswahl für Marketing
						
						//spieler[spiel.getAktuellerSpieler()].
						
						dispatcher.forward(request, response);
					}
					System.out.println("Start neuer Runde.");
					
				}
				
	}// doPost
	
	protected void setClockClass(HttpServletRequest request, HttpServletResponse response){
		
		int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
		
		for(int i = 0; i < anzahlUhren; i++){		
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke
			if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
				String[] item = {"c","b","cw"};
				for(int j = 0; j <=2; j++){
					for(int k = 0; k <= 2; k++){
						if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrBillig()[j][k]  == false)
							request.setAttribute("clM"+i+item[j]+k, "notAvailable");
						if(spieler[spiel.getAktuellerSpieler()].getUhr()[i].getGehaeuse() == k)							
							request.setAttribute("clM"+i+item[j]+k, "selected");
						
					}
				}
			}
		}
	}
	
}
