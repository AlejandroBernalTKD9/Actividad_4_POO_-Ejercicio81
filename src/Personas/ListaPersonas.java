
package Personas;
import java.util.*;

/**
 * @author Alejandro Bernal
 */
public class ListaPersonas {
    
    Vector listaPersonas; 
    public ListaPersonas() {
        listaPersonas = new Vector(); // Crea el vector de personas
    }

    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
    
}
