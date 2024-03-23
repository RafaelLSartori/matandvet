import javax.swing.JOptionPane;

public class ExercicioVetor03 {
    public static void main(String[] args){
        int vet1[] = new int[3];
        int vet2[] = new int[3];
        int vet3[] = new int[6];
        for(int i=0; i<3; i++){
            vet1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do primeiro vetor: "));
        }
        for(int i=0; i<3; i++){
            vet2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores do segundo vetor: "));
        }
        for(int i=0; i<3; i++){
            vet3[i] = vet1[i];
            vet3[i+3]= vet2[i];
        }
        for(int i=0; i<6; i++){
            System.out.print(vet3[i]);
        }
    }
}
