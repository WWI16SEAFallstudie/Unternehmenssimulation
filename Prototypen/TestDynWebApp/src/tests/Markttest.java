package tests;

import func.*;
import static org.junit.Assert.*; 
import org.junit.Test;

public class Markttest {
	@Test
<<<<<<< HEAD
	public void uhrenverkaufAlleKategorienTest() {
=======
	public void uhrenverkaufTest() {
>>>>>>> e889bf673636537e4a6fd1cda8c00c8fd81c0756
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(2);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		spieler[0].freischaltenSegment("Premium");
		spieler[0].freischaltenSegment("Oeko");
		spieler[0].erforscheUhr("Billig");
		spieler[0].erforscheUhr("Premium");
		spieler[0].erforscheUhr("Oeko");
		spieler[0].produzieren(100, 0);
		spieler[0].produzieren(100, 1);
		spieler[0].produzieren(100, 2);
		iUhrenkategorie[] uhren = spieler[0].getUhr();
		uhren[0].setMarktwert(100);
		uhren[1].setMarktwert(100);
		uhren[2].setMarktwert(100);
		spieler[0].bieteUhren(100, 0, 100);
		spieler[0].bieteUhren(100, 1, 100);
		spieler[0].bieteUhren(100, 2, 100);
		spielbrett.starteMarkt(true);

		assertEquals("Uhren wurde nicht korrekt abgenommen", 50, uhren[0].getAbgenommeneMenge());
		assertEquals("Uhren wurde nicht korrekt abgenommen", 50, uhren[1].getAbgenommeneMenge());
		assertEquals("Uhren wurde nicht korrekt abgenommen", 50, uhren[2].getAbgenommeneMenge());
	}
	
	@Test
	public void uhrenverkaufInGleicherKategorieTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(2);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		spieler[0].freischaltenSegment("Billig");
		spieler[0].erforscheUhr("Billig");
		spieler[0].erforscheUhr("Billig");	
		spieler[0].produzieren(100, 0);
		spieler[0].produzieren(100, 1);
		iUhrenkategorie[] uhren = spieler[0].getUhr();
		uhren[0].setMarktwert(100);
		uhren[1].setMarktwert(150);
		spieler[0].bieteUhren(100, 0, 100);
		spieler[0].bieteUhren(100, 1, 100);
		spielbrett.starteMarkt(true);
		System.out.println(uhren[0].getAbgenommeneMenge());

//		assertEquals("Uhren wurde nicht korrekt abgenommen", 50, uhren[0].getAbgenommeneMenge());
//		assertEquals("Uhren wurde nicht korrekt abgenommen", 50, uhren[1].getAbgenommeneMenge());
	}
}