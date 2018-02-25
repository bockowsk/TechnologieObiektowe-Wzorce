package main;

import java.util.Iterator;

import dokumenty.Faktura;
import dokumenty.Pozycja;

public abstract class DrukujFakture {

	public void wyswietl(Faktura faktura) {
		drukujNaglowek();
		drukujCialo(faktura);
		drukujStopke();
	}
	protected abstract void drukujNaglowek();
	protected abstract void drukujCialo(Faktura faktura);
	protected abstract void drukujStopke();

}
