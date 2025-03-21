import java.util.Scanner;
//Realizar un programa que solicite ingresar
//dos números distintos y muestre por pantalla el mayor de ellos.
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingresa el segundo numero recuerda debe distindo al anterior: ");
        int num2 = scanner.nextInt();

        if (num1>num2) {
            System.out.println("el numero mayor es :"+ num1);
        }else{
            System.out.println("El numero mayor es: "+num2);
        }
        scanner.close();

    }
}
