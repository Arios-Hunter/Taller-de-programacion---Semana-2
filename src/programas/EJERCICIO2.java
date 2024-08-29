
package programas;
import java.util.Scanner;
public class EJERCICIO2 {
public static void main (String [] args){
    // Declarar variable
    double capital;
    double tasa;
    int n;
    int tiempo;
    double montoTotal;
    Scanner lectura=new Scanner(System.in);
    // Entrada
    System.out.print("Ingresar el capital inicial:");
    capital=lectura.nextDouble();
    System.out.print("Ingresar la tasa de interes efectiva anual (en %):");
    tasa=lectura.nextDouble();
    System.out.print("Ingresar el numero de veces que se compone el interes por año:");
    n=lectura.nextInt();
    System.out.print("Ingresar el tiempo en años: ");
    tiempo=lectura.nextInt();
    // Proceso de datos
    double tasaDecimal=tasa/100.0;
    montoTotal=capital * Math.pow(1+(tasaDecimal/n),n * tiempo);
        // Salida de Datos
    System.out.println("Los resultados son:");
    System.out.println("El monto total despues de"+tiempo+"años es: "+montoTotal);
    
    
    
}    
}
