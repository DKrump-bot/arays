public class ejercicio7 {
    public static void main(String[] args) {
        //Escribid un programa Java para encontrar los valores duplicados de un array de valores enteros
        int[] numeros = {1,2,3,4,5,1,2,6,7,8,9};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]){
                    System.out.println("El numero " + numeros[i] + " esta repetido");
                }


            }
        }
    }
}
