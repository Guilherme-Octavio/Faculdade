package POO.Classe.PolimorfismoHeranca;

public class R2D2 extends Robot{

    public String falar(int n) {
        if (n < 2){
            return this.falar();
        }

        String fala = "";
        for (int i =0; i < n; i++){
            fala += this.falar() + " ";
        }
        return fala;
    }
}
