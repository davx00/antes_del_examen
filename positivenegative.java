/*Contar cuántos números positivos y negativos ingresa el usuario.
El usuario irá introduciendo números respondiendo a la pregunta
¿Quieres introducir más números?
o Si responde con s el programa seguirá pidiendo que introduzca más
números
o Si responde con n se deja de pedir más números y se muestra el total de
positivos y negativos introducidos.
o Cualquier otra respuesta no se acepta.
*/
package bucles;

import java.util.Scanner;

public class positivenegative {
	public static void main(String[] args)
	{
	
	Scanner user = new Scanner (System.in);
	
	System.out.println("Contador de numeros positivos y negativos, para seguir (s), para salir (n)");
	
	String escribe = user.next();
	
	int positive = 0;
	int negative = 0;
	
	while(escribe.equals("s"))
	{	
		System.out.println("Escribe el numero");
		int num = user.nextInt();
		
		if (num >= 0)
		{
			positive++;
		}
		else 
			negative++;
		
		System.out.println("Llevas " + positive + " numeros positivos y " + negative + " numeros negativos");
		System.out.println("¿Quieres introducir más números? (s) (n)");
		escribe = user.next();
	}
	System.out.println("Tienes " + positive + " numeros positivos y " + negative + " numeros negativos");
	}
}
