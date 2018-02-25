package rabaty;

public class RabatKwotowy implements IObliczCenePoRabacie {

	@Override
	public double obliczCenePoRabacie(double cena) {
		cena=Math.abs(cena-100);
		return cena;
	}

}
