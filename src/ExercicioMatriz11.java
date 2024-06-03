public class ExercicioMatriz11 {
    public static void main(String[] args) {
        int x, y, z;
        int mat[][] = new int[8][8];

        for (z = 1; z <= 4; z++){
            for (x = (z-1); x <= (8-z); x++){
                for (y = z-1; y <= (8-z); y++){
                    mat[x][y] = z;
                }
            }
        }
        for (x = 0; x < 8; x++){
            for (y = 0; y < 8; y++){
                System.out.print(mat[x][y] + "\t");
            }
            System.out.println("\n");
        }
    }
}
