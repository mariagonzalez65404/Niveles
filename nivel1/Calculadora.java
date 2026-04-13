public class Calculadora {

    public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static String dividir(double a, double b) {
        if (b == 0) {
            return "Error: División por cero";
        }
        return String.valueOf(a / b);
    }

    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static String raizCuadrada(double n) {
        if (n < 0) {
            return "Error: No se puede calcular raíz de número negativo";
        }
        return String.valueOf(Math.sqrt(n));
    }
}
