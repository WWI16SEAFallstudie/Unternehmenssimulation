package func;

public class Unternehmen {

	/*
	 * Attribute name und vorhandenes Kapital im Unternehmen
	 */
	private String name;
	private double kapital;
	
	/*
	 * Array f�r entsprechenden Uhren angelegt 
	 * iUhrenkategorie ist ein Interface, welches von BilligUhr, OekoUhr und PremiumUhr implementiert wurde
	 * -> Polymorphismus
	 */
	private iUhrenkategorie kate[] = new iUhrenkategorie[3];
	
	/*
	 * Produktionserweiterungen pro Segment
	 */
	private String prodStra�eBillig[] = {"x", "x", "x"};
	private String prodStra�eOeko[] = {"x", "x", "x"};
	private String prodStra�ePremium[] = {"x", "x", "x"};
		
	/*
	 * Konstruktor
	 */
	public Unternehmen(String name) {
		this.name = name;
		this.setKapital(100000.00);		
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
				this.kate[index] = new BilligUhr();
				break;
			case "Luxus":
				this.kate[index] = new PremiumUhr();
				break;
			case "Oeko":
				this.kate[index] = new OekoUhr();
				break;
			default:
				System.out.println("Falsches Segment");
				break;
			}
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
		this.kate[uhr].entwickleUhrwerk();
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
		this.kate[uhr].entwickleArmband();
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
		this.kate[uhr].entwickleGehause();
	}
	
	
	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Uhrwerke enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Uhrwerk zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Uhrwerke
	 */
	public String[] getUhrwerk(int uhr) {
		return this.kate[uhr].getUhrwerk();
	}

	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Armb�nder enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Armband zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Armband
	 */
	public String[] getArmband(int uhr) {
		return this.kate[uhr].getArmband();
	}
	
	/**
	 * Gibt ein Array zur�ck, welches die freigeschalteten Geh�use enth�lt
	 * 
	 * @param uhr: Zu welcher Uhr das Geh�use zur�ckgegeben werden soll
	 * @return: Array der freigeschalteten Geh�use
	 */
	public String[] getGehaeuse(int uhr) {
		return this.kate[uhr].getGehaeuse();
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
				if(prodStra�eBillig[i].equals("x")) {
					prodStra�eBillig[i] = "ok";
					return true;
				}
			}
			break;
		case "Luxus":
			for(int i = 0; i < 3; i++) {
				if(prodStra�ePremium[i].equals("x")) {
					prodStra�ePremium[i] = "ok";
					return true;
				}
			}
			break;
		case "Oeko":
			for(int i = 0; i < 3; i++) {
				if(prodStra�eOeko[i].equals("x")) {
					prodStra�eOeko[i] = "ok";
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
			if(kate[i] == null) {
				result = i;
				break;
			}
		}
		return result;
	}
	
	@Override
	public String toString() {			
		String temp = name + "\n";
		for(int i = 0; i < 3; i++) {
			if(kate[i] != null) {
				temp += "Uhr" + i + " Segment: " + kate[i].getClass().getName().substring(12, 19) + " ";
				for(String s : kate[i].getUhrwerk()) {
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
	
	public String[] getProdStra�eBillig() {
		return prodStra�eBillig;
	}

	public String[] getProdStra�eOeko() {
		return prodStra�eOeko;
	}

	public String[] getProdStra�ePremium() {
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
	
	
}
