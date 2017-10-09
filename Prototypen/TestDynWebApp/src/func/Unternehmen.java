package func;

public class Unternehmen {

	/*
	 * Attribute name und vorhandenes Kapital im Unternehmen
	 */
	private String name;
	private double kapital;
	private double kapitalAlt;
	private String info;
	
	/*
	 * Array für entsprechenden Uhren angelegt 
	 * iUhrenkategorie ist ein Interface, welches von BilligUhr, OekoUhr und PremiumUhr implementiert wurde
	 * -> Polymorphismus
	 */
	private iUhrenkategorie uhr[] = new iUhrenkategorie[3];
	
	/*
	 * Produktionserweiterungen pro Segment
	 */
	private boolean prodStraßeBillig[] = { false, false, false};
	private boolean prodStraßeOeko[] = { false, false, false};
	private boolean prodStraßePremium[] = { false, false, false};
		
	/*
	 * Konstruktor
	 */
	public Unternehmen(String name) {
		this.setInfo("Hier könnte Ihre Werbung stehen");
		this.setKapital(1000000);		
		this.setKapitalAlt(0);
		this.setName(name);
	}
	
	/**
	 * Methoden soll eine weitere Uhr erforschen
	 * 
	 * Funktionsweise: Durch Übergabe des Segments, wird über einen switch-case abgefragt,
	 * welches Segment ausgewählt wurde und dementsprechend wird ein neues Uhrmodell an der
	 * Stelle 'index' erzeugt. Jedoch nur, wenn genug Kapital vorhanden ist. Dies wird in einer
	 * privaten Methode getestet und das Kapital wird vermindert, wenn es ausreichend ist.
	 * Der 'index' wird durch eine private Methode abgefragt, um
	 * herauszufinden welches die nächste Freie Uhr ist.
	 * 
	 * @param segment: Gibt an, in welchem Segment die Uhr erforscht werden soll
	 * Mögliche Segmente: Billig, Luxus, Öko
	 */
	public void erforscheUhr(String segment) {		
		int index = indexFreieUhr();
		if(index != -1 ) {
			switch(segment) {
			case "Billig":
				if(checkeKapital(Info.kostenUhrBillig))
					this.uhr[index] = new BilligUhr();
				else
					System.out.println("Nicht genug Kohle!");
				break;
			case "Premium":
				if(checkeKapital(Info.kostenUhrPremium))
					this.uhr[index] = new PremiumUhr();
				else
					System.out.println("Nicht genug Kohle!");
				break;
			case "Oeko":
				if(checkeKapital(Info.kostenUhrOeko))
					this.uhr[index] = new OekoUhr();
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
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Uhrwerkes
	 * 
	 * Funktion: Ausgewählte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Uhrwerk erforscht
	 * Es wird nur erforscht, wenn diese Uhr überhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei Möglichen Uhren 
	 * ein neues Uhrwerk erforscht werden soll
	 */
	public void erforscheUhrwerk(int uhr) {
		if(this.uhr[uhr] != null)
			this.uhr[uhr].entwickleUhrwerk();
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Armbandes
	 * 
	 * Funktion: Ausgewählte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Armband erforscht
	 * Es wird nur erforscht, wenn diese Uhr überhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei Möglichen Uhren 
	 * ein neues Armband erforscht werden soll
	 */
	public void erforscheArmband(int uhr) {
		if(this.uhr[uhr] != null)
			this.uhr[uhr].entwickleArmband();
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Gehäuses
	 * 
	 * Funktion: Ausgewählte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Gehäuse erforscht
	 * Es wird nur erforscht, wenn diese Uhr überhaupt vorhanden ist
	 * 
	 * @param uhr: Gibt an, bei welche der drei Möglichen Uhren 
	 * ein neues Gehäuse erforscht werden soll
	 */
	public void erforscheGehaeuse(int uhr) {
		if(this.uhr[uhr] != null)
			this.uhr[uhr].entwickleGehause();
	}
	
	
	/**
	 * Gibt ein Array zurück, welches die freigeschalteten Uhrwerke enthält
	 * 
	 * @param uhr: Zu welcher Uhr das Uhrwerk zurückgegeben werden soll
	 * @return: Array der freigeschalteten Uhrwerke
	 */
	public boolean[] getUhrwerk(int uhr) {
		return this.uhr[uhr].getUhrwerk();
	}

	/**
	 * Gibt ein Array zurück, welches die freigeschalteten Armbänder enthält
	 * 
	 * @param uhr: Zu welcher Uhr das Armband zurückgegeben werden soll
	 * @return: Array der freigeschalteten Armband
	 */
	public boolean[] getArmband(int uhr) {
		return this.uhr[uhr].getArmband();
	}
	
	/**
	 * Gibt ein Array zurück, welches die freigeschalteten Gehäuse enthält
	 * 
	 * @param uhr: Zu welcher Uhr das Gehäuse zurückgegeben werden soll
	 * @return: Array der freigeschalteten Gehäuse
	 */
	public boolean[] getGehaeuse(int uhr) {
		return this.uhr[uhr].getGehaeuse();
	}
	
	/**
	 * Methode erweitert die Produktion des ausgewählten Segmentes
	 * 
	 * Funktion: Durch ein Switch-Case wird das Segment überprüft, in dem die
	 * Erweiterung durchgeführt werden soll. Anschließend wird das Array
	 * durchlaufen um an der nächsten Stelle die Produktion freizuschalten, 
	 * vorausgesetzt das Kapital ist ausreichend. Auch hier die private Methode zum
	 * testen und zum Kapitalvermindern
	 * 
	 * @param segment: In welchem Segment erweitert werden soll
	 * @return: Rückgabe ob die Erweiterung erfolgreich war
	 */
	public boolean erweitereProduktion(String segment) {
		switch(segment) {
		case "Billig":
			for(int i = 0; i < 3; i++) {
				if(prodStraßeBillig[i] == false) {
					if(checkeKapital(Info.getKostenProduktionBillig()[i])) {
						prodStraßeBillig[i] = true;
						return true;
					}
				}
			}
			break;
		case "Premium":
			for(int i = 0; i < 3; i++) {
				if(prodStraßePremium[i] == false) {
					if(checkeKapital(Info.getKostenProduktionPremium()[i])) {
						prodStraßePremium[i] = true;
						return true;
					}
				}
			}
			break;
		case "Oeko":
			for(int i = 0; i < 3; i++) {
				if(prodStraßeOeko[i] == false) {
					if(checkeKapital(Info.getKostenProduktionOeko()[i])) {
						prodStraßeOeko[i] = true;
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
	 * @param uhr: Für welche Uhr die Marketingstrategie ist
	 */
	public void uhrenMarketing(int uhr) {
	
	}
	
	
	/**
	 * Private Methode um den nächsten index herauszufinden, an den die nächste Uhr soll
	 * 
	 * @return: index des nächsten freien Platzes für die Uhr
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
	 * @param kosten: Übergabewert der anstehenden Kosten
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
				temp += "Uhr" + i + " Segment: " + uhr[i].getClass() + " ";
				temp += " Uhrwerk: ";
				for(boolean s : uhr[i].getUhrwerk()) {
					temp += s + " ";
				}
				temp += " Armband: ";
				for(boolean s : uhr[i].getArmband()) {
					temp += s + " ";
				}
				temp += " Gehäuse: ";
				for(boolean s : uhr[i].getGehaeuse()) {
					temp += s + " ";
				}
				temp += "\n";
			}
		}
		return (temp);
	}

	/*
	 * Getter / Setter
	 */
	
	public boolean[] getProdStraßeBillig() {
		return prodStraßeBillig;
	}

	public boolean[] getProdStraßeOeko() {
		return prodStraßeOeko;
	}

	public boolean[] getProdStraßePremium() {
		return prodStraßePremium;
	}

	public double getKapital() {
		return kapital;
	}

	public void setKapital(double kapital) {
		this.kapital = kapital;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getKapitalAlt() {
		return kapitalAlt;
	}

	private void setKapitalAlt(double kapitalAlt) {
		this.kapitalAlt = kapitalAlt;
	}
	
	public void setSpielerDaten(double kapital) {
		this.setKapitalAlt(this.getKapital());
		this.setKapital(kapital);
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
	
}
