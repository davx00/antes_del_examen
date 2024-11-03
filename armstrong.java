package bucles;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		
		Scanner user = new Scanner (System.in);
		
		System.out.println("Introduce el numero que quieres comprobar");
		int armstrong = user.nextInt();
		
		int longitud = 0;
		
		int temp= armstrong;
		int suma = 0;
		while (temp != 0)
		{
			temp = temp / 10;
			longitud++;
			
		}
		
		temp = armstrong;
		while (temp != 0)
		{
			int digit = temp % 10;
			suma += Math.pow(digit, longitud);
			temp = temp / 10;
		}
		
		if (suma == armstrong)
		{
			System.out.println("Es armstrong");
		}
		else 
			System.out.println("No es armstrong");
	}

}
