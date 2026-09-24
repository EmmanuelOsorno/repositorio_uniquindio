import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    //atributos
    private String nombreomercial;
    private String direccion;
    private int telefono;


    //listas
    private List<Cliente> ListaClientes;
    private List<Producto> ListaProductos;
    private List<Compra> ListaCompras;


    //constructor
    public Supermercado(String nombreomercial, String direccion, int telefono) {
        this.nombreomercial = nombreomercial;
        this.direccion = direccion;
        this.telefono = telefono;


        //inicializar listas
        ListaClientes=new ArrayList<>();
        ListaProductos=new ArrayList<>();
        ListaCompras=new ArrayList<>();
    }


    //get y set
    public String getNombreomercial() {
        return nombreomercial;
    }
    public void setNombreomercial(String nombreomercial) {
        this.nombreomercial = nombreomercial;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getTelefono() {
        return telefono;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public List<Cliente> getListaClientes() {
        return ListaClientes;
    }
    public void setListaClientes(List<Cliente> listaClientes) {
        ListaClientes = listaClientes;
    }
    public List<Producto> getListaProductos() {
        return ListaProductos;
    }
    public void setListaProductos(List<Producto> listaProductos) {
        ListaProductos = listaProductos;
    }
    public List<Compra> getListaCompras() {
        return ListaCompras;
    }
    public void setListaCompras(List<Compra> listaCompras) {
        ListaCompras = listaCompras;
    }


    //toString
    @Override
    public String toString() {
        return "Supermercado= " + nombreomercial +
                "= direccion: " + direccion +
                ", telefono: " + telefono +
                ", ListaClientes: " + ListaClientes +
                ", ListaProductos: " + ListaProductos +
                ", ListaCompras: " + ListaCompras;
    }
}
