
package javaapplication16;

public class Tipo_Documento {

    public class TipoDocumento {
         private int id_tipo_documento;
         private String nombre;
         private String sigla;
         private String pais;
         private String estado;

        // Getter para 'nombre'
        public String getNombre() {
            return this.nombre;
        }

        // Setter para 'nombre'
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }
}

