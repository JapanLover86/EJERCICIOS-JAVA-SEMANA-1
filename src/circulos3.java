
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class circulos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        float radio1, radio2, radio3, area1, area2, area3;
        System.out.println("AREA DE UN CIRCULO");
        System.out.println("Ingrese el radio 1 del circulo");
        radio1= in.nextFloat();
        System.out.println("Ingrese el radio 2  del circulo");
        radio2= in.nextFloat();
        System.out.println("Ingrese el radio 3 del circulo");
        radio3= in.nextFloat();
        area1= (float) ((3.14159265)*(radio1*radio1));
        area2= (float) ((3.14159265)*(radio2*radio2));
        area3= (float) ((3.14159265)*(radio3*radio3));
        
        System.out.println("El area del circulo es: "+area1);
        System.out.println("El area del circulo es: "+area2);
        System.out.println("El area del circulo es: "+area3);
    }
    
}
