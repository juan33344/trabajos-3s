
package date;

import java.util.List;
import java.util.ArrayList;


public class EstructuraArrayList {
    public void peincipal (){
        List<String> nombres = new ArrayList<>();
        nombres.add("Diego");
        nombres.add("Daniel");
        nombres.add("Juan");
        
        
        //imprimir un valor
        System.out.println(nombres.get(1));
        System.out.println(nombres.get(2));
        
        System.out.println("nombres: ");
        
        for(int i=0; i<=2; i++ )
        
        System.out.println(nombres.get(i));
    }
    
}
