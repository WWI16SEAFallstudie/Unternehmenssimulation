package func;

public class TESTMAIN {

	public static void main(String[] args) {
		
		Spielbrett spiel = new Spielbrett(10);
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

		System.out.println("Segmente pro Spieler freigeschalten: 0->Billig; 1->Oeko; 2->Premium");
		for(int i = 0; i < spieler.length; i++) {
			System.out.print("Spieler " + i + " ");
			for(boolean s : spieler[i].getFreieSegmenteAllgemein()) {
				System.out.print(s + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println("Spieler 1 entwickelt Uhrwerk in Uhr 0");
		spieler[1].erforscheUhrwerk(0);
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		System.out.println();
		spieler[2].erforscheUhrwerk(0);
		System.out.println("Spieler 2 entwickelt Uhrwerk in Uhr 0");
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		System.out.println();
		spieler[1].erforscheUhrwerk(1);
		System.out.println("Spieler 1 entwickelt Uhrwerk in Uhr 1");
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		
		// Spielerdaten erfassen - Rundenende
		System.out.println();
		System.out.println("Spieler 0 wählt: Armband 0; Uhrwerk 3; Gehaeuse 1");
		spieler[0].setSpielerDaten(0, 2, 0, 1);
		System.out.println(spieler[0].getSpielerDaten(0));
		
		System.out.println();
		System.out.println("Spieler 1 wählt: Armband 1; Uhrwerk 2; Gehaeuse 2");
		spieler[1].setSpielerDaten(0, 2, 1, 2);
		System.out.println(spieler[1].getSpielerDaten(0));		

		System.out.println();
		System.out.println("Spieler 2 wählt: Armband 2; Uhrwerk 1; Gehaeuse 0");
		spieler[2].setSpielerDaten(0, 1, 2, 0);
		System.out.println(spieler[2].getSpielerDaten(0));	

		System.out.println();
		System.out.println("Alternative Ausgabe zu getSpielerDaten");
		System.out.println(spieler[2].getUhrwerk(0));
		
	}
}
