public class ejercicio8 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] numeros2 = {2,4,6,7,8,9};
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros2.length; j++) {
                if (numeros[i] == numeros2[j]){
                    System.out.println("el numero  "+ numeros[i] + " esta ne ambos lados");
                }
            }

        }
    }
}
