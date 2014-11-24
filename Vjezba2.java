public class Vjezba2 {
	/**
	 * 
	 * @param broj
	 *            bilo koji integer
	 * @return vraca vrijednost da li je broj true ili false.
	 */
	public static int isPrime(int broj) {
		int ostatak = 0; // Definisemo neki ostatak, da bi u nastavku mogli
							// vidjeti da li je broj prime ili ne
		for (int i = 2; i < broj; i++) { // Brojac koji provjerava ostatak.
											// Ukoliko je ostatak nula broj nije
											// prime.
			if (broj % i == 0) { // Uslov ukoliko je broj djeljiv sa i, ako je
									// ostatak 0 broj nije prime !!
				ostatak = 1;
				break;// Izlazimo iz petlje jer nema potrebe za daljom
						// provjerom.
			}

		}

		if (ostatak == 0) { // U ovoj petlji ispisujemo da li je broj prime ili
							// ne.
			System.out.println("broj " + broj + " je prime broj");
		}
		return broj;

	}

	public static void main(String[] args) {

		System.out.println("Unesite manji broj intervala");
		int manjBroj = TextIO.getInt();

		System.out.println("Unesite veci broj intervala");
		int veciBroj = TextIO.getInt();
        int zbir = 0;
		for (int i = manjBroj; i <= veciBroj; i++) { // Petlja poziva isPrime
					  				            	// funkciju i provjerava
														// sve brojeve izmedju
														// unijetog intervala da
														// li su prime ili ne.
			isPrime(i);
			
			
		}

	}
}
