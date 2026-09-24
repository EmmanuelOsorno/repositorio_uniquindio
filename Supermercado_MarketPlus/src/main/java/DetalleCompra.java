public class DetalleCompra {

    //atributos
    private String codigoProducto;
    private int cantidadProducto;


    //contructor
    public DetalleCompra(String codigoProducto, int cantidadProducto) {
        this.codigoProducto = codigoProducto;
        this.cantidadProducto = cantidadProducto;
    }


    //get y set
    public String getCodigoProducto() {
        return codigoProducto;
    }
    public void setCodigoProducto(String codigoProducto) {
        this.codigoProducto = codigoProducto;
    }
    public int getCantidadProducto() {
        return cantidadProducto;
    }
    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }


    //toString

    @Override
    public String toString() {
        return "DetalleCompra=" +
                "codigoProducto: " + codigoProducto +
                ", cantidadProducto: " + cantidadProducto;
    }
}
