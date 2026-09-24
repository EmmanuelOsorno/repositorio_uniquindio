import java.time.LocalDate;
import java.util.Scanner;

public class Aplicacion {
    static void main() {

        //menú interactivo
        Scanner sc = new Scanner(System.in);

        Supermercado supermercado = new Supermercado("MarketPlus", "Calle 30 con carrera 15", 32165487);


        int opcion;
        do {
            System.out.println("===========Menú Supermercado===========\n");
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");

            System.out.println("--------------------------------------");

            System.out.println("5. Agregar cliente");
            System.out.println("6. Actualizar cliente");
            System.out.println("7. Eliminar cliente");
            System.out.println("8. Mostrar clientes");

            System.out.println("--------------------------------------");

            System.out.println("9. Agregar compra");
            System.out.println("10. Actualizar compra");
            System.out.println("11. Eliminar compra");
            System.out.println("12. Mostrar compras");

            System.out.println("--------------------------------------");

            System.out.println("0. Salir del menú");

            System.out.println("--------------------------------------");

            System.out.print("Seleccione la opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("==========Agregar Producto==========");

                    System.out.print("Ingrese el codigo del producto: ");
                    String codigoProducto=sc.nextLine();

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre= sc.nextLine();

                    System.out.print("Ingrese el precio unitario del producto: ");
                    double precioUnitario= sc.nextDouble();

                    System.out.print("Ingrese la cantidad disponible: ");
                    int cantidadDisponible= sc.nextInt();

                    Producto producto=new Producto(codigoProducto,nombre,precioUnitario,cantidadDisponible);

                    if(supermercado.agregarProducto(producto)){
                        System.out.println("Producto agregado correctamente");
                    }else{
                        System.out.println("El producto no pudo ser agregado");
                    }
                    break;

                case 2:
                    System.out.println("==========Actualizar Producto==========");

                    System.out.println("Ingrese el codigo del producto a atualizar: ");
                    String codigoActualizar=sc.nextLine();

                    System.out.print("Ingrese el nuevo nombre del prodcuto: ");
                    String nombreActualizado=sc.nextLine();

                    System.out.print("Ingrese el nuevo precio unitario del producto: ");
                    double precioActualizada=sc.nextDouble();

                    System.out.print("Ingrese la nueva cantidad: ");
                    int cantidadActualizado=sc.nextInt();

                    Producto actualizarProducto=new Producto(codigoActualizar,nombreActualizado,precioActualizada,cantidadActualizado);

                    if(supermercado.actualizarProducto(codigoActualizar, actualizarProducto)){
                        System.out.println("Producto actualizado correctamente");
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 3:
                    System.out.println("==========Eliminar Producto==========");

                    System.out.println("Ingrese el codigo del producto a eliminar: ");
                    String codigoEliminar=sc.nextLine();

                    if(supermercado.eliminarProducto(codigoEliminar)){
                        System.out.println("El producto fue eliminado correctamente");
                    }else{
                        System.out.println("Producto no encontrado");
                    }
                    break;

                case 4:
                    System.out.println("==========Mostrar Productos==========");

                    for(Producto ListaProductos: supermercado.getListaProductos()){
                        System.out.println(ListaProductos);
                    }
                    break;

                case 5:
                    System.out.println("==========Agregar Cliente==========");

                    System.out.print("Ingrese el nombre completo del cliente: ");
                    String nombreCompleto=sc.nextLine();

                    System.out.print("Ingrese el documento de identidad del cliente: ");
                    int documentoIdentidad= sc.nextInt();

                    System.out.print("Ingrese el teléfono del cliente: ");
                    int telefono= sc.nextInt();

                    System.out.print("Ingrese el correo disponible: ");
                    String correo= sc.nextLine();

                    Cliente cliente=new Cliente(nombreCompleto,documentoIdentidad,telefono,correo);

                    if(supermercado.agregarClientes(cliente)){
                        System.out.println("Cliente agregado correctamente");
                    }else{
                        System.out.println("El cliente no pudo ser agregado");
                    }
                    break;

                case 6:
                    System.out.println("==========Actualizar Cliente==========");

                    System.out.println("Ingrese el documento de identidad del cliente a atualizar: ");
                    int dumentoActualizar=sc.nextInt();

                    System.out.print("Ingrese el nuevo nombre del cliente: ");
                    String nombreCompletoActualizado=sc.nextLine();

                    System.out.print("Ingrese el nuevo teléfono del cliente: ");
                    int telefonoActualizado=sc.nextInt();

                    System.out.print("Ingrese el nuevo correo del cliente: ");
                    String correoActualizado=sc.nextLine();

                    Cliente actualizarClientes =new Cliente(nombreCompletoActualizado,dumentoActualizar,telefonoActualizado,correoActualizado);

                    if(supermercado.actualizarClientes(dumentoActualizar, actualizarClientes)){
                        System.out.println("Cliente actualizado correctamente");
                    }else{
                        System.out.println("Cliente no encontrado");
                    }
                    break;

                case 7:
                    System.out.println("==========Eliminar Cliente==========");

                    System.out.println("Ingrese el documento de identidad del cliente a eliminar: ");
                    int documentoIdentidadEliminar=sc.nextInt();

                    if(supermercado.eliminarClientes(documentoIdentidadEliminar)){
                        System.out.println("El cliente fue eliminado correctamente");
                    }else{
                        System.out.println("Cliente no encontrado");
                    }
                    break;

                case 8:
                    System.out.println("==========Mostrar Clientes==========");

                    for(Cliente ListaClientes: supermercado.getListaClientes()){
                        System.out.println(ListaClientes);
                    }
                    break;

                case 9:
                    System.out.println("==========Agregar Compra==========");

                    System.out.print("Ingrese el codigo de la compra: ");
                    String codigoCompra=sc.nextLine();

                    System.out.println("Ingrese la fecha en la que fue realizada la compra: ");
                    System.out.print("Ingrese el año: ");
                    int año=sc.nextInt();
                    System.out.print("Ingrese el mes: ");
                    int mes=sc.nextInt();
                    System.out.print("Ingrese el dia: ");
                    int dia=sc.nextInt();
                    LocalDate fechaRealizacion=LocalDate.of(año,mes,dia);

                    System.out.print("Ingrese el valor total de la compra: ");
                    double valorTotal= sc.nextDouble();

                    Compra compra=new Compra(codigoCompra,fechaRealizacion,valorTotal);

                    if(supermercado.agregarCompra(compra)){
                        System.out.println("Compra agregada correctamente");
                    }else{
                        System.out.println("La compra no pudo ser agregada");
                    }
                    break;

                case 10:
                    System.out.println("==========Actualizar Compra==========");

                    System.out.println("Ingrese el código de la compra a atualizar: ");
                    String codigoCompraActualizar=sc.nextLine();

                    System.out.println("Ingrese la nueva fecha en la que se realizo la compra: ");
                    System.out.print("Ingrese el año: ");
                    año=sc.nextInt();
                    System.out.print("Ingrese el mes: ");
                    mes=sc.nextInt();
                    System.out.print("Ingrese el dia: ");
                    dia=sc.nextInt();

                    LocalDate fechaRealizacionActualizada=LocalDate.of(año,mes,dia);

                    System.out.print("Ingrese el nuevo valor total de la compra: ");
                    double valorTotalActualizado=sc.nextDouble();

                    Compra actualizarCompra =new Compra(codigoCompraActualizar, fechaRealizacionActualizada, valorTotalActualizado);

                    if(supermercado.actualizarCompras(codigoCompraActualizar, actualizarCompra)){
                        System.out.println("Compra actualizada correctamente");
                    }else{
                        System.out.println("Compra no encontrada");
                    }
                    break;

                case 11:
                    System.out.println("==========Eliminar Compra==========");

                    System.out.println("Ingrese el código de la compra a eliminar: ");
                    String codigoCompraEliminar=sc.nextLine();

                    if(supermercado.eliminarCompras(codigoCompraEliminar)){
                        System.out.println("La compra fue eliminada correctamente");
                    }else{
                        System.out.println("Compra no encontrada");
                    }
                    break;

                case 12:
                    System.out.println("==========Mostrar Compras==========");

                    for(Compra ListaCompras: supermercado.getListaCompras()){
                        System.out.println(ListaCompras);
                    }
                    break;

                case 0:
                    System.out.println("Munú cerrado");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        }while(opcion!=0);
    }
}