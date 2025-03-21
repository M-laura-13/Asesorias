//Ingresar el sueldo de una persona, si supera los 3000 dolares mostrar un
//mensaje en pantalla indicando que debe abonar impuestos.
import java.util.Scanner;
public class ImpuestoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese su sueldo");
        float sueldo = scanner.nextFloat();

        if (sueldo>=3000) {
            System.out.println("Debe abonar impuestos");
        }else{
            System.out.println("No debe abonar impuestos");
        }
        scanner.close();
    }
}
