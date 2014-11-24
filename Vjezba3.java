public class Vjezba3 {
	/**
	 * 
	 * @param broj
	 *            bilo koji integer
	 * @return da li je broj paran ili ne
	 */
	public static int paran(int broj) {
		int ostatak = 0;

		if (broj % 2 != 0) {

			ostatak = 1;

		}

		if (ostatak == 0) {

			
		}

		return ostatak;

	}

	public static void main(String[] args) {
		int zbir = 0;
		int zbir1=0;
		System.out.println("Unesite manji broj intervala");
		int manjBroj = TextIO.getInt();

		System.out.println("Unesite veci broj intervala");
		int veciBroj = TextIO.getInt();

		for (int i = manjBroj; i <= veciBroj; i++) {

			paran(i);
             
             if(paran(i)==0){
            	 zbir = zbir +i;
             }
             
             if(paran(i) != 0){
            	 zbir1 = zbir1 +i;
             }
             
		}
		System.out.println("Zbir parnih brojeva je " +zbir);
		System.out.println("Zbir neparnih brojeva je " +zbir1);
	}
}
