public class DetalleCompra {

    //atributos
    private Producto producto;
    private int cantidadProducto;


    //contructor
    public DetalleCompra(Producto producto, int cantidadProducto) {
        this.producto = producto;
        this.cantidadProducto = cantidadProducto;
    }


    //get y set
    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


    public double calcularValor(){
        return producto.getPrecioUnitario()*cantidadProducto;
    }


    //toString

    @Override
    public String toString() {
        return "DetalleCompra= " +
                "producto: " + producto +
                ", cantidadProducto: " + cantidadProducto +
                ", valor de la compra: "+calcularValor();
    }
}
