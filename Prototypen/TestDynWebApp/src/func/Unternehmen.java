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
	 * Array f�r entsprechenden Uhren angelegt 
	 * iUhrenkategorie ist ein Interface, welches von BilligUhr, OekoUhr und PremiumUhr implementiert wurde
	 * -> Polymorphismus
	 */
	private iUhrenkategorie uhr[] = new iUhrenkategorie[3];
	
	/*
	 * Produktionserweiterungen pro Segment
	 */
	private boolean prodStra�eBillig[] = { false, false, false};
	private boolean prodStra�eOeko[] = { false, false, false};
	private boolean prodStra�ePremium[] = { false, false, false};
		
	/*
	 * Konstruktor
	 */
	public Unternehmen(String name) {
		this.setInfo("Hier k�nnte Ihre Werbung stehen");
		this.setKapital(100000.00);		
		this.setKapitalAlt(0);
		this.setName(name);
	}
	
	/**
	 * Methoden soll eine weitere Uhr erforschen
	 * 
	 * Funktionsweise: Durch �bergabe des Segments, wird �ber einen switch-case abgefragt,
	 * welches Segment ausgew�hlt wurde und dementsprechend wird ein neues Uhrmodell an der
	 * Stelle 'index' erzeugt. Der 'index' wird durch eine private Methode abgefragt, um
	 * herauszufinden welches die n�chste Freie Uhr ist.
	 * 
	 * @param segment: Gibt an, in welchem Segment die Uhr erforscht werden soll
	 * M�gliche Segmente: Billig, Luxus, �ko
	 */
	public void erforscheUhr(String segment) {
		int index = indexFreieUhr();
		if(index != -1 ) {
			switch(segment) {
			case "Billig":
				this.uhr[index] = new BilligUhr();
				break;
			case "Premium":
				this.uhr[index] = new PremiumUhr();
				break;
			case "Oeko":
				this.uhr[index] = new OekoUhr();
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
	 * Funktion: Ausgew�hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Uhrwerk erforscht
	 * 
	 * @param uhr: Gibt an, bei welche der drei M�glichen Uhren 
	 * ein neues Uhrwerk erforscht werden soll
	 */
	public void erforscheUhrwerk(int uhr) {
		this.uhr[uhr].entwickleUhrwerk();
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Armbandes
	 * 
	 * Funktion: Ausgew�hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Armband erforscht
	 * 
	 * @param uhr: Gibt an, bei welche der drei M�glichen Uhren 
	 * ein neues Armband erforscht werden soll
	 */
	public void erforscheArmband(int uhr) {
		this.uhr[uhr].entwickleArmband();
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Geh�uses
	 * 
	 * Funktion: Ausgew�hlte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Geh�use erforscht
	 * 
	 * @param uhr: Gibt an, bei welche der drei M�glichen Uhren 
	 * ein neues Geh�use erforscht werden soll
	 */
	public void erforscheGehaeuse(int uhr) {
		this.uhr[uhr].entwickleGehause();
	}
	
	
	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Uhrwerke enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Uhrwerk zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Uhrwerke
	 */
	public boolean[] getUhrwerk(int uhr) {
		return this.uhr[uhr].getUhrwerk();
	}

	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Armb�nder enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Armband zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Armband
	 */
	public boolean[] getArmband(int uhr) {
		return this.uhr[uhr].getArmband();
	}
	
	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Geh�use enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Geh�use zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Geh�use
	 */
	public boolean[] getGehaeuse(int uhr) {
		return this.uhr[uhr].getGehaeuse();
	}
	
	/**
	 * Methode erweitert die Produktion des ausgew�hlten Segmentes
	 * 
	 * Funktion: Durch ein Switch-Case wird das Segment �berpr�ft, in dem die
	 * Erweiterung durchgef�hrt werden soll. Anschlie�end wird das Array
	 * durchlaufen um an der n�chsten Stelle die Produktion freizuschalten
	 * 
	 * @param segment: In welchem Segment erweitert werden soll
	 * @return: R�ckgabe ob die Erweiterung erfolgreich war
	 */
	public boolean erweitereProduktion(String segment) {
		switch(segment) {
		case "Billig":
			for(int i = 0; i < 3; i++) {
				if(prodStra�eBillig[i] == false) {
					prodStra�eBillig[i] = true;
					return true;
				}
			}
			break;
		case "Premium":
			for(int i = 0; i < 3; i++) {
				if(prodStra�ePremium[i] == false) {
					prodStra�ePremium[i] = true;
					return true;
				}
			}
			break;
		case "Oeko":
			for(int i = 0; i < 3; i++) {
				if(prodStra�eOeko[i] == false) {
					prodStra�eOeko[i] = true;
					return true;
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
				temp += " Geh�use: ";
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
	
	public boolean[] getProdStra�eBillig() {
		return prodStra�eBillig;
	}

	public boolean[] getProdStra�eOeko() {
		return prodStra�eOeko;
	}

	public boolean[] getProdStra�ePremium() {
		return prodStra�ePremium;
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
