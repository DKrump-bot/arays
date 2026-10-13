public class ejercicio6 {
    public static void main(String[] args) {
        //Busca un número en el array e indica en qué posición está, o -1 si no aparece.
        int[] numeros = {1,2,3,4,5,6,7,8,9,10};
        int numeroBuscar = 5;
        int posicionNumero = -1;
        for (int i = 0; i < numeros.length; i++){
            if (numeros[i] == numeroBuscar){
                System.out.println("el numero esta en la posicion " + i);
            } else if (i == numeros.length -1 && posicionNumero ==-1) {
                System.out.println("El numero esta en la posicion -1");
            }
        }

    }
}
