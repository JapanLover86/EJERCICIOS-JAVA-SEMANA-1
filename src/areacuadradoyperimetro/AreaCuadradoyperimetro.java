/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package areacuadradoyperimetro;

import java.util.Scanner;

/**
 *
 * @author Andertaker
 */
public class AreaCuadradoyperimetro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int l=0, A=0, P=0;
        
        System.out.println("AREA DE UN CUADRADO");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        A=l*l;
        
        System.out.println("El area es: "+A);
        
        System.out.println("PERIMETRO DE UN CUADRADO");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        P=4*l;
        System.out.println("El perimetro es: "+P);
        
        System.out.println("TRABAJO HECHO POR ARANA FRANZ");
    }
    
}
