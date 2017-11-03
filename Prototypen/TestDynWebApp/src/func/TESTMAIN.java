package func;

//import javax.swing.plaf.synth.SynthSplitPaneUI;

public class TESTMAIN {
	
	public static void main(String[] args) {	
		Spielbrett spiel = new Spielbrett(10, 10000,0.1);
		Unternehmen[] spieler;
		
		// Spieler erstellen
		spiel.erstelleSpieler(3);
		
		// Spieler abfragen
		spieler = spiel.getSpieler();
		
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		
		// Nächster Spieler ist dran
		System.out.println("Spieler " + spiel.getAktuellerSpieler() + " am Zug");
		System.out.println("Naechster Spieler!");
		spiel.naechsterSpieler();
		System.out.println("Spieler " + spiel.getAktuellerSpieler() + " am Zug");
		System.out.println();
		
		// Spieler beendet Runde
		System.out.println("Aktuelle Runde: " + spiel.getRundenAktuell());
		System.out.println("Runde beendet!");
		// Rückgabewert -> false = Spiel zu Ende
		boolean result = spiel.naechsteRunde();
		System.out.println("Aktuelle Runde: " + spiel.getRundenAktuell());
		System.out.println();
		
		// Spieler schaltet Segment frei
		spieler[0].freischaltenSegment("Billig");
		spieler[1].freischaltenSegment("Premium");
		spieler[1].freischaltenSegment("Oeko");
		spieler[2].freischaltenSegment("Premium");
		
		// Spieler erforscht erste Uhr mit ausgewähltem segment
		spieler[0].erforscheUhr("Billig");
		spieler[1].erforscheUhr("Premium");
		spieler[2].erforscheUhr("Premium");
		
		// spieler 1 erforscht weitere Uhr
		spieler[1].erforscheUhr("Oeko");
				
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		System.out.println();
		
		// Uhren im Spieler
		System.out.println("Uhren im Spieler1");
		for(iUhrenkategorie u : spieler[1].getUhr()) {
			if(u != null) System.out.println(u.getSegment());
		}
		System.out.println();

		System.out.println("Segmente pro Spieler freigeschalten: 0->Billig; 1->Oeko; 2->Premium");
		for(int i = 0; i < spieler.length; i++) {
			System.out.print("Spieler " + i + " ");
			for(boolean s : spieler[i].getFreieSegmenteAllgemein()) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Spieler 0 entwickelt Uhrwerk im Premiummarkt");
		spieler[0].erforscheUhrwerk("Billig");
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		System.out.println();
		spieler[2].erforscheUhrwerk("Premium");
		System.out.println("Spieler 2 entwickelt Uhrwerk im Premiummarkt");
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		System.out.println();
		spieler[1].erforscheUhrwerk("Oeko");
		System.out.println("Spieler 1 entwickelt Uhrwerk im Oekobereich");
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		
		// Produzieren
		System.out.println();
		System.out.println("Spieler0 will 2000 Uhren (0) produzieren");
		spieler[0].produzieren(2000, 0);
		System.out.println("Bestand " + spieler[0].getBestandUhr(0));
		
		System.out.println("Spieler1 will 5000000 Uhren (0) produzieren");
		spieler[1].produzieren(50000000, 0);
		System.out.println("Bestand " + spieler[1].getBestandUhr(0));
		
		System.out.println("Spieler1 will 1000 Uhren (1) produzieren");
		spieler[1].produzieren(400, 1);
		System.out.println("Bestand " + spieler[1].getBestandUhr(1));
		
		System.out.println("Spieler2 will 22000 (0) Uhren produzieren");
		spieler[2].produzieren(22000, 0);
		System.out.println("Bestand " + spieler[2].getBestandUhr(0));
		
		// Spielerdaten erfassen - Rundenende
		System.out.println();
		System.out.println("Rundenende - Spielerdaten erfassen");
		System.out.println("Spieler 0 wählt: Armband 0; Uhrwerk 3; Gehaeuse 1");
		spieler[0].setSpielerDaten(0, 2, 0, 1);
		
		System.out.println();
		System.out.println("Spieler 1 wählt: Armband 1; Uhrwerk 2; Gehaeuse 2");
		spieler[1].setSpielerDaten(0, 2, 1, 2);		

		System.out.println();
		System.out.println("Spieler 2 wählt: Armband 2; Uhrwerk 1; Gehaeuse 0");
		spieler[2].setSpielerDaten(0, 1, 2, 0);
		System.out.println();
		System.out.println("Alternative Ausgabe zu getSpielerDaten");
		System.out.println(spieler[2].getUhrwerk(0));
		System.out.println();
		
		// Erweiterung der Produktion
		System.out.println("Produktion");
		System.out.println("Spieler0 Produktionslimit Billig: " + spieler[0].getProduktionslimitBillig());
		System.out.println("Spieler1 Produktionslimit Premium: " + spieler[1].getProduktionslimitPremium());
		System.out.println("Spieler1 Produktionslimit Oeko: " + spieler[1].getProduktionslimitOeko());
		System.out.println("Spieler2 Produktionslimit Premium: " + spieler[2].getProduktionslimitPremium());
		
		System.out.println("Spieler 0 erweitert Billigproduktion");
		spieler[0].erweitereProduktion("Billig");

		System.out.println("Spieler 1 erweitert 2x Premiumproduktion");
		spieler[1].erweitereProduktion("Premium");
		spieler[1].erweitereProduktion("Premium");

		System.out.println("Spieler 2 erweitert Premiumproduktion");
		spieler[2].erweitereProduktion("Premium");

		System.out.println("Spieler0 Produktionslimit Billig: " + spieler[0].getProduktionslimitBillig());
		System.out.println("Spieler1 Produktionslimit Premium: " + spieler[1].getProduktionslimitPremium());
		System.out.println("Spieler1 Produktionslimit Oeko: " + spieler[1].getProduktionslimitOeko());
		System.out.println("Spieler2 Produktionslimit Premium: " + spieler[2].getProduktionslimitPremium());
		
		System.out.println("Spieler0 will 500 Uhren (0) produzieren");
		spieler[0].produzieren(2000, 0);
		System.out.println("Bestand " + spieler[0].getBestandUhr(0));

		System.out.println("Spieler0 will 10000 Uhren (0) produzieren");
		spieler[0].produzieren(10000, 0);
		System.out.println("Bestand " + spieler[0].getBestandUhr(0));
		System.out.println();
		
		// Erweiterung Einkauf
		System.out.println("Einkauf");
		/*System.out.println("Spieler0 Anschaffungskosten Billig: " + spieler[0].getAnschaffungskostenBillig());
		System.out.println("Spieler1 Anschaffungskosten Premium: " + spieler[1].getAnschaffungskostenPremium());
		System.out.println("Spieler1 Anschaffungskosten Oeko: " + spieler[1].getAnschaffungskostenOeko());
		System.out.println("Spieler2 Anschaffungskosten Premium: " + spieler[2].getAnschaffungskostenPremium());*/
		
		System.out.println();
		System.out.println("Spieler 0 erweitert Billigproduktion");
		spieler[0].erweitereEinkauf("Billig");
		
		System.out.println("Spieler 1 erweitert 2x Premiumproduktion");
		spieler[1].erweitereEinkauf("Premium");
		spieler[1].erweitereEinkauf("Premium");

		System.out.println("Spieler 2 erweitert Premiumproduktion");
		spieler[2].erweitereEinkauf("Premium");
		
		System.out.println("Alternative Ausgabe für die Erweiterung des Einkaufs Billig");
		for(boolean a : spieler[0].getVerbesserungEinkaufBillig())
			System.out.print(a + " ");
		System.out.println();
		System.out.println();
		
		// Absatzmarkt
		System.out.println("Spieler0 will 5000 Uhren (0) am Markt anbieten");
		System.out.println("AB: " + spieler[0].getBestandUhr(0));
		System.out.println("Angeboten: " + spieler[0].bieteUhren(5000, 0, 10));
		System.out.println();

		System.out.println("Spieler1 will 100000 Uhren am Markt anbieten");
		System.out.println("AB: " + spieler[1].getBestandUhr(0));
		System.out.println("Angeboten: " + spieler[1].bieteUhren(100000, 0,10));
		System.out.println();

		System.out.println("Spieler2 will 1000 Uhren am Markt anbieten");
		System.out.println("AB: " + spieler[2].getBestandUhr(0));
		System.out.println("Angeboten: " + spieler[2].bieteUhren(1000, 0,10));
		
		// Uhren verkauft - Nachher Rückgabe vom Markt
		System.out.println();
		System.out.println("Spieler 0 hat 10 Uhren verkauft");
		spieler[0].setAbgenommeneMenge(100, 0);
		System.out.println("EB " + spieler[0].getBestandUhr(0));
		
		System.out.println("Spieler 1 hat 10000 Uhren verkauft");
		spieler[1].setAbgenommeneMenge(10000, 0);
		System.out.println("EB " + spieler[1].getBestandUhr(0));
		
		System.out.println("Spieler 0 hat  Uhren verkauft");
		spieler[2].setAbgenommeneMenge(5, 0);
		System.out.println("EB " + spieler[2].getBestandUhr(0));	
		
	}
}
