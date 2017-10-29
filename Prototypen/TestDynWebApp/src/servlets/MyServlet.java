package servlets;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;

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
	
	DecimalFormat df = (DecimalFormat)DecimalFormat.getInstance(Locale.GERMAN); //deutsche Zahlenformatierung DecimalFormat
	DecimalFormat sf = (DecimalFormat)DecimalFormat.getInstance(Locale.GERMAN); //deutsche Zahlenformatierung shortFormat
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
        df.applyPattern( "#,###,##0.00" );//Zahlenformatierung mit 1000er Trennzeichen und zwei Nachkommastellen
        sf.applyPattern( "#,###,##0" );//Zahlenformatierung mit 1000er Trennzeichen und zwei Nachkommastellen
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Start des Spiels mit der ausgewählten Anzahl an Spielern
		if (request.getParameter("startbtn") != null) {
						
			int spielerAnz = Integer.parseInt(request.getParameter("spielerAnzahl")); // Ermitteln der Spieleranzahl			
			spiel.erstelleSpieler(spielerAnz); // Erzeugen der Spieler
			spieler = spiel.getSpieler(); 	// Zugriff auf Spielerobjekte über Variable ermöglichen

			for(int i = 0; i < spieler.length; i++) System.out.println(spieler[i].toString()); // Ausgabe der Spieler in Konsole
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/segment.jsp");
			dispatcher.forward(request, response); // aufruf der segmentauswahl für den ersten Spieler		
		}
		
		
		// Auswahl der Sparte zu Spielbeginn
		
			// Wahl der Ökosparte
			if (request.getParameter("selectoeko") != null) {
				
				if(spieler[spiel.getAktuellerSpieler()].getUhr()[0] == null){
					spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Oeko");
					spieler[spiel.getAktuellerSpieler()].erforscheUhr("Oeko");
					System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Öko gewählt");
					System.out.println(spieler[spiel.getAktuellerSpieler()].toString());
				}else System.out.println("Die Seite wurde neu geladen. Doppelterforschung verhindert!");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				String kapital = df.format( spieler[spiel.getAktuellerSpieler()].getKapital());
				request.setAttribute("kapital", kapital);
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m0s", "Umwelt");
				
				for(int i = 0; i < 3; i++){
					request.setAttribute("m0c"+i, Info.getGehaeuseOeko()[i]); // setzen der Bezeichnungen der Gehäuse
					request.setAttribute("m0b"+i, Info.getArmbandOeko()[i]); // setzen der Bezeichnungen der Armbänder
					request.setAttribute("m0cw"+i, Info.getUhrwerkOeko()[i]); // setzen der Bezeichnungen der Uhrwerke
				}
				
				setValuesOnUI(request, response);
				
				dispatcher.forward(request, response);
			}
			
			// Wahl der Luxussparte
			if (request.getParameter("selectluxus") != null) {
				
				if(spieler[spiel.getAktuellerSpieler()].getUhr()[0] == null){
					spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Premium");
					spieler[spiel.getAktuellerSpieler()].erforscheUhr("Premium");
					System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Luxus gewählt");
					System.out.println(spieler[spiel.getAktuellerSpieler()].toString());
				}else System.out.println("Die Seite wurde neu geladen. Doppelterforschung verhindert!");
			
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				String kapital = df.format( spieler[spiel.getAktuellerSpieler()].getKapital());
				request.setAttribute("kapital", kapital);
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m0s", "Luxus");
				
				for(int i = 0; i < 3; i++){
					request.setAttribute("m0c"+i, Info.getGehaeusePremium()[i]); // setzen der Bezeichnungen der Gehäuse
					request.setAttribute("m0b"+i, Info.getArmbandPremium()[i]); // setzen der Bezeichnungen der Armbänder
					request.setAttribute("m0cw"+i, Info.getUhrwerkPremium()[i]); // setzen der Bezeichnungen der Uhrwerke
				}
				
				setValuesOnUI(request, response);
				
				dispatcher.forward(request, response);
			}
						
			// Wahl der Billigsparte
			if (request.getParameter("selectbillig") != null) {
				
				if(spieler[spiel.getAktuellerSpieler()].getUhr()[0] == null){
					spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Billig");
					spieler[spiel.getAktuellerSpieler()].erforscheUhr("Billig");
					System.out.println("Spieler: " + spiel.getAktuellerSpieler() + " hat das Segment Billig gewählt");
					System.out.println(spieler[spiel.getAktuellerSpieler()].toString());
				}else System.out.println("Die Seite wurde neu geladen. Doppelterforschung verhindert!");
				
				RequestDispatcher dispatcher = request.getRequestDispatcher("/game.jsp");
				
				// setzen des Spielerbildes sowie des aktuellen Kapitals
				request.setAttribute("pic", spiel.getAktuellerSpieler());
				String kapital = df.format( spieler[spiel.getAktuellerSpieler()].getKapital());
				request.setAttribute("kapital", kapital);
				
				// setzen der Produktlinienbezeichnung
				request.setAttribute("m0s", "Billig");
				
				for(int i = 0; i < 3; i++){
					request.setAttribute("m0c"+i, Info.getGehaeuseBillig()[i]); // setzen der Bezeichnungen der Gehäuse
					request.setAttribute("m0b"+i, Info.getArmbandBillig()[i]); // setzen der Bezeichnungen der Armbänder
					request.setAttribute("m0cw"+i, Info.getUhrwerkOeko()[i]); // setzen der Bezeichnungen der Uhrwerke
				}
				
				setValuesOnUI(request, response);
				
				dispatcher.forward(request, response);
			}
        
		// Beenden der aktuellen Runde des Spielers
		if (request.getParameter("nextRound") != null) {
			
			int anzeigeRunde;
			int anzeigeSpieler; 
			int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
			
			// Übergabe der Formularwerte aus dem UI an den Spieler
			// Testausgabe
			System.out.println(request.getParameter("usedCase0"));
			System.out.println(request.getParameter("usedBracelet0"));
			System.out.println(request.getParameter("usedClockWork0"));
			
			// Bestandteile der Uhren festlegen
			for(int i = 0; i < anzahlUhren; i++){
				// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke
				if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
					spieler[spiel.getAktuellerSpieler()].setSpielerDaten(
							i,
							Integer.parseInt(request.getParameter("usedCase"+i)),
							Integer.parseInt(request.getParameter("usedBracelet"+i)),
							Integer.parseInt(request.getParameter("usedClockWork"+i))
					);
				}
			}
			
			// Erforschung neuer Uhren
			if(!request.getParameter("researchModel1").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheUhr(request.getParameter("researchModel1"));
			if(!request.getParameter("researchModel2").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheUhr(request.getParameter("researchModel2"));
			
			// Erforschung neuer Uhrenbestandteile
			if(!request.getParameter("researchCaseOeko").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheGehaeuse("Oeko");
			if(!request.getParameter("researchBraceletOeko").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheArmband("Oeko");
			if(!request.getParameter("researchClockWorkOeko").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheUhrwerk("Oeko");
			
			if(!request.getParameter("researchCaseLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheGehaeuse("Premium");
			if(!request.getParameter("researchBraceletLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheArmband("Premium");
			if(!request.getParameter("researchClockWorkLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheUhrwerk("Premium");
			
			if(!request.getParameter("researchCaseBillig").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheGehaeuse("Billig");
			if(!request.getParameter("researchBraceletBillig").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheArmband("Billig");
			if(!request.getParameter("researchClockWorkBillig").equals("")) spieler[spiel.getAktuellerSpieler()].erforscheUhrwerk("Billig");
			
			// Erforschung neues Segment
			if(!request.getParameter("researchSegmentOeko").equals("")) spieler[spiel.getAktuellerSpieler()].freischaltenSegment("Oeko");
			if(!request.getParameter("researchSegmentLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].freischaltenSegment ("Premium");
			if(!request.getParameter("researchSegmentBillig").equals("")) spieler[spiel.getAktuellerSpieler()].freischaltenSegment ("Billig");
			
			// Erforschung von Produktionsoptimierungen		
			if(!request.getParameter("costReductionOeko").equals("")) spieler[spiel.getAktuellerSpieler()].senkeProdKosten("Oeko");
			if(!request.getParameter("expansionOeko").equals("")) spieler[spiel.getAktuellerSpieler()].erweitereProduktion("Oeko");
				
			if(!request.getParameter("costReductionLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].senkeProdKosten("Premium");
			if(!request.getParameter("expansionLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].erweitereProduktion("Premium");
				
			if(!request.getParameter("costReductionBillig").equals("")) spieler[spiel.getAktuellerSpieler()].senkeProdKosten("Billig");
			if(!request.getParameter("expansionBillig").equals("")) spieler[spiel.getAktuellerSpieler()].erweitereProduktion("Billig");
			
			
			// Produzieren von Uhren			
			if(!request.getParameter("output0").equals("")) spieler[spiel.getAktuellerSpieler()].produzieren(Integer.parseInt(request.getParameter("output0")), 0);
			if(!request.getParameter("output1").equals("")) spieler[spiel.getAktuellerSpieler()].produzieren(Integer.parseInt(request.getParameter("output1")), 1);
			if(!request.getParameter("output2").equals("")) spieler[spiel.getAktuellerSpieler()].produzieren(Integer.parseInt(request.getParameter("output2")), 2);
			
			//Optimierung der Einkaufskosten		
			if(!request.getParameter("purchasingOeko").equals("")) spieler[spiel.getAktuellerSpieler()].erweitereEinkauf("Oeko");
			if(!request.getParameter("purchasingLuxus").equals("")) spieler[spiel.getAktuellerSpieler()].erweitereEinkauf("Premium");
			if(!request.getParameter("purchasingBillig").equals("")) spieler[spiel.getAktuellerSpieler()].erweitereEinkauf("Billig");
			
			//Anbieten der Uhren zum Verkauf		
			if(!request.getParameter("offerPrice0").equals("") && !request.getParameter("quantitySupplied0").equals("")){
				spieler[spiel.getAktuellerSpieler()].bieteUhren(
						Integer.parseInt(request.getParameter("quantitySupplied0")),
						0,
						Double.parseDouble(request.getParameter("offerPrice0")));
			}
			
			if(!request.getParameter("offerPrice1").equals("") && !request.getParameter("quantitySupplied1").equals("")){
				spieler[spiel.getAktuellerSpieler()].bieteUhren(
						Integer.parseInt(request.getParameter("quantitySupplied1")),
						1,
						Double.parseDouble(request.getParameter("offerPrice1")));
			}
			
			if(!request.getParameter("offerPrice2").equals("") && !request.getParameter("quantitySupplied2").equals("")){
				spieler[spiel.getAktuellerSpieler()].bieteUhren(
						Integer.parseInt(request.getParameter("quantitySupplied2")),
						2,
						Double.parseDouble(request.getParameter("offerPrice2")));
			}
			
			//Start der MarketingKampagnen des gesamten Unternehmens
			/*
			if(!request.getParameter("marketingCompany0").equals(""))
			if(!request.getParameter("marketingCompany1").equals(""))
			if(!request.getParameter("marketingCompany2").equals(""))
			*/
			//Start der MarketingKampagnen der Uhren
			
			int[] anzahlMarketingUhr = {0,0,0};
			
			for(int i = 0; i < 3; i++){
				if(!request.getParameter("marketing0Clock"+i).equals("")) anzahlMarketingUhr[i]++;
				if(!request.getParameter("marketing1Clock"+i).equals("")) anzahlMarketingUhr[i]++;
				if(!request.getParameter("marketing2Clock"+i).equals("")) anzahlMarketingUhr[i]++;
				if(anzahlMarketingUhr[i] > 0) spieler[spiel.getAktuellerSpieler()].uhrenMarketing(i, anzahlMarketingUhr[i]);
			}
			//-- Ender der Datenübergabe
			
			
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
		}//nextRound
		
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
						String kapital = df.format( spieler[spiel.getAktuellerSpieler()].getKapital());
						request.setAttribute("kapital", kapital);
						
						// setzen der getätigten Auswahl der Produkte
								
						int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
					
						for(int i=0; i < anzahlUhren; i++){
							if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
								
								String segment = spieler[spiel.getAktuellerSpieler()].getUhr()[i].getSegment();
								switch(segment) {
									case "Billig":
										// setzen der Produktlinienbezeichnung
										request.setAttribute("m"+i+"s", "Billig");
										
										for(int j = 0; j < 3; j++){
											request.setAttribute("m"+i+"c"+j, Info.getGehaeuseBillig()[j]); // setzen der Bezeichnungen der Gehäuse
											request.setAttribute("m"+i+"b"+j, Info.getArmbandBillig()[j]); // setzen der Bezeichnungen der Armbänder
											request.setAttribute("m"+i+"cw"+j, Info.getUhrwerkBillig()[j]); // setzen der Bezeichnungen der Uhrwerke
										}
										break;
									case "Oeko":
										// setzen der Produktlinienbezeichnung
										request.setAttribute("m"+i+"s", "Umwelt");
										
										for(int j = 0; j < 3; j++){
											request.setAttribute("m"+i+"c"+j, Info.getGehaeuseOeko()[j]); // setzen der Bezeichnungen der Gehäuse
											request.setAttribute("m"+i+"b"+j, Info.getArmbandOeko()[j]); // setzen der Bezeichnungen der Armbänder
											request.setAttribute("m"+i+"cw"+j, Info.getUhrwerkOeko()[j]); // setzen der Bezeichnungen der Uhrwerke
										}
										break;
									case "Premium":
										// setzen der Produktlinienbezeichnung
										request.setAttribute("m"+i+"s", "Luxus");
										
										for(int j = 0; j < 3; j++){
											request.setAttribute("m"+i+"c"+j, Info.getGehaeusePremium()[j]); // setzen der Bezeichnungen der Gehäuse
											request.setAttribute("m"+i+"b"+j, Info.getArmbandPremium()[j]); // setzen der Bezeichnungen der Armbänder
											request.setAttribute("m"+i+"cw"+j, Info.getUhrwerkPremium()[j]); // setzen der Bezeichnungen der Uhrwerke
										}
										break;
								}
								System.out.println("Uhr " + i + " vorhanden und Bildschirmausgabe gesetzt");
							}
						}
						
						setValuesOnUI(request, response);
						
						dispatcher.forward(request, response);
					}
					System.out.println("Start neuer Runde.");
					
				}//nextPlayer
				
	}// doPost
	
	
	private void setValuesOnUI(HttpServletRequest request, HttpServletResponse response){
		setClockClass(request, response);
				
		// setzen der getätigten Auswahl für F&E						
		setFEOptions(request, response);
		
		// setzen der getätigten Auswahl für Produktion
		setProductionOptions(request, response);
		setStock(request, response);
		
		// setzen der getätigten Auswahl für Einkauf
		setPurchasingOptions(request, response);
		
		// setzen der getätigten Auswahl für Vertrieb
		
		// setzen der getätigten Auswahl für Marketing
		setMarketingOptions(request, response);
	}
	
	private void setClockClass(HttpServletRequest request, HttpServletResponse response){
		
		int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
		
		request.setAttribute("uO", sf.format(Info.getKostenUhrOeko()));
		request.setAttribute("uB", sf.format(Info.getKostenUhrBillig()));
		request.setAttribute("uP", sf.format(Info.getKostenUhrPremium()));
		
		for(int i = 0; i < anzahlUhren; i++){
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke
			if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
				request.setAttribute("watch"+i, "card-aktive");
				String[] item = {"c","b","cw"};
				
				// Optische Markierung des ausgewählten Uhrenteils
				request.setAttribute("clM"+i+"c"+spieler[spiel.getAktuellerSpieler()].getUhr()[i].getGehaeuse(), "selected");
				request.setAttribute("clM"+i+"cw"+spieler[spiel.getAktuellerSpieler()].getUhr()[i].getUhrwerk(), "selected");
				request.setAttribute("clM"+i+"b"+spieler[spiel.getAktuellerSpieler()].getUhr()[i].getArmband(), "selected");
				
				// Markierung des ausgewählten Uhrenteils in Inputfeld
				request.setAttribute("usedCase"+i, spieler[spiel.getAktuellerSpieler()].getUhr()[i].getGehaeuse());
				request.setAttribute("usedClockWork"+i, spieler[spiel.getAktuellerSpieler()].getUhr()[i].getUhrwerk());
				request.setAttribute("usedBracelet"+i, spieler[spiel.getAktuellerSpieler()].getUhr()[i].getArmband());
				
				// setzen des Einkaufpreises
				
				
				String ek = df.format( spieler[spiel.getAktuellerSpieler()].getUhr()[i].berechneSelbstkosten() );				
				request.setAttribute("ekM"+i, ek);
				
				for(int j = 0; j <=2; j++){

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

		//setzen der zur Erforschung einer neuen Nuhr zur Verfügung stehenden Segmente
		if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[0] == false)request.setAttribute("rB", "notAvailable");
		if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[1] == false)request.setAttribute("rO", "notAvailable");
		if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[2] == false)request.setAttribute("rL", "notAvailable");
		
		
	}//setClockClass
	
	private void setFEOptions(HttpServletRequest request, HttpServletResponse response){
			
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke des Segmentes Billig
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[0] == true){
				request.setAttribute("researchB", "card-aktive");
				String[] item = {"c","b","cw"};
				for(int j = 0; j <=2; j++){
					request.setAttribute("clCBc"+j, sf.format(Info.getKostenGehaeuseBillig()[j]));
					request.setAttribute("clCBb"+j, sf.format(Info.getKostenArmbandBillig()[j]));
					request.setAttribute("clCBcw"+j, sf.format(Info.getKostenUhrwerkBillig()[j]));
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
					request.setAttribute("clCOc"+j, sf.format(Info.getKostenGehaeuseOeko()[j]));
					request.setAttribute("clCOb"+j, sf.format(Info.getKostenArmbandOeko()[j]));
					request.setAttribute("clCOcw"+j, sf.format(Info.getKostenUhrwerkOeko()[j]));
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
					request.setAttribute("clCLc"+j, sf.format(Info.getKostenGehaeusePremium()[j]));
					request.setAttribute("clCLb"+j, sf.format(Info.getKostenArmbandPremium()[j]));
					request.setAttribute("clCLcw"+j, sf.format(Info.getKostenUhrwerkPremium()[j]));
					for(int k = 0; k <= 2; k++){						
						if(spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrPremium()[j][k] == true)
							request.setAttribute("clL"+item[j]+k, "done");
						if(k== 2 && spieler[spiel.getAktuellerSpieler()].getFreigeschalteneAttrPremium()[j][1] == false)
							request.setAttribute("addL"+item[j]+k, "notAvailable");
					}
				}
			}else request.setAttribute("researchL", "card-inaktive");
	}//setFEOptions
	
	// setzen der möglichen und freigeschaltenen Produktionserweiterungen
	private void setProductionOptions(HttpServletRequest request, HttpServletResponse response){

		for(int i = 0; i < 3; i++){		

			String[] seg = {"B","O","L"};
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[i] == true){
				request.setAttribute("production"+seg[i], "card-aktive");
					for(int k = 0; k <= 2; k++){
						switch(i){
							case 0:
								request.setAttribute("prodLimitB", spieler[spiel.getAktuellerSpieler()].getProduktionslimitBillig());
								request.setAttribute("prdCBcr"+k, sf.format(Info.getKostenProduktionBillig()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStrasseBillig()[k] == true)
									request.setAttribute("prdBcr"+k, "done");
								if(k >0  && spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStrasseBillig()[k-1] == false)
									request.setAttribute("addPrBcr"+k, "notAvailable");
								
								request.setAttribute("prdCBce"+k, sf.format(Info.getKostenProduktionBillig()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getKapaErwStrasseBillig()[k] == true)
									request.setAttribute("prdBce"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getKapaErwStrasseBillig()[k-1] == false)
									request.setAttribute("addPrBce"+k, "notAvailable");
							break;
							
							case 1:
								request.setAttribute("prodLimitO", spieler[spiel.getAktuellerSpieler()].getProduktionslimitOeko());
								request.setAttribute("prdCOcr"+k, sf.format(Info.getKostenProduktionOeko()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStrasseOeko()[k] == true)
									request.setAttribute("prdOcr"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStrasseOeko()[k-1] == false)
									request.setAttribute("addPr"+seg[i]+"cr"+k, "notAvailable");
								
								request.setAttribute("prdCOce"+k, sf.format(Info.getKostenProduktionOeko()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getKapaErwStrasseOeko()[k] == true)
									request.setAttribute("prdOce"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getKapaErwStrasseOeko()[k-1] == false)
									request.setAttribute("addPrOce"+k, "notAvailable");
							break;
							
							case 2:
								request.setAttribute("prodLimitL", spieler[spiel.getAktuellerSpieler()].getProduktionslimitPremium());
								request.setAttribute("prdCLcr"+k, sf.format(Info.getKostenProduktionPremium()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStrassePremium()[k] == true)
									request.setAttribute("prdLcr"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getProdKostenSenkungStrassePremium()[k-1] == false)
									request.setAttribute("addPrLcr"+k, "notAvailable");
								
								request.setAttribute("prdCLce"+k, sf.format(Info.getKostenProduktionPremium()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getKapaErwStrassePremium()[k] == true)
									request.setAttribute("prdLce"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getKapaErwStrassePremium()[k-1] == false)
									request.setAttribute("addPrLce"+k, "notAvailable");
							break;
						}
					}
			}
			else request.setAttribute("production"+seg[i], "card-inaktive");
		}
	}//setProductionOptions
	
	// setzen der möglichen und freigeschaltenen Produktionserweiterungen
	private void setPurchasingOptions(HttpServletRequest request, HttpServletResponse response){

		for(int i = 0; i < 3; i++){		

			String[] seg = {"B","O","L"};
			if(spieler[spiel.getAktuellerSpieler()].getFreieSegmenteAllgemein()[i] == true){
				request.setAttribute("purchasing"+seg[i], "card-aktive");
					for(int k = 0; k <= 2; k++){
						switch(i){
							case 0:
								request.setAttribute("purCB"+k, sf.format(Info.getKostenEinkaufBillig()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufBillig()[k] == true)
									request.setAttribute("purB"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufBillig()[k-1] == false)
									request.setAttribute("addPurB"+k, "notAvailable");
								
							break;
							
							case 1:
								request.setAttribute("purCO"+k, sf.format(Info.getKostenEinkaufOeko()[k]));
								if(spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufOeko()[k] == true)
									request.setAttribute("purO"+k, "done");
								if(k >0 && spieler[spiel.getAktuellerSpieler()].getVerbesserungEinkaufOeko()[k-1] == false)
									request.setAttribute("addPurO"+k, "notAvailable");
								
							break;
							
							case 2:
								request.setAttribute("purCL"+k, sf.format(Info.getKostenEinkaufPremium()[k]));
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
	}//setPurchasingOptions
	
	private void setStock(HttpServletRequest request, HttpServletResponse response){
		int anzahlUhren = spieler[spiel.getAktuellerSpieler()].getUhr().length;// Anzahl der erforschten Uhren
		for(int i = 0; i < anzahlUhren; i++){
			// setzen der Auswahl der Gehäuse, Armbänder und Uhrwerke
			if(spieler[spiel.getAktuellerSpieler()].getUhr()[i] != null){
				request.setAttribute("stock"+i, spieler[spiel.getAktuellerSpieler()].getUhr()[i].getBestand());
			}
		}
	}
	
	//Marketing
	private void setMarketingOptions(HttpServletRequest request, HttpServletResponse response){
		for(int i = 0; i < 3; i++){
			request.setAttribute("mCC"+i, sf.format(Info.getKostenMarketingUnternehmen()[i]));
			for(int j = 0; j < 3; j++){
				request.setAttribute("mCm"+i+""+j, sf.format(Info.getKostenMarketingUhr()[j]));
			}
		}
	}
	
}