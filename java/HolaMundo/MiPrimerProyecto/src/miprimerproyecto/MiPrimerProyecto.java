
package miprimerproyecto;

import Modelo.Persona;

public class MiPrimerProyecto {


    public static void main(String[] args) {
        //instanciar un objeto
        Persona persona = new Persona();
        //seteando valores o asignado valor
        persona.setNombre("Daniel");
        
        persona.setApellido_paterno("Laura ");
        persona.setApellido_materno("Quispe");
        persona.setCelular(900999453);
        //optener el valor seteado o asignado
        System.out.println("El nombre es: "+ persona.getNombre());
        System.out.println("El apellido Paterno es: "+ persona.getApellido_paterno());
        System.out.println("El apellido Materno es: "+ persona.getApellido_materno());
        System.out.println("El numero de Celular es: "+ persona.getCelular());
        
        //instanciar nuevamente al opjeto persona2
        System.out.println("persona2");
        
        //instanciar un objeto persona2
        Persona persona2 = new Persona();
        //seteando valores o asignado valor de persona2 
        persona2.setNombre("mateo");
        
        persona2.setApellido_paterno("mamani ");
        persona2.setApellido_materno("bautista");
        persona2.setCelular(923444523);
        //optener el valor seteado o asignado de persona2
        System.out.println("El nombre es: "+ persona2.getNombre());
        System.out.println("El apellido Paterno es: "+ persona2.getApellido_paterno());
        System.out.println("El apellido Materno es: "+ persona2.getApellido_materno());
        System.out.println("El numero de Celular es: "+ persona2.getCelular());
        
    }
    
}
