import javax.swing.*;

public class N1_2 {
    public static void main (String[] args){
        //2. Em um campeonato de basquete, há 4 times, cada um com 10 jogadores. Receba a idade e a altura de cada jogador no campeonato.
        // Então calcule e mostre a média de idade e de altura de cada time.
        // Por fim, mostre a maior altura e a segunda maior altura entre todos os jogadores do campeonato.
        int idade, altura, primeiraAltura, segundaAltura,mediaIdade, mediaAltura;

        mediaIdade = 0;
        mediaAltura = 0;
        primeiraAltura = 0;
        segundaAltura = 0;
        for(int t=0; t<4; t++){
            for(int j=0; j<10; j++){
                idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
                mediaIdade = mediaIdade + idade;
                altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura: "));
                mediaAltura = mediaAltura + altura;
                if(altura > primeiraAltura) {
                    segundaAltura = primeiraAltura;
                    primeiraAltura = altura;
                }
                else if(altura > segundaAltura){
                    segundaAltura = altura;
                }
            }
        }
        mediaIdade = mediaIdade / 40;
        mediaAltura = mediaAltura / 40;
        System.out.println("Média de idade: " + mediaIdade);
        System.out.println("Média de altura: " + mediaAltura);
        System.out.println("Primeira Maior altura: " + primeiraAltura);
        System.out.println("Segunda Maior altura: " + segundaAltura);
    }
}
