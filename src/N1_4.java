import javax.swing.*;

public class N1_4 {
    public static void main(String[] args) {

        //Receba um número inteiro n entre 3 e 10 (3 ≤ n ≤ 10). Caso não seja, mostre a mensagem "VALOR INVÁLIDO"
        // e receba o número novamente até conseguir um valor válido. Então, usando uma função, calcule e retorne
        // o resultado da série: XXX Por fim, mostre o resultado retornado pela função.

        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while (num < 3 || num > 10) {
            JOptionPane.showMessageDialog(null, "VALOR INVALIDO!");
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite um novo número: "));
        }
        System.out.println(FSerie(num));
    }
    static double FSerie(int n){
        double serie = 0;
        for(int cta=1; cta<=n; cta++) {
            serie = (double)serie + ((n-cta+1) / FFat(2*cta-1));
        }
        return n;
    }
    static double FFat(double n){
        double fat = 1;
        for(int cta=1; cta<n; cta++){
            fat = (fat*cta);
        }
        return n;
    }
}
