package func;

public class Uhrmodell {
	/*
	 * Klasse dient zur Auslagerung der selben Methoden
	 */

	/**
	 * Diese Methode w�rd �ber die Klasse von den jeweiligen Uhren aufgerufen (alle 3)
	 * 
	 * Funktion: Durchlaufen des �bergebenen Arrays um das n�chste "freizuschalten"
	 * 
	 * @param uhrwerk: altes Array
	 * @return: neues Array mit erweitertem Inhalt
	 */	
	public static String[] entwickleUhrwerk(String[] uhrwerk) {
		for(int i = 0; i < 3; i++) {
			if(uhrwerk[i].equals("x")) {
				uhrwerk[i] = "ok";
				break;
			}
		}
		return uhrwerk;
	}
	
	public static String[] entwickleArmband(String[] armband) {
		for(int i = 0; i < 3; i++) {
			if(armband[i].equals("x")) {
				armband[i] = "ok";
				break;
			}
		}
		return armband;
	}
	
	public static String[] entwickleGehaeuse(String[] gehaeuse) {
		for(int i = 0; i < 3; i++) {
			if(gehaeuse[i].equals("x")) {
				gehaeuse[i] = "ok";
				break;
			}
		}
		return gehaeuse;
	}
}
