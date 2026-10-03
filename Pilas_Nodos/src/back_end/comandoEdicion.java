// Victor Osvaldo Piña Becerra, Santiago Moreno Sotelo, Oscar Uriel Pedraza Alvarez
package back_end;


public class comandoEdicion {
    private String accion;
    private String texto;

    public comandoEdicion(String accion, String texto) {
        this.accion = accion;
        this.texto = texto;
    }

    public comandoEdicion() {
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return   "Accion: " + accion + ",  Texto: " + texto;
    }
    
}
