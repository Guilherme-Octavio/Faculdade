package EstruturaDeDados1.Lista;

public class ListaDesordenada {
    Pessoa[] elementos;
    int quantidade = 0;

    public ListaDesordenada(int tamanhoMaximo){
        elementos = new Pessoa[tamanhoMaximo];
    }
    protected boolean temEspaco(){
        return quantidade < elementos.length;
    }
    public boolean inserir(Pessoa p) {
        if (temEspaco()){
            elementos[quantidade] = p;
            ++quantidade;
            return true;
        } return false;
    }
    String getLista() {
        String res = "";
        if (elementos != null && quantidade > 0) {
            for (int i = 0; i < quantidade - 1; i++) {
                res += ("{ Nome: " + elementos[i].nome + ", Idade: " + elementos[i].idade + "},");
            }
            res += ("{ Nome: " + elementos[quantidade].nome + ", Idade: "+elementos[quantidade].idade+"}");
        } return res;
    }
}
