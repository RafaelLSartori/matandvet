import javax.swing.*;

public class EscolhaCasoMenu {
    public static void main(String[] args) {
        int vet[] = new int[20];
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Mostra Vetor \n 9 - Fim"));
            switch (opc) {
                case 1:
                    vet = FCarrega(vet);
                    break;

                case 2:
                    vet = FClassifica(vet);
                    break;

                case 3:
                    PMostra(vet);
                    break;


                case 9:
                    JOptionPane.showMessageDialog(null, "FIM.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "INVÁLIDO.");
            }
        } while (opc != 9);
    }

        static int[] FCarrega(int vt[]){
            for(int cta=0; cta<20; cta++){
                vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor"));
            }
            return vt;
        }
        static int[] FClassifica(int vt[]){
            int aux;
            for(int i=0; i<19; i++){
                for(int j=(i+1); j<20; j++){
                    if(vt[i] > vt[j]){
                        aux = vt[i];
                        vt[i] = vt[j];
                        vt[j] = aux;
                    }
                }
            }
            return vt;
        }
        static void PMostra(int vt[]){
            for(int cta=0; cta<20; cta++){
                System.out.println(vt[cta]);
            }
            System.out.println ("******************************");
        }

}
