/*
 *  Repositorio: https://github.com/DAlexSC/LAB_IPC1_2S2024
 */

package ejemploalgoritmomatriz;

/**
 * @author Douglas Soch
 */
public class EjemploAlgoritmoMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[][] matriz = {
            {15,21,9,18,6,6},
            {18,9,3,27,21,18},
            {3,9,27,24,18,15},
            {3,24,27,9,15,12},
            {3,3,15,24,24,9},
            {24,15,15,21,21,9},
        };
        int N = matriz.length;        
        AlgoritmoMatriz algoritmo = new AlgoritmoMatriz();
        int[][] respuesta = algoritmo.aplicarAlgoritmo(matriz, N);
        
        // Imprimir la matriz para verificar
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(respuesta[i][j] + "\t");
            }
            System.out.println();
        }
        
    }

}
