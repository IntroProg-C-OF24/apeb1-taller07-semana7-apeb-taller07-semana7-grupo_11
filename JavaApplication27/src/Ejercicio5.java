
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String estudiante;
        double nota, numeroEstu;
        int i;
        i = 1;
        numeroEstu = 1;
        while (i < 3) {
            System.out.println("Ingrese el nombre del estudiante");
        estudiante = teclado.next();
        System.out.println("Ingrese el promedio final del estudiante");
        nota = teclado.nextDouble();
        if (nota >= 7 && nota <= 10) { 
            System.out.println("Estudiante: " + estudiante);
            System.out.println("Promedio: " + nota);
            System.out.println("APROBADO");
        }else{
               System.out.println("Estudiante: " + estudiante);
            System.out.println("Promedio: " + nota);
            System.out.println("REPROBADO");
            i = i + 1;
            }
        }
    }
}

