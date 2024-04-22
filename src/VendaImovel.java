import java.util.Scanner;

public class VendaImovel {
    public static void main(String[] args) {
        Scanner mensagem = new Scanner(System.in);
        System.out.println("Digite o nome do imóvel:");
        String imovel = mensagem.next();
        System.out.println("Digite o valor do imovel");
        float valor = mensagem.nextFloat();
        System.out.println(("Digite o nome do vendedor:"));
        String nome = mensagem.next();

        if(valor >=50000){
            double comissao = (float) (valor*(0.2));
            System.out.println("O imovel: "+imovel+"\nvalor R$ :"+valor+"\nVendido por: "+nome);
            System.out.println("tem comissao de: " +comissao);
        }else if(valor>=30000){
            double comissao = (float) (valor*(0.15));
            System.out.println("O imovel: "+imovel+"\nvalor R$ :"+valor+"\nVendido por: "+nome);
            System.out.println("tem comissao de: "+comissao);
        }else if(valor<30000){
            double comissao = (float) (valor*(0.1));
            System.out.println("O imovel: "+imovel+"\nvalor R$ :"+valor+"\nVendido por: "+nome);
            System.out.println("tem comissao de: "+comissao);
        }

    }
}
