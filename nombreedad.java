package bucles;

import java.util.Scanner;

public class nombreedad {

	public static void main(String[] args) {
		
		Scanner user = new Scanner (System.in);
		
		System.out.println("Mi nombre es: ");
		String name = user.next();
		
		System.out.println("Cuantos años tengo?: ");
		int age = user.nextInt();
		
		int longi = name.length();
		
		System.out.println("Mi nombre tiene: " + longi + " letras");
		System.out.println("La primera letra es: " + name.charAt(0));
		System.out.println("La ultima letra es: " + name.charAt(longi - 1));
		System.out.println("Tengo " + age + " años " + ", el año que viene tendre: " + (age + 1) + " años");
	}

}
