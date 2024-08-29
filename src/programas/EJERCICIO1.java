
package programas;
import java.util.Scanner;
public class EJERCICIO1 {
    public static void main (String [] args){
// Declarar variable
double numero, raizCuadrada;
Scanner lectura=new Scanner(System.in);
// Entrada de datos
System.out.print("Ingresar un numero:");
numero=lectura.nextDouble();
// Proceso de datos
raizCuadrada=Math.sqrt(numero);
// Salida de datos
System.out.println("Los resultados son:");
System.out.println("La raiz cuadrada de"+numero+"es"+raizCuadrada);
// Mostrar el resultado

    }
    
}
