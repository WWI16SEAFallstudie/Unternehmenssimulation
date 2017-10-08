package func;

public interface iUhrenkategorie {
	/*
	 * Das interface dient dazu, damit alle Uhren die identischen Methoden nutzen können
	 * Im Spiel werden verschiedene Uhrobjekte erzeugt und in einem iUhrenkategorieArray gespeichert
	 */
	
	public void entwickleUhrwerk();
	
	public void entwickleArmband();
	
	public void entwickleGehause();
	
	public void uhrMarketingstrategie();
	
	public boolean[] getUhrwerk();
	
	public boolean[] getGehaeuse();
	
	public boolean[] getArmband();
}
