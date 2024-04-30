import java.sql.SQLOutput;
import java.util.Scanner;
/*Utilizando estruturas de repetição construa o algoritmo abaixo:
Faça um programa que leia a entrada de usuário e senha.
O programa deverá exibir uma mensagem de "Bem vindo",
 caso seja inserido o usuário igual à "aluno"
 e a senha digitada igual à "segredo".*/


public class BloqueioUsuario {
    public static void main(String[] args) {
        String usuario,senha;
        Scanner ler=new Scanner(System.in);
        int tentativa =0;
        boolean acertou = false;


            System.out.println("Insira seu login");
            usuario=ler.next();
            System.out.println("insira a senha");
            senha=ler.next();
            usuario.toLowerCase();
            senha.toLowerCase();

                do {
                    System.out.println("Insira seu login");
                    usuario = ler.next();
                    System.out.println("insira a senha");
                    senha = ler.next();
                    usuario.toLowerCase();
                    senha.toLowerCase();
                    tentativa ++;
                        if (usuario.equals("aluno") && (senha.equals("segredo"))) {
                        System.out.println("Bem vindo");
                        break;
                        }

                } while (tentativa <=2);
                    if(tentativa==3){
                        System.out.println("usuario bloqueado");
                    }
}}
