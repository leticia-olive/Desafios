import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int opcao;
        Scanner opt = new Scanner(System.in);
        System.out.println("digite qual operação deseja fazer: \n" +
                "1.Adição\n" +
                "2.Subtração\n" +
                "3.Multiplicação\n" +
                "4.Divisão\n");
        opcao = opt.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Primeiro Número:");
                Integer n1 = opt.nextInt();
                System.out.println("Segundo Número:");
                Integer n2 = opt.nextInt();
                int adicao = n1+n2;
                System.out.println("Resultado:" +adicao);
                break;

            case 2:
                System.out.println("Primeiro Número:");
                Integer n3 = opt.nextInt();
                System.out.println("Segundo Número:");
                Integer n4 = opt.nextInt();
                int subtracao = n3-n4;
                System.out.printf("Resultado:"+subtracao);
                break;
            case 3:
                System.out.println("Primeiro Número:");
                Integer n5 = opt.nextInt();
                System.out.println("Segundo Número:");
                Integer n6 = opt.nextInt();
                int multiplicacao = n5*n6;
                System.out.println("Resultado:"+multiplicacao);
                break;

            case 4:
                System.out.println("Primeiro Número:");
                Integer n7 = opt.nextInt();
                System.out.println("Segundo Número:");
                Integer n8 = opt.nextInt();
                int divisao = n7/n8;
                System.out.println("Resultado:"+divisao);
                break;
            default:
                System.out.println("Não é uma opção válida");
        }


    }
}
