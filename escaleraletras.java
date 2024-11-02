package bucles;

import java.util.Scanner;

public class esclaeraletras {
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		
		System.out.println("¿De que tamaño quieres la escalera de letras?");
		int size = user.nextInt();
		
		char letraprimera = (char) ('a' + size - 1);
		
		for (int i = 0; i < size; i++)
		{
			for (char j = letraprimera; j >= 'a' + i; j--)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
