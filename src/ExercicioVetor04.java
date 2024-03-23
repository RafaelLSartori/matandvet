import javax.swing.JOptionPane;
public class ExercicioVetor04 {
    public static void main(String[] args){
        double vet[] = new double[30], media=0, qtdAcima=0, soma=0;
        for(int i=0; i<30; i++){
            vet[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite os valores: "));
            soma = soma + vet[i];
        }
        media = (soma/30);
        for (int i=0; i<30; i++){
            if(vet[i] > media){
                qtdAcima++;
            }
        }
        for(int i=0; i<30; i++){
            if(vet[i] < media){
                System.out.print(i);
            }
        }
        System.out.print(media);
        System.out.print(qtdAcima);
    }
}