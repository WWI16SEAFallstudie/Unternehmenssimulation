package func;

public class PremiumUhr implements iUhrenkategorie {
	
	//*** Speziell für die Uhr 
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
	
	private final String segment = "Premium";
	
	public PremiumUhr() {
		this.setScore(0);
		
		this.uhrwerk = Info.getUhrwerkPremium()[0];
		this.gehaeuse = Info.getGehaeusePremium()[0];
		this.armband = Info.getArmbandPremium()[0];
		
		// Fülle das Array mit Defaultwerten
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
	 * Gilt für die nächsten 3 Methoden:
	 * 
	 * Ausgelagerte Methode in die Klasse 'Uhrmodell' aufgerufen über den Klassennamen
	 * Erweitert das entsprechende Attribut um das nächste
	 */
	/*
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
	}
*/
	@Override
	public void uhrMarketingstrategie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpielerDaten(String armband, String gehaeuse, String uhrwerk) {
		this.armband = armband;
		this.uhrwerk = uhrwerk;
		this.gehaeuse = gehaeuse;
	}
	
	@Override
	public String getSpielerDaten() {
		return ("Gehäuse: " + this.gehaeuse + " - Armband: " + this.armband + " - Uhrwerk: " + this.uhrwerk);
	}
	
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
