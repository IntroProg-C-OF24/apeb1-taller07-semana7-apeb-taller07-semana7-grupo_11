package javaapplication26;
import java.util.Scanner;
public class jugadoresdeFut_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String posicion;
        int contador, edad;
        double altura;
        double sumatoriaEdad, sumatoriaAltura, promedioEdad, promedioAltura;
        String seguir = "s";
        contador = 0;
        sumatoriaEdad = 0;
        sumatoriaAltura = 0;
        while (seguir.equals("s")) {
            System.out.println("Ingrese el nombre, posicion, altura y edad del jugador: ");
            nombre = teclado.next();
            posicion = teclado.next();
            altura = teclado.nextDouble();
            edad = teclado.nextInt();
            sumatoriaEdad = (sumatoriaEdad + edad);
            sumatoriaAltura = (sumatoriaAltura + altura);
            contador = contador + 1;
            System.out.println("Jugador" + contador + ":" + nombre + "|" + posicion + "|" + edad + "|" + altura);
            System.out.println("¿ Desea ingresar mas jugadores ?");
            System.out.println("desea continuar? s=si, n=no");
            seguir = teclado.next();       
        }
        promedioEdad = (sumatoriaEdad / contador);
        System.out.println("PROMEDIO DE EDAD: " + promedioEdad);
        promedioAltura = (sumatoriaAltura / contador);
        System.out.println("PROMEDIO DE ALTURA: " + promedioAltura);
    }
}
