package func;

public class Uhrmodell {
	/*
	 * Klasse dient zur Auslagerung der selben Methoden
	 */

	/**
	 * Diese Methode würd über die Klasse von den jeweiligen Uhren aufgerufen (alle 3)
	 * 
	 * Funktion: Durchlaufen des übergebenen Arrays um das nächste "freizuschalten"
	 * 
	 * @param uhrwerk: altes Array
	 * @return: neues Array mit erweitertem Inhalt
	 */	

	public static boolean[][] entwickleUhrwerk(boolean[][] uhrwerk, int index) {
		for(int i = 0; i < 3; i++) {
			if(uhrwerk[index][i] == false) {
				uhrwerk[index][i] = true;
				break;
			}
		}
		return uhrwerk;
	}
	
	public static boolean[][] entwickleArmband(boolean[][] armband, int index) {
		for(int i = 0; i < 3; i++) {
			if(armband[index][i] == false) {
				armband[index][i] = true;
				break;
			}
		}
		return armband;
	}

	public static boolean[][] entwickleGehaeuse(boolean[][] gehaeuse, int index) {
		for(int i = 0; i < 3; i++) {
			if(gehaeuse[index][i] == false) {
				gehaeuse[index][i] = true;
				break;
			}
		}
		return gehaeuse;
	}	
}
