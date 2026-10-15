import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {
        int[] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9,};
        int posicion = 0;
        for (int i = posicion; i < numeros.length -1; i++) {
            numeros[i] = numeros[i+1];

        }
        numeros[numeros.length -1] = 0;
        System.out.println(Arrays.toString(numeros));

    }

}