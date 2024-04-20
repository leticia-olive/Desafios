import java.util.Scanner;

public class CompraComDesconto {
    public static void main(String[] args) {
        int valorProduto;
        int quantidade;
        double total;
        String produto;
        Scanner opcao = new Scanner(System.in);
        Scanner leitor = new Scanner(System.in);


        System.out.println("Deseja iniciar uma compra?\n 1.Sim 2.Não");
        Integer opt = opcao.nextInt();
        if (opt==1){

            System.out.println("Digite o nome do produto");
                produto = leitor.nextLine();
            System.out.println("Digite o valor do produto");
                valorProduto = leitor.nextInt();
            System.out.println("Digite a quantidade do produto");
                quantidade = leitor.nextInt();

                if(quantidade <= 10){
                    total = valorProduto * quantidade;
                    System.out.println("Voce comprou:"+ produto);
                    System.out.printf("Valor total\n" + total);
                }else if (quantidade <=20) {
                    total = (int) ((valorProduto * quantidade)* (0.9));
                    System.out.println("Voce comprou:"+ produto);
                    System.out.printf("Valor total\n" + total);

                }else if (quantidade<=50){
                    total = (int) ((valorProduto * quantidade)* (0.8));
                    System.out.println("Voce comprou:"+ produto);
                    System.out.printf("Valor total\n" + total);
                }else if (quantidade > 50){
                    total = (int) ((valorProduto * quantidade)* (0.75));
                    System.out.println("Voce comprou:"+ produto);
                    System.out.printf("Valor total\n" + total);
                }
            {

            }




    }

}}
