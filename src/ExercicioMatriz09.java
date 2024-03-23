import javax.swing.JOptionPane;
import java.util.Random;

public class ExercicioMatriz09 {
    public static void main(String[] args){
        int mat[][] = new int[4][4];
        Random gerador = new Random();

        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                mat[i][j] = gerador.nextInt(100);
                if(i == j) {
                    mat[i][j] = (int) Math.pow(4, i);
                }
            }
        }
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
