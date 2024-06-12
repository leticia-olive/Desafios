import java.util.*;

public class ExcluirNome {
    public static <Set> void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> nomesUnicos = new ArrayList<>();

        System.out.println("Digite 20 nomes:");
        for (int i = 0; i < 20; i++) {
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        for (int i = 0; i < nomes.size(); i++) {
            boolean repetido = false;
            for (int j = 0; j < nomes.size(); j++) {
                if (i != j && nomes.get(i).equals(nomes.get(j))) {
                    repetido = true;
                    break;
                }
            }
            if (!repetido) {
                nomesUnicos.add(nomes.get(i));
            }
        }
        System.out.println("Nomes únicos:");
        for (String nome : nomesUnicos) {
            System.out.println(nome);
        }
    }}