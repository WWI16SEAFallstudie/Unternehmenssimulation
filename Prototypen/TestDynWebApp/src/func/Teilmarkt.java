package func;

public class Teilmarkt {
	private int volume;
	private double impactRange; // ImpactRange als Prozentteil des Preises der Uhr mit der Verglichen wird

	public Teilmarkt(int volume, double impactRange) {
		this.volume = volume;
		this.impactRange = impactRange;
	}

	public void calcAbnahme(iUhrenkategorie[] uhren, boolean mockRandom) {
		for (int i = 0; i < uhren.length; i++) {
			int konkurenz = 0;
			for (int j = 0; j < uhren.length; j++) {
				if(Math.abs(uhren[i].getAngebotspreis() - uhren[j].getAngebotspreis()) <= uhren[j].getAngebotspreis() * impactRange){
					// Je n�her die Preise der beiden Uhren beeinander sind, desto st�rker beeinflussen sich diese
					System.out.println("Abnahmepotential Uhr " + j + ": " + uhren[j].getAbnahmepotential());
					konkurenz += uhren[j].getAbnahmepotential() * ((impactRange - (Math.abs(uhren[i].getAngebotspreis() - uhren[j].getAngebotspreis()))) / impactRange);
				}
			}
			//if (konkurenz == uhren[i].getAbnahmepotential())   Obsolete
				konkurenz += getThirdParty(uhren[i].getAngebotspreis(), mockRandom); //hat die Uhr keine Konkurenz wird die Absatzm�glichkeiten f�r diese k�nstlich verschm�lert
			// Die verkaufte Menge entspricht dem Anteil der Uhr in der Konkurenzsituation zu dem gegebenen Preispunkt
			if (konkurenz > getMarktpotential(uhren[i].getAngebotspreis(), mockRandom)) {
				System.out.println(getMarktpotential(uhren[i].getAngebotspreis(), mockRandom));
				uhren[i].setAbgenommeneMenge((int) (uhren[i].getAbnahmepotential() * ((getMarktpotential(uhren[i].getAngebotspreis(), mockRandom) * ((Math.random() / 5) + 0.9)) / (double) konkurenz)));
			}
			else
				uhren[i].setAbgenommeneMenge(uhren[i].getAbnahmepotential());
			System.out.println(this.toString() + ": Uhr " + i + ": verkaufte Menge: " + uhren[i].getAbgenommeneMenge());
		}
	}

	private int getThirdParty (double preis, boolean mockRandom) {
		return (int) getMarktpotential(preis, mockRandom) * (1/3);
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	private int getMarktpotential(double preis, boolean mockRandom) {
		if (mockRandom) return (int) (volume / preis);
		return (int) (volume / preis * ((Math.random() / 5) + 0.9));
	}
}
