
package date;

import java.util.HashMap;
import java.util.Map;




public class EstructuraDatoHasMap {
    public void principales(){
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 20);
        edades.put("Pepito", 20);
        edades.put("Marcos", 20);
        
        //remober un valor 
        //edades.renove("Ana");
        
        //interar un HashMap
       for(Map.Entry<String, Integer> item: edades.entrySet()){
           System.out.println("Nombre: "+item.getKey()+"su edad es: "+item.getValue());
       }
        
    }
    
}
