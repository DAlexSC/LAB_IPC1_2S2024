package ejemploalgoritmomatriz;

/**
 *
 * @author Douglas Soch
 */
public class AlgoritmoMatriz {

    public int[][] aplicarAlgoritmo(int[][] matrizMuestra, int N){
        
        // Matriz Temporal 1
        int[][] matrizTemporal1 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizTemporal1[i][j] = matrizMuestra[i][j] * 3;
            }
        }
        
        // Matriz Temporal 2
        int[][] matrizTemporal2 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrizTemporal2[i][j] = matrizMuestra[i][j] * 7;
            }
        }
        
        // Matriz Temporal 3
        int[][] matrizTemporal3 = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    matrizTemporal3[i][j] += matrizTemporal1[i][k] * matrizTemporal2[k][j];
                }                
            }
        }
        
        return matrizTemporal3;
        
    }
    
}
