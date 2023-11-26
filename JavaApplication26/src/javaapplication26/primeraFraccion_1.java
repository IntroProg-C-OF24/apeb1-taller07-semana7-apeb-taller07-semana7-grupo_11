package javaapplication26;
public class primeraFraccion_1 {
    public static void main(String[] args) {
        int numerador, denominador, i, n;
        numerador = 1;
        denominador = 10;
        i = 1;
        n = 6;
        while (i <= n) {
            System.out.println("" + numerador + '/' + "" + denominador);
            numerador = (numerador + 1);
            denominador = (denominador + 1);
            i = i + 1;
        }
    }
}
