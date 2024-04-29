import javax.swing.*;
import java.util.Scanner;

public class EncerraPrograma {
    public static void main(String[] args) {
        int n = 0;

        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(
                    null, "Informe um numero (Valor 0 interrompe)"));
        }while (n!=10);
    }
}
