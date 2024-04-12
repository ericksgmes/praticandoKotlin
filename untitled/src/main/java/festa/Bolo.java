package festa;

import java.util.Collections;
import java.util.List;

public class Bolo {
    private int numeroDeVelas;
    private List <Integer> tamanhoDasVelas;

    public Bolo(List<Integer> tamanhoDasVelas) {
        this.numeroDeVelas = tamanhoDasVelas.size();
        tamanhoDasVelas = tamanhoDasVelas;
    }

    protected void ordenaVelas(){
        this.tamanhoDasVelas.sort(Collections.reverseOrder());
    }

    protected int removeVelas(int idade){
        ordenaVelas();
        int count = 0;
        for(int i = 0; i < tamanhoDasVelas.size(); i++){
            if(this.tamanhoDasVelas.get(i) > idade) {
                this.tamanhoDasVelas.removeFirst();
                count++;
            }
        }
        return count;
    }
}
