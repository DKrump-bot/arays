public class ejercicio5 {
    public static void main(String[] args) {
        //Realiza un programa que calcule cuántos números pares e impares tiene un array.
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int numeroPositivo = 0;
        int numeroNegativo = 0;
        for (int i = 0; i < numeros.length; i++){
            int resto;
            resto = numeros[i] % 2;
            System.out.println(resto);
            if (resto == 0){
                numeroPositivo = numeroPositivo + 1;

            }else {
                numeroNegativo = numeroNegativo + 1;
            }
        }
        System.out.println("Hay " + numeroPositivo + " numeros positivos");
        System.out.println("Hay " + numeroNegativo + " numeros negativos");
    }
}
