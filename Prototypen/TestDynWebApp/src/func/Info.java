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
	private static double kostenUhrwerkOeko[] = { 100000 , 200000 , 300000 };
	private static double kostenGehaeuseOeko[] = { 100000 , 200000 , 300000 };
	private static double kostenArmbandOeko[] = { 100000 , 200000 , 300000 };
	
	private static double kostenUhrwerkPremium[] = { 100000 , 200000 , 300000 };
	private static double kostenGehaeusePremium[] = { 100000 , 200000 , 300000 };
	private static double kostenArmbandPremium[] = { 100000 , 200000 , 300000 };

	private static double kostenUhrwerkBillig[] = { 100000 , 200000 , 300000 };
	private static double kostenGehaeuseBillig[] = { 100000 , 200000 , 300000 };
	private static double kostenArmbandBillig[] = { 100000 , 200000 , 300000 };
	
	// Selbstkosten der Attribute
	private static double selbstkostenUhrwerkOeko[] = { 33 , 66 , 100 };
	private static double selbstkostenGehaeuseOeko[] = { 25 , 50 , 75 };
	private static double selbstkostenArmbandOeko[] = { 25 , 50 , 75 };
	
	private static double selbstkostenUhrwerkPremium[] = { 330 , 660 , 1000 };
	private static double selbstkostenGehaeusePremium[] = { 250 , 500 , 750 };
	private static double selbstkostenArmbandPremium[] = { 250 , 500 , 750 };

	private static double selbstkostenUhrwerkBillig[] = { 13 , 26 , 40 };
	private static double selbstkostenGehaeuseBillig[] = { 10 , 20 , 30 };
	private static double selbstkostenArmbandBillig[] = { 10 , 20 , 30 };
	
	// Kosten für die Entwicklung der neuen Uhr
	private static double kostenUhrBillig = 100000;
	private static double kostenUhrPremium = 200000;
	private static double kostenUhrOeko = 150000;
	
	// Kosten für die Entwicklung der Produktion
	private static double kostenProduktionBillig[] = { 100000 , 200000 , 300000 };
	private static double kostenProduktionOeko[] = { 100000 , 200000 , 300000 };
	private static double kostenProduktionPremium[] = { 100000 , 200000 , 300000 };
	
	// Kosten für die Entwicklung des Einkaufs
	private static double kostenEinkaufBillig[] = { 100000 , 200000 , 300000 };
	private static double kostenEinkaufOeko[] = { 100000 , 200000 , 300000 };
	private static double kostenEinkaufPremium[] = { 100000 , 200000 , 300000 };
	
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
	private static double erweitereKapazitaetBillig[] = { 0.1, 0.2, 0.3 };
	private static double erweitereKapazitaetOeko[] = { 0.1, 0.2, 0.3 };
	private static double erweitereKapazitaetPremium[] = { 0.1, 0.2, 0.3 };
	
	private static double senkeProdKostenStrasseBillig[] = { 0.1, 0.2, 0.3 };
	private static double senkeProdKostenStrasseOeko[] = { 0.1, 0.2, 0.3 };
	private static double senkeProdKostenStrassePremium[] = { 0.1, 0.2, 0.3 };
	
	// Einkauf - kosten senken
	private static double rabatteEinkaufBillig[] = { 0.1, 0.2, 0.3 };
	private static double rabatteEinkaufOeko[] = { 0.1, 0.2, 0.3 };
	private static double rabatteEinkaufPremium[] = { 0.1, 0.2, 0.3 };

	// Kosten für die Entwicklung des Einkaufs
	private static double kostenMarketingBillig[] = { 10000 , 15000 , 25000 };//benötigen wir nicht
	private static double kostenMarketingOeko[] = { 1000 , 2000 , 3000 };//benötigen wir nicht
	private static double kostenMarketingPremium[] = { 1000 , 2000 , 3000 };//benötigen wir nicht
	
	private static double kostenMarketingUnternehmen[] = { 29000 , 43000 , 73000 };
	private static double kostenMarketingUhr[] = { 10000 , 15000 , 25000 };
	
	// Marketingkampagnen
	private static double scoreMarketingkampagne[] = { 0.1, 0.2, 0.3 };
	
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
	public static double[] getErweitereKapazitaetBillig() {
		return erweitereKapazitaetBillig;
	}
	public static double[] getErweitereKapazitaetOeko() {
		return erweitereKapazitaetOeko;
	}
	public static double[] getErweitereKapazitaetPremium() {
		return erweitereKapazitaetPremium;
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
	public static double[] getRabatteEinkaufBillig() {
		return rabatteEinkaufBillig;
	}
	public static double[] getRabatteEinkaufOeko() {
		return rabatteEinkaufOeko;
	}
	public static double[] getRabatteEinkaufPremium() {
		return rabatteEinkaufPremium;
	}
	public static double[] getSenkeProdKostenStrasseBillig() {
		return senkeProdKostenStrasseBillig;
	}
	public static double[] getSenkeProdKostenStrasseOeko() {
		return senkeProdKostenStrasseOeko;
	}
	public static double[] getSenkeProdKostenStrassePremium() {
		return senkeProdKostenStrassePremium;
	}
	public static double[] getSelbstkostenUhrwerkOeko() {
		return selbstkostenUhrwerkOeko;
	}
	public static double[] getSelbstkostenGehaeuseOeko() {
		return selbstkostenGehaeuseOeko;
	}
	public static double[] getSelbstkostenArmbandOeko() {
		return selbstkostenArmbandOeko;
	}
	public static double[] getSelbstkostenUhrwerkPremium() {
		return selbstkostenUhrwerkPremium;
	}
	public static double[] getSelbstkostenGehaeusePremium() {
		return selbstkostenGehaeusePremium;
	}
	public static double[] getSelbstkostenArmbandPremium() {
		return selbstkostenArmbandPremium;
	}
	public static double[] getSelbstkostenUhrwerkBillig() {
		return selbstkostenUhrwerkBillig;
	}
	public static double[] getSelbstkostenGehaeuseBillig() {
		return selbstkostenGehaeuseBillig;
	}
	public static double[] getSelbstkostenArmbandBillig() {
		return selbstkostenArmbandBillig;
	}
	public static double[] getKostenMarketingBillig() {
		return kostenMarketingBillig;
	}
	public static double[] getKostenMarketingOeko() {
		return kostenMarketingOeko;
	}
	public static double[] getKostenMarketingPremium() {
		return kostenMarketingPremium;
	}
	public static double[] getScoreMarketingkampagne() {
		return scoreMarketingkampagne;
	}
	public static double[] getKostenMarketingUnternehmen() {
		return kostenMarketingUnternehmen;
	}
	public static double[] getKostenMarketingUhr() {
		return kostenMarketingUhr;
	}
	
	
}