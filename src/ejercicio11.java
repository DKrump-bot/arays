import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9};
        int[] numerosInvertidos = {0,0,0,0,0,0,0,0,0};
        for (int i = 0; i < numeros.length; i++) {
            numerosInvertidos[i] = numeros[numeros.length -1 - i];

        }
        System.out.println(Arrays.toString(numerosInvertidos));
    }
}
