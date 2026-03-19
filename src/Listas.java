import java.util.*;

public class Listas {

    public static int mayor(List<Integer> lista) {
        return Collections.max(lista);
    }

    public static int menor(List<Integer> lista) {
        return Collections.min(lista);
    }

    public static double promedio(List<Integer> lista) {
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        return new ArrayList<>(new HashSet<>(lista));
    }

    public static List<Integer> bubbleSort(List<Integer> lista) {
        List<Integer> arr = new ArrayList<>(lista);
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }
}
