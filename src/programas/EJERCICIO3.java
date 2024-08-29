
package programas;
import java.util.Scanner;
public class EJERCICIO3 {
public static void main (String [] args){
    // Declarar variables
    double base,exponente,resultado;
    Scanner lectura=new Scanner(System.in);
    // Entrada de datos
    System.out.print("Ingresar la base: ");
    base=lectura.nextDouble();
    System.out.print("Ingresar el exponente: ");
    exponente=lectura.nextDouble();
    // Proceso de calculo
    resultado=Math.pow(base,exponente);
    //Salida de datos
    System.out.println("El resultado de" +base+"elevado a"+exponente+"es:"+resultado);
    // Mostrar resultado
}    
}
