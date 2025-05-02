/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosasbasicas;
import java.util.Scanner;
/**
 *
 * @author FABRIZZIO
 */
public class CosasBasicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, me llamo Fabrizzio");
        System.out.println("Hola, mundo me llamo Juan");
        System.out.println("Hola, me llamo Josue");
        System.out.println("Hola, me llamo Anghello");
        System.out.println("Hola, me llamo Jafet");

        System.out.println("Operacion Suma:");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();
        int resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);


    }
    
}
