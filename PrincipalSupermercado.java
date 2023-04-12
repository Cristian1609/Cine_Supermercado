package co.edu.udes.Supermercado;

import java.util.ArrayList;
import java.util.Scanner;

public class PrincipalSupermercado {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //-------------------
        ArrayList<Supermercado_Cliente> clientes = new ArrayList<>();
        ArrayList<Supermercado_Compra> compras = new ArrayList<>();
        ArrayList<Supermercado_Inventario> inventarios = new ArrayList<>();
        ArrayList<Supermercado_Producto> productos = new ArrayList<>();
        ArrayList<Supermercado_Proveedor> proveedores = new ArrayList<>();
        ArrayList<Supermercado_Venta> ventas = new ArrayList<>();
        //-------------------

        int menu = 0;
        int subMenu = 0;
        boolean salir = false;

        while (!salir) {
            menu = mostrarMenu(entrada);
            switch (menu) {
                case 1:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:
                                listarClientes(clientes);
                                break;
                            case 2:
                                agregarCliente(entrada, clientes);
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    salir = false;
                    break;
                case 2:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:
                                listarCompra(compras);
                                break;
                            case 2:
                                agregarCompras(entrada, compras);
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    salir = false;
                    break;

                case 3:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:
                                listarInventario(inventarios);
                                break;
                            case 2:
                                agregarInventario(entrada, inventarios);
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    salir = false;
                    break;

                case 4:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:

                                ListarProducto(productos);
                                break;
                            case 2:

                                agregarProdcutos(entrada, productos);
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    salir = false;
                    break;
                case 5:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:

                                ListarProveedor(proveedores);
                                break;
                            case 2:

                                agregarProveedor(entrada, proveedores);
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    salir = false;
                    break;
                case 6:
                    while (!salir) {
                        subMenu = mostrarSubMenu(entrada);

                        switch (subMenu) {
                            case 1:

                                ListarVenta(ventas);
                                break;
                            case 2:

                                agregarVenta(entrada, ventas);
                                break;
                            case 3:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }
                    }
                    salir = false;
                    break;
                case 7: 
                    salir=true;
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        entrada.close();
        System.out.println("Saliendo...");
    }

    private static int mostrarMenu(Scanner entrada) {
        System.out.println("\nBienvenido al Sistema");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Clientes");
        System.out.println("2. Compras");
        System.out.println("3. Inventario");
        System.out.println("4. Productos");
        System.out.println("5. Proveedor");
        System.out.println("6. Ventas");
        System.out.println("7. Salir");
        return entrada.nextInt();
    }

    private static int mostrarSubMenu(Scanner entrada) {
        System.out.println("\nSub Menu General");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Listar");
        System.out.println("2. Crear");
        System.out.println("3. Salir.");
        return entrada.nextInt();
    }

    private static void listarClientes(ArrayList<Supermercado_Cliente> clientes) {
        System.out.println("\nLos clientes registrados son:");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Supermercado_Cliente cliente : clientes) {
                System.out.println(cliente.toString());
            }
        }
    }

    private static void agregarCliente(Scanner entrada, ArrayList<Supermercado_Cliente> clientes) {

        System.out.println("\nDigite la información del cliente:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Nom cliente: ");
        String nombre = entrada.next();

        System.out.println("Telefono:");
        String telefono = entrada.next();

        System.out.println("Correo:");
        String correo = entrada.next();

        Supermercado_Cliente cliente = new Supermercado_Cliente(id, nombre, telefono, correo);
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    private static void listarCompra(ArrayList<Supermercado_Compra> compras) {
        System.out.println("\nLas compras registradas son:");
        if (compras.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Supermercado_Compra compra : compras) {
                System.out.println(compra.toString());
            }
        }
    }

    private static void agregarCompras(Scanner entrada, ArrayList<Supermercado_Compra> compras) {
        System.out.println("\nDigite la información de la compra:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Fecha: ");
        String fecha = entrada.next();

        System.out.println("Cantidad productos");
        int cantidad = entrada.nextInt();

        System.out.println("Precio Unitario");
        double precioU = entrada.nextDouble();

        System.out.println("Precio Total: ");
        double precioT = entrada.nextDouble();

        Supermercado_Compra compra = new Supermercado_Compra(id, fecha, cantidad, precioU, precioT);
        compras.add(compra);
        System.out.println("Cliente agregado correctamente.");
    }

    private static void listarInventario(ArrayList<Supermercado_Inventario> inventarios) {
        System.out.println("\nLos inventarios  registrados son:");
        if (inventarios.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Supermercado_Inventario inventario : inventarios) {
                System.out.println(inventario.toString());
            }
        }
    }

    private static void agregarInventario(Scanner entrada, ArrayList<Supermercado_Inventario> inventarios) {
        System.out.println("\nDigite la información del inventario:");

        System.out.println("Cantidad productos:");
        int id = entrada.nextInt();

        System.out.println("Cantidad categorias: ");
        String fecha = entrada.next();

        System.out.println("Balance");
        double cantidad = entrada.nextInt();

        Supermercado_Inventario inventario = new Supermercado_Inventario(id, fecha, cantidad);
        inventarios.add(inventario);
        System.out.println("Inventario agregado correctamente.");
    }

    private static void ListarProducto(ArrayList<Supermercado_Producto> productos) {
        System.out.println("\nLos inventarios  registrados son:");
        if (productos.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Supermercado_Producto producto : productos) {
                System.out.println(producto.toString());
            }
        }
    }

    private static void agregarProdcutos(Scanner entrada, ArrayList<Supermercado_Producto> productos) {
        System.out.println("\nDigite la información del producto:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Categoria: ");
        String categoria = entrada.next();

        System.out.println("Precio");
        double precio = entrada.nextInt();

        System.out.println("Descripcion");
        String descripcion = entrada.next();

        System.out.println("Caducidad");
        String caducidad = entrada.next();

        Supermercado_Producto producto = new Supermercado_Producto(id, categoria, precio, descripcion, caducidad);
        productos.add(producto);
        System.out.println("Producto agregado correctamente.");
    }

    private static void ListarVenta(ArrayList<Supermercado_Venta> ventas) {
        System.out.println("\nLas ventas  registradas son:");
        if (ventas.isEmpty()) {
            System.out.println("No hay ventas registradas.");
        } else {
            for (Supermercado_Venta venta : ventas) {
                System.out.println(venta.toString());
            }
        }
    }

    private static void agregarVenta(Scanner entrada, ArrayList<Supermercado_Venta> ventas) {
        System.out.println("\nDigite la información del producto:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Fecha : ");
        String fecha = entrada.next();

        System.out.println("Precio Unitario:");
        double precioU = entrada.nextInt();

        System.out.println("Precio Total:");
        double precioT = entrada.nextDouble();

        System.out.println("Cantidad Productos");
        int cantidadProductos = entrada.nextInt();
        
        System.out.println("Categoria Productos");
        String categoria = entrada.next();
        
         System.out.println("Cliente: ");
        String cliente = entrada.next();

       Supermercado_Venta venta = new Supermercado_Venta(id, fecha, precioU, precioT, cantidadProductos, categoria, cliente);
       ventas.add(venta);
        System.out.println("Producto agregado correctamente.");
    }

    private static void ListarProveedor(ArrayList<Supermercado_Proveedor> proveedores) {
        System.out.println("\nLos proveedores  registrados son:");
        if (proveedores.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Supermercado_Proveedor proveedor : proveedores) {
                System.out.println(proveedor.toString());
            }
        }
    }

    private static void agregarProveedor(Scanner entrada, ArrayList<Supermercado_Proveedor> proveedores) {
        System.out.println("\nDigite la información del proveedor:");

        System.out.println("Nit:");
        int nit = entrada.nextInt();

        System.out.println("Nombre: ");
        String nombre = entrada.next();

        System.out.println("Telefono");
        String telefono = entrada.next();

        System.out.println("Correo");
        String correo = entrada.next();

        System.out.println("Categoria");
        String categoria = entrada.next();

        Supermercado_Proveedor proveedor = new Supermercado_Proveedor(nit, nombre, telefono, correo, categoria);
        proveedores.add(proveedor);
        System.out.println("Proveedor agregado correctamente.");
    }

}
