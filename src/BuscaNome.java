import java.util.Arrays;
import java.util.Scanner;

public class BuscaNome {
    public static void main(String[] args) {
        String nomes[] = new String[2];
        Scanner entrada = new Scanner(System.in);
        int i;
        boolean encontrei = false;
        for (i=0;i<nomes.length;i++) {
            System.out.println("Digite o nome:");
            nomes[i] = entrada.next();
            nomes[i] = nomes[i].toLowerCase();
        }
            System.out.println("Digite o nome para pesquisa");
             String p = entrada.next();
                    p = p.toLowerCase();

             for(i=0;i<nomes.length;i++){
                 if (p.equals(nomes[i])){
                 System.out.println("encontrei");
                 encontrei = true;
                 break;
                 }
             } if(!encontrei){
            System.out.println("Não encontrei");
        }

    }
    }

