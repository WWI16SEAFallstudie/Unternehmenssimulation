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
	
	public void setSpielerDaten(int armband, int gehaeuse, int uhrwerk);
	
	public String getSpielerDaten();
		
	public int getUhrwerk();
	
	public int getGehaeuse();
	
	public int getArmband();
	
	public String getSegment();
	
	public void setAngeboteneMenge(int menge);
	
	public void setAbgenommeneMenge(int menge);
	
	public void setBestand(int menge);
	
	public int getBestand();
	
}
