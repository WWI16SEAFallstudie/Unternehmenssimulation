package func;

public class Info {
	
	// Attribute für die Uhr
	private static String uhrwerkOeko[] = {"Quarz","Funk","Automatik"};
	private static String gehaeuseOeko[] = {"Holz","Wurzelholz","Gebeiztes Holz"};
	private static String armbandOeko[] = {"Stoff","Leinenfasern","Holz"};

	private static String uhrwerkPremium[] = {"Quarz","Automatik","Skelett/Kalender"};
	private static String gehaeusePremium[] = {"Stahl","Titan","Platin"};
	private static String armbandPremium[] = {"Leder","Gehäusematerial","Keramik"};

	private static String uhrwerkBillig[] = {"Quarz","Funk","NochOffen"};
	private static String gehaeuseBillig[] = {"Plastik","Gefärbtes Plastik","Durchsichtiges Plastik"};
	private static String armbandBillig[] = {"Plastik","Gumi","Stoff"};
	
	// Kosten für die Entwicklungen der Attribute
	private static double kostenUhrwerkOeko[] = { 1000 , 2000 , 3000 };
	private static double kostenGehaeuseOeko[] = { 1000 , 2000 , 3000 };
	private static double kostenArmbandOeko[] = { 1000 , 2000 , 3000 };
	
	private static double kostenUhrwerkPremium[] = { 1000 , 2000 , 3000 };
	private static double kostenGehaeusePremium[] = { 1000 , 2000 , 3000 };
	private static double kostenArmbandPremium[] = { 1000 , 2000 , 3000 };

	private static double kostenUhrwerkBillig[] = { 1000 , 2000 , 3000 };
	private static double kostenGehaeuseBillig[] = { 1000 , 2000 , 3000 };
	private static double kostenArmbandBillig[] = { 1000 , 2000 , 3000 };
	
	// Kosten für die Entwicklung der neuen Uhr
	private static double kostenUhrBillig = 1000;
	private static double kostenUhrPremium = 2000;
	private static double kostenUhrOeko = 1500;
	
	// Kosten für die Entwicklung der Produktion
	private static double kostenProduktionBillig[] = { 1000 , 2000 , 3000 };
	private static double kostenProduktionOeko[] = { 1000 , 2000 , 3000 };
	private static double kostenProduktionPremium[] = { 1000 , 2000 , 3000 };
	
	
	// Getter & Setter
	public static String[] getUhrwerkOeko() {
		return uhrwerkOeko;
	}
	public static String[] getGehaeuseOeko() {
		return gehaeuseOeko;
	}
	public static String[] getArmbandOeko() {
		return armbandOeko;
	}
	public static String[] getUhrwerkPremium() {
		return uhrwerkPremium;
	}
	public static String[] getGehaeusePremium() {
		return gehaeusePremium;
	}
	public static String[] getArmbandPremium() {
		return armbandPremium;
	}
	public static String[] getUhrwerkBillig() {
		return uhrwerkBillig;
	}
	public static String[] getGehaeuseBillig() {
		return gehaeuseBillig;
	}
	public static String[] getArmbandBillig() {
		return armbandBillig;
	}
	public static double[] getKostenUhrwerkOeko() {
		return kostenUhrwerkOeko;
	}
	public static double[] getKostenGehaeuseOeko() {
		return kostenGehaeuseOeko;
	}
	public static double[] getKostenArmbandOeko() {
		return kostenArmbandOeko;
	}
	public static double[] getKostenUhrwerkPremium() {
		return kostenUhrwerkPremium;
	}
	public static double[] getKostenGehaeusePremium() {
		return kostenGehaeusePremium;
	}
	public static double[] getKostenArmbandPremium() {
		return kostenArmbandPremium;
	}
	public static double[] getKostenUhrwerkBillig() {
		return kostenUhrwerkBillig;
	}
	public static double[] getKostenGehaeuseBillig() {
		return kostenGehaeuseBillig;
	}
	public static double[] getKostenArmbandBillig() {
		return kostenArmbandBillig;
	}
	public static double getKostenUhrBillig() {
		return kostenUhrBillig;
	}
	public static double getKostenUhrPremium() {
		return kostenUhrPremium;
	}
	public static double getKostenUhrOeko() {
		return kostenUhrOeko;
	}
	public static double[] getKostenProduktionBillig() {
		return kostenProduktionBillig;
	}
	public static double[] getKostenProduktionOeko() {
		return kostenProduktionOeko;
	}
	public static double[] getKostenProduktionPremium() {
		return kostenProduktionPremium;
	}
	
	
}
