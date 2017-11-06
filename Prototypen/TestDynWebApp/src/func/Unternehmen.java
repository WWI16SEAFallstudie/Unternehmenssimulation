package func;

import java.util.*;

public class Unternehmen {

	/*
	 * Attribute name und vorhandenes Kapital im Unternehmen
	 */
	private String name;
	private double kapital;
	private double kapitalAlt;
	
	// Array f¸r verkaufte Uhren pro Runde
	private int verkaufteUhrenRunden[] = new int[10];
	
	// Produktionslimit speichern
	private int produktionslimitBillig = 10000;
	private int produktionslimitOeko = 4000;
	private int produktionslimitPremium = 400;

	// Produktionskosten speichern
	private int produktionskostenBillig = 10000;
	private int produktionskostenOeko = 10000;
	private int produktionskostenPremium = 10000;
		
	/*
	 * Array f¸r entsprechenden Uhren angelegt 
	 * iUhrenkategorie ist ein Interface, welches von BilligUhr, OekoUhr und PremiumUhr implementiert wurde
	 * -> Polymorphismus
	 */
	private iUhrenkategorie uhr[] = new iUhrenkategorie[3];
	
	/*
	 * Hier wird gespeichert, welche Segmente schon freigeschaltet wurden
	 * index:
	 * 
	 * 	0->Billig
	 * 	1->Oeko
	 * 	2->Premium
	 */
	private boolean freieSegmenteAllgemein[] = { false, false, false };
	
	/*
	 * Welche Attribute im Segment freigeschalten sind
	 * Aufbau der Arrays (default):
	 * Gehaeuse: [0][0] true, [0][1] false, [0][2] false
	 * Armband: [1][0] true, [1][1], false, [1][2] false
	 * Uhrwerk: [2][0] true, [2][1] false, [2][2] false
	 */
	private boolean freigeschalteneAttrBillig[][] = { {true,false,false}, {true,false,false}, {true,false,false} };
	private boolean freigeschalteneAttrOeko[][] = { {true,false,false}, {true,false,false}, {true,false,false} };
	private boolean freigeschalteneAttrPremium[][] = { {true,false,false}, {true,false,false}, {true,false,false} };
		
	/*
	 * Produktionskostensenkung pro Segment
	 */
	private boolean prodKostenSenkungStraﬂeBillig[] = { false, false, false};
	private boolean prodKostenSenkungStraﬂeOeko[] = { false, false, false};
	private boolean prodKostenSenkungStraﬂePremium[] = { false, false, false};
	
	/*
	 * Strasseserweiterung pro Segment
	 */
	private boolean kapaErwStraﬂeBillig[] = { false, false, false};
	private boolean kapaErwStraﬂeOeko[] = { false, false, false};
	private boolean kapaErwStraﬂePremium[] = { false, false, false};
		
	/*
	 * Einkauf
	 */
	private boolean verbesserungEinkaufBillig[] = { false, false, false };
	private boolean verbesserungEinkaufOeko[] = { false, false, false };
	private boolean verbesserungEinkaufPremium[] = { false, false, false };
	
	/*
	 * Konstruktor
	 */
	public Unternehmen(String name) {
		this.setKapital(1000000);		
		this.setKapitalAlt(0);
		this.setName(name);
	}
	
