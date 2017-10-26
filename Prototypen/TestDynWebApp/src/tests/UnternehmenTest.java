package tests;
import func.*;
import static org.junit.Assert.*;
import org.junit.Test;


public class UnternehmenTest {
	
	@Test
	public void erstelleSpielerTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		
		spielbrett.erstelleSpieler(2);
		spieler = spielbrett.getSpieler();
		
		assertEquals("Spieler wurde nicht korrekt erstellt", 2, spieler.length);
	}
	
	@Test
	public void billigsegmentFreischaltenTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Billig");
		boolean segmente[] = spieler[0].getFreieSegmenteAllgemein();
		
		assertTrue("Segment wurde nicht erforscht", segmente[0]);
		assertFalse("Falsches Segment wurde erforscht", segmente[1]);
		assertFalse("Falsches Segment wurde erforscht", segmente[2]);
	}
	
	@Test
	public void OekosegmentFreischaltenTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Oeko");
		boolean segmente[] = spieler[0].getFreieSegmenteAllgemein();
		
		assertFalse("Falsches Segment wurde nicht erforscht", segmente[0]);
		assertTrue("Segment wurde erforscht", segmente[1]);
		assertFalse("Falsches Segment wurde erforscht", segmente[2]);
	}
	
	@Test
	public void premiumsegmentFreischaltenTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Premium");
		boolean segmente[] = spieler[0].getFreieSegmenteAllgemein();
		
		assertFalse("Falsches Segment wurde erforscht", segmente[0]);
		assertFalse("Falsches Segment wurde erforscht", segmente[1]);
		assertTrue("Segment wurde nicht erforscht", segmente[2]);
	}
	
	@Test
	public void erforscheBilliguhrTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Billig");
		
		spieler[0].erforscheUhr("Billig");
		iUhrenkategorie u[] = spieler[0].getUhr();
		
		assertEquals("Uhr wurde nicht erforscht", "Billig", u[0].getSegment());
	}
	
	@Test
	public void erforscheOekouhrTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Oeko");
		
		spieler[0].erforscheUhr("Oeko");
		iUhrenkategorie u[] = spieler[0].getUhr();
		
		assertEquals("Uhr wurde nicht erforscht", "Oeko", u[0].getSegment());
	}
	
	@Test
	public void erforschePremiumuhrTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		
		spieler[0].freischaltenSegment("Premium");
		
		spieler[0].erforscheUhr("Premium");
		iUhrenkategorie u[] = spieler[0].getUhr();
		
		assertEquals("Uhr wurde nicht erforscht", "Premium", u[0].getSegment());
	}
	
	@Test
	public void entwickleUhrwerkPremiumTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Premium");
		spieler[0].erforscheUhr("Premium");
		
		spieler[0].erforscheUhrwerk("Premium"); 
		
		assertTrue("Uhrwerk wurde nicht erforscht", spieler[0].getFreigeschalteneAttrPremium()[2][1]);
	}
	
	@Test
	public void entwickleUhrwerkOekoTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Oeko");
		spieler[0].erforscheUhr("Oeko");
		
		spieler[0].erforscheUhrwerk("Oeko"); 
		
		assertTrue("Uhrwerk wurde nicht erforscht", spieler[0].getFreigeschalteneAttrOeko()[2][1]);
	}
	
	@Test
	public void entwickleUhrwerkBilligTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		spieler[0].erforscheUhr("Billig");
		
		spieler[0].erforscheUhrwerk("Billig"); 
		
		assertTrue("Uhrwerk wurde nicht erforscht", spieler[0].getFreigeschalteneAttrBillig()[2][1]);
	}
	
	@Test
	public void entwickleArmbandPremiumTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Premium");
		spieler[0].erforscheUhr("Premium");
		spieler[0].erforscheArmband("Premium"); 
		
		assertTrue("Armband wurde nicht erforscht", spieler[0].getFreigeschalteneAttrPremium()[1][1]);
	}
	
	@Test
	public void entwickleArmbandOekoTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Oeko");
		spieler[0].erforscheUhr("Oeko");
		spieler[0].erforscheArmband("Oeko"); 
		
		assertTrue("Armband wurde nicht erforscht", spieler[0].getFreigeschalteneAttrOeko()[1][1]);
	}
	
	@Test
	public void entwickleArmbandBilligTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		spieler[0].erforscheUhr("Billig");
		spieler[0].erforscheArmband("Billig"); 
		
		assertTrue("Armband wurde nicht erforscht", spieler[0].getFreigeschalteneAttrBillig()[1][1]);
	}
	
	@Test
	public void entwickleGehaeusePremiumTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Premium");
		spieler[0].erforscheUhr("Premium");
		spieler[0].erforscheGehaeuse("Premium"); 
		
		assertTrue("Gehäuse wurde nicht erforscht", spieler[0].getFreigeschalteneAttrPremium()[0][1]);
	}
	
	@Test
	public void entwickleGehaeuseOekoTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Oeko");
		spieler[0].erforscheUhr("Oeko");
		spieler[0].erforscheGehaeuse("Oeko"); 
		
		assertTrue("Gehäuse wurde nicht erforscht", spieler[0].getFreigeschalteneAttrOeko()[0][1]);
	}
	
	@Test
	public void entwickleGehaeuseBilligTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		spieler[0].erforscheUhr("Billig");
		spieler[0].erforscheGehaeuse("Billig"); 
		
		assertTrue("Gehäuse wurde nicht erforscht", spieler[0].getFreigeschalteneAttrBillig()[0][1]);
	}
	
//	@Test
//	public void entwickleZweimalGehaeusePremiumTest() {
//		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
//		Unternehmen[] spieler;
//		spielbrett.erstelleSpieler(1);
//		spieler = spielbrett.getSpieler();
//		spieler[0].freischaltenSegment("Premium");
//		spieler[0].erforscheUhr("Premium");
//		spieler[0].erforscheGehaeuse("Premium");
//		spieler[0].erforscheGehaeuse("Premium");
//		
//		assertTrue("Gehäuse wurde nicht zweimal erforscht", spieler[0].getFreigeschalteneAttrPremium()[0][2]);
//	}
	
	// kein Zugriff auf Index?
	@Test
	public void prodKostensenkungPremiumTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Premium");
		
		assertTrue("Produktionskosten wurden nicht gesenkt", spieler[0].senkeProdKosten("Premium"));
	}
	
	@Test
	public void prodKostensenkungOekoTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Oeko");
		
		assertTrue("Produktionskosten wurden nicht gesenkt", spieler[0].senkeProdKosten("Oeko"));
	}
	
	@Test
	public void prodKostensenkungBilligTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		
		assertTrue("Produktionskosten wurden nicht gesenkt", spieler[0].senkeProdKosten("Billig"));
	}
	
	@Test
	public void erweitereEinkaufPremiumTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Premium");
		
		assertTrue("Einkauf wurde nicht erweitert", spieler[0].erweitereEinkauf("Premium"));
	}
	
	@Test
	public void erweitereEinkaufOekoTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Oeko");
		
		assertTrue("Einkauf wurde nicht erweitert", spieler[0].erweitereEinkauf("Oeko"));
	}
	
	@Test
	public void erweitereProduktionBilligTest() {
		Spielbrett spielbrett = new Spielbrett(10, 10000, 0.1);
		Unternehmen[] spieler;
		spielbrett.erstelleSpieler(1);
		spieler = spielbrett.getSpieler();
		spieler[0].freischaltenSegment("Billig");
		
		assertTrue("Produktion wurde nicht erweitert", spieler[0].erweitereProduktion("Billig"));
	}

}