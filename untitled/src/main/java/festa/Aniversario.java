package festa;

import java.util.List;

public class Aniversario {
    private int velasApagadas;
    private List<Integer> tamanhoDasVelas;

    public Aniversario(List<Integer> tamanhoDasVelas, int idade) {
        this.tamanhoDasVelas = tamanhoDasVelas;
        this.idade = idade;
    }

    private int idade;

    public void fazAfesta(){
        int aux;
        aux = calculaVelasApagadas(tamanhoDasVelas, idade);
        System.out.printf("Velas apagadas: " + aux);
    }


    private int calculaVelasApagadas(List<Integer> tamanhoDasVelas, int idade){
        int velasApagadas = 0;
        Pessoa pessoa = new Pessoa(idade);
        Bolo bolo = new Bolo(tamanhoDasVelas);
        velasApagadas = bolo.removeVelas(pessoa.getIdade());
        return velasApagadas;
    }
}
