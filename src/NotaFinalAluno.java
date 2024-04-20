import java.util.Scanner;

public class NotaFinalAluno {
    public static void main(String[] args) {
        float n1,n2,n3,media;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota");
         n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota");
        n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota");
        n3 = teclado.nextFloat();
        media = (n1+n2+n3)/3;
        if (media >=7){
            System.out.println("Aprovado");
        }else if(media>=5){
            System.out.println("Em recuperação");
        }
        else if (media<5){
            System.out.println("Reprovado");
        }

    }
}
