import javax.swing.JOptionPane;
public class ExercicioVetor05 {
    public static void main(String[] args){
        int vet[] = new int[21], soma=0;
        for(int i=1; i<21; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores: "));
        }
        for(int i=1; i<11; i++){
            soma = soma + vet[i] - vet[21-i];
        }
        System.out.print(soma);
    }
}