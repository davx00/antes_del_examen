package bucles;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		
		Scanner user = new Scanner (System.in);
		
		System.out.println("Introduce un numero para calcular su !");
		int fact = user.nextInt();
		
		int factorial = fact;
		
		for (int i = 1; i < fact; i++)
		{
			factorial = (factorial * i);
		
		}
		System.out.println(factorial);

	}
}
