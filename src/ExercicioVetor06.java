import javax.swing.JOptionPane;
public class ExercicioVetor06 {
    public static void main(String[] args){
        double vet[] = new double[20], aux=0;
        for(int i=0; i<20; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite valores aleatórios: "));
        }
        for(int i=0; i<19; i++){
            for(int j=(i+1); j<20; j++){
                if(vet[i] > vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        for(int i=0; i<20; i++){
            System.out.println(vet[i]);
        }
    }
}