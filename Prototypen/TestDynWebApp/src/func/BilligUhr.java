package func;

public class BilligUhr implements iUhrenkategorie {
	/**
	 * Attribute
	 */
	private int uhrwerk;
	private int gehaeuse;
	private int armband;
	
	private int score;
	private int bestand;
	private int angeboteneMenge;
	private int abgenommeneMenge;
	
	private final String segment = "Billig";
	
	/**
	 * Konstruktor : legt default-Werte fest
	 */
	public BilligUhr() {
		this.setScore(0);
		
		this.uhrwerk = 0;
		this.gehaeuse = 0;
		this.armband = 0;
	}
	
	@Override
	public void uhrMarketingstrategie() {
		System.out.println("Hier könnte ihre Marketingstrategie stehen");
	}

	@Override
	public void setSpielerDaten(int armband, int gehaeuse, int uhrwerk) {
		this.setArmband(armband);
		this.setGehaeuse(gehaeuse);
		this.setUhrwerk(uhrwerk);
	}
	
	@Override
	public String getSpielerDaten() {
		return ("Gehäuse: " + this.getGehaeuse() + " - Armband: " + this.getArmband() + " - Uhrwerk: " + this.getUhrwerk());
	}
	
	@Override
	public void setAngeboteneMenge(int menge) {
		this.angeboteneMenge = menge;
	}

	@Override
	public void setAbgenommeneMenge(int menge) {
		this.abgenommeneMenge = menge;
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

	public int getUhrwerk() {
		return this.uhrwerk;
	}

	public void setUhrwerk(int uhrwerk) {
		this.uhrwerk = uhrwerk;
	}

	public int getGehaeuse() {
		return gehaeuse;
	}

	public void setGehaeuse(int gehaeuse) {
		this.gehaeuse = gehaeuse;
	}

	public int getArmband() {
		return armband;
	}

	public void setArmband(int armband) {
		this.armband = armband;
	}

	public int getBestand() {
		return bestand;
	}

	public void setBestand(int bestand) {
		this.bestand = bestand;
	}



	
}
