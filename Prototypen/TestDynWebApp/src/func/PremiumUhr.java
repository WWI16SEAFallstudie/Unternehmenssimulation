package func;

public class PremiumUhr implements iUhrenkategorie {
	
	//*** Speziell f�r die Uhr 
	
	private int uhrwerk;
	private int gehaeuse;
	private int armband;
	
	private int score;
	private int bestand;
	private int angeboteneMenge;
	private int abgenommeneMenge;
	private double herstellkosten;
	private double angebotspreis;
	private double marketingboost;
	
	private final String segment = "Premium";
	
	public PremiumUhr() {
		this.setScore(0);

		this.uhrwerk = 0;
		this.gehaeuse = 0;
		this.armband = 0;
	}
	
	@Override
	public void uhrMarketingstrategie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSpielerDaten(int armband, int gehaeuse, int uhrwerk) {
		this.setArmband(armband);
		this.setGehaeuse(gehaeuse);
		this.setUhrwerk(uhrwerk);
	}
	
	@Override
	public String getSpielerDaten() {
		return ("Geh�use: " + this.getGehaeuse() + " - Armband: " + this.getArmband() + " - Uhrwerk: " + this.getUhrwerk());
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

	@Override
	public void verkaufen() {
		System.out.println("Bestand davor: " + bestand);
		bestand -= abgenommeneMenge;
		System.out.println("Bestand danach:" + bestand);
	}
	
	@Override
	public int getAbnahmepotential() {
		System.out.println(getAbnahmequote());
		return (int) (angeboteneMenge * ((1 + marketingboost) * getAbnahmequote()));
	}
	
	@Override
	public double getAbnahmequote() {
		if(angebotspreis != 0) return 1 / (1 + Math.pow(Math.E, ((2.5 * Math.log(angebotspreis / (double) score) / Math.log(2)))));
		return 0;
	}

	@Override
	public double getAngebotspreis() {
		return this.angebotspreis;
	}

	@Override
	public void setAngebotspreis(double angebotspreis) {
		this.angebotspreis = angebotspreis;
	}

	@Override
	public double getMarketingboost() {
		return marketingboost;
	}

	@Override
	public void setMarketingboost(double marketingboost) {
		this.marketingboost = marketingboost;
	}

	@Override
	public int getAbgenommeneMenge() {
		return abgenommeneMenge;
	}

	
}
