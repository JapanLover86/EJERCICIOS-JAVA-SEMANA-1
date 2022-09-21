
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Andertaker
 */
public class promedionotas5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float acum = 1;
        float notas = 0;
        Scanner r = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas para promediar");
        float cn = r.nextFloat();
        
        while (notas <= cn){
            System.out.println("Ingrese la nota a promediar: "+acum);
            float n=r.nextFloat();
            notas = n;
            acum++;
        }
        
        float promedios = notas/cn;
        
        System.out.println("El promedio es: "+promedios);
    }
    
}
