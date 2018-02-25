package main;

import java.util.Iterator;

import dokumenty.Faktura;
import dokumenty.Pozycja;

public class DrukujFaktureStandardowa extends DrukujFakture {

	@Override
	protected void drukujNaglowek() {
		System.out.println("=====================================================");

	}

	@Override
	protected void drukujCialo(Faktura faktura) {
		System.out.println("FA z dnia: " + faktura.getDataSprzedazy().toString());
		System.out.println("Wystawiona dla: " + faktura.getKontrahent());
		System.out.println("Na kwote: " + faktura.getSuma());
		Iterator<Pozycja> iteratorPozycji = faktura.getIteratorPozycji();
		while (iteratorPozycji.hasNext()) {
			Pozycja pozycja = iteratorPozycji.next();
			System.out.println("Towar: " + pozycja.getNazwa() + " Ilosc: " + pozycja.getIlosc() + " Wartosc:"
					+ pozycja.getWartosc());
		}


	}

	@Override
	protected void drukujStopke() {
		System.out.println("=====================================================");

	}

}
