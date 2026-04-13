import java.util.ArrayList;

class Empleado {
    private String nombre;
    private String dni;
    private double salario;
    private String departamento;

    public Empleado(String nombre, String dni, double salario, String departamento) {
        this.nombre = nombre;
        this.dni = dni;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getDni() { return dni; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    public double salarioAnual() {
        return salario * 12;
    }

    public void aplicarAumento(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", DNI: " + dni +
                ", Salario: " + salario + ", Departamento: " + departamento);
    }
}

class RegistroEmpleados {
    private ArrayList<Empleado> empleados;

    public RegistroEmpleados() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }

    public Empleado buscarPorDni(String dni) {
        for (Empleado e : empleados) {
            if (e.getDni().equalsIgnoreCase(dni)) {
                return e;
            }
        }
        return null;
    }
}
