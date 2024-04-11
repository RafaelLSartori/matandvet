import javax.swing.*;
import java.sql.SQLOutput;

public class N1_3 {

    static double salarioClara, salarioFlora, investimentoFlora = 0, investimentoClara = 0;
    public static void main(String[] args){
        //3. Clara e Flora vão fazer investimentos, cada uma investindo uma única vez 10% do próprio salário.
        // O salário de Flora é um terço do salário de Clara. Porém o investimento de Flora rende 5% ao mês, enquanto o de Clara rende apenas 2% ao mês.
        // Receba o salário de Clara e, usando um procedimento, mostre quanto cada uma investiu e
        // quantos meses serão necessários para que o investimento de Flora ultrapasse o investimento de Clara.

        salarioClara = Integer.parseInt(JOptionPane.showInputDialog("Digite o salário de Clara: "));
        salarioFlora = (salarioClara/3);
        investimentoClara = (salarioClara * 0.10);
        investimentoFlora = (salarioFlora * 0.10);
        System.out.println("O investimento inicial da flora é: " + investimentoFlora);
        System.out.println("O investimento inicial da clara é: " + investimentoClara);
        ProcInv();
    }
    static void ProcInv(){
        int meses=0;
        while(investimentoFlora < investimentoClara){
            investimentoFlora = investimentoFlora + (investimentoFlora * 0.05);
            investimentoClara = investimentoClara + (investimentoClara * 0.02);
            meses++;
        }
        System.out.println("Levará " + meses + " meses.");
    }
}
