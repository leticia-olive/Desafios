import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        Scanner produto = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        System.out.println("O que deseja comprar? \n" +
                "1.Cerveja\n" +
                "2.Refrigerante\n" +
                "3.Água\n");
        Integer opcao = produto.nextInt();

        if(opcao == 1){
            System.out.println("qual a sua idade?");
            Integer i = idade.nextInt();
             if (i>=18){
                 System.out.println("Compra efetuada com sucesso");
             }else
                 System.out.println("Compra negada");
        }else
            System.out.println("Compra Efetuada com sucesso");
    }
}
