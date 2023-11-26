import java.util.Scanner;
public class Ejercicio2{
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num,dem, i, n;
        num = 5;
        dem = 10;
        i = 1;
        n = 6;
        while (i<=n){
            System.out.println("" + num + "/" + "" + dem);
        num = num + 5;
        dem = dem + 2;
        i = i + 1;
        } 
    }
}
