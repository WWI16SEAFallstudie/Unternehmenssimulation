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
	
	// Kosten für die Entwicklung des Einkaufs
	private static double kostenEinkaufBillig[] = { 1000 , 2000 , 3000 };
	private static double kostenEinkaufOeko[] = { 1000 , 2000 , 3000 };
	private static double kostenEinkaufPremium[] = { 1000 , 2000 , 3000 };
	
	// Wert, wie viel die Verbesserung des Attributs zählt
	private static double scoreUhrwerkBillig[] = { 0.1, 0.2, 0.3 };
	private static double scoreGehaeuseBillig[] = { 0.1, 0.2, 0.3 };
	private static double scoreArmbandBillig[] = { 0.1, 0.2, 0.3 };

	private static double scoreUhrwerkOeko[] = { 0.1, 0.2, 0.3 };
	private static double scoreGehaeuseOeko[] = { 0.1, 0.2, 0.3 };
	private static double scoreArmbandOeko[] = { 0.1, 0.2, 0.3 };
	
	private static double scoreUhrwerkPremium[] = { 0.1, 0.2, 0.3 };
	private static double scoreGehaeusePremium[] = { 0.1, 0.2, 0.3 };
	private static double scoreArmbandPremium[] = { 0.1, 0.2, 0.3 };
	
	// Produktion - Kosten pro erweiterung um ... senken
	private static double erweiterungMaschineBillig[] = { 0.1, 0.2, 0.3 };
	private static double erweiterungMaschineOeko[] = { 0.1, 0.2, 0.3 };
	private static double erweiterungMaschinePremium[] = { 0.1, 0.2, 0.3 };
	
	private static double erweitereKapazitätBillig[] = { 0.1, 0.2, 0.3 };
	private static double erweitereKapazitätOeko[] = { 0.1, 0.2, 0.3 };
	private static double erweitereKapazitätPremium[] = { 0.1, 0.2, 0.3 };
	
	// Einkauf - kosten senken
	
	private static double rabatteEinkaufBillig[] = { 0.1, 0.2, 0.3 };
	private static double rabatteEinkaufOeko[] = { 0.1, 0.2, 0.3 };
	private static double rabatteEinkaufPremium[] = { 0.1, 0.2, 0.3 };
	
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
	public static double[] getErweitereKapazitätBillig() {
		return erweitereKapazitätBillig;
	}
	public static double[] getErweitereKapazitätOeko() {
		return erweitereKapazitätOeko;
	}
	public static double[] getErweitereKapazitätPremium() {
		return erweitereKapazitätPremium;
	}
	public static double[] getKostenEinkaufBillig() {
		return kostenEinkaufBillig;
	}
	public static double[] getKostenEinkaufOeko() {
		return kostenEinkaufOeko;
	}
	public static double[] getKostenEinkaufPremium() {
		return kostenEinkaufPremium;
	}
	public static double[] getScoreUhrwerkBillig() {
		return scoreUhrwerkBillig;
	}
	public static double[] getScoreGehaeuseBillig() {
		return scoreGehaeuseBillig;
	}
	public static double[] getScoreArmbandBillig() {
		return scoreArmbandBillig;
	}
	public static double[] getScoreUhrwerkOeko() {
		return scoreUhrwerkOeko;
	}
	public static double[] getScoreGehaeuseOeko() {
		return scoreGehaeuseOeko;
	}
	public static double[] getScoreArmbandOeko() {
		return scoreArmbandOeko;
	}
	public static double[] getScoreUhrwerkPremium() {
		return scoreUhrwerkPremium;
	}
	public static double[] getScoreGehaeusePremium() {
		return scoreGehaeusePremium;
	}
	public static double[] getScoreArmbandPremium() {
		return scoreArmbandPremium;
	}
	public static double[] getErweiterungMaschineBillig() {
		return erweiterungMaschineBillig;
	}
	public static double[] getErweiterungMaschineOeko() {
		return erweiterungMaschineOeko;
	}
	public static double[] getErweiterungMaschinePremium() {
		return erweiterungMaschinePremium;
	}
	public static double[] getRabatteEinkaufBillig() {
		return rabatteEinkaufBillig;
	}
	public static double[] getRabatteEinkaufOeko() {
		return rabatteEinkaufOeko;
	}
	public static double[] getRabatteEinkaufPremium() {
		return rabatteEinkaufPremium;
	}
	
	
}
