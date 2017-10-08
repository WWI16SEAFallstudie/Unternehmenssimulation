package func;

/*
 * Hier findet die ganze Spielsteuerung von Unternehmen und Markt statt
 */
public class Spielbrett {
	
	// Attribute
	private Unternehmen[] spieler;
	private int rundenAktuell;
	private int rundenMax;
	private int aktuellerSpieler;
	
	public Spielbrett(int anzRunden) {
		this.rundenAktuell = 0;
		this.rundenMax = anzRunden;
		this.aktuellerSpieler = 0;
	}
	
	// Spieler erstellen
	public void erstelleSpieler(int anz) {
		spieler = new Unternehmen[anz];
		for(int i = 0; i < anz; i++) {
			spieler[i] = new Unternehmen("Spieler" + i);
		}
	}
	
	// Runden verwalten
	public boolean naechsteRunde() {
		boolean result = true;
		if(rundenAktuell+1 < rundenMax) {
			rundenAktuell++;
		}
		else {
			// Spiel beendet!!
			result = false;
			System.out.println("Spiel zu Ende!!");
		}
		return result;
	}
	
	// Nächster Spieler
	public void naechsterSpieler() {
		if(this.aktuellerSpieler == 4) {
			this.aktuellerSpieler = 0;
		}
		else {
			this.aktuellerSpieler++;
		}
	}

	
	// Markt
	
	// -> Runde beenden: Rückgabe aktueller Spieler, Spielerdaten direkt erfassen
	// -> Periode beenden: Marktsimmulation starten; Rückgabe der Infos an die Spieler
	
	// Spieler ist dran: Spielobjekt laden (Wie in HTML anzeigen?)
	
	
	
	// Getter & Setter
	
	public Unternehmen[] getSpieler() {
		return spieler;
	}

	public void setSpieler(Unternehmen[] spieler) {
		this.spieler = spieler;
	}

	public int getAktuellerSpieler() {
		
		return aktuellerSpieler;
	}

	public int getRundenAktuell() {
		return rundenAktuell;
	}

	public int getRundenMax() {
		return rundenMax;
	}
	
	

}
