public class ejercicio2 {
    public static void main(String[] args) {
        //Realiza un programa que pida diez números e imprima el mayor
        int[] numeros = {2,7,3,9,4};
        int numeroMayor = 0;
        for (int i = 0; i < numeros.length; i++){
            if (numeroMayor < numeros[i]){
                numeroMayor = numeros[i];
            }
        }
        System.out.println("El numero mas grande es " + numeroMayor);
    }
}
