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
			int konkurrenz = 0;
			for (int j = 0; j < uhren.length; j++) {
				if(Math.abs(uhren[i].getAngebotspreis() - uhren[j].getAngebotspreis()) <= uhren[j].getAngebotspreis() * impactRange){
					// Je näher die Preise der beiden Uhren beeinander sind, desto stärker beeinflussen sich diese
//					System.out.println("Abnahmepotential Uhr " + j + ": " + uhren[j].getAbnahmepotential());
					konkurrenz += uhren[j].getAbnahmepotential() * ((impactRange - (Math.abs(uhren[i].getAngebotspreis() - uhren[j].getAngebotspreis()))) / impactRange);
				}
			}
			//if (konkurenz == uhren[i].getAbnahmepotential())   Obsolete
				konkurrenz += getThirdParty(uhren[i].getAngebotspreis()); //hat die Uhr keine Konkurenz wird die Absatzmöglichkeiten für diese künstlich verschmälert
			// Die verkaufte Menge entspricht dem Anteil der Uhr in der Konkurenzsituation zu dem gegebenen Preispunkt
			if (konkurrenz > getMarktpotential(uhren[i].getAngebotspreis())) {
//				System.out.println("Marktpotential: " + getMarktpotential(uhren[i].getAngebotspreis()));
				if (!mockRandom) uhren[i].setAbgenommeneMenge((int) (uhren[i].getAbnahmepotential() * ((getMarktpotential(uhren[i].getAngebotspreis()) * ((Math.random() / 5) + 0.9)) / (double) konkurrenz)));
				else uhren[i].setAbgenommeneMenge((int) (uhren[i].getAbnahmepotential() * ((getMarktpotential(uhren[i].getAngebotspreis())) / (double) konkurrenz)));
			}
			else
				uhren[i].setAbgenommeneMenge(uhren[i].getAbnahmepotential());
//			System.out.println(this.toString() + ": Uhr " + i + ": verkaufte Menge: " + uhren[i].getAbgenommeneMenge());
		}
	}

	private int getThirdParty (double preis) {
		return (int) getMarktpotential(preis) * (1/3);
	}

	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}

	private int getMarktpotential(double preis) {
		return (int) (volume / preis);
	}
}
