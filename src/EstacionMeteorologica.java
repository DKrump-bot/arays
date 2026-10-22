import java.util.Scanner;

//Contexto: Una estación registra la temperatura máxima de cada día de la semana. El programa guarda las temperaturas en un double[7] y los nombres de los días en un String[7].
//
//Requisitos:
//
//    Pedir las 7 temperaturas mostrando el nombre del día. Solo se aceptan valores entre -30 y 50; si el valor no es válido, se vuelve a pedir.
//    Mostrar la temperatura media de la semana con dos decimales.
//    Mostrar la temperatura máxima y la mínima indicando en qué día se produjeron.
//    Listar los días que superaron la media.
//    Indicar entre qué dos días consecutivos se produjo la mayor subida de temperatura y de cuántos grados fue.
//    Dibujar un gráfico de barras horizontal con asteriscos, uno por grado (los valores negativos se muestran con -).
//
//Restricciones: cada apartado debe ser un método independiente que reciba el array como parámetro. El main solo puede

public class EstacionMeteorologica {
    static final String RESET = "\u001B[0m";   // vuelve al color normal
    static final String AZUL  = "\u001B[34m";
    static final String VERDE = "\u001B[32m";
    static final String ROJO  = "\u001B[31m";
    public static void main(String[] args) {
        String[] dias = {"Lunes" , "Martes" , "Miercoles" , "Jueves" , "Viernes" , "Sabado" , "Domingo"};
        int[] temperaturas = new int[7];
        float temperturaMedia = 0;
        String mediaReal = "";
        int temperaturaMinima = 0;
        int temperaturaMaxima = 0;
        String diaMax = "";
        String diaMin = "";
        int mayorSubida = 0;

        String diasCosecutivos = "";
        Scanner inValue = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            do {
                System.out.println("Ingrese temperaturas del " + dias[i]);
                temperaturas[i] = inValue.nextInt();
                if (temperaturas[i] >= 50 || temperaturas[i] <=-30){
                    System.out.println("Temperatura invalida");
                }
                temperturaMedia =temperturaMedia + temperaturas[i];
            }while (temperaturas[i] >=50 || temperaturas[i] <= -30 );
        }
        temperturaMedia = temperturaMedia / 7;
        mediaReal = String.format("%.2f", temperturaMedia);
        System.out.println("La temperatura media es " + mediaReal);
        for (int i = 0; i < 7; i++) {
            if ( i == 0) {
                temperaturaMaxima = temperaturas[i];
                temperaturaMinima = temperaturas[i];
                diaMax = dias[i];
                diaMin = dias[i];
            }else if (temperaturas[i] > temperaturaMaxima){
                temperaturaMaxima = temperaturas[i];
                diaMax = dias[i];
            }else if (temperaturas[i] < temperaturaMinima){
                temperaturaMinima = temperaturas[i];
                diaMin = dias[i];
            }

        }
        System.out.println("la temperatura maxima es " + temperaturaMaxima + " y fue el " + diaMax);
        System.out.println("la temperatura minima es " + temperaturaMinima + " y fue el " + diaMin);
        for (int i = 0; i < 7; i++) {
            if (temperaturas[i] > temperturaMedia){
                System.out.println("El dia " + dias[i] + " supero la media ");
            }
        }
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                mayorSubida = (temperaturas[i] - temperaturas[i + 1]);
                diasCosecutivos = dias[i] + " " + dias[i + 1];
            } else if (i == 6) {
                break;
            } else if ((temperaturas[i] - temperaturas[i+1]) > mayorSubida ) {
                mayorSubida = Math.abs(temperaturas[i] - temperaturas[i+1]);
                diasCosecutivos = dias[i] + " " +  dias[i+1];

            }

        }
        System.out.println("Los dias " + diasCosecutivos + " son los dias en los que mas diferencia de emperatra hay con " + mayorSubida + "º de diferencia");
        for (int i = 0; i < 7; i++) {

            System.out.printf("%-10s", dias[i]);
            for (int j = 0; j < Math.abs(temperaturas[i] + 30); j++){
                if  (j >= 0 && j <= 30 ){
                    System.out.print(AZUL + "▯" + RESET);
                }else if (j >= 30 && j <=55){
                    System.out.print(VERDE + "█" + RESET);
                }else {
                    System.out.print(ROJO + "█" + RESET);
                }
            }
            System.out.print(" " + temperaturas[i] + "º");
            System.out.println();
        }

    }
}
