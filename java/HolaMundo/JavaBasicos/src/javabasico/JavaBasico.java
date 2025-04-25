
package javabasico;

import date.Ciclos;
import date.Condicionales;
import date.EstructuraArrayList;
import date.EstructuraDatoArrays;
import date.EstructuraDatoHasMap;
import date.OperacionesComparacion;
import date.OperadoresAretmeticos;
import date.OperadoresLogicos;
import date.TipoDato;
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
        
        try {
            Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una opcion:  ");
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
                   OperadoresAretmeticos oa = new  OperadoresAretmeticos();
                   oa.principal();
                   break;
                   
               case 3:
                   OperacionesComparacion oc = new OperacionesComparacion();
                   oc.principal();
                   break;
                  
                   
               case 4:
                   TipoDato tp = new TipoDato();
                   tp.principal();
                   break;
                   
               case 5:
                   Condicionales c = new Condicionales();
                   c.valideInformacionPersona();
                   break;
               case 6:
                   Ciclos ciclos = new Ciclos();
                   ciclos.cicloFor();
                   break;
               case 7:
                   //Ejemplo realizado en la clase Principal
               case 8:
                   EstructuraDatoArrays e = new EstructuraDatoArrays ();
                   e.principal();
                   break;
                   
               case 9:
                   EstructuraArrayList eal = new EstructuraArrayList ();
                   eal.peincipal();
                   break;
         
                   
               case 10:
                   EstructuraDatoHasMap edhm = new EstructuraDatoHasMap();
                   edhm.principales();
                   break;
                   
                   
              default:
                  System.out.println("Opcion no encontrada, Intende nuevamente");
             
               
           }
           salir = false;
       }
            
        } catch (Exception e) {
            System.out.println("Ocurrio un Error!: por favor ingrese un numero valido: "+ e.getMessage());
        }
        
        
       
 
    }
    
}
