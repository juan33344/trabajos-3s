
package date;
public class TipoDato {
    public void principal () {
        // Tipos primitivos
        byte b = 100;
        short s = 10000;
        int i = 5000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 3.14159;
        char c = 'A';
        boolean isJavaFun = true;

        // Tipos de referencia
        String str = "Hola, Mundo!";
        int[] arr = {1, 2, 3, 4, 5};

        // Clase Persona
        class Persona {
            String nombre;
            int edad;
        }

        // Creación de objeto de la clase Persona
        Persona p = new Persona();
        p.nombre = "Juan";
        p.edad = 30;

        // Imprimir todos los valores
        System.out.println("Byte: " + b);
        System.out.println("Short: " + s);
        System.out.println("Int: " + i);
        System.out.println("Long: " + l);
        System.out.println("Float: " + f);
        System.out.println("Double: " + d);
        System.out.println("Char: " + c);
        System.out.println("Boolean: " + isJavaFun);
        System.out.println("String: " + str);
        System.out.println("Array: " + arr[0]);
        System.out.println("Persona: " + p.nombre + ", " + p.edad + " años.");
    }
}

    

