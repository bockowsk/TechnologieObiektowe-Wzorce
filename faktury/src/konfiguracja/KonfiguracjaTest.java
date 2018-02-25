package konfiguracja;

public class KonfiguracjaTest {
	private static KonfiguracjaTest instancja = new KonfiguracjaTest();
	public static KonfiguracjaTest getKonfiguracjaTest() {
		return instancja;
	}
	
	public static void main(String[] args) {
		KonfiguracjaTest o1=KonfiguracjaTest.getKonfiguracjaTest();
		KonfiguracjaTest o2=KonfiguracjaTest.getKonfiguracjaTest();
		if (o1.equals(o2)) {
			System.out.println("IDENTYCZNE");
		}
		else {
			System.out.println("inne");
		}
	}
}
