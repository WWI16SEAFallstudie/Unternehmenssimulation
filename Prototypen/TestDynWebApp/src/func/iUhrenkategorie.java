package func;

public interface iUhrenkategorie {
	/*
	 * Das interface dient dazu, damit alle Uhren die identischen Methoden nutzen können
	 * Im Spiel werden verschiedene Uhrobjekte erzeugt und in einem iUhrenkategorieArray gespeichert
	 */
	
	/*public void entwickleUhrwerk();
	
	public void entwickleArmband();
	
	public void entwickleGehause();
	--> Wird im Unternehmen gemacht*/
	
	public void uhrMarketingstrategie();
	
	public void setSpielerDaten(String armband, String gehaeuse, String uhrwerk);
	
	public String getSpielerDaten();
	
	/*public boolean[] getUhrwerk();
	
	public boolean[] getGehaeuse();
	
	public boolean[] getArmband();*/
	
	public String getUhrwerk();
	
	public String getGehaeuse();
	
	public String getArmband();
	
	public String getSegment();
}
