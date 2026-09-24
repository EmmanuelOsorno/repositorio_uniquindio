import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Atributos
    private String nombreCompleto;
    private int documentoIdentidad;
    private int telefono;
    private String correo;


    //relacion Cliente-Compra
    private Compra compra;


    //Creación listas

    private List<Compra> listaCompras;



    //constructor
    public Cliente(String nombreCompleto, int documentoIdentidad, int telefono, String correo) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.telefono = telefono;
        this.correo = correo;
        this.compra=compra;


        //Inicializar las listas

        listaCompras= new ArrayList<>();

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

    public Compra getCompra() {return compra;}
    public void setCompra(Compra compra) {this.compra = compra;}


    //metodo para mostrar compra
    public void mostrarCompra(){
        System.out.println("Cliente: "+nombreCompleto);
        System.out.print("Documento de identidad: "+documentoIdentidad);
        System.out.print("Compras=\nCodigo de compra: "+compra.getCodigoCompra()+"\nFecha de compra: "+compra.getFechaRealizacion()+"\nDetalles de la compra: "+compra.getDetalleCompra());
    }



    public List<Compra> getListaCompras() {
        return listaCompras;
    }public void setListaCompras(List<Compra> listaCompras) {

        this.listaCompras = listaCompras;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Cliente " + nombreCompleto +
                "= documentoIdentidad: " + documentoIdentidad +
                ", telefono: " + telefono +
                ", correo: " + correo +
                ", listaCompras=" + "\nDetalles de la compra: "+compra.getDetalleCompra();
    }

    //================Clientes==================

    // Método verificar  compra

    public boolean verificarCompra(String codigoCompra){
        boolean existe = false;
        for(Compra compra: listaCompras){
            if(compra.getCodigoCompra()==(codigoCompra)){
                existe = true;
                break;
            }
        }
        return existe;
    }

    //Metodo para agregar compra

    public boolean agregarCompra(Compra compra){
        boolean agregada = false;
        boolean existe = verificarCompra(compra.getCodigoCompra());
        if(existe == false){
            listaCompras.add(compra);
            agregada = true;
        }

        return agregada;
    }
}
