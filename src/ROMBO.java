
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class ROMBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int l=0, dM, dm, A=0, P=0;
        
        System.out.println("AREA DE UN ROMBO");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        System.out.println("Ingrese el valor del diagonal mayor");
        dM=in.nextInt();
        System.out.println("Ingrese el valor del diagonal menor");
        dm=in.nextInt();
        A=(dM*dm)/2;
        
        
        System.out.println("El area es: "+A);
        
        System.out.println("PERIMETRO DE UN ROMBO   ");
        System.out.println("Ingrese el valor del lado");
        l=in.nextInt();
        System.out.println("Ingrese el valor del diagonal mayor");
        dM=in.nextInt();
        System.out.println("Ingrese el valor del diagonal menor");
        dm=in.nextInt();
        P=4*l;
        System.out.println("El perimetro es: "+P);
        
        System.out.println("TRABAJO HECHO POR ARANA FRANZ");
    }
    
}
