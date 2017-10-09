package func;

public class OekoUhr implements iUhrenkategorie{
	
	/**
	 * Attribute
	 */
	private boolean[] uhrwerk = new boolean[3];
	private boolean[] gehaeuse = new boolean[3];
	private boolean[] armband = new boolean[3];
	
	private int score;
	
	/**
	 * Konstruktor: Legt die Standardwerte fest
	 */
	public OekoUhr() {
		this.setScore(0);
		// Fülle das Array mit Defaultwerte
		for( int i = 0; i < 3; i++) {
			if(i == 0) {
				uhrwerk[i] = true;
				gehaeuse[i] = true;
				armband[i] = true;
			}else {
				uhrwerk[i] = false;
				gehaeuse[i] = false;
				armband[i] = false;
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
	
	// Getter
	
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

	@Override
	public void uhrMarketingstrategie() {
		// TODO Auto-generated method stub
		
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
