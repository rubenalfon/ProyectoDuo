
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Angel & Ruben
 */
public class HolaDAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero para calcular la tabla de multiplicar: ");

        int num = sc.nextInt();
        int cont = 1;
        
        System.out.println("La tabla de multiplicar del" + num + "es:");
        while (cont < 11) {
            System.out.println(num + " * " + cont + " = " + (num*cont));
            cont++;
        }
    }
    
}
