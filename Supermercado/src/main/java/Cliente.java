public class Cliente {

    //atributos
    private String nombreCompleto;
    private int documentoIdentidad;
    private int telefono;
    private String correo;


    //constructor
    public Cliente(String nombreCompleto, int documentoIdentidad, int telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
        this.correo = correo;
    }


    //get y set
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }
    public void setDocumentoIdentidad(int documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }


    //toString
    @Override
    public String toString() {
        return "Cliente " + nombreCompleto +
                "= documentoIdentidad: " + documentoIdentidad +
                ", telefono: " + telefono +
                ", correo: " + correo;
    }
}
