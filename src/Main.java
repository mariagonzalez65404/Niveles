import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENÚ PRINCIPAL ===");
            System.out.println("1. Calculadora Básica");
            System.out.println("2. Validador de Números");
            System.out.println("3. Manipulación de Cadenas");
            System.out.println("4. Operaciones con Listas");
            System.out.println("5. Conversor de Unidades");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1: // Calculadora
                    System.out.print("Ingresa primer número: ");
                    double num1 = sc.nextDouble();
                    System.out.print("Ingresa segundo número: ");
                    double num2 = sc.nextDouble();
                    System.out.println("Suma: " + Calculadora.sumar(num1, num2));
                    System.out.println("Resta: " + Calculadora.restar(num1, num2));
                    System.out.println("Multiplicación: " + Calculadora.multiplicar(num1, num2));
                    System.out.println("División: " + Calculadora.dividir(num1, num2));
                    System.out.println("Potencia (" + num1 + "^" + num2 + "): " + Calculadora.potencia(num1, num2));
                    System.out.println("Raíz cuadrada del primer número: " + Calculadora.raizCuadrada(num1));
                    System.out.println("Raíz cuadrada del segundo número: " + Calculadora.raizCuadrada(num2));
                    break;

                case 2: // Validador
                    System.out.print("Ingresa un número: ");
                    int n = sc.nextInt();
                    System.out.println("¿Es par? " + ValidadorNumeros.esPar(n));
                    System.out.println("¿Es primo? " + ValidadorNumeros.esPrimo(n));
                    System.out.println("¿Es perfecto? " + ValidadorNumeros.esPerfecto(n));
                    System.out.println("¿Es palíndromo? " + ValidadorNumeros.esPalindromoNumero(n));
                    break;

                case 3: // Cadenas
                    System.out.print("Ingresa una frase: ");
                    String texto = sc.nextLine();
                    int[] conteo = Cadenas.contarVocalesConsonantes(texto);
                    System.out.println("Vocales: " + conteo[0] + ", Consonantes: " + conteo[1]);
                    System.out.println("Invertida: " + Cadenas.invertirCadena(texto));
                    System.out.println("¿Es palíndromo? " + Cadenas.esPalindromoCadena(texto));
                    System.out.println("Número de palabras: " + Cadenas.contarPalabras(texto));
                    break;

                case 4: // Listas
                    System.out.print("Ingresa números separados por espacio: ");
                    String[] partes = sc.nextLine().split(" ");
                    List<Integer> lista = new ArrayList<>();
                    for (String p : partes) lista.add(Integer.parseInt(p));
                    System.out.println("Mayor: " + Listas.mayor(lista));
                    System.out.println("Menor: " + Listas.menor(lista));
                    System.out.println("Promedio: " + Listas.promedio(lista));
                    System.out.println("Sin duplicados: " + Listas.eliminarDuplicados(lista));
                    System.out.println("Ordenada: " + Listas.bubbleSort(lista));
                    break;

                case 5: // Conversor
                    // Temperatura
                    System.out.print("Ingresa temperatura en Celsius: ");
                    double celsius = sc.nextDouble();
                    System.out.println("Fahrenheit: " + Conversor.celsiusAFahrenheit(celsius));
                    System.out.println("Kelvin: " + Conversor.celsiusAKelvin(celsius));

                    System.out.print("Ingresa temperatura en Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();
                    System.out.println("Celsius: " + Conversor.fahrenheitACelsius(fahrenheit));

                    // Longitud
                    System.out.print("Ingresa longitud en metros: ");
                    double metros = sc.nextDouble();
                    System.out.println("Kilómetros: " + Conversor.metrosAKilometros(metros));

                    System.out.print("Ingresa longitud en kilómetros: ");
                    double km = sc.nextDouble();
                    System.out.println("Millas: " + Conversor.kilometrosAMillas(km));

                    System.out.print("Ingresa longitud en millas: ");
                    double millas = sc.nextDouble();
                    System.out.println("Kilómetros: " + Conversor.millasAKilometros(millas));

                    // Peso
                    System.out.print("Ingresa peso en kilogramos: ");
                    double kg = sc.nextDouble();
                    System.out.println("Libras: " + Conversor.kilogramosALibras(kg));

                    System.out.print("Ingresa peso en libras: ");
                    double libras = sc.nextDouble();
                    System.out.println("Onzas: " + Conversor.librasAOnzas(libras));

                    System.out.print("Ingresa peso en onzas: ");
                    double onzas = sc.nextDouble();
                    System.out.println("Libras: " + Conversor.onzasALibras(onzas));

                    // Tiempo
                    System.out.print("Ingresa tiempo en segundos: ");
                    double segundos = sc.nextDouble();
                    System.out.println("Minutos: " + Conversor.segundosAMinutos(segundos));

                    System.out.print("Ingresa tiempo en minutos: ");
                    double minutos = sc.nextDouble();
                    System.out.println("Horas: " + Conversor.minutosAHoras(minutos));

                    System.out.print("Ingresa tiempo en horas: ");
                    double horas = sc.nextDouble();
                    System.out.println("Segundos: " + Conversor.horasASegundos(horas));
                    break;

                case 0:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}

