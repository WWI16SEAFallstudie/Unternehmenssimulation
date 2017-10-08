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
	public static boolean[] entwickleUhrwerk(boolean[] uhrwerk) {
		for(int i = 0; i < 3; i++) {
			if(uhrwerk[i] == false) {
				uhrwerk[i] = true;
				break;
			}
		}
		return uhrwerk;
	}
	
	public static boolean[] entwickleArmband(boolean[] armband) {
		for(int i = 0; i < 3; i++) {
			if(armband[i] == false) {
				armband[i] = true;
				break;
			}
		}
		return armband;
	}
	
	public static boolean[] entwickleGehaeuse(boolean[] gehaeuse) {
		for(int i = 0; i < 3; i++) {
			if(gehaeuse[i] == false) {
				gehaeuse[i] = true;
				break;
			}
		}
		return gehaeuse;
	}
}
