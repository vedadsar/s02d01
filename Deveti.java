public class Deveti {

	public static void main(String[] args) {
		try{
		String str = "   Neka recenica    koju provjeravamo,ali ovaj zarez da zeza";
		int redniBrojRijeciKojuTrazimo = 4;
		System.out.println("To je rijec:"
				+ izvadiRijec(str, redniBrojRijeciKojuTrazimo));
		}catch (Exception e ){
			e.printStackTrace();
		}

	}

	private static String izvadiRijec(String recenica,
			int redniBrojRijeciKojuTrazimo) {
		String trazenaRijec = "";
		int trenutaRijec = 0;
		int trenutniIndex = 0;
		while (trenutaRijec < redniBrojRijeciKojuTrazimo ){
			if(recenica.charAt(trenutniIndex) != ' '){
				if(trenutniIndex == 0){
					trenutaRijec++;
				}else{
					if ( recenica.charAt(trenutniIndex - 1) == ' '){
						trenutaRijec++;
					}
					
				}
			}
			trenutniIndex++;
		}
		
		trenutniIndex--;
		while(recenica.charAt(trenutniIndex) != ' '){
			trazenaRijec += recenica.charAt(trenutniIndex);
					trenutniIndex++;
		}
		return trazenaRijec;
	}

}
