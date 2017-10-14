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
				
				spieler[spiel.getAktuellerSpieler()].erforscheUhr("Oeko");
				System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Öko gewählt");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m1s", "Umwelt");
				
				// setzen der Bezeichnungen der Gehäuse
				request.setAttribute("m1c1", Info.getGehaeuseOeko()[0]);
				request.setAttribute("m1c2", Info.getGehaeuseOeko()[1]);
				request.setAttribute("m1c3", Info.getGehaeuseOeko()[2]);
				
				// setzen der Bezeichnungen der Armbänder
				request.setAttribute("m1b1", Info.getArmbandOeko()[0]);
				request.setAttribute("m1b2", Info.getArmbandOeko()[1]);
				request.setAttribute("m1b3", Info.getArmbandOeko()[2]);
				
				// setzen der Bezeichnungen der Uhrwerke
				request.setAttribute("m1cw1", Info.getUhrwerkOeko()[0]);
				request.setAttribute("m1cw2", Info.getUhrwerkOeko()[1]);
				request.setAttribute("m1cw3", Info.getUhrwerkOeko()[2]);
				
				dispatcher.forward(request, response);
			}
			
			// Wahl der Luxussparte
			if (request.getParameter("selectluxus") != null) {
				
				spieler[spiel.getAktuellerSpieler()].erforscheUhr("Premium");
				System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Luxus gewählt");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m1s", "Luxus");
				
				// setzen der Bezeichnungen der Gehäuse
				request.setAttribute("m1c1", Info.getGehaeusePremium()[0]);
				request.setAttribute("m1c2", Info.getGehaeusePremium()[1]);
				request.setAttribute("m1c3", Info.getGehaeusePremium()[2]);
				
				// setzen der Bezeichnungen der Armbänder
				request.setAttribute("m1b1", Info.getArmbandPremium()[0]);
				request.setAttribute("m1b2", Info.getArmbandPremium()[1]);
				request.setAttribute("m1b3", Info.getArmbandPremium()[2]);
				
				// setzen der Bezeichnungen der Uhrwerke
				request.setAttribute("m1cw1", Info.getUhrwerkPremium()[0]);
				request.setAttribute("m1cw2", Info.getUhrwerkPremium()[1]);
				request.setAttribute("m1cw3", Info.getUhrwerkPremium()[2]);
				
				dispatcher.forward(request, response);
			}
						
			// Wahl der Billigsparte
			if (request.getParameter("selectbillig") != null) {
				
				spieler[spiel.getAktuellerSpieler()].erforscheUhr("Billig");
				System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Billig gewählt");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m1s", "Billig");
				
				// setzen der Bezeichnungen der Gehäuse
				request.setAttribute("m1c1", Info.getGehaeuseBillig()[0]);
				request.setAttribute("m1c2", Info.getGehaeuseBillig()[1]);
				request.setAttribute("m1c3", Info.getGehaeuseBillig()[2]);
				
				// setzen der Bezeichnungen der Armbänder
				request.setAttribute("m1b1", Info.getArmbandBillig()[0]);
				request.setAttribute("m1b2", Info.getArmbandBillig()[1]);
				request.setAttribute("m1b3", Info.getArmbandBillig()[2]);
				
				// setzen der Bezeichnungen der Uhrwerke
				request.setAttribute("m1cw1", Info.getUhrwerkOeko()[0]);
				request.setAttribute("m1cw2", Info.getUhrwerkOeko()[1]);
				request.setAttribute("m1cw3", Info.getUhrwerkOeko()[2]);
				
				dispatcher.forward(request, response);
			}
        
		// Beenden der aktuellen Runde des Spielers
		if (request.getParameter("nextRound") != null) {
			
			int anzeigeRunde;
			int anzeigeSpieler; 
			
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
						request.setAttribute("pic", spiel.getAktuellerSpieler());
						request.setAttribute("kapital", spieler[spiel.getAktuellerSpieler()].getKapital());
						dispatcher.forward(request, response);
					}
					System.out.println("Start neuer Runde.");
					
				}
	}

}
