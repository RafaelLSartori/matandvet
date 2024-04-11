import javax.swing.*;

public class N1 {
    //1. Receba um número inteiro para o valor do saque de um caixa eletrônico. O valor deve ser múltiplo de 5.
    // Caso não seja, mostre a mensagem "VALOR INVÁLIDO" e receba o valor novamente até conseguir um valor válido.
    // Então, usando um procedimento, conte e mostre quantas notas de cada valor serão usadas nesse saque.
    // Os valores são: R$ 100, R$ 50, R$ 20, R$ 10 e R$ 5.
    // O caixa deve dar a menor quantidade possíveis de nota, ou seja, deve começar pelos valores mais altos.
    // Ex:
    //Massa de dados: 455
    //Saída:
    //4 nota(s) de R$ 100
    //1 nota(s) de R$ 50
    //1 nota(s) de R$ 5

    static int saque;
    public static void main (String[] Args){

        saque = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saque: "));

        while(saque % 5 != 0){
            JOptionPane.showMessageDialog(null, "VALOR INVÁLIDO.");
            saque = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para saque: "));
        }
        ProcSaque();
    }
    static void ProcSaque(){
        int nota100=0, nota50=0, nota20=0, nota10=0, nota5=0;
        while(saque > 0){
            if(saque >= 100){
                saque = saque - 100;
                nota100++;
            }
            else if(saque >= 50) {
                saque = saque - 50;
                nota50++;
            }
            else if(saque >= 20) {
                saque = saque - 20;
                nota20++;
            }
            else if(saque >= 10) {
                saque = saque - 10;
                nota10++;
            }
            else {
                saque = saque - 5;
                nota5++;
            }
        }
        JOptionPane.showMessageDialog(null,"Nota 100: " + nota100 + "\nNota 50: " + nota50 + "\nNota 20: " + nota20 + "\nNota 10: " + nota10 + "\nNota 5: " + nota5);
    }
}
