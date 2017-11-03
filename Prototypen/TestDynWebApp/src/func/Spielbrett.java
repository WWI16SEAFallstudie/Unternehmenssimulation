package func;

import java.util.Arrays;
import java.util.Collections;

/*
 * Hier findet die ganze Spielsteuerung von Unternehmen und Markt statt
 */
public class Spielbrett {
	
	// Attribute
	private Unternehmen[] spieler;
	private int rundenAktuell;
	private int rundenMax;
	private int aktuellerSpieler;
	Gesamtmarkt gesamtmarkt;
	private int sieger[];
	
	public Spielbrett(int anzRunden, int volume, double impactRange) {
		this.rundenAktuell = 0;
		this.rundenMax = anzRunden;
		this.aktuellerSpieler = 0;
		//this.gesamtmarkt = new Gesamtmarkt(volume, impactRange);
	}
	
	public void starteMarkt() {
		//gesamtmarkt.starteSimulation(spieler);
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
			starteMarkt();
		}
		else {
			// Spiel beendet!!
			result = false;
			System.out.println("Spiel zu Ende!!");
			starteMarkt();
			gewinnermittlung();
			
		}
		return result;
	}
	
	// Nächster Spieler (2-4 spieler)
	public void naechsterSpieler() {
		int lastPlayer = spieler.length-1;
		if(this.aktuellerSpieler == lastPlayer) {
			this.aktuellerSpieler = 0;
		}
		else {
			this.aktuellerSpieler++;
		}
	}
	
	private void gewinnermittlung() {
		this.sieger = new int[spieler.length];
		double kapi[] = new double[spieler.length];
		// Kapital in extra array speichern
		for(int i = 0; i < spieler.length; i++)
			kapi[i] = spieler[i].getKapital();
		
		// Kapital nach größe sortieren und umdrehen
		Arrays.sort(kapi);
		double temp[] = new double[kapi.length];
		int t = kapi.length-1;
		for(int i = 0; i < kapi.length; i++)
		{
			temp[t] = kapi[i];
			t--;
		}
		kapi = temp;
		
		// Kapital den Siegern zuordnen und in siegerarray speichern
		for(int i = 0; i < spieler.length; i++) {
			for(int j = 0; j < kapi.length; j++)
				if(kapi[i] == spieler[j].getKapital()) {
					sieger[i] = j;
					break;
				}
		}
	}

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

	public int[] getSieger() {
		return sieger;
	}
	
	
}
