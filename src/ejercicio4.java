import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        //Crea un programa que pida 10 números enteros por teclado, los almacene en un array y luego muestre por separado
        // la suma de todos los valores positivos y negativos.
        int[] numeros;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        numeros = new int[9];
        for (int i = 0; i < numeros.length; i++){
            Scanner inputValue = new Scanner(System.in);
            numeros[i] = inputValue.nextInt();
            if (numeros[i] >= 0){
                sumaPositivos = sumaPositivos + numeros[i];
            } else {
                sumaNegativos = sumaNegativos + numeros[i];

            }
        }
        System.out.println("La suma de los positios da " + sumaPositivos);
        System.out.println("La suma de los negativos da " + sumaNegativos);

    }
}
