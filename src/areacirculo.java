
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class areacirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        double radio, area;
        System.out.println("AREA DE UN CIRCULO");
        System.out.println("Ingrese el radio del circulo");
        radio= in.nextDouble();
        area=(3.14159265)*(radio*radio);
        
        System.out.println("El area del circulo es: "+area);
    }
    
}
