import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        int i;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero entre 1 e 10");
        Integer numero = teclado.nextInt();
        if(numero<=10){
            for(i=1;i<=10;i++){
                int tabuada = i*numero;
                    System.out.println(numero+"x"+i+"="+tabuada);

        }
        } else System.out.println("digite um número válido");
    }
}
