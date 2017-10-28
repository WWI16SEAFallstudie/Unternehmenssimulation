package func;

public class Unternehmen {

	/*
	 * Attribute name und vorhandenes Kapital im Unternehmen
	 */
	private String name;
	private double kapital;
	private double kapitalAlt;
	private String info;
	
	// Produktionslimit speichern
	private int produktionslimitBillig = 100000;
	private int produktionslimitOeko = 30000;
	private int produktionslimitPremium = 10000;

	// Produktionskosten speichern
	private int produktionskostenBillig = 10000;
	private int produktionskostenOeko = 10000;
	private int produktionskostenPremium = 10000;
		
	/*
	 * Array f�r entsprechenden Uhren angelegt 
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
	
	/**
	 * selbstkostenarray wie oben nur mit werten anstatt true/false
	 * In Produktion dann die selbstkosten(einzelpositionen was freigeschaltet is) * menge und diese vom Kapital abziehen!!! -> Produziere() �ndern
	 */
	
	/*
	 * Produktionskostensenkung pro Segment
	 */
	private boolean prodKostenSenkungStra�eBillig[] = { false, false, false};
	private boolean prodKostenSenkungStra�eOeko[] = { false, false, false};
	private boolean prodKostenSenkungStra�ePremium[] = { false, false, false};
	
	/*
	 * Kapazit�tserweiterung pro Segment
	 */
	private boolean kapaErwStra�eBillig[] = { false, false, false};
	private boolean kapaErwStra�eOeko[] = { false, false, false};
	private boolean kapaErwStra�ePremium[] = { false, false, false};
		
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
		this.setInfo("Hier k�nnte Ihre Werbung stehen");
		this.setKapital(1000000);		
		this.setKapitalAlt(0);
		this.setName(name);
	}
	
	/**
	 * Methoden soll eine weitere Uhr erforschen
	 * 
	 * Funktionsweise: Durch �bergabe des Segments, wird �ber einen switch-case abgefragt,
	 * welches Segment ausgew�hlt wurde und dementsprechend wird ein neues Uhrmodell an der
	 * Stelle 'index' erzeugt. Jedoch nur, wenn genug Kapital vorhanden ist. Dies wird in einer
	 * privaten Methode getestet und das Kapital wird vermindert, wenn es ausreichend ist.
	 * Der 'index' wird durch eine private Methode abgefragt, um
	 * herauszufinden welches die n�chste Freie Uhr ist.
	 * 
	 * @param segment: Gibt an, in welchem Segment die Uhr erforscht werden soll
	 * M�gliche Segmente: Billig, Luxus, �ko
	 * @return: Uhrerforschung erfolgreich / nicht erfolgreich
	 */
	public boolean erforscheUhr(String segment) {
		boolean result = false;
		// Test auf naechste Freie Uhr
		int index = indexFreieUhr();
		
		// Wenn alle Uhren entwickelt oder nicht genug Kohle-> false zur�ckgeben;
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
	 * Funktion: Ausgew�hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Uhrwerk erforscht
	 * Es wird nur erforscht, wenn diese Uhr �berhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei M�glichen Uhren 
	 * ein neues Uhrwerk erforscht werden soll
	 */
	public void erforscheUhrwerk(String segment) {
		switch (segment) {
			case "Billig":
				freigeschalteneAttrBillig = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrBillig, 2);
				break;
			case "Oeko":
				freigeschalteneAttrOeko = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrOeko, 2);				
				break;
			case "Premium":
				freigeschalteneAttrPremium = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrPremium, 2);
				break;
		}	
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Armbandes
	 * 
	 * Funktion: Ausgew�hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Armband erforscht
	 * Es wird nur erforscht, wenn diese Uhr �berhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei M�glichen Uhren 
	 * ein neues Armband erforscht werden soll
	 */
	public void erforscheArmband(String segment) {
		switch (segment) {
			case "Billig":
				freigeschalteneAttrBillig = Uhrmodell.entwickleArmband(freigeschalteneAttrBillig, 1);
				break;
			case "Oeko":
				freigeschalteneAttrOeko = Uhrmodell.entwickleArmband(freigeschalteneAttrOeko, 1);				
				break;
			case "Premium":
				freigeschalteneAttrPremium = Uhrmodell.entwickleArmband(freigeschalteneAttrPremium, 1);
				break;
		}	
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Geh�uses
	 * 
	 * Funktion: Ausgew�hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Geh�use erforscht
	 * Es wird nur erforscht, wenn diese Uhr �berhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei M�glichen Uhren 
	 * ein neues Geh�use erforscht werden soll
	 */
	public void erforscheGehaeuse(String segment) {
		switch (segment) {
			case "Billig":
				freigeschalteneAttrBillig = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrBillig, 0);
				break;
			case "Oeko":
				freigeschalteneAttrOeko = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrOeko, 0);				
				break;
			case "Premium":
				freigeschalteneAttrPremium = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrPremium, 0);
				break;
		}	
	}
	
	
	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Uhrwerke enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Uhrwerk zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Uhrwerke
	 */
