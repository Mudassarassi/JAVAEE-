/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurada;

import java.util.Scanner;

/**
 *
 * @author Mudassar
 */
public class Estructurada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //  System.out.print(args[0] + " " + args[1]);
        p3();
                
		
	}
	public static void p1() {
	}
	public static void p2() {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int x = reader.nextInt();
		int y = x + 3;
		System.out.print("Resultado: " + y);
		
		
	}
	public static void p3() {
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce un numero1: ");
		int x = reader.nextInt();
		System.out.print("Introduce un numero2: ");
		int y = reader.nextInt();
		System.out.print("Resultado: "+ (y+x));
	}


}
