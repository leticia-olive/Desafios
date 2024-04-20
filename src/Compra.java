import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        System.out.println("O que deseja comprar? \n" +
                "1.Cerveja" +
                "2.Refrigerante" +
                "3.Água");
        Integer opcao = produto.nextInt();

        if(opcao == 1){
            System.out.println("qual a sua idade?");
            Integer i = idade.nextInt();
             if (i>=18){
                 System.out.println("Compra efetuada");
             }else
                 System.out.println("Você é menor de idade");
        }else
            System.out.println("Compra Efetuada");
    }
}
