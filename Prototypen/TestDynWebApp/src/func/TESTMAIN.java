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
		
		// Spieler entwickelt Uhr weiter
		spieler[1].erforscheUhrwerk(1);
		spieler[0].erforscheUhrwerk(0);
		spieler[0].erforscheUhrwerk(0);
		
		// Spieler ausgabe
		for(int i = 0; i < spieler.length; i++) {
			System.out.println(spieler[i].toString());
		}
		System.out.println();
		
		// Infos über die Attribute zu den jeweiligen Segmenten
		String[] uhrwerkOeko = Info.getUhrwerkOeko();
		System.out.println("Beispiel für Uhrwerk im Ökobereich:");
		for(int i = 0; i < uhrwerkOeko.length; i++) {
			System.out.println(uhrwerkOeko[i]);
		}
		
		// Spielerdaten speichern
		spieler[0].setSpielerDaten(20000);
		
		// Spielerinformationen ausgeben
		System.out.println(spieler[0].getInfo());
		
	}
}
