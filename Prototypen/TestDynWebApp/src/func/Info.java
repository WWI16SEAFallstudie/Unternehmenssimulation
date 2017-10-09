package func;

public class Info {
	
	// Attribute für die Uhr
	public static String uhrwerkOeko[] = {"Quarz","Funk","Automatik"};
	public static String gehaeuseOeko[] = {"Holz","Wurzelholz","Gebeiztes Holz"};
	public static String ArmbandOeko[] = {"Stoff","Leinenfasern","Holz"};

	public static String uhrwerkPremium[] = {"Quarz","Automatik","Skelett/Kalender"};
	public static String gehaeusePremium[] = {"Stahl","Titan","Platin"};
	public static String ArmbandPremium[] = {"Leder","Gehäusematerial","Keramik"};

	public static String uhrwerkBillig[] = {"Quarz","Funk","NochOffen"};
	public static String gehaeuseBillig[] = {"Plastik","Gefärbtes Plastik","Durchsichtiges Plastik"};
	public static String ArmbandBillig[] = {"Plastik","Gumi","Stoff"};
	
	// Kosten für die Entwicklungen der Attribute
	public static double kostenUhrwerkOeko[] = { 1000 , 2000 , 3000 };
	public static double kostenGehaeuseOeko[] = { 1000 , 2000 , 3000 };
	public static double kostenArmbandOeko[] = { 1000 , 2000 , 3000 };
	
	public static double kostenUhrwerkPremium[] = { 1000 , 2000 , 3000 };
	public static double kostenGehaeusePremium[] = { 1000 , 2000 , 3000 };
	public static double kostenArmbandPremium[] = { 1000 , 2000 , 3000 };

	public static double kostenUhrwerkBillig[] = { 1000 , 2000 , 3000 };
	public static double kostenGehaeuseBillig[] = { 1000 , 2000 , 3000 };
	public static double kostenArmbandBillig[] = { 1000 , 2000 , 3000 };
	
	// Kosten für die Entwicklung der neuen Uhr
	public static double kostenUhrBillig = 1000;
	public static double kostenUhrPremium = 2000;
	public static double kostenUhrOeko = 1500;
	
	// Kosten für die Entwicklung der Produktion
	public static double kostenProduktionBillig[] = { 1000 , 2000 , 3000 };
	public static double kostenProduktionOeko[] = { 1000 , 2000 , 3000 };
	public static double kostenProduktionPremium[] = { 1000 , 2000 , 3000 };
	
	
	// Getter & Setter
	public static String[] getUhrwerkOeko() {
		return uhrwerkOeko;
	}
	public static String[] getGehaeuseOeko() {
		return gehaeuseOeko;
	}
	public static String[] getArmbandOeko() {
		return ArmbandOeko;
	}
	public static String[] getUhrwerkPremium() {
		return uhrwerkPremium;
	}
	public static String[] getGehaeusePremium() {
		return gehaeusePremium;
	}
	public static String[] getArmbandPremium() {
		return ArmbandPremium;
	}
	public static String[] getUhrwerkBillig() {
		return uhrwerkBillig;
	}
	public static String[] getGehaeuseBillig() {
		return gehaeuseBillig;
	}
	public static String[] getArmbandBillig() {
		return ArmbandBillig;
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
