
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class multiplicacion5numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=0;
        int resultado;
        
        Scanner numeros = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1 = numeros.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2 = numeros.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero3 = numeros.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int numero4 = numeros.nextInt();
        System.out.println("Ingrese el quinto numero");
        int numero5 = numeros.nextInt();
        
        resultado = numero1*numero2*numero3*numero4*numero5;
        
        System.out.println("El resultado de la multiplicacion es: "+resultado);
    }
    
}
