import javax.swing.JOptionPane;

public class ExercicioVetor01 {
    public static void main(String[] args){
        int vet[] = new int[50];
        int cta=0, soma=0, media, somaImpar =0;
        for(int i=0; i<10; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite os valores: "));
            if (vet[i] >= 10 && vet[i] <= 200){
                soma = soma + vet[i];
                cta++;
            }
            if(vet[i] % 2 !=0){
                somaImpar = somaImpar + vet[i];
            }
        }
        if(cta !=0){
            media = soma / cta;
            System.out.println("A média é: " + media);
        } else {
            System.out.println("Os números coletados não estão entre 10 e 200");
        }
        if (somaImpar == 0){
            System.out.println("Não foi lido nenhum número ímpar");
        } else {
            System.out.println("Soma dos números ímpares: " + somaImpar);
        }
    }
}