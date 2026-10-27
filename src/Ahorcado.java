import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        //Contexto: El programa contiene un array con al menos 15 palabras y elige una al azar.
        //
        //Requisitos:
        //
        //    Convertir la palabra secreta en un char[] y crear otro char[] del mismo tamaño relleno de '_' para mostrar el progreso.
        //    Pedir letras al jugador. Se rechaza todo lo que no sea una única letra.
        //    Guardar las letras ya usadas en un array y avisar si se repite una.
        //    Si la letra está en la palabra, descubrir todas sus apariciones; si no, restar un intento (6 en total).
        //    Mostrar en cada turno: progreso, letras falladas, intentos restantes y un dibujo del ahorcado que evoluciona con los fallos (los dibujos pueden guardarse en un array de String, uno por fase).
        //    La partida acaba al adivinar la palabra o agotar los intentos, mostrando la solución.
        //
        //Ampliación opcional: las palabras se clasifican por categorías (matriz String[][], una fila por categoría) y el jugador elige la categoría antes de empezar. Las tildes deben tratarse como letras sin tilde (si el jugador escribe a, se descubre también la á).

        String[] palabras = {"sol","casa","perro","limon","zapatos","planeta","guitarra","edificio","burbuja","esqueleto","cachivache","jazmin","xilofono","sanguijuela","desoxidorribonucleico" };
        Scanner input = new Scanner(System.in);
        int longitudPalabra = 0;
        int j = 0;
        //char[] solucionSecreta = new char[];
        //char[] solucionUsuario = new char[];
        int palabraSeleccionada = 0;
        char[] solucionSecreta = new char[palabras[palabraSeleccionada].length()];
        char letraAnadir = ' ';
        char[] solucionUsuario = new char[palabras[palabraSeleccionada].length()];
        System.out.println("Seleccione la palabra ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.println((i + 1) + " " + palabras[i]);
            if (i < palabras[palabraSeleccionada].length()) {
                longitudPalabra = palabras[palabraSeleccionada].length();
                solucionSecreta[i] = palabras[palabraSeleccionada].charAt(i);
                solucionUsuario[i] = '_';
            }
        }
        for (int i = 0; i < longitudPalabra; i++) {

            solucionUsuario[i] = '_' ;
            solucionSecreta[i] = palabras[palabraSeleccionada].charAt(i);
        }
        for (int i = 0; i < longitudPalabra; i++) {
            do {

                //solucionUsuario[i] = input.next().charAt(i);
                System.out.println("La palabra es " + Arrays.toString(solucionUsuario));
                letraAnadir = input.next().charAt(0);
                for (j = 0; j < longitudPalabra; j++) {
                    if(letraAnadir == solucionSecreta[j]) {
                        solucionUsuario[j] = letraAnadir;
                    }

                }
            }while (solucionSecreta[j] == '_' );
            System.out.println("Enorabuena tu palabra era " + Arrays.toString(solucionUsuario));
        }
    }
}
