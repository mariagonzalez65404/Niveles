public class Conversor {

    // Temperatura
    public static double celsiusAFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitACelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static double celsiusAKelvin(double c) {
        return c + 273.15;
    }

    // Longitud
    public static double metrosAKilometros(double m) {
        return m / 1000;
    }

    public static double kilometrosAMillas(double km) {
        return km * 0.621371;
    }

    public static double millasAKilometros(double mi) {
        return mi / 0.621371;
    }

    // Peso
    public static double kilogramosALibras(double kg) {
        return kg * 2.20462;
    }

    public static double librasAOnzas(double lb) {
        return lb * 16;
    }

    public static double onzasALibras(double oz) {
        return oz / 16;
    }

    // Tiempo
    public static double segundosAMinutos(double seg) {
        return seg / 60;
    }

    public static double minutosAHoras(double min) {
        return min / 60;
    }

    public static double horasASegundos(double h) {
        return h * 3600;
    }
}
