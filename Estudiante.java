import java.util.ArrayList;

public class Estudiante {
        private String nombre;
        private int edad;
        private ArrayList<Double> calificaciones;

        public Estudiante(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
            this.calificaciones = new ArrayList<>();
        }

        public void agregarCalificacion(double nota) {
            calificaciones.add(nota);
        }

        public double calcularPromedio() {
            if (calificaciones.isEmpty()) return 0;
            double suma = 0;
            for (double nota : calificaciones) {
                suma += nota;
            }
            return suma / calificaciones.size();
        }

        public boolean aprobar() {
            return calcularPromedio() >= 3.0;
        }

        public void mostrarInformacion() {
            String estado = aprobar() ? "Aprobado" : "Reprobado";
            System.out.println("Nombre: " + nombre + ", Edad: " + edad +
                    ", Promedio: " + calcularPromedio() + ", Estado: " + estado);
        }
    }

