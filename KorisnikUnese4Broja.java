public class KorisnikUnese4Broja {
	/**
	 * Sabiranje dva integera
	 * 
	 * @param broj1
	 *            int bilo koji broj
	 * @param broj2
	 *            int bilo koji broj
	 * @return suma brojeva.
	 */
	public static int zbirInt(int broj1, int broj2) {

		int zbir = broj1 + broj2;
		return zbir;

	}

	/**
	 * razlika dva broja
	 * 
	 * @param broj1
	 *            bilo koji integer
	 * @param broj2
	 *            bilo koji integer
	 * @return razlika dva broja.
	 */
	public static int razlikaInt(int broj1, int broj2) {

		int razlika = broj1 - broj2;
		return razlika;

	}

	public static int produktInt(int broj1, int broj2) {

		int produkt = broj1 / broj2;
		return produkt;

	}

	public static int proizvodInt(int broj1, int broj2) {

		int proizvod = broj1 * broj2;
		return proizvod;

	}

	public static double zbirDouble(double broj1, double broj2) {

		double zbir = broj1 + broj2;
		return zbir;

	}

	public static double razlikaDouble(double broj1, double broj2) {

		double razlika = broj1 - broj2;
		return razlika;

	}

	public static double produktDouble(double broj1, double broj2) {

		double produkt = broj1 / broj2;
		return produkt;

	}

	public static double proizvodDouble(double broj1, double broj2) {

		double proizvod = broj1 * broj2;
		return proizvod;

	}

	public static void main(String[] args) {

		System.out.println("Unesite dva integera");

		int intBroj1 = TextIO.getInt();
		int intBroj2 = TextIO.getInt();

		System.out.println("Unesite dva doublea");

		double dBroj1 = TextIO.getDouble();
		double dBroj2 = TextIO.getDouble();

		int zbir = zbirInt(intBroj1, intBroj2);
		int razlika = razlikaInt(intBroj1, intBroj2);
		int proizvod = proizvodInt(intBroj1, intBroj2);
		int produkt = produktInt(intBroj1, intBroj2);

		double zbirD = zbirDouble(dBroj1, dBroj2);
		double razlikaD = razlikaDouble(dBroj1, dBroj2);
		double proizvodD = proizvodDouble(dBroj1, dBroj2);
		double produktD = produktDouble(dBroj1, dBroj2);

		System.out.println("Za integere zbir je: " + zbir + " razlika: "
				+ razlika + " proizvod: " + proizvod + " produkt: " + produkt);

		System.out.println("Za double zbir je: " + zbirD + " razlika: "
				+ razlikaD + " proizvod: " + proizvodD + " produkt: "
				+ produktD);

	}

}
