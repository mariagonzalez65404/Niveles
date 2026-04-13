public class Cadenas {

    public static int[] contarVocalesConsonantes(String cadena) {
        int vocales = 0, consonantes = 0;
        String vocalesStr = "aeiouAEIOU";

        for (char c : cadena.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vocalesStr.indexOf(c) != -1) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }
        return new int[]{vocales, consonantes};
    }

    public static String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    public static boolean esPalindromoCadena(String cadena) {
        String limpio = cadena.replace(" ", "").toLowerCase();
        return limpio.equals(new StringBuilder(limpio).reverse().toString());
    }

    public static int contarPalabras(String frase) {
        return frase.trim().split("\\s+").length;
    }
}
