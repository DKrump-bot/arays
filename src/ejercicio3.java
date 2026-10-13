public class ejercicio3 {
    public static void main(String[] args) {
        //Realiza un programa que imprima el menor de un array de 10 números
        int[] numeros = {2,7,3,9,4};
        int numeroMenor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (i == 0){
                numeroMenor = numeros[0];
            }else if (numeroMenor > numeros[i]){
                numeroMenor = numeros[i];
            }

        }
        System.out.println("El numero mas grande es " + numeroMenor);
    }
}
