package func;

public class BilligUhr implements iUhrenkategorie {
	/**
	 * Attribute
	 */
	private int uhrwerk;
	private int gehaeuse;
	private int armband;
	
	private double marktwert;
	private int bestand;
	private int angeboteneMenge;
	private int abgenommeneMenge;
	private double angebotspreis;
	private double marketingboost;
	private double selbstkosten;
	
	private final String segment = "Billig";
	
	/**
	 * Konstruktor : legt default-Werte fest
	 */
	public BilligUhr() {		
		this.uhrwerk = 0;
		this.gehaeuse = 0;
		this.armband = 0;
		this.marketingboost = 0;
		this.bestand = 0; 
		this.angeboteneMenge = 0;
		this.marktwert = 0;
		this.abgenommeneMenge = 0;
		this.selbstkosten = 0;
		this.angebotspreis = 0;
	}
	
	@Override
	public void verkaufen() {
//		System.out.println("Bestand davor: " + bestand);
		if( (bestand - abgenommeneMenge) < 0)
			this.setBestand(0);
		else
			this.setBestand(this.getBestand() - abgenommeneMenge);
//		System.out.println("Bestand danach:" + bestand);
	}
	
	@Override
	public int getAbnahmepotential() {
//		System.out.println(getAbnahmequote());
		return (int) (angeboteneMenge * ((1 + marketingboost) * getAbnahmequote()));
	}
	
	@Override
	public double getAbnahmequote() {
		if(angebotspreis != 0) return 1 / (1 + Math.pow(Math.E, ((2.5 * Math.log(angebotspreis / (double) marktwert) / Math.log(2)))));
		return 0;
	}
	
	@Override
	public void setSpielerDaten(int armband, int gehaeuse, int uhrwerk) {
		this.setArmband(armband);
		this.setGehaeuse(gehaeuse);
		this.setUhrwerk(uhrwerk);
	}
		
	@Override
	public void setAngeboteneMenge(int menge) {
		this.angeboteneMenge = menge;
	}

	@Override
	public void setAbgenommeneMenge(int menge) {
		this.abgenommeneMenge = menge;
	}
	
	@Override
	public int getAbgenommeneMenge() {
		return abgenommeneMenge;
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

	public double getSelbstkosten() {
		return selbstkosten;
	}
	
	public void setSelbstkosten() {
		this.selbstkosten = berechneSelbstkosten();
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
	public double getMarktwert() {
		return this.marktwert;
	}

	@Override
	public void setMarktwert(double marktwert) {
		this.marktwert = marktwert;
	}
	
	@Override
	public double berechneSelbstkosten() {
		return( Info.getSelbstkostenArmbandBillig()[this.getArmband()] + Info.getSelbstkostenGehaeuseBillig()[this.getGehaeuse()] 
				+ Info.getSelbstkostenUhrwerkBillig()[this.getUhrwerk()] );
	}

	@Override
	public double berechneMarktwert() {
		this.setMarktwert( this.getSelbstkosten() * (1 + ( Info.getScoreArmbandBillig()[this.getArmband()] + Info.getScoreGehaeuseBillig()[this.getGehaeuse()] + 
				Info.getScoreUhrwerkBillig()[this.getUhrwerk()])) ); 
		return this.getMarktwert();
	}
}
