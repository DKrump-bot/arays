public class ejercicio9 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int suma = 6;
        for (int i = 0; i < numeros.length; i++) {
            for (int j =i + 1; j < numeros.length;j++) {
                if ((numeros[i] + numeros[j]) == suma){
                    System.out.println("el los numeros " + numeros[i] + " y " + numeros[j] + " dan la suma");
                }

            }
        }
    }
}
