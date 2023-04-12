package co.edu.udes.Cine;


import java.util.ArrayList;

import java.util.Scanner;

public class PrincipalCine {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //-------------------
        ArrayList<Cine_Cliente> clientes = new ArrayList<>();
        ArrayList<Cine_Empleado> empleados = new ArrayList<>();
        ArrayList<Cine_Cafeteria> cafeterias = new ArrayList<>();
        ArrayList<Cine_Sala> salas = new ArrayList<>();
        int menu = 0;
        int subMenu = 0;
        boolean salir = false;
        //-------------------

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
                                listarEmpleados(empleados);
                                break;
                            case 2:
                                agregarEmpleados(entrada, empleados);
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
                                listarCafeteria(cafeterias);
                                break;
                            case 2:
                                agregarCafeterias(entrada, cafeterias);
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

                                ListarSala(salas);
                                break;
                            case 2:

                                agregarSalas(entrada, salas);
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
                    salir = true;
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
        System.out.println("2. Empleados");
        System.out.println("3. Cafeteria");
        System.out.println("4. Sala");
        System.out.println("5. Salir");
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

    private static void listarClientes(ArrayList<Cine_Cliente> clientes) {
        System.out.println("\nLos clientes registrados son:");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cine_Cliente cliente : clientes) {
                System.out.println(cliente.toString());
            }
        }
    }

    private static void agregarCliente(Scanner entrada, ArrayList<Cine_Cliente> clientes) {
        System.out.println("\nDigite la información del cliente:");

        System.out.println("Nombre:");
        String nombre = entrada.next();

        System.out.println("Numero Identificacion:");
        String identificacion = entrada.next();

        System.out.println("Telefono:");
        String telefono = entrada.next();

        Cine_Cliente cliente = new Cine_Cliente(nombre, identificacion, telefono);
        clientes.add(cliente);
        System.out.println("Cliente agregado correctamente.");
    }

    private static void listarEmpleados(ArrayList<Cine_Empleado> empleados) {
        System.out.println("\nLos empleado registrados son:");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            for (Cine_Empleado empleado : empleados) {
                System.out.println(empleado.toString());
            }
        }
    }

    private static void agregarEmpleados(Scanner entrada, ArrayList<Cine_Empleado> empleados) {

        System.out.println("\nDigite la información del empleado:");

        System.out.println("Id:");
        int id = entrada.nextInt();

        System.out.println("Nombre:");
        String nombre = entrada.next();

        System.out.println("Direccion:");
        String direccion = entrada.next();

        System.out.println("Correo:");
        String correo = entrada.next();

        System.out.println("Fecha Nacimiento:");
        String fechaNacimineto = entrada.next();

        System.out.println("ARL: ");
        String arl = entrada.next();
        System.out.println("Tipo labor: ");
        String labor = entrada.next();

        Cine_Empleado empleado = new Cine_Empleado(id, nombre, direccion, correo, fechaNacimineto, arl, labor);
        empleados.add(empleado);

        System.out.println("Empleado agregado correctamente.");
    }

    private static void listarCafeteria(ArrayList<Cine_Cafeteria> cafeterias) {
        System.out.println("\nLas cafeterias  registradas son:");
        if (cafeterias.isEmpty()) {
            System.out.println("No hay cafeterias registradas.");
        } else {
            for (Cine_Cafeteria cafeteria : cafeterias) {
                System.out.println(cafeteria.toString());
            }
        }
    }

    private static void agregarCafeterias(Scanner entrada, ArrayList<Cine_Cafeteria> cafeterias) {
        System.out.println("\nDigite la información de la cafeteria:");

        System.out.println("Nombre:");
        String nombre = entrada.next();

        System.out.println("Ubicacion:");
        String ubicacion = entrada.next();

        System.out.println("Horario:");
        String horario = entrada.next();

        System.out.println("Numero Cafeteria");
        int numeroCafeteria = entrada.nextInt();

        System.out.println("Numero Empleados:");
        int numeroEmpleados = entrada.nextInt();

        System.out.println("Numero Mesas");
        int numeroMesas = entrada.nextInt();

        Cine_Cafeteria cafeteria = new Cine_Cafeteria(nombre, ubicacion, horario, numeroCafeteria, numeroEmpleados, numeroMesas);
        cafeterias.add(cafeteria);
        System.out.println("Cafeteria agregada correctamente.");
    }

    private static void ListarSala(ArrayList<Cine_Sala> salas) {
        System.out.println("\nLas salas  registradas son:");
        if (salas.isEmpty()) {
            System.out.println("No hay cafeterias registradas.");
        } else {
            for (Cine_Sala sala : salas) {
                System.out.println(sala.toString());
            }
        }
    }

    private static void agregarSalas(Scanner entrada, ArrayList<Cine_Sala> salas) {
       
         System.out.println("\nDigite la información de la sala:");

         
        System.out.println("Nombre:");
        String nombre = entrada.next();

        System.out.println("Tipo:");
        String tipo= entrada.next();

        System.out.println("Numero sillas");
        int sillas= entrada.nextInt();

        System.out.println("Numero Empleados");
        int empleados= entrada.nextInt();

        

        Cine_Sala sala = new Cine_Sala(nombre, tipo, sillas, empleados);
        salas.add(sala);
        System.out.println("sala agregada correctamente.");
    }
}
