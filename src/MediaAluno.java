import javax.print.attribute.standard.JobPrioritySupported;
import javax.swing.*;
import java.util.Locale;

public class MediaAluno {
    public static void main(String[] args) {
        String resp = new String();

        do {
          float n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite primeira nota"));
          float n2= Float.parseFloat(JOptionPane.showInputDialog("Digite segunda nota"));
          float media = (n1+n2)/2;
                    if(media>=7){
                        JOptionPane.showMessageDialog(null,"Aprovado");

                    }else{
                        JOptionPane.showMessageDialog(null,"Reprovado");
                    }
            resp=JOptionPane.showInputDialog(null,"Voce Deseja Continuar? S/N");


        } while (resp.equals("S"));//Nao consegui usar toUpperCase :(
    }
}
