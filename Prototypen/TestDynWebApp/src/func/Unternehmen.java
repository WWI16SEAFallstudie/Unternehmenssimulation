package func;

public class Unternehmen {

	/*
	 * Attribute name und vorhandenes Kapital im Unternehmen
	 */
	private String name;
	private double kapital;
	
	/*
	 * Array für entsprechenden Uhren angelegt 
	 * iUhrenkategorie ist ein Interface, welches von BilligUhr, OekoUhr und PremiumUhr implementiert wurde
	 * -> Polymorphismus
	 */
	private iUhrenkategorie kate[] = new iUhrenkategorie[3];
	
	/*
	 * Produktionserweiterungen pro Segment
	 */
	private String prodStraßeBillig[] = {"x", "x", "x"};
	private String prodStraßeOeko[] = {"x", "x", "x"};
	private String prodStraßePremium[] = {"x", "x", "x"};
		
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
	 * Funktionsweise: Durch Übergabe des Segments, wird über einen switch-case abgefragt,
	 * welches Segment ausgewählt wurde und dementsprechend wird ein neues Uhrmodell an der
	 * Stelle 'index' erzeugt. Der 'index' wird durch eine private Methode abgefragt, um
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
	 * Funktion: Ausgewählte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Uhrwerk erforscht
	 * 
	 * @param uhr: Gibt an, bei welche der drei Möglichen Uhren 
	 * ein neues Uhrwerk erforscht werden soll
	 */
	public void erforscheUhrwerk(int uhr) {
		this.kate[uhr].entwickleUhrwerk();
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Armbandes
	 * 
	 * Funktion: Ausgewählte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Armband erforscht
	 * 
	 * @param uhr: Gibt an, bei welche der drei Möglichen Uhren 
	 * ein neues Armband erforscht werden soll
	 */
	public void erforscheArmband(int uhr) {
		this.kate[uhr].entwickleArmband();
	}
	
	/**
	 * Methode zum Erforschen eines Neuen Gehäuses
	 * 
	 * Funktion: Ausgewählte Uhr ruft die Methode in der iUhrenkategorie auf,
	 * welches auf das jeweilige Segment weiterleitet und da das Gehäuse erforscht
	 * 
	 * @param uhr: Gibt an, bei welche der drei Möglichen Uhren 
	 * ein neues Gehäuse erforscht werden soll
	 */
	public void erforscheGehaeuse(int uhr) {
		this.kate[uhr].entwickleGehause();
	}
	
	
	/**
	 * Gibt ein Array zurück, welches die freigeschalteten Uhrwerke enthält
	 * 
	 * @param uhr: Zu welcher Uhr das Uhrwerk zurückgegeben werden soll
	 * @return: Array der freigeschalteten Uhrwerke
	 */
	public String[] getUhrwerk(int uhr) {
		return this.kate[uhr].getUhrwerk();
	}

	/**
	 * Gibt ein Array zurück, welches die freigeschalteten Armbänder enthält
	 * 
	 * @param uhr: Zu welcher Uhr das Armband zurückgegeben werden soll
	 * @return: Array der freigeschalteten Armband
	 */
	public String[] getArmband(int uhr) {
		return this.kate[uhr].getArmband();
	}
	
	/**
	 * Gibt ein Array zurück, welches die freigeschalteten Gehäuse enthält
	 * 
	 * @param uhr: Zu welcher Uhr das Gehäuse zurückgegeben werden soll
	 * @return: Array der freigeschalteten Gehäuse
	 */
	public String[] getGehaeuse(int uhr) {
		return this.kate[uhr].getGehaeuse();
	}
	
	/**
	 * Methode erweitert die Produktion des ausgewählten Segmentes
	 * 
	 * Funktion: Durch ein Switch-Case wird das Segment überprüft, in dem die
	 * Erweiterung durchgeführt werden soll. Anschließend wird das Array
	 * durchlaufen um an der nächsten Stelle die Produktion freizuschalten
	 * 
	 * @param segment: In welchem Segment erweitert werden soll
	 * @return: Rückgabe ob die Erweiterung erfolgreich war
	 */
	public boolean erweitereProduktion(String segment) {
		switch(segment) {
		case "Billig":
			for(int i = 0; i < 3; i++) {
				if(prodStraßeBillig[i].equals("x")) {
					prodStraßeBillig[i] = "ok";
					return true;
				}
			}
			break;
		case "Luxus":
			for(int i = 0; i < 3; i++) {
				if(prodStraßePremium[i].equals("x")) {
					prodStraßePremium[i] = "ok";
					return true;
				}
			}
			break;
		case "Oeko":
			for(int i = 0; i < 3; i++) {
				if(prodStraßeOeko[i].equals("x")) {
					prodStraßeOeko[i] = "ok";
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
	
	public String[] getProdStraßeBillig() {
		return prodStraßeBillig;
	}

	public String[] getProdStraßeOeko() {
		return prodStraßeOeko;
	}

	public String[] getProdStraßePremium() {
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
	
	
}
