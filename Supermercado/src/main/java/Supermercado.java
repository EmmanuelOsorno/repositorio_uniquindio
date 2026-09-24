import java.util.ArrayList;
import java.util.List;

public class Supermercado {

    //Atributos
    private String nombreComercial;
    private String direccion;
    private int telefono;


    //listas
    private List<Cliente> ListaClientes;
    private List<Producto> ListaProductos;
    private List<Compra> ListaCompras;


    //constructor
    public Supermercado(String nombreComercial, String direccion, int telefono) {
        this.nombreComercial = nombreComercial;
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

    //===================Productos===================

    //Método para verificar productos
    public boolean verificarProducto(String codigoProducto){
        boolean existe=false;
        for(Producto producto:ListaProductos){
            if(producto.getCodigoProducto().equals(codigoProducto)){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar productos
    public boolean agregarProducto(Producto producto){
        boolean agregado=false;
        Boolean existe=verificarProducto(producto.getCodigoProducto());
        if(existe==false){
            ListaProductos.add(producto);
            agregado=true;
        }
        return agregado;
    }

    //Metodo para actualizar productos
    public boolean actualizarProducto(String codigoProducto, Producto informacionActualizada){
        boolean actualizado=false;
        for(Producto producto:ListaProductos){
            if(producto.getCodigoProducto().equals(codigoProducto)){
                producto.setNombre(informacionActualizada.getNombre());
                producto.setPrecioUnitario(informacionActualizada.getPrecioUnitario());
                producto.setCantidadDisponible(informacionActualizada.getCantidadDisponible());
                actualizado=true;
                break;
            }
        }
        return actualizado;
    }

    //Metodo para eliminar prodcutos
    public boolean eliminarProducto(String codigoProducto) {
        boolean eliminado = false;
        for (Producto producto : ListaProductos) {
            if (producto.getCodigoProducto().equals(codigoProducto)) {
                ListaProductos.remove(producto);
                eliminado = true;
                break;
            }

        }
        return eliminado;
    }


    //================Clientes============

    //metodo para verificar clientes
    public boolean verificarClientes(int documentoIdentidad){
        boolean existe=false;
        for(Cliente cliente:ListaClientes){
            if(cliente.getDocumentoIdentidad()==documentoIdentidad){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //Metodo para agregar clientes
    public boolean agregarClientes(Cliente cliente){
        boolean agregado=false;
        Boolean existe=verificarClientes(cliente.getDocumentoIdentidad());
        if(existe==false){
            ListaClientes.add(cliente);
            agregado=true;
        }
        return agregado;
    }

    //Metodo para actualizar clientes
    public boolean actualizarClientes(int documentoIdentidad, Cliente informacionActualizada){
        boolean actualizado=false;
        for(Cliente cliente:ListaClientes){
            if(cliente.getDocumentoIdentidad()==documentoIdentidad){
                cliente.setNombreCompleto(informacionActualizada.getNombreCompleto());
                cliente.setTelefono(informacionActualizada.getTelefono());
                cliente.setCorreo(informacionActualizada.getCorreo());
                actualizado=true;
                break;
            }
        }
        return actualizado;
    }

    //Metodo para eliminar clientes
    public boolean eliminarClientes(int documentoIdentidad) {
        boolean eliminado = false;
        for (Cliente cliente : ListaClientes) {
            if (cliente.getDocumentoIdentidad() == documentoIdentidad) {
                ListaClientes.remove(cliente);
                eliminado = true;
                break;
            }
        }

        return eliminado;
    }

    //===============Compras==================
    //Metodo para verificar compras
    public boolean verificarCompra(String codigoCompra){
        boolean existe=false;
        for(Compra compra:ListaCompras){
            if(compra.getCodigoCompra().equals(codigoCompra)){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //Metodo para agregar compras
    public boolean agregarCompra(Compra compra){
        boolean agregado=false;
        Boolean existe=verificarCompra(compra.getCodigoCompra());
        if(existe==false){
            ListaCompras.add(compra);
            agregado=true;
        }
        return agregado;
    }

    //Metodo para actualizar compras
    public boolean actualizarCompras(String codigoCompra, Compra informacionActualizada){
        boolean actualizado=false;
        for(Compra compra:ListaCompras){
            if(compra.getCodigoCompra().equals(codigoCompra)){
                compra.setFechaRealizacion(informacionActualizada.getFechaRealizacion());
                compra.setValorTotal(informacionActualizada.getValorTotal());
                actualizado=true;
                break;
            }
        }
        return actualizado;
    }

    //Metodo para eliminar compras
    public boolean eliminarCompras(String codigoCompra){
        boolean eliminado=false;
        for (Compra compra:ListaCompras){
            ListaCompras.remove(compra);
            eliminado=true;
            break;
        }
        return eliminado;
    }


    //Asociar compra al cliente

    public boolean asociarCompraCliente(int documentoIdentidad, String codigoCompra) {
        boolean asociado = false;

        Cliente clienteEncontrado = null;
        Compra compraEncontrada = null;


       //Buscar cliente
        for (Cliente cliente : ListaClientes) {
            if (cliente.getDocumentoIdentidad() == documentoIdentidad) {
                clienteEncontrado = cliente;
                break;
            }

        }

        //Buscar compra

        for(Compra compra: listaCompra){
            if(compra.getCodigoCompra().equals(codigoCompra)){

                compraEncontrada = compra;
                break;
            }
        }

        //Asociación




       //Agregar un producto a una compra
       //buscar producto
            //verificar que existe
        //calcular total de compra
          //Actualizar inventario
            //Consultar compras del cliente
            //total de ventas por fecha

}