	/**
	 * Methoden soll eine weitere Uhr erforschen
	 * 
	 * Funktionsweise: Durch ‹bergabe des Segments, wird ¸ber einen switch-case abgefragt,
	 * welches Segment ausgew‰hlt wurde und dementsprechend wird ein neues Uhrmodell an der
	 * Stelle 'index' erzeugt. Jedoch nur, wenn genug Kapital vorhanden ist. Dies wird in einer
	 * privaten Methode getestet und das Kapital wird vermindert, wenn es ausreichend ist.
	 * Der 'index' wird durch eine private Methode abgefragt, um
	 * herauszufinden welches die n‰chste Freie Uhr ist.
	 * 
	 * @param segment: Gibt an, in welchem Segment die Uhr erforscht werden soll
	 * Mˆgliche Segmente: Billig, Luxus, ÷ko
	 * @return: Uhrerforschung erfolgreich / nicht erfolgreich
	 */
	public boolean erforscheUhr(String segment) {
		boolean result = false;
		// Test auf naechste Freie Uhr
		int index = indexFreieUhr();
		
		// Wenn alle Uhren entwickelt oder nicht genug Kohle-> false zur¸ckgeben;
		if(index != -1 ) {
			// Checken ob Segment bereits freigeschalten
			if(isFreigeschaltenSegment(segment)) {
				switch(segment) {
				case "Billig":
					if(checkeKapital(Info.getKostenUhrBillig())) {
						this.uhr[index] = new BilligUhr();
						result = true;
					}
					else
						System.out.println("Nicht genug Kohle!");
					break;
				case "Premium":
					if(checkeKapital(Info.getKostenUhrPremium())) {
						this.uhr[index] = new PremiumUhr();
						result = true;
					}
					else
						System.out.println("Nicht genug Kohle!");
					break;
				case "Oeko":
					if(checkeKapital(Info.getKostenUhrOeko())) {
						this.uhr[index] = new OekoUhr();
						result = true;
					}
					else
						System.out.println("Nicht genug Kohle!");
					break;
				default:
					System.out.println("Falsches Segment");
					break;
				}
			}
			else {
				System.out.println("Segment noch nicht freigeschalten");
			}
		}
		else {
			System.out.println("Es kann keine weitere Uhr erforscht werden!");
		}
		return result;
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Uhrwerkes
	 * 
	 * Funktion: Ausgew‰hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Uhrwerk erforscht
	 * Es wird nur erforscht, wenn diese Uhr ¸berhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei Mˆglichen Uhren 
	 * ein neues Uhrwerk erforscht werden soll
	 */
	public void erforscheUhrwerk(String segment, int index) {
		double kosten = 0;
		switch (segment) {
			case "Billig":
				kosten = Info.getKostenUhrwerkBillig()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrBillig = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrBillig, 2);
				break;
			case "Oeko":
				kosten = Info.getKostenUhrwerkOeko()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrOeko = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrOeko, 2);				
				break;
			case "Premium":
				kosten = Info.getKostenUhrwerkPremium()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrPremium = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrPremium, 2);
				break;
		}	
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Armbandes
	 * 
	 * Funktion: Ausgew‰hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Armband erforscht
	 * Es wird nur erforscht, wenn diese Uhr ¸berhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei Mˆglichen Uhren 
	 * ein neues Armband erforscht werden soll
	 */
	public void erforscheArmband(String segment, int index) {
		double kosten = 0;
		switch (segment) {
			case "Billig":
				kosten = Info.getKostenArmbandBillig()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrBillig = Uhrmodell.entwickleArmband(freigeschalteneAttrBillig, 1);
				break;
			case "Oeko":
				kosten = Info.getKostenArmbandOeko()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrOeko = Uhrmodell.entwickleArmband(freigeschalteneAttrOeko, 1);				
				break;
			case "Premium":
				kosten = Info.getKostenArmbandPremium()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrPremium = Uhrmodell.entwickleArmband(freigeschalteneAttrPremium, 1);
				break;
		}	
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Geh‰uses
	 * 
	 * Funktion: Ausgew‰hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Geh‰use erforscht
	 * Es wird nur erforscht, wenn diese Uhr ¸berhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei Mˆglichen Uhren 
	 * ein neues Geh‰use erforscht werden soll
	 */
	public void erforscheGehaeuse(String segment, int index) {
		double kosten = 0;
		switch (segment) {
			case "Billig":
				kosten = Info.getKostenGehaeuseBillig()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrBillig = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrBillig, 0);
				break;
			case "Oeko":
				kosten = Info.getKostenGehaeuseOeko()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrOeko = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrOeko, 0);				
				break;
			case "Premium":
				kosten = Info.getKostenGehaeusePremium()[index];
				if(checkeKapital(kosten))
					freigeschalteneAttrPremium = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrPremium, 0);
				break;
		}	
	}
	
	public int getUhrwerk(int uhr) {
		if(this.uhr[uhr] != null)
			return this.uhr[uhr].getUhrwerk();
		else
			return -1;
	}
	
	public int getArmband(int uhr) {
		if(this.uhr[uhr] != null)
			return this.uhr[uhr].getArmband();
		else
			return -1;
	}
	
	public int getGehaeuse(int uhr) {
		if(this.uhr[uhr] != null)
			return this.uhr[uhr].getGehaeuse();
		else
			return -1;
	}
	
	/**
	 * Methode erweitert die Produktion des ausgew‰hlten Segmentes
	 * 
	 * Funktion: Durch ein Switch-Case wird das Segment ¸berpr¸ft, in dem die
	 * Erweiterung durchgef¸hrt werden soll. Anschlieﬂend wird das Array
	 * durchlaufen um an der n‰chsten Stelle die Produktion freizuschalten, 
	 * vorausgesetzt das Kapital ist ausreichend. Auch hier die private Methode zum
	 * testen und zum Kapitalvermindern
	 * 
	 * @param segment: In welchem Segment erweitert werden soll
	 * @return: R¸ckgabe ob die Erweiterung erfolgreich war
	 */
	public boolean erweitereProduktion(String segment) {
		// Erweitert die Kapazit‰t -> erhˆht also das Produktionslimit
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					if(this.getKapaErwStraﬂeBillig()[i] == false) {
						if(checkeKapital(Info.getKostenProduktionBillig()[i])) {
							kapaErwStraﬂeBillig[i] = true;
							erhoeheProduktionslimit(segment, i);
							return true;
						}
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(this.getKapaErwStraﬂePremium()[i] == false) {
						if(checkeKapital(Info.getKostenProduktionPremium()[i])) {
							kapaErwStraﬂePremium[i] = true;
							erhoeheProduktionslimit(segment, i);
							return true;
						}
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(this.getKapaErwStraﬂeOeko()[i] == false) {
						if(checkeKapital(Info.getKostenProduktionOeko()[i])) {
							kapaErwStraﬂeOeko[i] = true;
							erhoeheProduktionslimit(segment, i);
							return true;
						}
					}
				}
				break;
			default:
				System.out.println("Falsches Segment");
				break;
		}
		return false;
	}	
	
	public boolean senkeProdKosten(String segment) {
		// Senkt die Produktionskosten
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					if(this.getProdKostenSenkungStraﬂeBillig()[i] == false) {
						if(checkeKapital(Info.getKostenProduktionBillig()[i])) {
							prodKostenSenkungStraﬂeBillig[i] = true;
							senkeProduktionskosten(segment, i);
							return true;
						}
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(this.getProdKostenSenkungStraﬂePremium()[i] == false) {
						if(checkeKapital(Info.getKostenProduktionPremium()[i])) {
							prodKostenSenkungStraﬂePremium[i] = true;
							senkeProduktionskosten(segment, i);
							return true;
						}
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(this.getProdKostenSenkungStraﬂeOeko()[i] == false) {
						if(checkeKapital(Info.getKostenProduktionOeko()[i])) {
							prodKostenSenkungStraﬂeOeko[i] = true;
							senkeProduktionskosten(segment, i);
							return true;
						}
					}
				}
				break;
			default:
				System.out.println("Falsches Segment");
				break;
		}
		return false;
	}
		
	public boolean erweitereEinkauf(String segment) {
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					if(verbesserungEinkaufBillig[i] == false) {
						if(checkeKapital(Info.getKostenEinkaufBillig()[i])) {
							verbesserungEinkaufBillig[i] = true;
							return true;
						}
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(verbesserungEinkaufPremium[i] == false) {
						if(checkeKapital(Info.getKostenEinkaufPremium()[i])) {
							verbesserungEinkaufPremium[i] = true;
							return true;
						}
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(verbesserungEinkaufOeko[i] == false) {
						if(checkeKapital(Info.getKostenEinkaufOeko()[i])) {
							verbesserungEinkaufOeko[i] = true;
							return true;
						}
					}
				}
				break;
			default:
				System.out.println("Falsches Segment");
				break;
		}
		return false;
	}
	
	/**
	 * 
	 * @param uhr: F¸r welche Uhr die Marketingstrategie ist
	 * @param anzKampagnen: Wie viele Marketingkampagnen gestartet werden
	 */
	public void uhrenMarketing(int uhr, boolean[] kampagne) {	
		// Kosten der Kampagnen berechnen
		double kostenMarketing = berechneMarketingkosten(kampagne, "Uhr");
		
		// Suche den Index
		int boostIndex = -1;
		for(int i = 0; i < 3; i++) {
			if(kampagne[i] == true)
				boostIndex = i;
		}
		
		// Nur wenn Kapital ausreichend ist UND es einen boost gibt UND wenn die Zufallszahl nicht zugeschlagen hat
		if(checkeKapital(kostenMarketing) && boostIndex != -1 && zufallMarketing())
			this.uhr[uhr].setMarketingboost(this.uhr[uhr].getMarketingboost() + Info.getScoreMarketingkampagne()[boostIndex]);
		else
			this.uhr[uhr].setMarketingboost(this.uhr[uhr].getMarketingboost());
	}
	
	public void unternehmenMarketing(boolean[] kampagne) {
		// Kosten der Kampagnen berechnen
		double kostenMarketing = berechneMarketingkosten(kampagne, "Unternehmen");
		
		// Suche den Index
		int boostIndex = -1;
		for(int i = 0; i < 3; i++) {
			if(kampagne[i] == true)
				boostIndex = i;
		}
		
		// Nur wenn Kapital ausreichend ist UND es einen boost gibt UND wenn die Zufallszahl nicht zugeschlagen hat
		if(checkeKapital(kostenMarketing) && boostIndex != -1 && zufallMarketing()) {
			// Marketingbosst auf alle Uhren anrechnen
			for(int i = 0; i < 3; i++) {
				if(this.uhr[i] != null)
					this.uhr[i].setMarketingboost(this.uhr[i].getMarketingboost() + Info.getScoreMarketingkampagne()[boostIndex]);
			}
		} else {
			for(int i = 0; i < 3; i++) {
				if(this.uhr[i] != null)
					this.uhr[i].setMarketingboost(this.uhr[i].getMarketingboost());
			}
		}
	}
	
	public void produzieren(int menge, int uhr) {
		if(this.uhr[uhr] != null) {
			int m = 0;
			double s = this.uhr[uhr].berechneSelbstkosten();
			double f = 0;
			// Segment abfragen
			switch(this.uhr[uhr].getSegment()) {
				case "Billig":
					f = sucheEinkaufsfaktor("Billig");
					if(f != 0)
						s *= f;
					m = testeMengeProduzieren( menge, uhr , this.getProduktionslimitBillig(), s);
					if(m != -1) {
						this.setKapital( this.getKapital() - (m * s) );
						this.uhr[uhr].setBestand(this.getBestandUhr(uhr) + m);
						}
					break;
				case "Oeko":
					f = sucheEinkaufsfaktor("Oeko");
					if(f != 0)
						s *= f;
					m = testeMengeProduzieren( menge, uhr, this.getProduktionslimitOeko(), s);
					if(m != -1)  {
						this.setKapital( this.getKapital() - (m * s) );
						this.uhr[uhr].setBestand(this.getBestandUhr(uhr) + m);
						}
					break;
				case "Premium":
					f = sucheEinkaufsfaktor("Premium");
					if(f != 0)
						s *= f;
					m = testeMengeProduzieren( menge, uhr , this.getProduktionslimitPremium(), s);
					if(m != -1)  {
						this.setKapital( this.getKapital() - (m * s) );
						this.uhr[uhr].setBestand(this.getBestandUhr(uhr) + m);
						}
					break;
			}
		}
	}
	
	public int bieteUhren(int menge, int uhr, double preis) {	
		if(this.uhr[uhr] != null) {
			int m = -1;
			// Genug zum Produzieren im Bestand?
			if(menge <= this.getBestandUhr(uhr)) {
				m = menge;
				this.uhr[uhr].setAngeboteneMenge(m);
			} else {
				m = this.getBestandUhr(uhr);
				this.uhr[uhr].setAngeboteneMenge(m);
			}
			this.uhr[uhr].setAngebotspreis(preis);
			return m;
		}
		return -1;
	}
	
	public void setAbgenommeneMenge(int menge, int uhr) {
		if(this.uhr[uhr] != null) {
			this.uhr[uhr].setAbgenommeneMenge(menge);
			// Verringere den Bestand um abgenommene Menge
			if( (this.uhr[uhr].getBestand() - menge) >= 0 )
				this.uhr[uhr].setBestand(this.uhr[uhr].getBestand() - menge);
			else
				this.uhr[uhr].setBestand(0);
		}
		this.addMengeZuArray(this.getBestandUhr(uhr));
	}
	
	/**
	 * Methode zum freischalten des Segments
	 * @param segment
	 */
	public void freischaltenSegment(String segment) {
		switch(segment) {
			case "Billig":
				if(checkeKapital(Info.getKostenSegmentBillig())) {
					if(this.freieSegmenteAllgemein[0] == false)
						this.freieSegmenteAllgemein[0] = true;
				}
				break;
			case "Oeko":
				if(checkeKapital(Info.getKostenSegmentOeko())) {
					if(this.freieSegmenteAllgemein[1] == false)
						this.freieSegmenteAllgemein[1] = true;
				}
				break;
			case "Premium":
				if(checkeKapital(Info.getKostenSegmentPremium())) {
					if(this.freieSegmenteAllgemein[2] == false)
						this.freieSegmenteAllgemein[2] = true;
				}
				break;
		}
	}
	
	// *** PRIVATE METHODEN
	private void addMengeZuArray(int menge) {
		for(int i = 0; i < 10; i++)
			if(this.verkaufteUhrenRunden[i] != -1)
				this.verkaufteUhrenRunden[i] = menge;
	}

	private boolean zufallMarketing() {
		// Zufallszahl zwischen 0 und 1
		Random rand = new Random();
		double z = rand.nextDouble();
		// zwischen 0.4 und 0.6 (incl)
		if(z >= 0.4 && z <= 0.6)
			return false;
		return true;
	}
	
	private double berechneMarketingkosten(boolean[] kampagne, String art) {
		double kosten = 0;
		for(int i = 0; i < 3; i++) {
			if(kampagne[i] == true) {
				if(art.equals("Uhr"))
					kosten += Info.getKostenMarketingUhr()[i];
				else
					kosten += Info.getKostenMarketingUnternehmen()[i];
			}
		}
		return kosten;
	}
	

	private double sucheEinkaufsfaktor(String segment) {
		double faktor = 0;
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					if(this.getVerbesserungEinkaufBillig()[i] == true) {
						faktor = Info.getRabatteEinkaufBillig()[i];
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(this.getVerbesserungEinkaufOeko()[i] == true) {
						faktor = Info.getRabatteEinkaufOeko()[i];
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(this.getVerbesserungEinkaufPremium()[i] == true) {
						faktor = Info.getRabatteEinkaufPremium()[i];
					}
				}
				break;
		}
		return faktor;
	}
	
	private int testeMengeProduzieren(int menge, int uhr, int limit, double prodKostenStueck) {
		int m = -1;
		// Produktionslimit testen
		if( (menge + this.getBestandUhr(uhr) ) > limit)
			menge = limit;
		// Berechnen wie viele mit vorhandenem Kapital produziert werden kˆnnen
		for(int i = menge; i > 0; i --) {
			double prodKosten = i * prodKostenStueck;
			if(prodKosten <= this.getKapital()) {
				m = i;
				break;
			}
		}
		return m;
	}
	
	/**
	 * Private Methode um Produktionslimit zu erhˆhen
	 * @param segment: In welchem Segment die Produktion erhoht wird
	 * @param stufe: Welche Erweiterungsstufe besteht
	 */
	private void erhoeheProduktionslimit(String segment, int stufe) {		
		switch(segment) {
			case "Billig":
				this.setProduktionslimitBillig(this.getProduktionslimitBillig() + (int)(this.getProduktionslimitBillig() * Info.getErweitereKapazitaetBillig()[stufe]));
				break;
			case "Oeko":
				this.setProduktionslimitOeko(this.getProduktionslimitOeko() + (int)(this.getProduktionslimitOeko() * Info.getErweitereKapazitaetOeko()[stufe]));
				break;
			case "Premium":
				this.setProduktionslimitPremium(this.getProduktionslimitPremium() + (int)(this.getProduktionslimitPremium() * Info.getErweitereKapazitaetPremium()[stufe]));
				break;
		}
	}
	
	private void senkeProduktionskosten(String segment, int stufe) {
		switch(segment) {
			case "Billig":
				this.setProduktionskostenBillig(this.getProduktionskostenBillig() - (int)(this.getProduktionskostenBillig() * Info.getSenkeProdKostenStrasseBillig()[stufe]));
				break;
			case "Oeko":
				this.setProduktionskostenOeko(this.getProduktionskostenOeko() - (int)(this.getProduktionskostenOeko() * Info.getSenkeProdKostenStrasseOeko()[stufe]));
				break;
			case "Premium":
				this.setProduktionskostenPremium(this.getProduktionskostenPremium() - (int)(this.getProduktionskostenPremium() * Info.getSenkeProdKostenStrassePremium()[stufe]));
				break;
		}
	}
	
	
	private boolean isFreigeschaltenSegment(String segment) {
		boolean result = false;
		switch(segment) {
			case "Billig":
				if(this.freieSegmenteAllgemein[0] == true)
					result = true;
				break;
			case "Oeko":
				if(this.freieSegmenteAllgemein[1] == true)
					result = true;
				break;
			case "Premium":
				if(this.freieSegmenteAllgemein[2] == true)
					result = true;
				break;
		}
		return result;
	}
		
	/**
	 * Private Methode um den n‰chsten index herauszufinden, an den die n‰chste Uhr soll
	 * 
	 * @return: index des n‰chsten freien Platzes f¸r die Uhr
	 */
	private int indexFreieUhr() {
		int result = -1;
		for(int i = 0; i < 3; i++) {
			if(uhr[i] == null) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	/**
	 * Private Methode um zu testen, ob genug Kapital vorhanden ist
	 * Kapital wird auch direkt um die Kosten vermindert
	 * 
	 * @param kosten: ‹bergabewert der anstehenden Kosten
	 * @return true -> Wenn genug Kosten vorhanden; false wenn nicht
	 */
	private boolean checkeKapital(double kosten) {
		if( (this.kapital - kosten) >= 0) {
			this.kapital -= kosten;
			return true;
		}
		else
			return false;
	}
	
	/*
	 * Getter / Setter
	 */
	

	private void setKapitalAlt(double kapitalAlt) {
		this.kapitalAlt = kapitalAlt;
	}
	
	public iUhrenkategorie[] getUhr() {
		return uhr;
	}
	
	public boolean[] getProdKostenSenkungStraﬂeBillig() {
		return this.prodKostenSenkungStraﬂeBillig;
	}

	public boolean[] getProdKostenSenkungStraﬂeOeko() {
		return this.prodKostenSenkungStraﬂeOeko;
	}

	public boolean[] getProdKostenSenkungStraﬂePremium() {
		return this.prodKostenSenkungStraﬂePremium;
	}
	
	public boolean[] getKapaErwStraﬂeBillig() {
		return kapaErwStraﬂeBillig;
	}

	public boolean[] getKapaErwStraﬂeOeko() {
		return kapaErwStraﬂeOeko;
	}

	public boolean[] getKapaErwStraﬂePremium() {
		return kapaErwStraﬂePremium;
	}

	public boolean[] getVerbesserungEinkaufBillig() {
		return verbesserungEinkaufBillig;
	}

	public boolean[] getVerbesserungEinkaufOeko() {
		return verbesserungEinkaufOeko;
	}

	public boolean[] getVerbesserungEinkaufPremium() {
		return verbesserungEinkaufPremium;
	}

	public double getKapital() {
		return this.kapital;
	}

	public void setKapital(double kapital) {
		this.kapital = kapital;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKapitalAlt() {
		return this.kapitalAlt;
	}
	
	public void setSpielerDaten(int uhr, int indexUhrwerk, int indexArmband, int indexGehaeuse) {
		System.out.println("Erstens");
		if(this.uhr[uhr] !=  null) {
			// ‹berpr¸fen ob eine Umr¸stung stattgefunden hat
			if(this.uhr[uhr].getUhrwerk() == indexUhrwerk && this.uhr[uhr].getArmband() == indexArmband 
					&& this.uhr[uhr].getGehaeuse() == indexGehaeuse) {
				System.out.println("Zweitens");
				// Uhrenkonfiguration ist identisch
				this.uhr[uhr].setSpielerDaten(indexArmband, indexGehaeuse, indexUhrwerk);
				this.uhr[uhr].setSelbstkosten();
				this.uhr[uhr].berechneMarktwert();
			}else {
				System.out.println("Drittens");
				// Uhrenkonfiguration hat sich ge‰ndert - Umr¸stkosten werden berechnet
				double umruest = this.uhr[uhr].berechneSelbstkosten() * 0.4 * this.uhr[uhr].getBestand();
				if(checkeKapital(umruest)) {
					this.setKapital( this.getKapital() - umruest);
					this.uhr[uhr].setSpielerDaten(indexArmband, indexGehaeuse, indexUhrwerk);
					this.uhr[uhr].setSelbstkosten();
					this.uhr[uhr].berechneMarktwert();
				} else {
					System.out.println("Nicht genug Kohle!!!");
				}
			}			
		}
		System.out.println("Selbst " + this.uhr[uhr].getSelbstkosten());
		System.out.println("Markt " + this.uhr[uhr].getMarktwert());
	}
		
	public int getBestandUhr(int uhr) {
		if(this.uhr[uhr] != null)
			return this.uhr[uhr].getBestand();
		return 0;
	}
	
	public void setBestandUhr(int uhr, int menge) {
		if(this.uhr[uhr] != null)
			this.uhr[uhr].setBestand(menge);
	}

	public boolean[] getFreieSegmenteAllgemein() {
		return this.freieSegmenteAllgemein;
	}
	
	public boolean[][] getFreigeschalteneAttrBillig() {
		return freigeschalteneAttrBillig;
	}

	public void setFreigeschalteneAttrBillig(boolean[][] freigeschalteneAttrBillig) {
		this.freigeschalteneAttrBillig = freigeschalteneAttrBillig;
	}

	public boolean[][] getFreigeschalteneAttrOeko() {
		return freigeschalteneAttrOeko;
	}

	public void setFreigeschalteneAttrOeko(boolean[][] freigeschalteneAttrOeko) {
		this.freigeschalteneAttrOeko = freigeschalteneAttrOeko;
	}

	public boolean[][] getFreigeschalteneAttrPremium() {
		return freigeschalteneAttrPremium;
	}

	public void setFreigeschalteneAttrPremium(boolean[][] freigeschalteneAttrPremium) {
		this.freigeschalteneAttrPremium = freigeschalteneAttrPremium;
	}

	public int getProduktionslimitBillig() {
		return produktionslimitBillig;
	}

	public void setProduktionslimitBillig(int produktionslimitBillig) {
		this.produktionslimitBillig = produktionslimitBillig;
	}

	public int getProduktionslimitOeko() {
		return produktionslimitOeko;
	}

	public void setProduktionslimitOeko(int produktionslimitOeko) {
		this.produktionslimitOeko = produktionslimitOeko;
	}

	public int getProduktionslimitPremium() {
		return produktionslimitPremium;
	}

	public void setProduktionslimitPremium(int produktionslimitPremium) {
		this.produktionslimitPremium = produktionslimitPremium;
	}

	public int getProduktionskostenBillig() {
		return produktionskostenBillig;
	}

	public void setProduktionskostenBillig(int produktionskostenBillig) {
		this.produktionskostenBillig = produktionskostenBillig;
	}

	public int getProduktionskostenOeko() {
		return produktionskostenOeko;
	}

	public void setProduktionskostenOeko(int produktionskostenOeko) {
		this.produktionskostenOeko = produktionskostenOeko;
	}

	public int getProduktionskostenPremium() {
		return produktionskostenPremium;
	}

	public void setProduktionskostenPremium(int produktionskostenPremium) {
		this.produktionskostenPremium = produktionskostenPremium;
	}

	public int[] getVerkaufteUhrenRunden() {
		return verkaufteUhrenRunden;
	}
}

