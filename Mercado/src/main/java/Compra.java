import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Compra {
    //Atributos
    private String codigoCompra;
    private LocalDate fechaRealizacion;
    private double valorTotal;


    //relacion Compra-MetodoPago
    private MetodoPago metodoPago;
    //relacion Cliente-Compra
    private Cliente cliente;
    //relacion Compra-DetalleCompra
    private DetalleCompra detalleCompra;

    //creacion de lista
    private List<DetalleCompra> listaDetalleCompra;


    public Compra(List<DetalleCompra> listaDetalleCompra) {
        this.listaDetalleCompra = listaDetalleCompra;

    }



    //constructor
    public Compra(String codigoCompra, LocalDate fechaRealizacion, double valorTotal, MetodoPago metodoPago) {
        this.codigoCompra = codigoCompra;
        this.fechaRealizacion = fechaRealizacion;
        this.valorTotal = valorTotal;
        this.metodoPago= metodoPago;
        this.detalleCompra=detalleCompra;


        //Inicializar la lista

        listaDetalleCompra = new ArrayList<>();


    }



    //get y set
    public String getCodigoCompra() {
        return codigoCompra;
    }
    public void setCodigoCompra(String codigoCompra) {
        this.codigoCompra = codigoCompra;
    }
    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }
    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }
    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<DetalleCompra> getListaDetalleCompra() {
        return listaDetalleCompra;
    }

    public void setListaDetalleCompra(List<DetalleCompra> listaDetalleCompra) {
        this.listaDetalleCompra = listaDetalleCompra;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public DetalleCompra getDetalleCompra() {
        return detalleCompra;
    }

    public void setDetalleCompra(DetalleCompra detalleCompra) {
        this.detalleCompra = detalleCompra;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    //toString

    @Override
    public String toString() {
        return "Compra{" +
                "codigoCompra='" + codigoCompra + '\'' +
                ", fechaRealizacion=" + fechaRealizacion +
                ", valorTotal=" + valorTotal +
                ", metodoPago=" + metodoPago +
                ", cliente=" + cliente +
                ", detalleCompra=" + detalleCompra +
                ", listaDetalleCompra=" + listaDetalleCompra +
                '}';
    }


    //Método agregar detalleCompra

    public boolean agregarDetalleCompra(DetalleCompra detalle){
        boolean agregado = false;

        listaDetalleCompra.add(detalle);
        agregado = true;

        return agregado;
    }

    //Calcular valor total de compra

    public double calcularValorTotal(List<Producto> listaProductos){
        double total = 0;

        for(DetalleCompra detalle : listaDetalleCompra){

            for(Producto producto : listaProductos){

                if(producto.getCodigoProducto().equals(detalle.getCodigoProducto())){

                    total = total + (producto.getPrecioUnitario() * detalle.getCantidadProducto());

                    break;
                }
            }
        }

        return total;
    }

}
