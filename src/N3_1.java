import java.util.Random;

public class N3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int estante[][] = new int[6][6];
        int contador[] = new int[6];

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                estante[i][j] = random.nextInt(6);
                if(estante[i][j] == 0){
                    contador[0]++;
                }
                else if(estante[i][j] == 1){
                    contador[1]++;
                }
                else if(estante[i][j] == 2){
                    contador[2]++;
                }
                else if(estante[i][j] == 3){
                    contador[3]++;
                }
                else if(estante[i][j] == 4){
                    contador[4]++;
                }
                else{
                    contador[5]++;
                }
            }
        }

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 6; j++){
                System.out.print(estante[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("****************************************************");

        for (int i = 1; i < 6; i++) {
            System.out.println("Produto "+i+": "+ contador[i] + " unidades.");
        }


    }
}

