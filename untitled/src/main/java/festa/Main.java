package festa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(4);
        lista.add(4);
        lista.add(1);
        lista.add(3);
        int idade = 4;
        Aniversario aniversario = new Aniversario(lista, idade);
        aniversario.fazAfesta();
    }
}