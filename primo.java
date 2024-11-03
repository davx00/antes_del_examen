package bucles;

import java.util.Scanner;

public class primo {
	public static void main(String[] args)
	{
		Scanner user = new Scanner (System.in);
		
		System.out.println("Adivina si tu numero es primo o no");
		System.out.println("Introducelo!");
		int primo = user.nextInt();
		int cont = 0;
		int cont1 = 0;
		
		if (primo > 1)
		{
			for (int i = 2; i <= Math.sqrt(primo); i++)
			{
				if (primo % i == 0)
				{
					cont++;
				}
			}
			if (cont == 0)
			{
				System.out.println("Es primo");
			}
			else 
				System.out.println("No es primo");
		}
		else 
			System.out.println("No es primo");
		
		user.close();
	}
}
