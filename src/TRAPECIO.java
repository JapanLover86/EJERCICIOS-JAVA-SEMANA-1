
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class TRAPECIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int l1=0, l2, l3, l4, b, B, h, A=0, P=0;
        
        System.out.println("AREA DE UN TRAPECIO");
        System.out.println("Ingrese el valor de la base");
        b=in.nextInt();
        System.out.println("Ingrese el valor de la base mayor");
        B=in.nextInt();
        System.out.println("Ingrese el valor de la altura");
        h=in.nextInt();
        A=(h*(B+b))/2;
        
        System.out.println("El area es: "+A);
        
        System.out.println("PERIMETRO DE UN TRAPECIO");
        System.out.println("Ingrese el valor del lado1");
        l1=in.nextInt();
        System.out.println("Ingrese el valor del lado2");
        l2=in.nextInt();
        System.out.println("Ingrese el valor del lado3");
        l3=in.nextInt();
        System.out.println("Ingrese el valor del lado4");
        l4=in.nextInt();
        P=l1+l2+l3+l4;
        System.out.println("El perimetro es: "+P);
        
        System.out.println("TRABAJO HECHO POR ARANA FRANZ");
    }
    
}
