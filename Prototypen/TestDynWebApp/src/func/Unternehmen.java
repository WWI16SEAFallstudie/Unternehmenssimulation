package func;

public class Unternehmen {

	/*
	 * Attribute name und vorhandenes Kapital im Unternehmen
	 */
	private String name;
	private double kapital;
	private double kapitalAlt;
	private String info;
	private int produktionslimitBillig = 10000;
	private int produktionslimitOeko = 10000;
	private int produktionslimitPremium = 10000;
	
	/*
	 * Array f�r entsprechenden Uhren angelegt 
	 * iUhrenkategorie ist ein Interface, welches von BilligUhr, OekoUhr und PremiumUhr implementiert wurde
	 * -> Polymorphismus
	 */
	private iUhrenkategorie uhr[] = new iUhrenkategorie[3];
	
	/*
	 * Hier wird gespeichert, welche Segmente schon freigeschaltet wurden
	 * index:
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
	 * Produktionserweiterungen pro Segment
	 */
	private boolean prodStra�eBillig[] = { false, false, false};
	private boolean prodStra�eOeko[] = { false, false, false};
	private boolean prodStra�ePremium[] = { false, false, false};
		
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
			// Segment freischalten
			this.freischaltenSegment(segment);
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
	public void erforscheUhrwerk(int uhr) {
		if(this.uhr[uhr] != null) {
			String segment = this.uhr[uhr].getSegment();
					
			switch (segment) {
				case "Billig":
					freigeschalteneAttrBillig = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrBillig, 1);
					break;
				case "Oeko":
					freigeschalteneAttrOeko = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrOeko, 1);				
					break;
				case "Premium":
					freigeschalteneAttrPremium = Uhrmodell.entwickleUhrwerk(freigeschalteneAttrPremium, 1);
					break;
			}	
		}
		
		// **Alt
		/*if(this.uhr[uhr] != null) {
			this.uhr[uhr].entwickleUhrwerk();
			entwickleAttrImSegment(segment, "Uhrwerk");
		}*/
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
	public void erforscheArmband(int uhr) {
		if(this.uhr[uhr] != null) {
			String segment = this.uhr[uhr].getSegment();
			
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
		
		
		// **ALT
		/*
		if(this.uhr[uhr] != null)
			this.uhr[uhr].entwickleArmband(); */
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
	public void erforscheGehaeuse(int uhr) {
		if(this.uhr[uhr] != null) {
			String segment = this.uhr[uhr].getSegment();
			
			switch (segment) {
				case "Billig":
					freigeschalteneAttrBillig = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrBillig, 1);
					break;
				case "Oeko":
					freigeschalteneAttrOeko = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrOeko, 1);				
					break;
				case "Premium":
					freigeschalteneAttrPremium = Uhrmodell.entwickleGehaeuse(freigeschalteneAttrPremium, 1);
					break;
			}	
		}
		
		// **ALT
		/*
		if(this.uhr[uhr] != null)
			this.uhr[uhr].entwickleGehause();*/
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
	
	
	public String getUhrwerk(int uhr) {
		return this.uhr[uhr].getUhrwerk();
	}
	
	public String getArmband(int uhr) {
		return this.uhr[uhr].getArmband();
	}
	
	public String getGehaeuse(int uhr) {
		return this.uhr[uhr].getGehaeuse();
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
		switch(segment) {
			case "Billig":
				for(int i = 0; i < 3; i++) {
					if(prodStra�eBillig[i] == false) {
						if(checkeKapital(Info.getKostenProduktionBillig()[i])) {
							prodStra�eBillig[i] = true;
							return true;
						}
					}
				}
				break;
			case "Premium":
				for(int i = 0; i < 3; i++) {
					if(prodStra�ePremium[i] == false) {
						if(checkeKapital(Info.getKostenProduktionPremium()[i])) {
							prodStra�ePremium[i] = true;
							return true;
						}
					}
				}
				break;
			case "Oeko":
				for(int i = 0; i < 3; i++) {
					if(prodStra�eOeko[i] == false) {
						if(checkeKapital(Info.getKostenProduktionOeko()[i])) {
							prodStra�eOeko[i] = true;
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
		
	public void erweitereEinkauf(String segment) {
		// Hier sollen die Kosten im Einkauf gesenkt werden
	}
	
	/**
	 * 
	 * @param uhr: F�r welche Uhr die Marketingstrategie ist
	 */
	public void uhrenMarketing(int uhr) {
	
	}
	
	private void erhoeheProduktionslimit(String segment) {
		// Soll durch erweitereProduktion aufgerufen werden!
		// produktionslimitBillig, produktionslimitOeko, produktionslimitPremium
	}
	
	/**
	 * Private Methode zum freischalten des Segments
	 * @param segment
	 */
	private void freischaltenSegment(String segment) {
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
	
	/*->Ungenutzt momentan
	private void entwickleAttrImSegment(String segment, String attr) {
		int index = -1;
		boolean result = false;
		switch(segment) {
			case "Billig":
				switch(attr) {
					case "Gehaeuse":
						index = indexFreiesAttr(freigeschalteneAttrBillig, 0);
						if(index != -1) {
							this.freigeschalteneAttrBillig[0][index] = true;
						}
						break;
					case "Armband":
						index = indexFreiesAttr(freigeschalteneAttrBillig, 1);
						if(index != -1) {
							this.freigeschalteneAttrBillig[1][index] = true;
						}
						break;
					case "Uhrwerk":
						index = indexFreiesAttr(freigeschalteneAttrBillig, 2);
						if(index != -1) {
							this.freigeschalteneAttrBillig[2][index] = true;
						}
					break;
				}
				break;
			case "Oeko":
				switch(attr) {
					case "Gehaeuse":
						index = indexFreiesAttr(freigeschalteneAttrOeko, 0);
						if(index != -1) {
							this.freigeschalteneAttrOeko[0][index] = true;
						}
						break;
					case "Armband":
						index = indexFreiesAttr(freigeschalteneAttrOeko, 1);
						if(index != -1) {
							this.freigeschalteneAttrOeko[1][index] = true;
						}
						break;
					case "Uhrwerk":
						index = indexFreiesAttr(freigeschalteneAttrOeko, 2);
						if(index != -1) {
							this.freigeschalteneAttrOeko[2][index] = true;
						}
					break;
				}
				break;
			case "Premium":
				switch(attr) {
					case "Gehaeuse":
						index = indexFreiesAttr(freigeschalteneAttrPremium, 0);
						if(index != -1) {
							this.freigeschalteneAttrPremium[0][index] = true;
						}
						break;
					case "Armband":
						index = indexFreiesAttr(freigeschalteneAttrPremium, 1);
						if(index != -1) {
							this.freigeschalteneAttrPremium[1][index] = true;
						}
						break;
					case "Uhrwerk":
						index = indexFreiesAttr(freigeschalteneAttrPremium, 2);
						if(index != -1) {
							this.freigeschalteneAttrPremium[2][index] = true;
						}
					break;
				}
				break;
		}
	}
	*/
	
	private int indexFreiesAttr(boolean[][] array, int indexFest) {
		for(int i = 0; i < 3; i++) {
			if( array[indexFest][i] == false ) 
				return i;
		}
		return -1;
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
	
	public boolean[] getProdStra�eBillig() {
		return this.prodStra�eBillig;
	}

	public boolean[] getProdStra�eOeko() {
		return this.prodStra�eOeko;
	}

	public boolean[] getProdStra�ePremium() {
		return this.prodStra�ePremium;
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
		switch(this.uhr[uhr].getSegment()) {
			case "Billig":
				this.uhr[uhr].setSpielerDaten(Uhrmodell.sucheAttributImArmband("Billig", indexArmband),
						Uhrmodell.sucheAttributImGehaeuse("Billig", indexGehaeuse),
						Uhrmodell.sucheAttributImUhrwerk("Billig", indexUhrwerk));
				break;
			case "Oeko":
				this.uhr[uhr].setSpielerDaten(Uhrmodell.sucheAttributImArmband("Oeko", indexArmband),
						Uhrmodell.sucheAttributImGehaeuse("Oeko", indexGehaeuse),
						Uhrmodell.sucheAttributImUhrwerk("Oeko", indexUhrwerk));
				break;
			case "Premium":
				this.uhr[uhr].setSpielerDaten(Uhrmodell.sucheAttributImArmband("Premium", indexArmband),
						Uhrmodell.sucheAttributImGehaeuse("Premium", indexGehaeuse),
						Uhrmodell.sucheAttributImUhrwerk("Premium", indexUhrwerk));
				break;
		}
	}
	
	public String getSpielerDaten(int uhr) {
		return this.uhr[uhr].getSpielerDaten();
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
	
	
}
