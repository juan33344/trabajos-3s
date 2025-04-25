
package date;


public class OperadoresLogicos {
    //variables
    //Metodos
    public void principal(){
        System.out.println("==========================================");
        System.out.println("Bienbenido al Modulo de operadores logicos");
        System.out.println("==========================================");
        
        boolean esVerdadero = true;
        boolean esFalse = false;
        
        System.out.println("Operador Logico (AND) (Y) SIMBOLO=(&&)");
        System.out.println("Verdadero y Verdadero: "+String.valueOf(esVerdadero && esVerdadero) );
        System.out.println("Falso y Verdadero: "+String.valueOf(esFalse&& esVerdadero) );
        System.out.println("Verdadero y Falso: "+String.valueOf(esVerdadero && esFalse) );
        System.out.println("Falso y Falso: "+String.valueOf(esFalse && esFalse) );
        
        
    }
    
}
