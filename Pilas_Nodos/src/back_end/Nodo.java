// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package back_end;


public class Nodo {
    private comandoEdicion dato;
    private Nodo siguiente;

    
    public Nodo(comandoEdicion dato , Nodo siguiente ) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Nodo(comandoEdicion dato) {
        this.dato = dato;
    }

    public comandoEdicion getDato() {
        return dato;
    }

    public void setDato(comandoEdicion dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dato =" + dato + ", siguiente =" + siguiente + '}';
    }
    
}
