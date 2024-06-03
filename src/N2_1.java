import javax.swing.JOptionPane;
public class N2_1 {
    public static void main(String[] args){
        int opc = 0;
        int num = 0;
        while(opc !=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(" Opção 1: Validar \n Opção 2: Convertar e Mostrar \n Opção 9: FIM "));
            switch(opc){
                case 1: num = Fvalida(num);
                break;
                case 2: PconverteMostra(num);
                break;
                case 9: JOptionPane.showMessageDialog(null,"FIM.");
                System.exit(0);
                break;
                default: JOptionPane.showMessageDialog(null,"INVÁLIDO.");
            }
        }
    }
    static int Fvalida(int n){
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while(n<0 || n>31){
            JOptionPane.showMessageDialog(null,"VALOR INVÁLIDO");
            n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 0 e 31: "));
        }
        return n;
    }
    static void PconverteMostra(int n){
        System.out.println("\nValor digitado: " + n);
        int vetBin[] = new int[5];
        for(int i=4; i>=0; i--){
            vetBin[i] = n % 2;
            n = n/2;

        }
        System.out.println("Conversão em binário: ");
        for(int i=0; i<=4; i++){
            System.out.print(vetBin[i] + " ");
        }
    }
}
