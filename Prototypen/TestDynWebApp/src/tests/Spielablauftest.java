package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import func.Spielbrett;
import func.Unternehmen;
public class Spielablauftest {
        @Test
        public void testeSpielablauf(){
            Spielbrett spielbrett = new Spielbrett(3, 100000, 0.1);
            Unternehmen[] spieler = null;
            spielbrett.erstelleSpieler(3);    
            spieler = spielbrett.getSpieler();
                    
            spieler[0].freischaltenSegment("Billig");
            spieler[1].freischaltenSegment("Oeko");
            spieler[2].freischaltenSegment("Premium");
            spieler[0].erforscheUhr("Billig");
            spieler[1].erforscheUhr("Oeko");
            spieler[2].erforscheUhr("Premium");
            
            spieler[0].erweitereEinkauf("Billig");
            spieler[1].erweitereEinkauf("Oeko");
            spieler[2].erweitereEinkauf("Premium");
            
            spieler[0].produzieren(100, 0);
            spieler[1].produzieren(200, 0);
            spieler[2].produzieren(300, 0);
            
            spieler[0].setSpielerDaten(0, 0, 0, 0);
            spieler[1].setSpielerDaten(0, 0, 0, 0);
            spieler[2].setSpielerDaten(0, 0, 0, 0);
            
            spielbrett.naechsteRunde();
            
            spieler[0].bieteUhren(100, 0, 50);
            spieler[1].bieteUhren(200, 0, 150);
            spieler[2].bieteUhren(300, 0, 1000);
            
            spieler[0].erforscheArmband("Billig", 1);
            spieler[1].erforscheGehaeuse("Oeko", 1);
            spieler[2].erforscheUhrwerk("Premium", 1);
            
            spieler[0].setSpielerDaten(0, 0, 1, 0);
            spieler[1].setSpielerDaten(0, 0, 0, 1);
            spieler[2].setSpielerDaten(0, 1, 0, 0);
            
            spielbrett.naechsteRunde();
            
            spieler[0].erweitereProduktion("Bilig");
            spieler[0].erweitereProduktion("Oeko");
            spieler[0].erweitereProduktion("Premium");
            
            boolean[] uhrenMarketing = {true, false, false};
            spieler[0].uhrenMarketing(0, uhrenMarketing);
            
            boolean[] unternehmenMarketing = {true, false, false};
            spieler[0].unternehmenMarketing(unternehmenMarketing);
            
            spielbrett.naechsteRunde();
            
            assertEquals("Spieler in der falschen Reihenfolge bei Gewinnermittlung.", 1, spielbrett.getSieger()[0]);
            
        }
}