import javax.swing.JOptionPane;
public class ExercicioVetor08 {
    public static void main(String[] args){
        int mat[][] = new int[4][3];
        int sem[] = new int[4];
        int mes[] = new int[3];
        int total = 0;
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                mat[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Digite os valores: "));
                mes[j] = mes[j] + mat[i][j];
                sem[i] = sem[i] + mat[i][j];
                total = total + (mes[j] + sem[i]);
            }
        }
        for(int j=0; j<3; j++){
            System.out.println("Mês: " + mes[j]);
        }
        System.out.println("****************************************************");
        for(int i=0; i<4; i++){
            System.out.println("Semana: " + sem[i]);
        }
        System.out.println("****************************************************");
        System.out.print("Total: " + total);
    }
}