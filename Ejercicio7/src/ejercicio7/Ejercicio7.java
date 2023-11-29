package ejercicio7;
public class Ejercicio7 {
    public static void main(String[] args) {
        int i, n;
        float num, dem;
        double division, respuesta, resultado;
        respuesta = 0;
        i = 1;
        n = 10;
        num = 1;
        dem = 0;
        resultado = 0;
        while (i <= n){
            num = num * (-1);
             System.out.print("("+num + "/" + dem + ") + ");
            dem = dem + 1;
            division = (num / dem);
            respuesta = division;
            resultado = (resultado + respuesta);
            i = i + 1;
        }   
        System.out.println("Sumatoria total: " + resultado);
    }
    
}
