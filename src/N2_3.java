import java.util.Random;

public class N2_3 {
    public static void main(String[] args){
        int mat[][] = new int[800][800];

        Random random = new Random();

        for(int i=0; i<800; i++){
            for(int j=0; j<800; j++){
                mat[i][j] = random.nextInt(100);
                if(i+j == 799){
                    mat[i][j] = (int)Math.pow(2,i);
                }
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("****************************************************");
        for (int i = 0; i < 800; i++) {
            for (int j = 0; j < 800; j++) {
                if(i+j== 799){
                    mat[i][j] = mat[i][j];
                }
                else{
                    mat[i][j] = mat[i][j] / mat[i][5-i];
                }
            }
        }
        for (int i = 0; i < 800; i++) {
            for (int j = 0; j < 800; j++) {
                if (i + j == 799) {
                    mat[i][j] = mat[i][j] / mat[i][5-i];
                }
            }
        }
        for(int i=0; i<800; i++) {
            for (int j=0; j<800; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}
