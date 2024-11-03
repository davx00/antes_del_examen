package bucles;

import java.util.Scanner;

public class sieteymedio {

    public static void main(String[] args) {
        
        Scanner user = new Scanner(System.in);
        System.out.println("¡Juego de Siete y Medio!");
        System.out.println("Para empezar (s), para rendirse (n)");
        
        double suma = 0;
        double suma1 = 0;
        String carta = user.next();
        
        while (!carta.equals("n") && suma <= 7.5) {
            if (carta.equals("s")) {
                int random = (int) (Math.random() * 10 + 1);
                double valor = (random == 8 || random == 9 || random == 10) ? 0.5 : random;
                
                suma += valor;
                System.out.println("Consigues la carta: " + random);
                System.out.println("La puntuación actual es: " + suma);

                if (suma > 7.5) {
                    System.out.println("¡Te has pasado de 7.5! Has perdido.");
                    
                }
            }
            System.out.println("Para pedir otra carta (s), para rendirse (n)");
            carta = user.next();
        }
        
        if (suma <= 7.5) {
            while (suma1 <= 7.5 && suma1 <= 6.5) {
                int random1 = (int) (Math.random() * 10 + 1);
                double valor1 = (random1 == 8 || random1 == 9 || random1 == 10) ? 0.5 : random1;
                
                suma1 += valor1;
                System.out.println("(IA) Consigue la carta: " + random1);
                System.out.println("(IA) Puntuación actual: " + suma1);

                if (suma1 > 7.5) {
                    System.out.println("(IA) ¡Se ha pasado de 7.5!");
                
                }
                
                if (suma1 >= 6.5) {
                	 System.out.println("(IA) Decide detenerse");
                }
            }
        }
        
        if (suma > 7.5) {
            System.out.println("La IA gana, el jugador se pasó de 7.5.");
        } else if (suma1 > 7.5) {
            System.out.println("El jugador gana, la IA se pasó de 7.5.");
        } else if (suma > suma1) {
            System.out.println("¡El jugador gana con " + suma + " contra " + suma1 + " de la IA!");
        } else if (suma1 > suma) {
            System.out.println("La IA gana con " + suma1 + " contra " + suma + " del jugador.");
        } else {
            System.out.println("Empate con " + suma + " ambos.");
        }

        user.close();
    }
}
