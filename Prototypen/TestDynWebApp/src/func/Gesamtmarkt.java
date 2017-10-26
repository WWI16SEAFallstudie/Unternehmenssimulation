package func;

import java.util.ArrayList;

public class Gesamtmarkt {
	private Teilmarkt billigmarkt, oekomarkt, premiummarkt;

	public Gesamtmarkt(Teilmarkt billigmarkt, Teilmarkt oekomarkt, Teilmarkt premiummarkt) {
		this.billigmarkt = billigmarkt;
		this.oekomarkt = oekomarkt;
		this.premiummarkt = premiummarkt;
	}

	public Gesamtmarkt(int volume, double impactRange) {
		this.billigmarkt = new Teilmarkt(volume, impactRange);
		this.oekomarkt = new Teilmarkt(volume, impactRange);
		this.premiummarkt = new Teilmarkt(volume, impactRange);
	}

	public Gesamtmarkt(int billigVolume, double billigRange, int oekoVolume, double oekoRange, int premiumVolume, double premiumRange) {
		this.billigmarkt = new Teilmarkt(billigVolume, billigRange);
		this.oekomarkt = new Teilmarkt(oekoVolume, oekoRange);
		this.premiummarkt = new Teilmarkt(premiumVolume, premiumRange);
	}

	public void starteSimulation(Unternehmen[] unternehmen) {
		ArrayList<iUhrenkategorie> billiguhren = new ArrayList<iUhrenkategorie>(), oekouhren = new ArrayList<iUhrenkategorie>(), premiumuhren = new ArrayList<iUhrenkategorie>();

		for (Unternehmen einzelunternehmen : unternehmen) { //Uhren aufteilen auf die Teilmärkte
			for (iUhrenkategorie uhr : einzelunternehmen.getUhr()) {
				if (uhr != null) {
					switch (uhr.getSegment()) {
					case "Billig":
						billiguhren.add(uhr);
						break;
					case "Oeko":
						oekouhren.add(uhr);
						break;
					case "Premium":
						premiumuhren.add(uhr);
						break;

					default:
						System.err.println("Switch fehlgeschlagen bei Uhr" + uhr);
						break;
					}
				}
			}
		}

		// Uhren an die Teilmärkte übergeben zur weiteren Verarbeitung (Festlegung der verkauften Mengen)
 		if (billiguhren.size() > 0)	 billigmarkt.calcAbnahme(billiguhren.toArray(new iUhrenkategorie[0]));
		if (oekouhren.size() > 0)	 oekomarkt.calcAbnahme(oekouhren.toArray(new iUhrenkategorie[0]));
		if (premiumuhren.size() > 0) premiummarkt.calcAbnahme(premiumuhren.toArray(new iUhrenkategorie[0]));

		// Uhren verkaufen
		for (Unternehmen einzelunternehmen : unternehmen) {
			for (iUhrenkategorie uhr : einzelunternehmen.getUhr()) {
				if (uhr != null) uhr.verkaufen();
			}
		}
	}
}
