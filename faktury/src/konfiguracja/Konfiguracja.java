package konfiguracja;

import rabaty.IObliczCenePoRabacie;
import rabaty.LosowyRabatZaadoptowany;
import rabaty.RabatProcentowy;

public class Konfiguracja {
	private static Konfiguracja instancja = null;
	private IObliczCenePoRabacie rabat = null;

	private Konfiguracja() {
		rabat = new LosowyRabatZaadoptowany();
	}

	public static Konfiguracja getKonfiguracja() {

		if (instancja == null) {
			instancja = new Konfiguracja();
			return instancja;
		} else {
			return instancja;
		}
	}
	
	public IObliczCenePoRabacie getRabat() {
		return rabat;
	}
	

}
