package actividad4;
import java.util.Scanner;
public class Actividad4 {
    public static void main(String[] args) {
        double cuadrado, cubo, numero;
        Scanner número = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        numero = número.nextDouble();
        cuadrado = Math.pow(numero,2);
        cubo = Math.pow(numero,3);     
        System.out.println("Su cuadrado es: " + cuadrado);
        System.out.println("Su cubo es: " + cubo);
    }
}
