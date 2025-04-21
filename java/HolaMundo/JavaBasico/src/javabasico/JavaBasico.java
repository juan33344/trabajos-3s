
package javabasico;

import date.OperadoresLogicos;
import java.util.Scanner;

public class JavaBasico {

   
    public static void main(String[] args) {
        System.out.println("===================JAVA BASICO=====================");
        System.out.println("Juan Jose");
        System.out.println("===================================================");
        System.out.println("======================MENU=========================");
        System.out.println("1. Operadores Logicos");
        System.out.println("2. Operadores Aretmeticos");
        System.out.println("3. Operadores de comparacion");
        System.out.println("4. Tipos de Datos");
        System.out.println("5. Condicionales");
        System.out.println("6. Bucle");
        System.out.println("7. Excepciones");
        System.out.println("8. Arrays");
        System.out.println("9. Listas");
        System.out.println("10.Mapa de Valores");
        
        
       Scanner sc = new Scanner(System.in);
       
       int opcion = sc.nextInt();
       System.out.println("La opcion seleccionada es: "+opcion);
       
       boolean salir = true;
       while(salir){
           switch(opcion){
               case 1:
                   OperadoresLogicos ol = new OperadoresLogicos();
                   ol.principal();
                   break;
                   
               case 2:
                   OperadoresAretmeticos
               case 3:
                   
               case 4:
                   
               case 5:
                   
               case 6:
                   
               case 7:
                   
               case 8:
                   
               case 9:
                   
               case 10:
               
                   
              default:
                  System.out.println("Opcion no encontrada, Intende nuevamente");
             
               
           }
           salir = false;
       }
 
    }
    
}
