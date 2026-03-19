public class ValidadorNumeros {

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }

    public static boolean esPrimo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean esPerfecto(int n) {
        int suma = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) suma += i;
        }
        return suma == n;
    }

    public static boolean esPalindromoNumero(int n) {
        String numStr = String.valueOf(n);
        return numStr.equals(new StringBuilder(numStr).reverse().toString());
    }
}
