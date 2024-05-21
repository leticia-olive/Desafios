import java.util.ArrayList;
import java.util.Scanner;

public class ExcluirNome {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int i;

            nomes.add("pedro");
            nomes.add ("joao");
            nomes.add("pedro");
            nomes.add("maria");
            nomes.add("joaquim");
            nomes.add("joao");

        for (i=0;i<nomes.size();i++){
            if (nomes.get(i).equals(nomes.get(i))){
                nomes.remove(i);
                break;
            }
        }
            System.out.println(nomes);
    }}
