import java.time.LocalDate;

public class Compra {

    //atributos
    private String codigoCompra;
    private LocalDate fechaRealizacion;
    private double valorTotal;


    //relacion Compra-MetodoPago
    private MetodoPago metodoPago;


    //constructor
    public Compra(String codigoCompra, LocalDate fechaRealizacion, double valorTotal) {
        this.codigoCompra = codigoCompra;
        this.fechaRealizacion = fechaRealizacion;
        this.valorTotal = valorTotal;
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


    //toString


    @Override
    public String toString() {
        return "Compra\n" +
                "codigoCompra: " + codigoCompra +
                ", fechaRealizacion: " + fechaRealizacion +
                ", valorTotal:" + valorTotal;
    }
}
