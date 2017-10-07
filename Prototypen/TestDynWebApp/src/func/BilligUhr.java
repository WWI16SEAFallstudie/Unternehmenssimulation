package func;

public class BilligUhr implements iUhrenkategorie {
	/**
	 * Attribute
	 */
	private String[] uhrwerk = new String[3];
	private String[] gehaeuse = new String[3];
	private String[] armband = new String[3];
	
	/**
	 * Konstruktor : legt default-Werte fest
	 */
	public BilligUhr() {
		for( int i = 0; i < 3; i++) {
			if(i == 0) {
				uhrwerk[i] = "ok";
				gehaeuse[i] = "ok";
				armband[i] = "ok";
			}else {
				uhrwerk[i] = "x";
				gehaeuse[i] = "x";
				armband[i] = "x";
			}
		}
	}
	
	/**
	 * Gilt für die nächsten 3 Methoden:
	 * 
	 * Ausgelagerte Methode in die Klasse 'Uhrmodell' aufgerufen über den Klassennamen
	 * Erweitert das entsprechende Attribut um das nächste
	 */
	
	@Override
	public void entwickleUhrwerk() {
		uhrwerk = Uhrmodell.entwickleUhrwerk(uhrwerk);
	}
		
	@Override
	public void entwickleArmband() {
		armband = Uhrmodell.entwickleArmband(armband);	
	}
	
	@Override
	public void entwickleGehause() {
		gehaeuse = Uhrmodell.entwickleGehaeuse(gehaeuse);
	}
	
	@Override
	public void uhrMarketingstrategie() {
		System.out.println("Hier könnte ihre Marketingstrategie stehen");
	}

	
	// Getter

	@Override
	public String[] getUhrwerk() {
		return this.uhrwerk;
	}

	@Override
	public String[] getGehaeuse() {
		return this.gehaeuse;
	}

	@Override
	public String[] getArmband() {
		return this.armband;
	}

	
}
