
package date;

public class EstructuraDatoArrays {
    public void principal(){
        int edad = 10;
        String nombres = "Pepito";
        int[] edades = {10, 20, 30, 40, 60, 80, 90, 100};
        String[] nombre = {"Pepe", "Maria", "Miguel" };
        Object[] nombresEdades = {"Juan", "Maria",50, true,12.29, "Juan Jose"};
        
        //imprimer un valor
        System.out.println(edades[5]);
        System.out.println(nombre[2]);
        
        for(int i = 0; i <= 8; i++){
            System.out.println(edades[i]);
        }
        for(int i = 0; i <= nombre.length; i++){
            System.out.println(nombre[i]);
            
        }
        for(int i = 0; i<= nombresEdades.length-1; i++ ){
            System.out.println(nombresEdades[i]);
        
        if("Juan Jose"==nombresEdades[i]){
            System.out.println("aqui esta mi nombre:"+nombresEdades[i]);
        }
        }
         
    }
    
}
