import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        Estudiante estudiante = new Estudiante("Ana", 20);
        Agenda agenda = new Agenda();
        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "001", 500);
        Carrito carrito = new Carrito();
        RegistroEmpleados registro = new RegistroEmpleados();

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Gestionar Estudiante");
            System.out.println("2. Agenda de Contactos");
            System.out.println("3. Cuenta Bancaria");
            System.out.println("4. Carrito de Compras");
            System.out.println("5. Registro de Empleados");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.println("\n--- Estudiante ---");
                    estudiante.agregarCalificacion(4.0);
                    estudiante.agregarCalificacion(2.5);
                    estudiante.mostrarInformacion();
                    break;

                case 2:
                    System.out.println("\n--- Agenda ---");
                    agenda.agregarContacto(new Contacto("Carlos", "123456", "carlos@mail.com"));
                    agenda.agregarContacto(new Contacto("Laura", "987654", "laura@mail.com"));
                    agenda.listarContactos();
                    System.out.print("Buscar contacto por nombre: ");
                    String nombreBuscar = sc.nextLine();
                    Contacto encontrado = agenda.buscarContacto(nombreBuscar);
                    if (encontrado != null) {
                        System.out.println("Encontrado: " + encontrado.getNombre() + " - " + encontrado.getTelefono());
                    } else {
                        System.out.println("No se encontró el contacto.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Cuenta Bancaria ---");
                    cuenta.consultarSaldo();
                    System.out.print("Monto a depositar: ");
                    double dep = sc.nextDouble();
                    cuenta.depositar(dep);
                    cuenta.consultarSaldo();
                    System.out.print("Monto a retirar: ");
                    double ret = sc.nextDouble();
                    cuenta.retirar(ret);
                    cuenta.consultarSaldo();
                    break;

                case 4:
                    System.out.println("\n--- Carrito de Compras ---");
                    carrito.agregarProducto(new Producto("Laptop", 2000, 1));
                    carrito.agregarProducto(new Producto("Mouse", 50, 2));
                    System.out.println("Total sin descuento: " + carrito.calcularTotal());
                    System.out.print("Porcentaje de descuento: ");
                    double desc = sc.nextDouble();
                    System.out.println("Total con descuento: " + carrito.aplicarDescuento(desc));
                    break;

                case 5:
                    System.out.println("\n--- Registro de Empleados ---");
                    Empleado emp1 = new Empleado("Sofía", "123", 1500, "IT");
                    Empleado emp2 = new Empleado("Luis", "456", 1800, "Ventas");
                    registro.agregarEmpleado(emp1);
                    registro.agregarEmpleado(emp2);
                    emp1.mostrarInfo();
                    emp2.mostrarInfo();
                    System.out.print("Buscar empleado por DNI: ");
                    String dniBuscar = sc.nextLine();
                    Empleado buscado = registro.buscarPorDni(dniBuscar);
                    if (buscado != null) {
                        System.out.println("Encontrado: ");
                        buscado.mostrarInfo();
                        System.out.print("Aplicar aumento (%): ");
                        double aumento = sc.nextDouble();
                        buscado.aplicarAumento(aumento);
                        buscado.mostrarInfo();
                    } else {
                        System.out.println("No se encontró el empleado.");
                    }
                    break;

                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