//	public boolean[] getUhrwerk(int uhr) {
//		return null; //this.uhr[uhr].getUhrwerk();
//	}

	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Armb�nder enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Armband zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Armband
	 */
//	public boolean[] getArmband(int uhr) {
//		return null; //this.uhr[uhr].getArmband();
//	}
	
	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Geh�use enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Geh�use zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Geh�use
	 */
//	public boolean[] getGehaeuse(int uhr) {
//		return null; //this.uhr[uhr].getGehaeuse();
//	}
	
	
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
	 * Methode erweitert die Produktion des ausgew�hlten Segmentes
	 * 
	 * Funktion: Durch ein Switch-Case wird das Segment �berpr�ft, in dem die
	 * Erweiterung durchgef�hrt werden soll. Anschlie�end wird das Array
	 * durchlaufen um an der n�chsten Stelle die Produktion freizuschalten, 
	 * vorausgesetzt das Kapital ist ausreichend. Auch hier die private Methode zum
	 * testen und zum Kapitalvermindern
	 * 
	 * @param segment: In welchem Segment erweitert werden soll
	 * @return: R�ckgabe ob die Erweiterung erfolgreich war
	 */
	public boolean erweitereProduktion(String segment) {
		// Erweitert die Kapazit�t -> erh�ht also das Produktionslimit
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					if(this.getKapaErwStra�eBillig()[i] == false) {
						if(checkeKapital(Info.getErweitereKapazit�tBillig()[i])) {
							kapaErwStra�eBillig[i] = true;
							erhoeheProduktionslimit(segment, i);
							return true;
						}
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(this.getKapaErwStra�ePremium()[i] == false) {
						if(checkeKapital(Info.getErweitereKapazit�tPremium()[i])) {
							kapaErwStra�ePremium[i] = true;
							erhoeheProduktionslimit(segment, i);
							return true;
						}
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(this.getKapaErwStra�eOeko()[i] == false) {
						if(checkeKapital(Info.getErweitereKapazit�tOeko()[i])) {
							kapaErwStra�eOeko[i] = true;
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
					if(this.getProdKostenSenkungStra�eBillig()[i] == false) {
						if(checkeKapital(Info.getSenkeProdKostenStra�eBillig()[i])) {
							prodKostenSenkungStra�eBillig[i] = true;
							senkeProduktionskosten(segment, i);
							return true;
						}
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(this.getProdKostenSenkungStra�ePremium()[i] == false) {
						if(checkeKapital(Info.getSenkeProdKostenStra�ePremium()[i])) {
							prodKostenSenkungStra�ePremium[i] = true;
							senkeProduktionskosten(segment, i);
							return true;
						}
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(this.getProdKostenSenkungStra�eOeko()[i] == false) {
						if(checkeKapital(Info.getSenkeProdKostenStra�eOeko()[i])) {
							prodKostenSenkungStra�eOeko[i] = true;
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
							senkeAnschaffungskosten(segment, i);
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
							senkeAnschaffungskosten(segment, i);
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
							senkeAnschaffungskosten(segment, i);
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
	 * @param uhr: F�r welche Uhr die Marketingstrategie ist
	 */
	public void uhrenMarketing(int uhr) {
	
	}
	
	public void produzieren(int menge, int uhr) {
		int m = 0;
		int u = 0;
		// Segment abfragen
		switch(this.uhr[uhr].getSegment()) {
			case "Billig":
				u = errechneSelbstkosten(this.getFreigeschalteneAttrBillig(), "Billig");
				m = testeMengeProduzieren( (menge + this.getBestandUhr(uhr)) , this.getProduktionslimitBillig(), u);
				if(m != -1) 
					this.uhr[uhr].setBestand(m);
				break;
			case "Oeko":
				u = errechneSelbstkosten(this.getFreigeschalteneAttrBillig(), "Oeko");
				m = testeMengeProduzieren( (menge + this.getBestandUhr(uhr)) , this.getProduktionslimitOeko(), u);
				if(m != -1) 
					this.uhr[uhr].setBestand(m);
				break;
			case "Premium":
				u = errechneSelbstkosten(this.getFreigeschalteneAttrBillig(), "Premium");
				m = testeMengeProduzieren( (menge + this.getBestandUhr(uhr)) , this.getProduktionslimitPremium(), u);
				if(m != -1) 
					this.uhr[uhr].setBestand(m);
				break;
		}
	}
	
//	public int bieteUhren(int menge, int uhr) {	
//		int m = -1;
//		if(menge <= this.getBestandUhr(uhr)) {
//			m = menge;
//			this.uhr[uhr].setAngeboteneMenge(menge);
//		} else {
//			m = this.getBestandUhr(uhr);
//			this.uhr[uhr].setAngeboteneMenge(this.getBestandUhr(uhr));
//		}
//		return m;
//	}
	
	public int bieteUhren(int menge, int uhr, int preis) {	
		int m = -1;
		if(menge <= this.getBestandUhr(uhr)) {
			m = menge;
			this.uhr[uhr].setAngeboteneMenge(menge);
		} else {
			m = this.getBestandUhr(uhr);
			this.uhr[uhr].setAngeboteneMenge(this.getBestandUhr(uhr));
		}
		this.uhr[uhr].setAngebotspreis(preis);
		return m;
	}
	
	public void setAbgenommeneMenge(int menge, int uhr) {
		if(this.uhr[uhr] != null) {
			this.uhr[uhr].setAbgenommeneMenge(menge);
			// Verringere den Bestand um abgenommene Menge
			if( (this.uhr[uhr].getBestand() + menge) >= 0 )
				this.uhr[uhr].setBestand(this.uhr[uhr].getBestand() - menge);
			else
				this.uhr[uhr].setBestand(0);
		}
	}
	
	private int errechneSelbstkosten(boolean[][] freigeschalten, String segment) {
		int result = 0;
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(freigeschalten[i][j] == true)
							result += Info.getSelbstkostenBillig()[i];
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(freigeschalten[i][j] == true)
							result += Info.getSelbstkostenBillig()[i];
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if(freigeschalten[i][j] == true)
							result += Info.getSelbstkostenBillig()[i];
					}
				}
				break;
		}
		return result;
	}
	
	private int testeMengeProduzieren(int menge, int limit, double prodKostenStueck) {
		int m = -1;
		// Produktionslimit testen
		if(menge > limit)
			menge = limit;
		// Berechnen wie viele mit vorhandenem Kapital produziert werden k�nnen
		for(int i = menge; i > 0; i --) {
			double prodKosten = menge * prodKostenStueck;
			if(prodKosten <= this.kapital) {
				m = i;
				break;
			}
		}
		return m;
	}
	
	/**
	 * Private Methode um Anschaffungskosten zu senken
	 * @param segment: 
	 * @param stufe
	 */
	private void senkeAnschaffungskosten(String segment, int stufe) {
		/*int temp[];
		switch(segment) {
			case "Billig":
				
				Info.setSelbstkostenBillig({10, 20, 30});
				this.setAnschaffungskostenBillig(this.getAnschaffungskostenBillig() - (this.getAnschaffungskostenBillig() * Info.getRabatteEinkaufBillig()[stufe]));
				break;
			case "Oeko":
				this.setAnschaffungskostenOeko(this.getAnschaffungskostenOeko() - (this.getAnschaffungskostenOeko() * Info.getRabatteEinkaufOeko()[stufe]));
				break;
			case "Premium":
				this.setAnschaffungskostenPremium(this.getAnschaffungskostenPremium() - (this.getAnschaffungskostenPremium() * Info.getRabatteEinkaufPremium()[stufe]));
				break;
		}*/
	}
	
	/**
	 * Private Methode um Produktionslimit zu erh�hen
	 * @param segment: In welchem Segment die Produktion erhoht wird
	 * @param stufe: Welche Erweiterungsstufe besteht
	 */
	private void erhoeheProduktionslimit(String segment, int stufe) {		
		switch(segment) {
			case "Billig":
				this.setProduktionslimitBillig(this.getProduktionslimitBillig() + (int)(this.getProduktionslimitBillig() * Info.getErweitereKapazit�tBillig()[stufe]));
				break;
			case "Oeko":
				this.setProduktionslimitOeko(this.getProduktionslimitOeko() + (int)(this.getProduktionslimitOeko() * Info.getErweitereKapazit�tOeko()[stufe]));
				break;
			case "Premium":
				this.setProduktionslimitPremium(this.getProduktionslimitPremium() + (int)(this.getProduktionslimitPremium() * Info.getErweitereKapazit�tPremium()[stufe]));
				break;
		}
	}
	
	private void senkeProduktionskosten(String segment, int stufe) {
		switch(segment) {
			case "Billig":
				this.setProduktionskostenBillig(this.getProduktionskostenBillig() - (int)(this.getProduktionskostenBillig() * Info.getSenkeProdKostenStra�eBillig()[stufe]));
				break;
			case "Oeko":
				this.setProduktionskostenOeko(this.getProduktionskostenOeko() - (int)(this.getProduktionskostenOeko() * Info.getSenkeProdKostenStra�eOeko()[stufe]));
				break;
			case "Premium":
				this.setProduktionskostenPremium(this.getProduktionskostenPremium() - (int)(this.getProduktionskostenPremium() * Info.getSenkeProdKostenStra�ePremium()[stufe]));
				break;
		}
	}
	
	/**
	 * Methode zum freischalten des Segments
	 * @param segment
	 */
	public void freischaltenSegment(String segment) {
		switch(segment) {
			case "Billig":
				if(this.freieSegmenteAllgemein[0] == false)
					this.freieSegmenteAllgemein[0] = true;
				break;
			case "Oeko":
				if(this.freieSegmenteAllgemein[1] == false)
					this.freieSegmenteAllgemein[1] = true;
				break;
			case "Premium":
				if(this.freieSegmenteAllgemein[2] == false)
					this.freieSegmenteAllgemein[2] = true;
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
	 * Private Methode um den n�chsten index herauszufinden, an den die n�chste Uhr soll
	 * 
	 * @return: index des n�chsten freien Platzes f�r die Uhr
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
	 * @param kosten: �bergabewert der anstehenden Kosten
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
	
	@Override
	public String toString() {			
		String temp = name + "\n";
		for(int i = 0; i < uhr.length; i++) {
			if(uhr[i] != null) {

				temp += "Uhr" + i + " Segment: " + uhr[i].getSegment() + " ";
				switch(uhr[i].getSegment()) {
					case "Billig":
						for(boolean s[] : this.freigeschalteneAttrBillig) {
							for(boolean k : s) {
								temp += k + " ";
							}
							temp += " - ";
						}
						break;
					case "Oeko":
						for(boolean s[] : this.freigeschalteneAttrOeko) {
							for(boolean k : s) {
								temp += k + " ";
							}
							temp += " - ";
						}
						break;
					case "Premium":
						for(boolean s[] : this.freigeschalteneAttrPremium) {
							for(boolean k : s) {
								temp += k + " ";
							}
							temp += " - ";
						}
						break;
				}
				
				
				// **ALT
				/*temp += "Uhr" + i + " Segment: " + uhr[i].getSegment() + " ";
				temp += " Uhrwerk: ";
				for(boolean s : uhr[i].getUhrwerk()) {
					temp += s + " ";
				}
				temp += " Armband: ";
				for(boolean s : uhr[i].getArmband()) {
					temp += s + " ";
				}
				temp += " Geh�use: ";
				for(boolean s : uhr[i].getGehaeuse()) {
					temp += s + " ";
				}
				temp += "\n";*/
				
			}
		}
		return (temp);
	}

	/*
	 * Getter / Setter
	 */
	

	public iUhrenkategorie[] getUhr() {
		return uhr;
	}
	
	public boolean[] getProdKostenSenkungStra�eBillig() {
		return this.prodKostenSenkungStra�eBillig;
	}

	public boolean[] getProdKostenSenkungStra�eOeko() {
		return this.prodKostenSenkungStra�eOeko;
	}

	public boolean[] getProdKostenSenkungStra�ePremium() {
		return this.prodKostenSenkungStra�ePremium;
	}
	
	public boolean[] getKapaErwStra�eBillig() {
		return kapaErwStra�eBillig;
	}

	public boolean[] getKapaErwStra�eOeko() {
		return kapaErwStra�eOeko;
	}

	public boolean[] getKapaErwStra�ePremium() {
		return kapaErwStra�ePremium;
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

	private void setKapitalAlt(double kapitalAlt) {
		this.kapitalAlt = kapitalAlt;
	}
	
	public void setSpielerDaten(int uhr, int indexUhrwerk, int indexArmband, int indexGehaeuse) {
		if(this.uhr[uhr] !=  null) {
			this.uhr[uhr].setSpielerDaten(indexArmband, indexGehaeuse, indexUhrwerk);
		}
	}
	
	public String getSpielerDaten(int uhr) {
		if(this.uhr[uhr] != null)
			return this.uhr[uhr].getSpielerDaten();
		else
			return null;
	}
	
	public int getBestandUhr(int uhr) {
		if(this.uhr[uhr] != null)
			return this.uhr[uhr].getBestand();
		return -1;
	}
	
	public void setBestandUhr(int uhr, int menge) {
		if(this.uhr[uhr] != null)
			this.uhr[uhr].setBestand(menge);
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
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
	
	
	
	
	
}
