import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class DivisaoValores {
    public static void main(String[] args) {
        int num1,num2,divisao;
        num1 = Integer.parseInt(showInputDialog("Digite o primeiro numero"));
        num2 = Integer.parseInt(showInputDialog("Digite o segundo numero"));

        if (num2==0){
            do{
                JOptionPane.showMessageDialog(null,"Segundo numero não pode ser igual a 0");
                num2= Integer.parseInt(showInputDialog("Digite o segundo numero"));
            } while (num2==0);
        }
        divisao = num1/num2;
        JOptionPane.showMessageDialog(null,"O resultado da divisao é:"+divisao);

    }
}
