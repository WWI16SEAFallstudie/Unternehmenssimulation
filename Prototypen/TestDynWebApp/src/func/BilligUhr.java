package func;

public class BilligUhr implements iUhrenkategorie {
	/**
	 * Attribute
	 */
	/*private boolean[] uhrwerk = new boolean[3];
	private boolean[] gehaeuse = new boolean[3];
	private boolean[] armband = new boolean[3];
	*/
	
	private String uhrwerk;
	private String gehaeuse;
	private String armband;
	
	private int score;
	private int bestand;
	private int angeboteneMenge;
	private int abgenommeneMenge;
	private double herstellkosten;
	private double angebotspreis;
	
	private final String segment = "Billig";
	
	/**
	 * Konstruktor : legt default-Werte fest
	 */
	public BilligUhr() {
		this.setScore(0);
		
		this.uhrwerk = Info.getUhrwerkBillig()[0];
		this.gehaeuse = Info.getGehaeuseBillig()[0];
		this.armband = Info.getArmbandBillig()[0];
		
		// F�llen des Arrays mit Defaultwerten
		/*for( int i = 0; i < 3; i++) {
			if(i == 0) {
				uhrwerk[i] = true;
				gehaeuse[i] = true;
				armband[i] = true;
			}else {
				uhrwerk[i] = false;
				gehaeuse[i] = false;
				armband[i] = false;
			}
		}*/
	}
	
	/**
	 * Gilt f�r die n�chsten 3 Methoden:
	 * 
	 * Ausgelagerte Methode in die Klasse 'Uhrmodell' aufgerufen �ber den Klassennamen
	 * Erweitert das entsprechende Attribut um das n�chste
	 */
	/*
	 * 
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
*/
	
	@Override
	public void uhrMarketingstrategie() {
		System.out.println("Hier k�nnte ihre Marketingstrategie stehen");
	}

	@Override
	public void setSpielerDaten(String armband, String gehaeuse, String uhrwerk) {
		this.armband = armband;
		this.uhrwerk = uhrwerk;
		this.gehaeuse = gehaeuse;
	}
	
	@Override
	public String getSpielerDaten() {
		return ("Geh�use: " + this.gehaeuse + " - Armband: " + this.armband + " - Uhrwerk: " + this.uhrwerk);
	}
	
	// Getter
/*
	@Override
	public boolean[] getUhrwerk() {
		return this.uhrwerk;
	}

	@Override
	public boolean[] getGehaeuse() {
		return this.gehaeuse;
	}

	@Override
	public boolean[] getArmband() {
		return this.armband;
	}*/

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getSegment() {
		return this.segment;
	}

	public String getUhrwerk() {
		return uhrwerk;
	}

	public void setUhrwerk(String uhrwerk) {
		this.uhrwerk = uhrwerk;
	}

	public String getGehaeuse() {
		return gehaeuse;
	}

	public void setGehaeuse(String gehaeuse) {
		this.gehaeuse = gehaeuse;
	}

	public String getArmband() {
		return armband;
	}

	public void setArmband(String armband) {
		this.armband = armband;
	}

	


	
}
