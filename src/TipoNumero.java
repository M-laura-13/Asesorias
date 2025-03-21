//Se ingresa por teclado un valor entero,
//mostrar una leyenda que indique si el número es positivo,
//negativo o nulo (es decir cero)

import java.util.Scanner;

public class TipoNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingrese un valor entero :");
        int valor = scanner.nextInt();

        if (valor>0) {
            System.out.println("El numero es positivo");
        }else if (valor<0) {
            System.out.println("El numero es negativo ");
        } else{
            System.out.println("El valor es nulo ");
        }
        scanner.close();
    }
   
}
