package rabaty;

public class RabatProcentowy implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		cena=cena-(70*cena/100);
		return cena;
	}

}
