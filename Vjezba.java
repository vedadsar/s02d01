
import java.util.Scanner;


public class Vjezba {
	public static int sum( int br1, int br2){
		
		int sum = br1 + br2;
		return sum;
	}
	
public static double sum( double br1, double br2){
		
	    double  sum = br1 + br2;
		return sum;
	}


public static void pozdrav( String ime){
	System.out.println("Cao " +ime);
}
	
	
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		
		
		int sum = sum(num1, num2);
		double sum1 = sum(1.78, 9.16);
		
		System.out.println("Zbir je: " +sum +". Double sum:  " +sum1);
			System.out.println(num1 +" " +num2);	
			
	pozdrav("Mirza");
	

	}

}
