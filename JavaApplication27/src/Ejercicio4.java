import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre;
        String posicion;
        int contador, edad;
        double altura;
        double sumatoriaEdad, sumatoriaAltura, promedioEdad, promedioAltura;
        boolean terminar = false;
        contador = 0;
        sumatoriaEdad = 0;
        sumatoriaAltura = 0;
        while (terminar = false) {
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
            terminar = teclado.hasNextBoolean(); 
            if (terminar != true){
                break;
            }
        }
        promedioEdad = (sumatoriaEdad % contador);
        promedioAltura = (sumatoriaAltura % contador);
        System.out.println("Promedio de edades " + promedioEdad + "Promedio de altura " + promedioAltura);
    }
}
