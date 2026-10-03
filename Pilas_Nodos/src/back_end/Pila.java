// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package back_end;


public class Pila {
    private Nodo tope;
    private int tm;

    public Pila() {
    }

    
    public Pila(Nodo tope, int tm) {
        this.tope = null;
        this.tm = 0;
    }
    
    public void push(comandoEdicion dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.setSiguiente(tope);
        tope = nuevoNodo;
        tm++;
  
    }
    
    public comandoEdicion pop(){
        if ( isEmpty()) {
            return null;
        }
        
        comandoEdicion datoExtraido = tope.getDato();
        tope = tope.getSiguiente();
        tm--;
        return datoExtraido;
    }
    
    public comandoEdicion peek(){
    if(isEmpty()){
        return null;
      }
    return tope.getDato();
    }
    
    public int size(){
    return tm;
    }
    
    public void clear(){
    tope = null;
    tm = 0;
    }
    
    
    
    public boolean isEmpty() {
        return tope == null;
    }    

    public Nodo getTope() {
        return tope;
    }

    public void setTope(Nodo tope) {
        this.tope = tope;
    }

    public int getTm() {
        return tm;
    }

    public void setTm(int tm) {
        this.tm = tm;
    }
    
    
    
}
