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
	
	public static boolean[][] entwickleUhrwerk(boolean[][] uhrwerk, int index) {
		for(int i = 0; i < 3; i++) {
			if(uhrwerk[index][i] == false) {
				uhrwerk[index][i] = true;
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
	
	public static boolean[][] entwickleArmband(boolean[][] armband, int index) {
		for(int i = 0; i < 3; i++) {
			if(armband[index][i] == false) {
				armband[index][i] = true;
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
	
	public static boolean[][] entwickleGehaeuse(boolean[][] gehaeuse, int index) {
		for(int i = 0; i < 3; i++) {
			if(gehaeuse[index][i] == false) {
				gehaeuse[index][i] = true;
				break;
			}
		}
		return gehaeuse;
	}
	
	public static String sucheAttributImArmband(String segment, int index) {
		String result = null;
		if(!segment.isEmpty() && (index >=0 && index <=2) ) {
			switch(segment) {
				case "Billig":
					result = Info.getArmbandBillig()[index];
					break;
				case "Oeko":
					result = Info.getArmbandOeko()[index];
					break;
				case "Premium":
					result = Info.getArmbandPremium()[index];
					break;
			}
		}
		return result;
	}
	
	public static String sucheAttributImGehaeuse(String segment, int index) {
		String result = null;
		if(!segment.isEmpty() && (index >=0 && index <=2) ) {
			switch(segment) {
				case "Billig":
					result = Info.getGehaeuseBillig()[index];
					break;
				case "Oeko":
					result = Info.getGehaeuseOeko()[index];
					break;
				case "Premium":
					result = Info.getGehaeusePremium()[index];
					break;
			}
		}
		return result;
	}
	
	public static String sucheAttributImUhrwerk(String segment, int index) {
		String result = null;
		if(!segment.isEmpty() && (index >=0 && index <=2) ) {
			switch(segment) {
				case "Billig":
					result = Info.getUhrwerkBillig()[index];
					break;
				case "Oeko":
					result = Info.getUhrwerkOeko()[index];
					break;
				case "Premium":
					result = Info.getUhrwerkPremium()[index];
					break;
			}
		}
		return result;
	}
}
