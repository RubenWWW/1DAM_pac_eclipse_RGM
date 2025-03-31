import java.util.*;
public class Ejercicio4_RGM {
	
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random aleat = new Random();

        String[] ArrayNombres = new String[20];
        int[] ArrayPuntuacion = new int[20];

    
        for (int i = 0; i < 20; i++) {
            System.out.print("Introduce el nombre del equipo " + (i + 1) + ": ");
            ArrayNombres[i] = entrada.nextLine();
        }

       
        for (int i = 0; i < 20; i++) {
            ArrayPuntuacion[i] = aleat.nextInt(66) + 35; 
        }

        int indiceGanador = 0, indiceUltimo = 0;
        for (int i = 1; i < 20; i++) {
            if (ArrayPuntuacion[i] > ArrayPuntuacion[indiceGanador]) {
                indiceGanador = i;
            }
            if (ArrayPuntuacion[i] < ArrayPuntuacion[indiceUltimo]) {
                indiceUltimo = i;
            }
        }

        int sumaPuntos = 0;
        for (int puntos : ArrayPuntuacion) {
            sumaPuntos += puntos;
        }
        double puntuacionMedia = (double) sumaPuntos / 20;

        System.out.println("\nResultados de la liga:");
        System.out.println("Equipo ganador: " + ArrayNombres[indiceGanador] + " con " + ArrayPuntuacion[indiceGanador] + " puntos.");
        System.out.println("Último clasificado: " + ArrayNombres[indiceUltimo] + " con " + ArrayPuntuacion[indiceUltimo] + " puntos.");
        System.out.printf("Puntuación media de los equipos: %.2f puntos.\n", puntuacionMedia);

        entrada.close();
    }
}
