package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que gestiona las operaciones de un hotel.
 * Permite registrar clientes, empleados, habitaciones, dar de baja, mostrar listados, etc.
 * @author [Nombre del autor]
 * @version 1.0
 */
public class Hotel {
    
    /**
     * Método principal que inicia la ejecución del programa.
     * @param args Los argumentos de la línea de comandos (no utilizado).
     */
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Empleado> empleados = new ArrayList<>();
        ArrayList<Habitacion> habitaciones = new ArrayList<>();

        Cliente cliente = null;
        Empleado empleado = null;
        Habitacion habitacion = null;

        int opcion = 10;

        // Menú de opciones
        do {
            System.out.println("1. Registrar cliente.");
            System.out.println("2. Dar de baja a un cliente.");
            System.out.println("3. Registrar empleado.");
            System.out.println("4. Dar de baja a un empleado.");
            System.out.println("5. Agregar nueva habitación.");
            System.out.println("6. Eliminar una habitación.");
            System.out.println("7. Mostrar todos los clientes.");
            System.out.println("8. Mostrar todos los empleados.");
            System.out.println("9. Mostrar todas las habitaciones.");
            System.out.println("10. Salir del programa.");
            System.out.println("Introduce el número de la opción deseada: ");

            opcion = sca.nextInt();

            switch (opcion) {
                case 1:
                    registrarCliente(sca, clientes);
                    break;

                case 2:
                    darDeBajaCliente(sca, clientes);
                    break;

                case 3:
                    registrarEmpleado(sca, empleados);
                    break;

                case 4:
                    darDeBajaEmpleado(sca, empleados);
                    break;

                case 5:
                    agregarHabitacion(sca, habitaciones);
                    break;

                case 6:
                    eliminarHabitacion(sca, habitaciones);
                    break;

                case 7:
                    mostrarClientes(clientes);
                    break;

                case 8:
                    mostrarEmpleados(empleados);
                    break;

                case 9:
                    mostrarHabitaciones(habitaciones);
                    break;

                case 10:
                    System.out.println("Cerrando el programa...");
                    break;

                default:
                    System.out.println("La opción seleccionada no existe...");
                    break;
            }
        } while (opcion != 10);
    }
    
    /**
     * Registra un nuevo cliente en el hotel.
     * @param sca El objeto Scanner para entrada de datos.
     * @param clientes La lista de clientes del hotel.
     */
    private static void registrarCliente(Scanner sca, ArrayList<Cliente> clientes) {
        // Código para registrar un nuevo cliente
    }
    
    /**
     * Da de baja a un cliente del hotel.
     * @param sca El objeto Scanner para entrada de datos.
     * @param clientes La lista de clientes del hotel.
     */
    private static void darDeBajaCliente(Scanner sca, ArrayList<Cliente> clientes) {
        // Código para dar de baja a un cliente
    }
    
    /**
     * Registra un nuevo empleado en el hotel.
     * @param sca El objeto Scanner para entrada de datos.
     * @param empleados La lista de empleados del hotel.
     */
    private static void registrarEmpleado(Scanner sca, ArrayList<Empleado> empleados) {
        // Código para registrar un nuevo empleado
    }
    
    /**
     * Da de baja a un empleado del hotel.
     * @param sca El objeto Scanner para entrada de datos.
     * @param empleados La lista de empleados del hotel.
     */
    private static void darDeBajaEmpleado(Scanner sca, ArrayList<Empleado> empleados) {
        // Código para dar de baja a un empleado
    }
    
    /**
     * Agrega una nueva habitación al hotel.
     * @param sca El objeto Scanner para entrada de datos.
     * @param habitaciones La lista de habitaciones del hotel.
     */
    private static void agregarHabitacion(Scanner sca, ArrayList<Habitacion> habitaciones) {
        // Código para agregar una nueva habitación
    }
    
    /**
     * Elimina una habitación del hotel.
     * @param sca El objeto Scanner para entrada de datos.
     * @param habitaciones La lista de habitaciones del hotel.
     */
    private static void eliminarHabitacion(Scanner sca, ArrayList<Habitacion> habitaciones) {
        // Código para eliminar una habitación
    }
    
    /**
     * Muestra todos los clientes registrados en el hotel.
     * @param clientes La lista de clientes del hotel.
     */
    private static void mostrarClientes(ArrayList<Cliente> clientes) {
        // Código para mostrar todos los clientes
    }
    
    /**
     * Muestra todos los empleados registrados en el hotel.
     * @param empleados La lista de empleados del hotel.
     */
    private static void mostrarEmpleados(ArrayList<Empleado> empleados) {
        // Código para mostrar todos los empleados
    }
    
    /**
     * Muestra todas las habitaciones disponibles en el hotel.
     * @param habitaciones La lista de habitaciones del hotel.
     */
    private static void mostrarHabitaciones(ArrayList<Habitacion> habitaciones) {
        // Código para mostrar todas las habitaciones
    }
}
