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
    public Compra(String codigoCompra, LocalDate fechaRealizacion, double valorTotal) {
        this.codigoCompra = codigoCompra;
        this.fechaRealizacion = fechaRealizacion;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.detalleCompra=detalleCompra;


        //Iinicializar la lista

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

    public Cliente getCliente() {return cliente;}

    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

    public List<DetalleCompra> getListaDetalleCompra() {
        return listaDetalleCompra;
    }

    public DetalleCompra getDetalleCompra() {return detalleCompra;}

    public void setDetalleCompra(DetalleCompra detalleCompra) {this.detalleCompra = detalleCompra;}

    public void setListaDetalleCompra(List<DetalleCompra> listaDetalleCompra) {
        this.listaDetalleCompra = listaDetalleCompra;

    }


    //metodo para mostrar detalleCompra
    public void mostrarDetalleCompra(){
        System.out.println("Compra: "+codigoCompra);
        System.out.print("Detalles de la compra: "+detalleCompra.getProducto()+", "+detalleCompra.getCantidadProducto()+", "+detalleCompra.calcularValor());
    }


    //toString
    @java.lang.Override
    public java.lang.String toString() {
        return "Compra= " +
                "codigoCompra: " + codigoCompra +
                ", fechaRealizacion: " + fechaRealizacion +
                ", valorTotal: " + valorTotal +
                ", metodoPago: " + metodoPago +
                "\nDetalles de la compra: "+detalleCompra;
    }



}
