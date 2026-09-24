public class Producto {

    //atributos
    private String codigoProducto;
    private String nombre;
    private double precioUnitario;
    private int cantidadDisponible;


    //relacion Producto-Categoria
    private Categoria categoria;


    //constructor
    public Producto(String codigoProducto, String nombre, double precioUnitario, int cantidadDisponible) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadDisponible = cantidadDisponible;
    }


    //get y set
    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    //toString


    @java.lang.Override
    public java.lang.String toString() {
        return "Producto{" +
                "codigoProducto='" + codigoProducto + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precioUnitario=" + precioUnitario +
                ", cantidadDisponible=" + cantidadDisponible +
                ", categoria=" + categoria +
                '}';
    }

    //Método  para verificar disponible
    public boolean verificarDisponibilidad(int cantidad){
        boolean disponible = false;

        if(cantidadDisponible >= cantidad){
            disponible = true;
        }

        return disponible;
    }
}
