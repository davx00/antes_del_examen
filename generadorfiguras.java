package bucles;

import java.util.Scanner;

public class generadorfiguras {
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("Introduce el simbolo ");
		String a =  user.next();
		
		System.out.println("Introduce la figura (cuadrado o triangulo) ");
		String b =  user.next();
		
		System.out.println("Introduce si quieres relleno o no ");
		String c =  user.next();
		
		System.out.println("Introduce el tamaño ");
		int size =  user.nextInt();
		
		if (b.equals("cuadrado") && c.equals("no"))
		{
			for (int j = 0; j < size; j++)
			{
				for (int l = 0; l < size; l++)
				{
					if (j == 0 || j == size -1 || l == 0 || l == size -1)
					{
						System.out.print(a);
					}
					else 
						System.out.print(" ");
				}
				System.out.println();
			}
			
		}
		if (b.equals("cuadrado") && c.equals("si"))
		{
			for (int j = 0; j < size; j++)
			{
				System.out.println();
				for (int l = 0; l < size; l++)
				{
					System.out.print(a);
				}
			}
		}
		if (b.equals("triangulo") && c.equals("si"))
		{
			for (int d = 0; d < size; d++)
			{
				System.out.println();
				for (int s = 0; s <= d; s++)
				System.out.print(a);
			}
		}
		if (b.equals("triangulo") && c.equals("no"))
		{
			for (int d = 0; d < size; d++)
			{
				for (int s = 0; s <= d; s++)
				{
					if ( d == size - 1 || s == 0 || s == d)
					{
						System.out.print(a);
					}
					else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
		user.close();
	}		
}
