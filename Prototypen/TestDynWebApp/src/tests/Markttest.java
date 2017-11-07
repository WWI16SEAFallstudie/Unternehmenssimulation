package tests;

import func.Spielbrett;
import func.Unternehmen;
import func.iUhrenkategorie;

public class Markttest {

	public static void main(String[] args) {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		
		spielbrett.erstelleSpieler(2);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Billig");
		
		spieler[0].erforscheUhr("Billig");
		spieler[0].erforscheUhr("Billig");
		
		//produzieren
		System.out.println("Spieler0 will 1000 Uhren (0) produzieren");
		spieler[0].produzieren(1000, 0);
		System.out.println("Bestand " + spieler[0].getBestandUhr(0));
		
		System.out.println("Spieler0 will 1000 Uhren (1) produzieren");
		spieler[0].produzieren(1000, 1);
		System.out.println("Bestand " + spieler[0].getBestandUhr(1));
		
		//setze score
		iUhrenkategorie[] uhren = spieler[0].getUhr();
		uhren[0].setMarktwert(100);
		uhren[1].setMarktwert(150);
		
		spieler[0].bieteUhren(100, 0, 100);
		spieler[0].bieteUhren(100, 1, 100);
		
		spielbrett.starteMarkt(true);
	}
	
}
