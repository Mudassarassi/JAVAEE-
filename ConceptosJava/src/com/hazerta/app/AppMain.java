package com.hazerta.app;

import com.hazerta.lecciones.DatosPrimitivos;
import com.hazerta.models.Ave;
import com.hazerta.models.Pez;
import java.util.Scanner;

public class AppMain {

    public static void main(String[] args) {

        DatosPrimitivos dp = new DatosPrimitivos();
        
//       dp.maxValoresNumericos(4);
//       System.out.println("\n");
//       dp.maxValoresNumericos(5);
//       System.out.println("\n");
//       int resultado = dp.sumar(15, 5);
//       System.out.println(resultado); 

//        
       Ave gorrion = new Ave();
//       gorrion.setColor("Rojo");
//       Pez sardina = new Pez();
//       Ave canario = new Ave(2, 2.8f, 2, "Amarillo");
//       System.out.println("El color del canario es "+canario.getColor());
//       System.out.println("El color del canario es "+gorrion.getColor());
//       System.out.println(gorrion.toString());
//       
//       
//        
        

//         char letra = 'A';
//         char resultado = dp.charEnMinusculas(65);
//         System.out.println(resultado);
//
//                
//         float num1 = 14.8f;
//         int num2 = 10;
//         
//         long num3 = 40L;
//         
//         num2 = (int) num3;
//         
//         System.out.println(num1+num2);
         
         
//         Animal animal = new Pez();
//         animal.mover();
//         gorrion.emitirSonido();
//         AnnimalSonoro.sonidoApareamiento();
        A a1 = new A();
        A a2 = new A();
        a1.num1++;
        a1.num2++;
        System.out.println(a1.num1+" "+a1.num2);
        a2.num1++;
        a2.num2++;
        System.out.println(a1.num1+" "+a1.num2);

       // System.out.println(a1.despedirse("Ricardo")+ " "+a1.num1);
       // System.out.println(A.saludar("Ricardo")+ " "+A.num2);
       
       String notaCadena;
//       int notaNumerica = Integer.parseInt(System.console().readLine());
       System.out.println("Introduzca su nota");
       Scanner sc = new Scanner(System.in);
       double notaNumerica = Double.parseDouble(sc.next());
       if (notaNumerica < 5)
       {
           notaCadena = "suspenso";
       } else
       {
           notaCadena = "aprobado";
       }

       // Versión con el operador ternario
//       notaCadena = notaNumerica < 5 ? "suspenso" : "aprobado";
       System.out.println("Nota: " + notaCadena);
       
       System.out.println("Introduzca un numero del 1 al 7: ");
       int diaSemana = sc.nextInt();
       switch (diaSemana) 
       {
           case 1:   
            System.out.println("Lunes");
            break;
            case 2:   
            System.out.println("Martes");
            break;
            case 3:   
            System.out.println("Miercoles");
            break;
            case 4:   
            System.out.println("Jueves");
            break;
            case 5:   
            System.out.println("Viernes");
            break;
            case 6:   
            System.out.println("Sabado");
            break;
            case 7:   
            System.out.println("Domingo");
            break;
            
            default:
                System.out.println("no hay un dia de la semana");
       }
       
    }

}

class A
{
    int num1;
    static int num2;
    
    public static String saludar(String nombre)
    {
        return " Hola "+nombre;
    }
    
    public String despedirse(String nombre)
    {
        return "Adios "+nombre;
    }
}
