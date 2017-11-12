package func;

import java.util.ArrayList;

public class Gesamtmarkt {
	private Teilmarkt billigmarkt, oekomarkt, premiummarkt;
	private int volume;

//	public Gesamtmarkt(Teilmarkt billigmarkt, Teilmarkt oekomarkt, Teilmarkt premiummarkt) {
//		this.billigmarkt = billigmarkt;
//		this.oekomarkt = oekomarkt;
//		this.premiummarkt = premiummarkt;
//		this.volume = billigmarkt.getVolume();
//	}

	public Gesamtmarkt(int volume, double impactRange) {
		this.billigmarkt = new Teilmarkt(volume, impactRange);
		this.oekomarkt = new Teilmarkt(volume, impactRange);
		this.premiummarkt = new Teilmarkt(volume, impactRange);
		this.volume = volume;
	}

//	public Gesamtmarkt(int billigVolume, double billigRange, int oekoVolume, double oekoRange, int premiumVolume, double premiumRange) {
//		this.billigmarkt = new Teilmarkt(billigVolume, billigRange);
//		this.oekomarkt = new Teilmarkt(oekoVolume, oekoRange);
//		this.premiummarkt = new Teilmarkt(premiumVolume, premiumRange);
//		this.volume = billigVolume;
//	}

	public void starteSimulation(Unternehmen[] unternehmen) {
		starteSimulation(unternehmen, false);
	}

	public void starteSimulation(Unternehmen[] unternehmen, boolean mockRandom) {
		ArrayList<iUhrenkategorie> billiguhren = new ArrayList<iUhrenkategorie>(), oekouhren = new ArrayList<iUhrenkategorie>(), premiumuhren = new ArrayList<iUhrenkategorie>();

		for (Unternehmen einzelunternehmen : unternehmen) { //Uhren aufteilen auf die Teilmärkte
			for (iUhrenkategorie uhr : einzelunternehmen.getUhr()) {
				if (uhr != null) {
					int volumeChange =  (int) (volume * Math.log(uhr.getMarktwert() / uhr.getAngebotspreis()) * 0.2);
//					System.out.println("Abnahmepotential: " + uhr.getAbnahmepotential());
					if(uhr.getAbnahmepotential() > uhr.getBestand() || uhr.getAbnahmepotential() == 0) uhr.setAngeboteneMenge(uhr.getBestand());

					switch (uhr.getSegment()) {
					case "Billig":
						billiguhren.add(uhr);
						billigmarkt.setVolume(billigmarkt.getVolume() + volumeChange);
						oekomarkt.setVolume((int) (oekomarkt.getVolume() - (volumeChange * 0.5)));
						
						premiummarkt.setVolume((int) (premiummarkt.getVolume() - (volumeChange * 0.5)));
						break;
					case "Oeko":
						oekouhren.add(uhr);
						billigmarkt.setVolume((int) (billigmarkt.getVolume() - (volumeChange * 0.5)));
						oekomarkt.setVolume(oekomarkt.getVolume() + volumeChange);
						premiummarkt.setVolume((int) (premiummarkt.getVolume() - (volumeChange * 0.5)));
						break;
					case "Premium":
						premiumuhren.add(uhr);
						billigmarkt.setVolume((int) (billigmarkt.getVolume() - (volumeChange * 0.5)));
						oekomarkt.setVolume((int) (oekomarkt.getVolume() - (volumeChange * 0.5)));
						premiummarkt.setVolume(premiummarkt.getVolume() + volumeChange);
						break;

					default:
						System.err.println("Switch fehlgeschlagen bei Uhr" + uhr);
						break;
					}
				}
			}
		}
		
		if (billigmarkt.getVolume() < 0.5 * volume) billigmarkt.setVolume((int) (volume * 0.5));
		if (oekomarkt.getVolume() < 0.5 * volume) oekomarkt.setVolume((int) (volume * 0.5));
		if (premiummarkt.getVolume() < 0.5 * volume) premiummarkt.setVolume((int) (volume * 0.5));
		
//		System.out.println("Billigmarkt: " + billigmarkt.getVolume());
//		System.out.println("Oekomarkt: " + oekomarkt.getVolume());
//		System.out.println("Premiummarkt: " + premiummarkt.getVolume());

		// Uhren an die Teilmärkte übergeben zur weiteren Verarbeitung (Festlegung der verkauften Mengen)
 		if (billiguhren.size() > 0)	 billigmarkt.calcAbnahme(billiguhren.toArray(new iUhrenkategorie[0]), mockRandom);
		if (oekouhren.size() > 0)	 oekomarkt.calcAbnahme(oekouhren.toArray(new iUhrenkategorie[0]), mockRandom);
		if (premiumuhren.size() > 0) premiummarkt.calcAbnahme(premiumuhren.toArray(new iUhrenkategorie[0]), mockRandom);

		// Uhren verkaufen
		for (Unternehmen einzelunternehmen : unternehmen) {
			for (iUhrenkategorie uhr : einzelunternehmen.getUhr()) {
				if (uhr != null) {
					uhr.verkaufen();
					uhr.setMarketingboost(0.0);
					uhr.setAngeboteneMenge(0);
					einzelunternehmen.setKapital(einzelunternehmen.getKapital() + (uhr.getAbgenommeneMenge()*uhr.getAngebotspreis()));
				}
			}
		}
	}
}
