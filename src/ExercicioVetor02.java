import javax.swing.JOptionPane;
public class ExercicioVetor02 {
    public static void main(String[] args){
        int vet[] = new int[100];
        int soma=0, media, maior=vet[0], menor=vet[0];
        for(int i=0; i<100; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(""));
        }
        for(int i=0; i<100; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
            else if (vet[i] < menor){
                menor = vet[i];
            }
        }
        for(int i=0; i<100; i++){
            soma = soma + vet[i];
        }
        media = (soma/100);
        System.out.print(maior);
        System.out.print(menor);
        System.out.print(media);
    }
}