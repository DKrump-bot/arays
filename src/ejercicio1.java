public class ejercicio1 {
    public static void main(String[] args) {
        //Calcula la media de un array de 10 posiciones

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int media = 0;
        int sumaTotal = 0;
        for (int i = 0; i < numeros.length; i++){
            sumaTotal = sumaTotal + numeros[i];
        }
        media = sumaTotal / numeros.length;
        System.out.println("Tu media es de " + media);

    }
}
