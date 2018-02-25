package rabaty;
import rabatlosowy.LosowyRabat;

public class LosowyRabatZaadoptowany extends LosowyRabat implements IObliczCenePoRabacie  {

	@Override
	public double obliczCenePoRabacie(double cena) {
		double wylosowany=losujRabat();
		double nowaCena=cena-wylosowany;
		return nowaCena;
	}

}
