
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class area8circulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        float radio1, radio2, radio3, radio4, radio5, radio6, radio7, radio8, area1, area2, area3, area4, area5, area6, area7, area8;
        System.out.println("AREA DE UN CIRCULO");
        System.out.println("Ingrese el radio 1 del circulo");
        radio1= in.nextFloat();
        System.out.println("Ingrese el radio 2  del circulo");
        radio2= in.nextFloat();
        System.out.println("Ingrese el radio 3 del circulo");
        radio3= in.nextFloat();
        System.out.println("Ingrese el radio 4 del circulo");
        radio4= in.nextFloat();
        System.out.println("Ingrese el radio 5 del circulo");
        radio5= in.nextFloat();
        System.out.println("Ingrese el radio 6 del circulo");
        radio6= in.nextFloat();
        System.out.println("Ingrese el radio 7 del circulo");
        radio7= in.nextFloat();
        System.out.println("Ingrese el radio 8 del circulo");
        radio8= in.nextFloat();
        area1= (float) ((3.14159265)*(radio1*radio1));
        area2= (float) ((3.14159265)*(radio2*radio2));
        area3= (float) ((3.14159265)*(radio3*radio3));
        area4= (float) ((3.14159265)*(radio4*radio4));
        area5= (float) ((3.14159265)*(radio5*radio5));
        area6= (float) ((3.14159265)*(radio6*radio6));
        area7= (float) ((3.14159265)*(radio7*radio7));
        area8= (float) ((3.14159265)*(radio8*radio8));
        
        System.out.println("El area del circulo es: "+area1);
        System.out.println("El area del circulo es: "+area2);
        System.out.println("El area del circulo es: "+area3);
        System.out.println("El area del circulo es: "+area4);
        System.out.println("El area del circulo es: "+area5);
        System.out.println("El area del circulo es: "+area6);
        System.out.println("El area del circulo es: "+area7);
        System.out.println("El area del circulo es: "+area8);
    }
    
}
