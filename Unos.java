public class Unos {

	public static int getInput(String poruka) {
		System.out.println(poruka);
		int unos = TextIO.getInt();
		return unos;
	}

	public static double getInput1(String poruka) {

		System.out.println(poruka);
		double unos = TextIO.getDouble();
		return unos;

	}

	public static String getInput2(String poruka) {
		System.out.println(poruka);
		String unos = TextIO.getln();
		return unos;

	}

	public static void main(String[] args) {
				
		int a= getInput("Unesi broj");
		double b= getInput1("Unesi double broj");
		String c= getInput2("Unesi rijec ");
		
				
		System.out.println("Vas uneseni broj je " +a );
		System.out.println("Vas uneseni double broj je " +b);
		System.out.println("Vasa unesena rijec je " +c);
		

	}
}
