
package date;

import java.util.Scanner;


public class Condicionales {
    public void principal(){
        Scanner sc = new Scanner (System.in);
       
        
        System.out.println("==========================================");
        System.out.println("Bienbenido al Modulo Condicionales");
        System.out.println("==========================================");
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt(); 
        if (edad>=18){
            System.out.println("es mayor de edad");
        }else{
            System.out.println("es menor de edad");
        }
    }
   public void valideInformacionPersona(){
       Scanner sc = new Scanner (System.in);
       System.out.print("Ingrese su edad: ");
       int edad = sc.nextInt();
       
       if (edad < 5){
           System.out.println("eres una nino(a)");
           
       }else if (edad <= 12){
           System.out.println("eres un adolecente");
        
       }else if (edad <=20){
           System.out.println("eres un joven");
       }else if (edad <=60){
           System.out.println("eres un adulto");
       }else if(edad >60){
           System.out.println("eres un anciano");
       }
       String tipoDia = "";
       String diaSemana = "Lunes";

     switch (diaSemana.toLowerCase()) {
     case "lunes" -> tipoDia = "Inicio de semana";
     case "martes", "míercoles", "jueves" -> tipoDia = "Mediados de semana";
     case "viernes" -> tipoDia = "Inicio de fin se semana";
     case "sábado", "domingo" -> tipoDia = "Fin de seman";
 }

System.out.println(diaSemana + " es " + tipoDia);
   } 
           
}

