import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] vet = { 8, 9, 3, 5, 1 };
         BublleSort(vet);
         System.out.println(Arrays.toString(vet));
    }

    public static void BublleSort(int v[]) {
        for (int ultimo = v.length - 1; ultimo > 0; ultimo--) {
            for (int i = 0; i < ultimo; i++) {
                if (v[i] > v[i + 1]) {
                    change(v, i, i + 1);
                }
            }
        }
    }

    public static void change(int[] v, int i, int j) {
        int aux = v[i];
        v[i] = v[j];
        v[j] = aux;
    }
}
